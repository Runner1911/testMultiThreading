package cn.sj.test;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args){
		File f1 = new File("D:/workspace/testoop");
/*		File f2 = new File("D:/workspace/testoop/src/cn/sj/oop");
		File f3 = new File(f2,"Point.java");//f3代表Point.java的路径 
	
		File f4 = new File("D:/workspace/testoop/aa/bb/cc/dd");
		f4.mkdirs();
		File f5 = new File(f4,"test.java");
		f5.isFile();
//	    f5.delete();
		try {
			f5.createNewFile();
//			System.out.println("创建一个新的文件");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		printFile(f1,1);
	}
	
	static void printFile(File file ,int level){
		for(int i=0; i<level; i++){
			System.out.print("-");
		}
		
		System.out.println(file.getName());
		
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for( File temp : files){
				printFile(temp,level+1);
			}
			System.out.println("");
		}
	}
}

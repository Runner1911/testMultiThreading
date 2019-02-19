package cn.sj.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss,属于本月的第w周");
		Date d = new Date(23213214l);
		String str = df.format(d);
		System.out.println(str);
		
		System.out.println("################");
		String str2 = "2008-8-8";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd"); //将字符串格式化为时间对象
		try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

package cn.sj.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ���ӻ�������
 * @author sj
 *
 */
public class VisualCalendar {

	public static void main(String[] args){
		System.out.println("���������ڣ����ո�ʽ1970-4-5");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		String temp = inputStr;
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");//�ַ���ת����ʱ�����
		
		
		  
		try {
			Date date = format.parse(temp);
			//System.out.println("ת���Ķ���"+date);
			
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(Calendar.DATE);//��ȡ�����Ǽ���
			System.out.println("�����ǣ� "+ day);
//			calendar.set(Calendar.DATE, 1);// ����������Ϊһ�š�
			
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));  //�ж���һ�������ܵĶ�ڼ��졣
			System.out.println();
			
			int maxDate = calendar.getActualMaximum(Calendar.DATE);//����һ���¶�����
			
			System.out.print("�� \t" +"һ\t"+"��\t"+"��\t"+"��\t"+"��\t"+"��\t\n");
			
			for(int i=1; i<calendar.get(Calendar.DAY_OF_WEEK); i++){
				System.out.print("\t");
			}
			
			for(int i=1; i<=maxDate; i++){
				if(i==day){
					System.out.print("*");
				}
				System.out.print(i+"\t");
				
				int w = calendar.get(Calendar.DAY_OF_WEEK);
				//System.out.print(w);
				if(w==Calendar.SATURDAY){
					System.out.println();
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
}

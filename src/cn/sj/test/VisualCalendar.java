package cn.sj.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化的日历
 * @author sj
 *
 */
public class VisualCalendar {

	public static void main(String[] args){
		System.out.println("请输入日期，按照格式1970-4-5");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		String temp = inputStr;
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");//字符串转化成时间对象
		
		
		  
		try {
			Date date = format.parse(temp);
			//System.out.println("转坏的对象"+date);
			
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(Calendar.DATE);//获取今天是几号
			System.out.println("今天是： "+ day);
//			calendar.set(Calendar.DATE, 1);// 将今天设置为一号。
			
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));  //判断这一天是这周的额第几天。
			System.out.println();
			
			int maxDate = calendar.getActualMaximum(Calendar.DATE);//计算一个月多少天
			
			System.out.print("日 \t" +"一\t"+"二\t"+"三\t"+"四\t"+"五\t"+"六\t\n");
			
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

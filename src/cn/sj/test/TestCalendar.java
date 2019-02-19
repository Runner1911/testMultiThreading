package cn.sj.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日历类
 * @author sj
 *
 */

public class TestCalendar {
	public static void main(String[] args){
		Calendar c = new GregorianCalendar();
		c.set(2001, Calendar.FEBRUARY, 10, 12, 23,34);
		c.set(Calendar.YEAR, 2001);
		c.set(Calendar.MONTH,1);
		c.set(Calendar.DATE,10);
		Date d = c.getTime();
		System.out.println(d);
		
		c.setTime(d);
		
		//
		System.out.println(c.get(Calendar.DATE));
		
		//日期的计算
		//c.add(Calendar.YEAR,-30);
		c.add(Calendar.YEAR,30);
		System.out.println(c);
		
	}

}

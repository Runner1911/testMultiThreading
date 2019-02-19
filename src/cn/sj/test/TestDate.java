package cn.sj.test;

import java.util.Date;

public class TestDate {
	public static void main(String[] args){
		Date d = new Date();
		//long t = System.currentTimeMillis();
		System.out.println(d);
		
		Date d2 = new Date(100000000);
		System.out.println(d2);
		d2.setTime(1980000000);
		System.out.println(d2.getTime());
		System.out.println(d.getTime());
		System.out.println(d.getTime()<d2.getTime());		
	}

}

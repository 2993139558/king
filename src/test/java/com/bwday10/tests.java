/**
 * 
 */
package com.bwday10;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ljf
 *
 * 2019年12月11日
 */
public class tests {

   @Test
	//根据传入的日期获取年龄
	public void test1() {
		
		long l = DateUtils.getYears("2019-12-19");
		System.out.println(l);
	}
   
   @Test
//   根据传入的参数获取该日期的月初日期
	public void test2() {
		
		String l = DateUtils.getDateByMonthInit("2019-12-19");
		System.out.println(l);
	}
   
   @Test
//   根据传入的参数获取该日器的月末日期
	public void test3() {
		
		String l = DateUtils.getDateByMonthLast("2019-12-19");
		System.out.println(l);
	}
   
   @Test
//   求未来日期离今天还剩的天数
	public void test4() {
		
		long l = DateUtils.getDaysByDeparted("2019-12-19");
		System.out.println(l);
	}
   
   @Test
//   求过去日期离今天过去的天数
	public void test5() {
		
		String l = DateUtils.getEndOfDay("2019-12-19");
		System.out.println(l);
	}

}

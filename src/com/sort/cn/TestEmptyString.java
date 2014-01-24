package com.sort.cn;

/**
 * 以下是 Java 判断字符串是否为空的几种方法.
　　方法一: 最多人使用的一个方法, 直观, 方便, 但效率很低.
　　方法二: 比较字符串长度, 效率高, 是我知道的最好一个方法.
　　方法三: Java SE 6.0 才开始提供的办法, 效率和方法二基本上相等, 但出于兼容性考虑, 推荐使用方法二或方法四.
      方法四: 这是种最直观,简便的方法,而且效率也非常的高,与方法二、三的效率差不多
      以下代码在我机器上的运行结果: (机器性能不一, 仅供参考)
　	function 1 use time: 140ms
    function 2 use time: 47ms
    function 3 use time: 47ms
    function 4 use time: 47ms
 * @author dfzhou
 *
 */

public class TestEmptyString {

	String	s	= "";
	long	n	= 10000000;

	private void function1() {
		long startTime = System.currentTimeMillis();
		for (long i = 0; i < n; i++) {
			if (s == null || s.equals(""))
				;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("function 1 use time: " + (endTime - startTime)
		                + "ms");
	}

	
	private void function2() {
		long startTime = System.currentTimeMillis();
		for (long i = 0; i < n; i++) {
			if (s == null || s.length() <= 0);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("function 2 use time: " + (endTime - startTime)
		                + "ms");
	}

	private void function3() {
		long startTime = System.currentTimeMillis();
		for (long i = 0; i < n; i++) {
			if (s == null || s.isEmpty())
				;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("function 3 use time: " + (endTime - startTime)
		                + "ms");
	}

	private void function4() {
		long startTime = System.currentTimeMillis();
		for (long i = 0; i < n; i++) {
			if (s == null || s == "");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("function 4 use time: " + (endTime - startTime)
		                + "ms");
	}
	
	public static void main(String[] args) {
		TestEmptyString test = new TestEmptyString();
		test.function1();
		test.function2();
		test.function3();
		test.function4();
	}
}


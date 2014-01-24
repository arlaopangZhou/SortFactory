package com.sort.cn;

/**
 * ������ Java �ж��ַ����Ƿ�Ϊ�յļ��ַ���.
��������һ: �����ʹ�õ�һ������, ֱ��, ����, ��Ч�ʺܵ�.
����������: �Ƚ��ַ�������, Ч�ʸ�, ����֪�������һ������.
����������: Java SE 6.0 �ſ�ʼ�ṩ�İ취, Ч�ʺͷ��������������, �����ڼ����Կ���, �Ƽ�ʹ�÷������򷽷���.
      ������: ��������ֱ��,���ķ���,����Ч��Ҳ�ǳ��ĸ�,�뷽����������Ч�ʲ��
      ���´������һ����ϵ����н��: (�������ܲ�һ, �����ο�)
��	function 1 use time: 140ms
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


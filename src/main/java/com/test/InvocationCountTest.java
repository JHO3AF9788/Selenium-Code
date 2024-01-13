package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=11)
	public void sum() {
		int a = 89;
		int b = 98;
		int c = 103;
		int d = a + b +c;
		
		System.out.println("sum is " + d);
	}

}

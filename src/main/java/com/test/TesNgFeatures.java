package com.test;

import org.testng.annotations.Test;

public class TesNgFeatures {
	
	@Test
	public void opening() {
		System.out.println("opening");
		int a = 90/0;
	}
	
@Test(dependsOnMethods="opening")
public void MiddleOrder() {
	System.out.println("MiddleOrder");
}

@Test(dependsOnMethods="opening")
public void LowerMiddleOrder() {
	System.out.println("LowerMiddleOrder");
}
	
@Test(dependsOnMethods="opening")
public void LowerOrder() {
	System.out.println("LowerOrder");
}

}

package com.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.qa.base.TestBaseClass;

public class Sample extends TestBaseClass{

	@Test
	public void test1(){
		TestBaseClass.getDriver();
		System.out.println("test executed ");
	}

}

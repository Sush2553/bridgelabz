package com.bridgelabz.functional;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;





public class TestRunner extends MyFirstClassTest{				
	public static void main(String[] args) {									
    Result result = JUnitCore.runClasses(MyFirstClassTest.class);					
	for (org.junit.runner.notification.Failure failure : result.getFailures()) {							
      System.out.println(failure.toString());					
}		
System.out.println("Result=="+result.wasSuccessful());							
}		
}      	
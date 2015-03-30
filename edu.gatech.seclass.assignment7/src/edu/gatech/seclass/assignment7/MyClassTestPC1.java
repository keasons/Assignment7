package edu.gatech.seclass.assignment7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTestPC1 extends MyClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testBuggyMet1() {
		
		//3 separate paths 
		int a=5 ;
		int b=5 ;
		buggyMet1 (a,b) ;
		
		a = 0 ;
		b = 5 ;
		buggyMet1 (a,b) ;
		
		a = 0 ;
		b = 0 ;
				
				
		buggyMet1 (a,b) ;
				
				
 				
	}

}

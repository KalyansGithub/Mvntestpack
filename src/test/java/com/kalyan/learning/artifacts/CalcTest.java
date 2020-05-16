package com.kalyan.learning.artifacts;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void addTest() 
	{
		calculator cal=new calculator();
		assertEquals(10,cal.addNumbers(5, 5));	
	}
	@Test
	public void subTest() 
	{
		calculator cal=new calculator();
		assertEquals(5,cal.subNumbers(10, 5));	
	}

}

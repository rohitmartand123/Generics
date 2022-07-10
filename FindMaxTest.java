package com.bridgelabz.generics;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
/*
 * Author: Rohit
 * Test case to check maximum number is at first position
 */
public class FindMaxTest {
	@Test
	public void maxNumberAtFirstPosition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer number");	
		Integer num1 = sc.nextInt();
		System.out.println("Enter second integer number");
		Integer num2 = sc.nextInt();
		System.out.println("Enter third integer number");
		Integer num3 = sc.nextInt();
		Integer max = null;
		//object
		FindMax findMax = new FindMax();
		int actualResult = findMax.findMaximumInteger(num1, num2, num3, max);
		int expectedResult = num1;
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	/*
	 * Test case to check maximum number is at second position
	 */
	@Test
	public void maxNumberAtSecondPosition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer number");	
		Integer num1 = sc.nextInt();
		System.out.println("Enter second integer number");
		Integer num2 = sc.nextInt();
		System.out.println("Enter third integer number");
		Integer num3 = sc.nextInt();
		Integer max = null;
		FindMax findMax = new FindMax();
		int actualResult = findMax.findMaximumInteger(num1, num2, num3, max);
		int expectedResult = num2;
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	/*
	 * Test case to check maximum number is at third position
	 */
	@Test
	public void maxNumberAtThirdPosition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer number");	
		Integer num1 = sc.nextInt();
		System.out.println("Enter second integer number");
		Integer num2 = sc.nextInt();
		System.out.println("Enter third integer number");
		Integer num3 = sc.nextInt();
		Integer max = null;
		FindMax findMax = new FindMax();
		int actualResult = findMax.findMaximumInteger(num1, num2, num3, max);
		int expectedResult = num3;
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	/*
	 * Test case to check maximum float number is at first position
	 */
	@Test
	public void maxFloatAtFirstPosition() {
		//Input numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first float number");	
		Float num1 = sc.nextFloat();
		System.out.println("Enter second float number");
		Float num2 = sc.nextFloat();
		System.out.println("Enter third float number");
		Float num3 = sc.nextFloat();
		Float max = null;
		//object
		FindMax findMax = new FindMax();
		float actualResult = findMax.findMaxFloat(num1, num2, num3, max);
		float expectedResult = num1;
		//Test condition
		Assert.assertEquals(expectedResult, actualResult, 0.0f);
	}
	
	/*
	 * Test case to check maximum float number is at second position
	 */
	@Test
	public void maxFloatAtSecondPosition() {
		//Input numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first float number");	
		Float num1 = sc.nextFloat();
		System.out.println("Enter second float number");
		Float num2 = sc.nextFloat();
		System.out.println("Enter third float number");
		Float num3 = sc.nextFloat();
		Float max = null;
		//object
		FindMax findMax = new FindMax();
		float actualResult = findMax.findMaxFloat(num1, num2, num3, max);
		float expectedResult = num2;
		//Test condition
		Assert.assertEquals(expectedResult, actualResult, 0.0f);
	}
	
	/*
	 * Test case to check maximum float number is at third position
	 */
	@Test
	public void maxFloatAtThirdPosition() {
		//Input numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first float number");	
		Float num1 = sc.nextFloat();
		System.out.println("Enter second float number");
		Float num2 = sc.nextFloat();
		System.out.println("Enter third float number");
		Float num3 = sc.nextFloat();
		Float max = null;
		//object
		FindMax findMax = new FindMax();
		float actualResult = findMax.findMaxFloat(num1, num2, num3, max);
		float expectedResult = num3;
		//Test condition
		Assert.assertEquals(expectedResult, actualResult, 0.0f);
	}
	
	/*
	 * Test case to check maximum string is at first position
	 */
	@Test
	public void maxStringAtFirstPosition() {
		//Input strings
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");	
		String str1 = sc.next();
		System.out.println("Enter second string");
		String str2 = sc.next();
		System.out.println("Enter third string");
		String str3 = sc.next();
		String max = null;
		//object
		FindMax findMax = new FindMax();
		String actualResult = findMax.findMaxString(str1, str2, str3, max);
		String expectedResult = str1;
		//Test condition
		Assert.assertSame(expectedResult, actualResult);
	}
	
	/*
	 * Test case to check maximum string is at second position
	 */
	@Test
	public void maxStringAtSecondPosition() {
		//Input strings
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");	
		String str1 = sc.next();
		System.out.println("Enter second string");
		String str2 = sc.next();
		System.out.println("Enter third string");
		String str3 = sc.next();
		String max = null;
		//object
		FindMax findMax = new FindMax();
		String actualResult = findMax.findMaxString(str1, str2, str3, max);
		String expectedResult = str2;
		//Test condition
		Assert.assertSame(expectedResult, actualResult);
	}
	
	/*
	 * Test case to check maximum string is at third position
	 */
	@Test
	public void maxStringAtThirdPosition() {
		//Input strings
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");	
		String str1 = sc.next();
		System.out.println("Enter second string");
		String str2 = sc.next();
		System.out.println("Enter third string");
		String str3 = sc.next();
		String max = null;
		//object
		FindMax findMax = new FindMax();
		String actualResult = findMax.findMaxString(str1, str2, str3, max);
		String expectedResult = str3;
		//Test condition
		Assert.assertSame(expectedResult, actualResult);
	}
	
	/*
	 * Test case to find maximum input using generic method
	 */
	@Test
	public <T> void toCheckMaxInput() {
		//object
		FindMaxGenericMethod findMax1 = new FindMaxGenericMethod();
		T maxInput = (T) findMax1.findMaxInput(50, 100, 500, null);
		//Test condition
		Assert.assertEquals(500, maxInput);
		
		maxInput = (T) findMax1.findMaxInput(50.5, 100.8, 500.53, null);
		//Test condition
		Assert.assertEquals(500.53, maxInput);
		
		maxInput = (T) findMax1.findMaxInput("z", "b", "c", null);
		//Test condition
		Assert.assertEquals("z", maxInput);
	}
}

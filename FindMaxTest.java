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
}

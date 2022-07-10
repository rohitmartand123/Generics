package com.bridgelabz.generics;
/*
 * Author: Rohit
 * Refactor all three to one generic method and find the maximum
 */
public class FindMaxGenericMethod {
	//generic method
		public static <T extends Comparable<T>> T findMaxInput(T input1, T input2, T input3, T maxInput) {
			maxInput = null;
			//compare three numbers
			if(input1.compareTo(input2) > 0 && input1.compareTo(input3) > 0) {
				maxInput = input1;
				System.out.println(maxInput + "is maximum");
			}
			else if (input2.compareTo(input3) > 0) {
				maxInput = input2;
				System.out.println(maxInput + "is maximum");
			}
			else {
				maxInput = input3;
				System.out.println(maxInput + "is maximum");
			}
			return maxInput;	
		}
}

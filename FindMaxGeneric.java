package com.bridgelabz.generics;
/*
 * Author: Rohit
 * Refactor to create a generic class to take three variables of generic type
 */
public class FindMaxGeneric<T extends Comparable<T>> {
	//variables
		T input1, input2, input3;
		
		//constructor
		public FindMaxGeneric(T input1, T input2, T input3) {
			this.input1 = input1;
			this.input2 = input2;
			this.input3 = input3;
		}
		
		/*
		 * This method internally call static findMaxInput method
		 */
		public T findMaxInput() {
			return FindMaxGeneric.findMaxInput(input1, input2, input3);
		}


		//generic method
		public static <T extends Comparable<T>> T findMaxInput(T input1, T input2, T input3) {
			T maxInput = null;
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

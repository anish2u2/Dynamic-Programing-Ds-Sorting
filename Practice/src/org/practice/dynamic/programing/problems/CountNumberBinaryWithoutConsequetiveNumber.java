/**
 * 
 */
package org.practice.dynamic.programing.problems;

/**
 * @author Anish Singh
 *
 */
public class CountNumberBinaryWithoutConsequetiveNumber {
	
	public static void main(String args[]) {
		System.out.println(countNumberBinaryWithoutConsequetiveNumber(3));
		System.out.println(countNumberBinaryWithoutConsequetiveNumber(10));
		System.out.println(countNumberBinaryWithoutConsequetiveNumber(20));
		System.out.println(countNumberBinaryWithoutConsequetiveNumber(30));
		System.out.println(countNumberBinaryWithoutConsequetiveNumber(40));
	}
	
	public static int countNumberBinaryWithoutConsequetiveNumber(int lengthOfDigits) {
		int arrayEndingWithBinaryOne[]=new int[lengthOfDigits];
		int arrayEndingWithBinaryZero[]=new int[lengthOfDigits];
		arrayEndingWithBinaryOne[0]=arrayEndingWithBinaryZero[0]=1;
		for(int counter=1;counter<lengthOfDigits;counter++) {
			arrayEndingWithBinaryOne[counter]=arrayEndingWithBinaryOne[counter-1]+arrayEndingWithBinaryZero[counter-1];
			arrayEndingWithBinaryZero[counter]=arrayEndingWithBinaryOne[counter-1];
		}
		return arrayEndingWithBinaryOne[lengthOfDigits-1]+arrayEndingWithBinaryZero[lengthOfDigits-1];
	}
	
}

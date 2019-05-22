/**
 * 
 */
package org.practice.sorting;

import org.practice.sorting.contracts.Sort;

/**
 * @author Anish Singh
 *
 */
public class SelectionSort implements Sort {

	private int[] inputArray;

	public void sort() {
		int temp = 0, currentOuterLoopPosition = 0;
		for (int outerLoopCounter = 0; outerLoopCounter < inputArray.length; outerLoopCounter++) {
			currentOuterLoopPosition = outerLoopCounter;
			for (int innerLoopCounter = outerLoopCounter
					+ 1; innerLoopCounter < inputArray.length; innerLoopCounter++) {
				if (inputArray[innerLoopCounter] < inputArray[currentOuterLoopPosition]) {
					currentOuterLoopPosition = innerLoopCounter;
				}
			}
			temp = inputArray[outerLoopCounter];
			inputArray[outerLoopCounter] = inputArray[currentOuterLoopPosition];
			inputArray[currentOuterLoopPosition] = temp;
		}

	}

	public int[] getInputArray() {
		return inputArray;
	}

	public void setInputArray(int[] inputArray) {
		this.inputArray = inputArray;
	}

}

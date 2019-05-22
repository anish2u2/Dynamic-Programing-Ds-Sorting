/**
 * 
 */
package org.practice.sorting;

import org.practice.sorting.contracts.Sort;

/**
 * @author Anish Singh
 *
 */
public class SortingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort selectionSort=new SelectionSort();
		int [] array= {2,4,1,6,4,7,9,3,10,3,5,30,2,32,23,25,21};
		selectionSort.setInputArray(array);
		selectionSort.sort();
		for(int value:selectionSort.getInputArray())
		System.out.println(value);
	}

}

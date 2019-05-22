/**
 * 
 */
package org.practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anish Singh
 *
 */
public class MaximumSumWithNoTwoElementAdjacent {

	private static List<int[]> listOfArray = new ArrayList<int[]>();

	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D://test.txt")));
		int testCases = Integer.parseInt(reader.readLine());
		for (int counter = 0; counter < testCases; counter++) {

			int sequenceLength = Integer.parseInt(reader.readLine());
			String[] data = reader.readLine().split(" ");
			int[] array = new int[sequenceLength];
			for (int inputCounter = 0; inputCounter < sequenceLength; inputCounter++) {
				array[inputCounter] = Integer.parseInt(data[inputCounter]);
			}
			listOfArray.add(array);
		}
		for (int[] data : listOfArray) {
			List<Integer> result = findMaximumSum(data, data.length);
			for (int count = result.size() - 1; count >= 0; count--) {
				if (result.get(count) != 0)
					System.out.print(result.get(count));
			}
			System.out.println();
		}

	}

	public static List<Integer> findMaximumSum(int[] data, int length) {
		int includeNode = data[0];
		int excludeNode = 0;
		int excludeNewNode = 0;
		List<Integer> includeList = new ArrayList<Integer>();
		List<Integer> excludeList = new ArrayList<Integer>();
		for (int counter = 1; counter < length; counter++) {
			if (includeNode > excludeNode) {
				excludeNewNode = includeNode;
				includeList.add(data[counter - 1]);
			} else {
				excludeNewNode = excludeNode;
				excludeList.add(data[counter - 1]);
			}
			includeNode = excludeNode + data[counter];
			excludeNode = excludeNewNode;

		}
		if (includeNode > excludeNode) {
			includeList.add(data[length - 1]);
			return includeList;
		} else {
			excludeList.add(data[length - 1]);
			return excludeList;
		}
	}

}

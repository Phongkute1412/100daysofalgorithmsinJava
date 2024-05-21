package day00;

import java.util.ArrayList;
import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {

		// Test1
		int[] instance1 = { 5, 2, 4, 6, 1, 3 };
		InsertSort_ASC(instance1);
		System.out.println("Test 1: " + Arrays.toString(instance1));

		// Test2
		int[] instance2 = { 31, 41, 59, 26, 41, 58 };
		InsertSort_ASC(instance2);
		System.out.println("Test 2: " + Arrays.toString(instance2));

		// Test3 (DEC)
		int[] instance3 = { 31, 41, 59, 26, 41, 58 };
		InsertSort_DEC(instance3);
		System.out.println("Test 3: " + Arrays.toString(instance3));

		// Test4 (Find Index)
		int[] instance4_1 = { 5, 8, 12, 3, 7, 14, 21, 6, 11, 9, 17, 4, 18, 2, 20, 10, 15, 19, 1, 13 };
		int[] instance4_2 = { 4, 15, 7, 9, 20, 3, 12, 6, 14, 1, 18, 11, 5, 19, 8, 2, 13, 10, 16, 17 };

		if (Find_Index(instance4_1, 17) != null) {
			String result1 = String.join(", ", Find_Index(instance4_1, 17).toString().replaceAll("[\\[\\]]", ""));
			System.out.println("Test 4.1: " + result1);
		} else {
			System.out.println("Test 4.1: " + "NULL");
		}

		if (Find_Index(instance4_2, 50) != null) {
			String result2 = String.join(", ", Find_Index(instance4_2, 50).toString().replaceAll("[\\[\\]]", ""));
			System.out.println("Test 4.1: " + result2);
		} else {
			System.out.println("Test 4.2: " + "NULL");
		}

	}

	public static int[] InsertSort_ASC(int[] arr) {
		int key, j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			/*
			 * System.out.println("Step " + i + ": " + Arrays.toString(arr)); // -> Delete
			 * the first "//" and run the code to print out the screen so you can see how
			 * the algorithm works!
			 */
		}
		return arr;
	}

	public static int[] InsertSort_DEC(int[] arr) {
		int key, j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	public static ArrayList<Integer> Find_Index(int[] arr, int A) {
		ArrayList<Integer> index = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (A == arr[i]) {
				index.add(i + 1);
			}
		}
		if (!index.isEmpty()) {
			return index;
		} else {
			return null;
		}
	}

}

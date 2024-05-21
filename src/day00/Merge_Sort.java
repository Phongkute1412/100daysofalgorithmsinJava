package day00;

import java.util.Arrays;

public class Merge_Sort {

	public static void main(String[] args) {

		// Test1
		int[] instance1 = { 3, 41, 52, 26, 38, 57, 9, 49, 27 };
		MergeSort_ASC(instance1);
		System.out.println("Test 1: " + Arrays.toString(instance1));

		// Test2
		int[] instance2 = { 31, 41, 59, 26, 41, 58, 69, 40 };
		MergeSort_DEC(instance2);
		System.out.println("Test 2: " + Arrays.toString(instance2));
	}

	public static void MergeSort_ASC(int[] arr) {
		int length = arr.length;
		if (length <= 1)
			return;

		int middle = arr.length / 2;
		int[] leftArr = split(arr, 0, middle);
		int[] rightArr = split(arr, middle, arr.length - middle);

		MergeSort_ASC(leftArr);
		MergeSort_ASC(rightArr);

		merge_ASC(leftArr, rightArr, arr);
	}

	public static void merge_ASC(int[] leftArr, int[] rightArr, int[] arr) {
		int leftSize = leftArr.length;
		int rightSize = rightArr.length;

		int i = 0;
		int l = 0;
		int r = 0;

		while (l < leftSize && r < rightSize) {
			if (leftArr[l] < rightArr[r]) {
				arr[i] = leftArr[l];
				i++;
				l++;
			} else {
				arr[i] = rightArr[r];
				i++;
				r++;
			}
		}
		while (l < leftSize) {
			arr[i] = leftArr[l];
			i++;
			l++;
		}
		while (r < rightSize) {
			arr[i] = rightArr[r];
			i++;
			r++;
		}

	}

	public static void MergeSort_DEC(int[] arr) {
		int length = arr.length;
		if (length <= 1)
			return;

		int middle = arr.length / 2;
		int[] leftArr = split(arr, 0, middle);
		int[] rightArr = split(arr, middle, arr.length - middle);

		MergeSort_DEC(leftArr);
		MergeSort_DEC(rightArr);

		merge_DEC(leftArr, rightArr, arr);
	}

	public static void merge_DEC(int[] leftArr, int[] rightArr, int[] arr) {
		int leftSize = leftArr.length;
		int rightSize = rightArr.length;

		int i = 0;
		int l = 0;
		int r = 0;

		while (l < leftSize && r < rightSize) {
			if (leftArr[l] > rightArr[r]) {
				arr[i] = leftArr[l];
				i++;
				l++;
			} else {
				arr[i] = rightArr[r];
				i++;
				r++;
			}
		}
		while (l < leftSize) {
			arr[i] = leftArr[l];
			i++;
			l++;
		}
		while (r < rightSize) {
			arr[i] = rightArr[r];
			i++;
			r++;
		}

	}

	public static int[] split(int[] arr, int i, int size) {
		int[] result = new int[size];
		for (int j = 0; j < size; j++) {
			result[j] = arr[i + j];
		}
		return result;
	}
}
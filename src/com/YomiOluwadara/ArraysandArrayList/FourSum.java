package com.YomiOluwadara.ArraysandArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums == null || nums.length < 4)
			return result;

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 3; i++) {
			if (i != 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j != i + 1 && nums[j] == nums[j - 1])
					continue;

				int k = j + 1;
				int l = nums.length - 1;

				while (k < l) {
					if (nums[i] + nums[j] + nums[k] + nums[l] < target) {
						k++;
					} else if (nums[i] + nums[j] + nums[k] + nums[l] > target) {
						l--;
					} else {
						List<Integer> t = new ArrayList<Integer>();
						t.add(nums[i]);
						t.add(nums[j]);
						t.add(nums[k]);
						t.add(nums[l]);
						result.add(t);

						k++;
						l--;

						while (k < l && nums[l] == nums[l - 1]) {
							l--;
						}

						while (k < l && nums[k] == nums[k + 1]) {
							k++;
						}
					}

				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// get input from keyboard and pass into array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter the elements of the Array");
		for (int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		System.out.println(FourSum.fourSum(myArray, 4));

	}

}

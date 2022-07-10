package com.greatlearning.main;

import java.util.Scanner;

public class paymoney {

	public void display(int array[], int targ) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size of the transaction array");

		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Please enter the values of the array:-");

		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		System.out.println("Please enter the total number of targets that needs to be achieved : ");

		int numOfTarget = sc.nextInt();

		while (numOfTarget--!= 0) {

			int flag = 0;

			int target;

			System.out.println("Please enter the value of the target : ");

			target = sc.nextInt();

			int sum = 0;

			for (int i = 0; i < size; i++) {
				sum += arr[i];

				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println("target is not achived");
			}

		}

	}

}

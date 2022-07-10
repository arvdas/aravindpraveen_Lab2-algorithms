package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.NotesCount;
import com.greatlearning.services.mergesort;

public class driver {

	public static void main(String[] args) {

		mergesort mergeSort = new mergesort();
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSort.sort(notes,0,notes.length-1);
		notesCount.notescount(notes, amount);

	}

}

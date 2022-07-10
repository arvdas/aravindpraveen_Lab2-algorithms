package com.greatlearning.services;

public class NotesCount {

	public void notescount(int[] note, int amount) {
		int[] noteCounter = new int[note.length];
		try {
			for (int i = 0; i < note.length; i++) {
				if (amount >= note[i]) {
					noteCounter[i] = amount / note[i];
					amount = amount - noteCounter[i] * note[i];
				}
			}
			if (amount > 0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give minimum number of notes will be");
				for (int i = 0; i < note.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(note[i] + ":" + noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + "invalid");

		}
	}
}
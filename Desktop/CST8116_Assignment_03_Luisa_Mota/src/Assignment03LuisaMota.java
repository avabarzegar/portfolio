/*
 * Student Name:  Luisa Mota
 * Lab Professor:  Professor Teddy Yap
 * Due Date:  Dec 11
 * Description:  Assignment 03
 */

public class Assignment03LuisaMota {

	public static void main(String[] args) {
		// The program rolls a 10 sided dice NUM_ROLLS times and records the
		// results, then outputs the largest value
		final int NUM_ROLLS = 10;
		int[] rollResults = new int[NUM_ROLLS];
		// Roll the dice 10 times
		for(int count = 0; count < NUM_ROLLS; ++count) {
		// Math.random() returns 0.0 to 1.0 excluding 1.0
		// i.e. we could get 0.99999999999 etc. but not 1.0
		// so Math.random() times upper range of 10 is 0 to 9
		// add 1 to get correct range, then cast to int to remove any decimal fraction.
		rollResults[count] = (int)(Math.random() * 10) + 1;
		}
		// find the largest
		int largestValue = Integer.MIN_VALUE;
		for(int diceNum = 0; diceNum < NUM_ROLLS; ++diceNum) {
		if (rollResults[diceNum] > largestValue)
		largestValue = rollResults[diceNum];
		}
		// display the results
		for (int rollNum = 0; rollNum < rollResults.length; ++rollNum) {
		    System.out.printf("Result of roll #%d is: %d%n", rollNum + 1, rollResults[rollNum]);
		}
		System.out.printf("Largest value = %d%n", largestValue);
		System.out.println("Program by Luisa Mota");

	}

}

package guessingGame;

import java.util.*;

public class guessingGame {

	public static void main(String[] args) {
		
		int secretNum;
		int guess;
		boolean correct = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("GIVE ME SECRET Number: ");
		secretNum = keyboard.nextInt();
		
		while(!correct) {
			System.out.print("GUESS: ");
			guess = keyboard.nextInt();
			
			if (guess == secretNum) {
				correct = true;
				System.out.println("You are right!");
			} else if (guess < secretNum) {
				System.out.println("HIGHER");
			} else if (guess > secretNum) {
				System.out.println("LOWER");
			}
		}
	}

}

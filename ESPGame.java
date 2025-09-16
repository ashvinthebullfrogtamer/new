package assignment1;

import java.util.*;
import java.io.*;

import java.util.*;
import java.io.*;

public class ESPGame {
	public static void main(String[] args) throws IOException {
		final int MAX_COLORS = 16;
		final int MAX_GUESSES = 3;
		final String OUTPUT_FILE = "EspGameResults.txt";

		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		PrintWriter outFile = new PrintWriter(OUTPUT_FILE);

		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		System.out.println("Welcome to ESP - extrasensory perception!");

		boolean continueGame = true;

		while (continueGame) {
			int option = 0;

			// validte menu
			while (true) {
				System.out.println("\nPlease choose one of the 4 options:");
				System.out.println("1- Display first 16 colors from colors.txt");
				System.out.println("2- Display first 10 colors from colors.txt");
				System.out.println("3- Display first 5 colors from colors.txt");
				System.out.println("4- Exit the program");
				System.out.print("Enter your option: ");

				if (keyboard.hasNextInt()) {
					option = keyboard.nextInt();
					keyboard.nextLine();
					if (option >= 1 && option <= 4)
						break;
				} else {
					keyboard.nextLine();
				}
				System.out.println("Invalid choice. Please enter 1-4.");
			}

			if (option == 4)
				break;

			System.out.print("Enter the filename: ");
			String fileName = keyboard.nextLine();

			int numColorsToShow = 16;
			if (option == 2)
				numColorsToShow = 10;
			if (option == 3)
				numColorsToShow = 5;

			System.out.println("There are " + numColorsToShow + " colors from the file:");

			int count = 0;
			try (Scanner fileScanner = new Scanner(new File(fileName))) {
				while (fileScanner.hasNext() && count < numColorsToShow) {
					count++;
					System.out.println(count + " " + fileScanner.next());
				}
			} catch (FileNotFoundException e) {
				System.out.println("File not found: " + fileName);
				continue;
			}

			int correctGuesses = 0;

			for (int round = 1; round <= MAX_GUESSES; round++) {
				System.out.println("\nRound " + round);
				System.out.println("I am thinking of a color.");
				System.out.println("Is it one of the colors above?");

				int selectedNumber = rand.nextInt(MAX_COLORS) + 1;
				String selectedColor = "";

				try (Scanner fileScanner = new Scanner(new File(fileName))) {
					int current = 1;
					while (fileScanner.hasNext()) {
						String color = fileScanner.next();
						if (current == selectedNumber) {
							selectedColor = color;
							break;
						}
						current++;
					}
				}

				System.out.print("Enter your guess: ");
				String guess = keyboard.nextLine().trim();

				System.out.println("I was thinking of " + selectedColor + ".");
				if (guess.equalsIgnoreCase(selectedColor)) {
					correctGuesses++;
				}
			}

			System.out.println("Game Over");
			System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
			outFile.println("Game Over");
			outFile.println("You guessed " + correctGuesses + " out of 3 colors correctly.");

			System.out.println("\nWould you like to continue a game? Type Yes/No");
			String cont = keyboard.nextLine().trim().toLowerCase();
			if (!cont.equals("yes"))
				continueGame = false;
		}

		System.out.print("Enter your name: ");
		String userName = keyboard.nextLine();
		System.out.print("Describe yourself: ");
		String description = keyboard.nextLine();
		System.out.print("Due Date (MM/DD): ");
		String dueDate = keyboard.nextLine();

		System.out.println("\nUsername: " + userName);
		System.out.println("User Description: " + description);
		System.out.println("Due Date: " + dueDate);
		System.out.println("Date: " + dueDate);

		outFile.println("Due Date: " + dueDate);
		outFile.println("Username: " + userName);
		outFile.println("User Description: " + description);
		outFile.println("Date: " + dueDate);

		keyboard.close();
		outFile.close();
	}
}

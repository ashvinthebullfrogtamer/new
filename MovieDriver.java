package driverproj;

import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String answer = "y";

		while (answer == "y" || answer == "Y") {

			movie movie = new movie();

			System.out.print("Enter the title of the movie: ");
			String title = keyboard.nextLine();
			movie.setTitle(title);

			System.out.print("Enter the movie's rating: ");
			String rating = keyboard.nextLine();
			movie.setRating(rating);

			System.out.print("Enter the number of tickets sold at a theater: ");
			int tickets = keyboard.nextInt();
			movie.setSoldTickets(tickets);

			System.out.println(movie.toString());

			keyboard.nextLine();


			System.out.print("Do you want to enter another? (y/n): ");
			answer = keyboard.nextLine();
		}

		keyboard.close();
		System.out.println("Goodbye!");
	}
}

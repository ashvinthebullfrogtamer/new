package hospital;

import java.util.Scanner;
/*
 * Class: CMSC203 
 * Instructor: Professor Farnaz Eivazi
 * Description: Procedure is for doctors, patient is for patient, driver is to utilize both
 * Due: 9/29/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ashvin Thirumal
*/


public class PatientDriverApp {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter patient information:");
		System.out.print("First name: ");
		String firstName = keyboard.nextLine();
		System.out.print("Middle name: ");
		String middleName = keyboard.nextLine();
		System.out.print("Last name: ");
		String lastName = keyboard.nextLine();
		System.out.print("Street Address: ");
		String streetAddress = keyboard.nextLine();
		System.out.print("City: ");
		String city = keyboard.nextLine();
		System.out.print("State: ");
		String state = keyboard.nextLine();
		System.out.print("ZIP Code: ");
		String zipCode = keyboard.nextLine();
		System.out.print("Phone Number: ");
		String phoneNumber = keyboard.nextLine();
		System.out.print("Emergency Contact Name: ");
		String emergencyName = keyboard.nextLine();
		System.out.print("Emergency Contact Phone: ");
		String emergencyPhone = keyboard.nextLine();

		Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber,emergencyName, emergencyPhone);

		Procedure procedure1 = new Procedure();  //no arguments
		procedure1.setProcedureName("X-Ray");
		procedure1.setProcedureDate("09/20/2025");
		procedure1.setPractitioner("Dr. Smith");
		procedure1.setCharges(250.00);

		Procedure procedure2 = new Procedure("Blood Test", "09/21/2025"); // only two arguments
		procedure2.setPractitioner("Nurse Amy");
		procedure2.setCharges(150.00);

		Procedure procedure3 = new Procedure("MRI Scan", "09/25/2025", "Dr. Johnson", 1200.00); // has all agruements

		displayPatient(patient);
		System.out.println("\nProcedures (tab separated):");
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);

		double total = calculateTotalCharges(procedure1, procedure2, procedure3);
		System.out.printf("\nTotal Charges: $%,.2f\n", total);

		keyboard.close();
	}

	public static void displayPatient(Patient patient) {
		System.out.println("\n" + patient.toString());
	}

	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}

	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		return p1.getCharges() + p2.getCharges() + p3.getCharges();
	}
}

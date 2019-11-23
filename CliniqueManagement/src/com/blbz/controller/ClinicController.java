package com.blbz.controller;

import com.blbz.service.CliniqueService;
import com.blbz.serviceimpl.CliniqueServiceImpl;
import com.blbz.util.Utility;

public class ClinicController {
	static CliniqueService service = new CliniqueServiceImpl();
	public static void main(String[] args) {
		
		menu();
	}

	public static void menu() {
		System.out.println("Select option");
		System.out.println("1. Add Doctor Details");
		System.out.println("2. Search Doctor");
		System.out.println("3. Search Patient");
		
		int choice = Utility.inputinteger();
		
		switch (choice) {
		case 1:
			service.doctorDetails();
			menu();
			break;
		case 2:
			doctorInput();
			break;
		case 3:
			patientInput();
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
	}


	private static void doctorInput() {
		System.out.println("Search doctor by:");
		System.out.println("1. Name");
		System.out.println("2. ID");
		System.out.println("3. Specialization");
		System.out.println("4. Availability");
		int choice = Utility.inputinteger();
		doctorChoice(choice);
	}

	private static void doctorChoice(int choice) {
		switch (choice) {
		case 1:
			Utility.inputString();
			System.out.print("Enter name:");
			service.readDoctorData("Name", Utility.inputString());
			break;
		case 2:
			Utility.inputString();
			System.out.print("Enter ID:");
			service.readDoctorData("Id", Utility.inputString());
			break;
		case 3:
			Utility.inputString();
			System.out.print("Enter speacialization:");
			service.readDoctorData("Specialization", Utility.inputString());
			break;
		case 4:
			Utility.inputString();
			System.out.print("Enter availability::");
			service.readDoctorData("Availability", Utility.inputString());
			break;
		}
	}
	
	private static void patientInput() {
		System.out.println("Search patient by:");
		System.out.println("1. Name");
		System.out.println("2. ID");
		System.out.println("3. Mobile Number");
		int choice = Utility.inputinteger();
		patientChoice(choice);
		
	}

	private static void patientChoice(int choice) {
		switch (choice) {
		case 1:
			Utility.inputString();
			System.out.print("Enter name:");
			service.readPatientData("Name", Utility.inputString());
			break;
		case 2:
			System.out.print("Enter ID:");
			service.readPatientData("Id", Utility.inputString());
			break;
		case 3:
			System.out.print("Enter mobile number:");
			service.readPatientData("Mobile", Utility.inputString());
			break;
		}
	}

}

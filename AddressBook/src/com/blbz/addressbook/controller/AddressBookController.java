package com.blbz.addressbook.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.addressbook.model.Person;
import com.blbz.addressbook.repository.AddressBookRepository;
import com.blbz.addressbook.service.AddressBookService;
import com.blbz.addressbook.serviceimpl.AddressBookServiceImpl;
import com.blbz.addressbook.util.Utility;

public class AddressBookController {
	static Utility utility = new Utility();
	static AddressBookService bookService = new AddressBookServiceImpl();
	static AddressBookRepository bookRepository = new AddressBookRepository();
	static String name;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		System.out.println("Select following option to perform some action..");
		System.out.println("1. Add a person");
		System.out.println("2. Edit");
		System.out.println("3. Delete a person");
		System.out.println("4. Search a person");
		System.out.println("5. Quit");
		String select = Utility.inputString();
		if(Utility.stringChecker(select)) {
			switch (select) {
			case "1":
				AddressBookController.addUser();
				break;
			case "2":
				System.out.println("Enter the first name :");
				name = Utility.inputString();
				bookService.edit(name);
				break;
			case "3":
				System.out.println("Enter first name :");
				name = Utility.inputString();
				bookService.delete(name);
				break;
			case "4":
				System.out.println("Enter first name :");
				name = Utility.inputString();
				JSONObject object = bookService.search(name);
				//array.forEach(person -> AddressBookServiceImpl.displayPersonDetails((JSONObject)person));
				break;
			case "5":
				break;
			default:
				break;
			}
		}
	}

	public static void addUser() {
		String firstName,lastName,address,city,state;
		int zip;
		long mobile;
		
		JSONObject jsonObject = bookRepository.readData();
		jsonObject = (JSONObject) jsonObject.get("Address Book");
		
		
		Person person = new Person();
		System.out.println("Enter first Name :");
		firstName = Utility.getString(false);
		
		
		System.out.println("Enter Last Name :");
		lastName = Utility.getString(false);
		
		System.out.println("Enter Address :");
		address = Utility.getString(false);
		
		System.out.println("Enter city Name :");
		city = Utility.getString(false);
		
		System.out.println("Enter State Name :");
		state = Utility.getString(false);

		System.out.println("Enter Zip Code:");
		zip = Utility.inputinteger();
		
		System.out.println("Enter 10 digit Phone Number :");
		mobile = Utility.inputLong();
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setCity(city);
		person.setAddress(address);
		person.setState(state);
		person.setZip(zip);
		person.setPhonenumber(mobile);
		
		bookService.store(person);
		
	}
}

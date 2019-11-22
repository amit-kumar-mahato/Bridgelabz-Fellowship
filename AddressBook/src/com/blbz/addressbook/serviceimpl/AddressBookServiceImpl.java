package com.blbz.addressbook.serviceimpl;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.addressbook.model.Person;
import com.blbz.addressbook.repository.AddressBookRepository;
import com.blbz.addressbook.service.AddressBookService;
import com.blbz.addressbook.util.Utility;

public class AddressBookServiceImpl implements AddressBookService {

	JSONObject firstName = new JSONObject();
	JSONObject jsonFinalObject = new JSONObject();
	JSONArray jsonArray = new JSONArray();

	@SuppressWarnings("unchecked")
	@Override
	public void store(Person person) {
		JSONObject json = AddressBookRepository.readData();
		System.out.println("From file :" + json);
		json = (JSONObject) json.get("Address Book");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("FirstName", person.getFirstName());
		jsonObject.put("LastName", person.getLastName());
		jsonObject.put("City", person.getCity());
		jsonObject.put("State", person.getState());
		jsonObject.put("Address", person.getAddress());
		jsonObject.put("Zip", person.getZip());
		jsonObject.put("Mobile", person.getPhonenumber());

		// System.out.println(jsonObject);
		jsonArray.add(jsonObject);

		json.put(person.getFirstName(), jsonArray);

		// System.out.println(firstName);

		jsonFinalObject.put("Address Book", json);

		System.out.println(jsonFinalObject);

		AddressBookRepository.writeData(jsonFinalObject);

	}

	@SuppressWarnings("unchecked")
	@Override
	public void edit(String name) {

		JSONObject json = new JSONObject();
		JSONObject temp = new JSONObject();
		jsonFinalObject = AddressBookRepository.readData();
		json = (JSONObject) jsonFinalObject.get("Address Book");
		jsonArray = (JSONArray) json.get(name);
		System.out.println(name + " Details ::\n" + jsonArray);

		System.out.println("Please select what you want to update ");
		Iterator<?> iterator = jsonArray.iterator();

		while (iterator.hasNext()) {
			JSONObject object = (JSONObject) iterator.next();

			object.forEach((k, v) -> {
				System.out.println(k + " " + v);
				System.out.println("Do u want to update " + k + "? enter Y for yes otherwise enter N");
				String updatedvalue = Utility.inputString().toUpperCase();
				if (updatedvalue.equals("Y")) {
					System.out.println("Please enter updated value for " + k);
					updatedvalue = Utility.inputString();
					v = updatedvalue;
				}
				temp.put(k, v);
			});
			jsonArray.remove(object);
			jsonArray.add(temp);

		}
		System.out.println(jsonFinalObject.toJSONString());
		AddressBookRepository.writeData(jsonFinalObject);

	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(String name) {
		jsonFinalObject = AddressBookRepository.readData();
		System.out.println("Before Deleted :" + jsonFinalObject);
		jsonFinalObject.remove(name);
		System.out.println("After Deleted :" + jsonFinalObject);

		JSONObject tempobject = new JSONObject();
		tempobject.put("Address Book", jsonFinalObject);
		AddressBookRepository.writeData(tempobject);
	}

	/*
	 * Method will search weather the details is present in the Address Book or not
	 * 
	 * @param-type: String
	 * 
	 * @return-type: JSONArray
	 * 
	 */

	@Override
	public JSONObject search(String name) {
		JSONObject json = new JSONObject();
		jsonFinalObject = AddressBookRepository.readData();
		json = (JSONObject) jsonFinalObject.get("Address Book");

		jsonArray = (JSONArray) json.get(name);

		jsonArray.forEach(person -> AddressBookServiceImpl.displayPersonDetails((JSONObject)person));
		return json;

	}

	/*
	 * Method will display the Details
	 * 
	 * @param-type: JSONObject
	 * 
	 * @return-type: Doesn't return anything
	 * 
	 */
	public static void displayPersonDetails(JSONObject person) {

		System.out.println("Name :" + person.get("FirstName") + " " + person.get("LastName"));
		System.out.println("\nAddress :" + person.get("Address"));
		System.out.println("\nCity :" + person.get("City"));
		System.out.println("\nState :" + person.get("State"));
		System.out.println("\nZip :" + person.get("Zip"));
		System.out.println("\nMobile :" + person.get("Mobile"));
	}

}

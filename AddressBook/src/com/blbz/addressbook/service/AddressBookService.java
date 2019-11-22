package com.blbz.addressbook.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.addressbook.model.Person;

public interface AddressBookService {

	void store(Person person);

	void edit(String name);

	void delete(String name);

	JSONObject search(String name);

}

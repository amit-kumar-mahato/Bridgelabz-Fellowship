package com.blbz.loginproject.serviceimpl;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.loginproject.model.Registration;
import com.blbz.loginproject.repository.RegistrationRepository;
import com.blbz.loginproject.service.RegistrationService;
import com.blbz.loginproject.util.Utility;

public class RegistrationServiceImpl implements RegistrationService{

	JSONObject jsonObject = Utility.getJsonObject();
	@SuppressWarnings("unchecked")
	public JSONArray addUser(Registration userDetails) {
		jsonObject.put("firstname", userDetails.getFirstName());
		jsonObject.put("lastname", userDetails.getLastName());
		jsonObject.put("username", userDetails.getUserName());
		jsonObject.put("email", userDetails.getEmail());
		jsonObject.put("phone", userDetails.getMobile());
		jsonObject.put("password", userDetails.getPassword());
		
		return RegistrationRepository.addUser(jsonObject);
		
	}

	
}

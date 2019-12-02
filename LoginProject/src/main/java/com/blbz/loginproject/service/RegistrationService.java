package com.blbz.loginproject.service;

import org.json.simple.JSONArray;

import com.blbz.loginproject.model.Registration;

public interface RegistrationService {
	public JSONArray addUser(Registration userDetails);
}

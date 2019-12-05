package com.blbz.loginproject.serviceimpl;

import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.loginproject.model.Login;
import com.blbz.loginproject.model.Registration;
import com.blbz.loginproject.repository.UserDetailsRepository;
import com.blbz.loginproject.service.UserDetailsService;
import com.blbz.loginproject.util.Utility;

public class UserDetailsServiceImpl implements UserDetailsService{
	JSONObject jsonObject = Utility.getJsonObject();

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray authenticateUser(Login login) throws ClassNotFoundException, SQLException {
		jsonObject.put("username", login.getUsername());
		jsonObject.put("password", login.getPassword());

		return UserDetailsRepository.getAuthenticatedUser(jsonObject);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean addUser(Registration userDetails) {
		jsonObject.put("firstname", userDetails.getFirstName());
		jsonObject.put("lastname", userDetails.getLastName());
		jsonObject.put("username", userDetails.getUserName());
		jsonObject.put("email", userDetails.getEmail());
		jsonObject.put("phone", userDetails.getMobile());
		jsonObject.put("password", userDetails.getPassword());
		
		return UserDetailsRepository.addUser(jsonObject);
	}

	@Override
	public boolean deleteUserDetails(String name) throws ClassNotFoundException, SQLException {
		return UserDetailsRepository.delete(name);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean updateUserDetails(Registration userDetails) throws ClassNotFoundException, SQLException {
		jsonObject.put("firstname", userDetails.getFirstName());
		jsonObject.put("lastname", userDetails.getLastName());
		jsonObject.put("username", userDetails.getUserName());
		jsonObject.put("email", userDetails.getEmail());
		jsonObject.put("phone", userDetails.getMobile());
		
		return UserDetailsRepository.update(jsonObject);
	}

}

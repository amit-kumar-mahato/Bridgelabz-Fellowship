package com.blbz.loginproject.service;

import java.sql.SQLException;

import org.json.simple.JSONArray;

import com.blbz.loginproject.model.Login;
import com.blbz.loginproject.model.Registration;

public interface UserDetailsService {
	JSONArray authenticateUser(Login login) throws ClassNotFoundException, SQLException;
	public JSONArray addUser(Registration userDetails);
	boolean deleteUserDetails(String name) throws ClassNotFoundException, SQLException;
}

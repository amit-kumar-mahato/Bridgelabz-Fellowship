package com.blbz.loginproject.service;

import java.sql.SQLException;

import org.json.simple.JSONArray;

import com.blbz.loginproject.model.Login;

public interface LoginService {

	JSONArray authenticateUser(Login login) throws ClassNotFoundException, SQLException;

}

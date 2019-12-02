package com.blbz.loginproject.serviceimpl;

import java.sql.SQLException;

import org.json.simple.JSONObject;

import com.blbz.loginproject.model.Login;
import com.blbz.loginproject.repository.LoginRepository;
import com.blbz.loginproject.service.LoginService;
import com.blbz.loginproject.util.Utility;

public class LoginServiceimpl implements LoginService {

	JSONObject jsonObject = Utility.getJsonObject();

	@SuppressWarnings("unchecked")
	public boolean authenticateUser(Login login) throws ClassNotFoundException, SQLException {
		jsonObject.put("username", login.getUsername());
		jsonObject.put("password", login.getPassword());

		return LoginRepository.getAuthenticatedUser(jsonObject);
	}
}

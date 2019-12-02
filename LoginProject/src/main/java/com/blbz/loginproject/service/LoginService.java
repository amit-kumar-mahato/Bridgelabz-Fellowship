package com.blbz.loginproject.service;

import java.sql.SQLException;

import com.blbz.loginproject.model.Login;

public interface LoginService {

	boolean authenticateUser(Login login) throws ClassNotFoundException, SQLException;

}

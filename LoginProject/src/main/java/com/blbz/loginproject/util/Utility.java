package com.blbz.loginproject.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.loginproject.model.Login;
import com.blbz.loginproject.model.Registration;
import com.blbz.loginproject.service.LoginService;
import com.blbz.loginproject.service.RegistrationService;
import com.blbz.loginproject.serviceimpl.LoginServiceimpl;
import com.blbz.loginproject.serviceimpl.RegistrationServiceImpl;

public class Utility {
	
	static JSONObject jsonObject;
	static JSONArray jsonArray;
	static Registration registration;
	static Login login;
	static RegistrationService registrationService;
	static LoginService loginService;
	
	/*
	 * @param-type: Doesn't take any parameter
	 * @return-type: JSONObject
	 * 
	 * */
	public static JSONObject getJsonObject() {
		return jsonObject = new JSONObject();
	}
	
	/*
	 * @param-type: Doesn't take any parameter
	 * @return-type: Registration Object
	 * 
	 * */
	public static Registration getRegistration() {
		return registration = new Registration();
	}
	
	/*
	 * @param-type: Doesn't take any parameter
	 * @return-type: Login Object
	 * 
	 * */
	public static Login getLogin() {
		return login = new Login();
	}
	
	/*
	 * @param-type: Doesn't take any parameter
	 * @return-type: RegistrationService
	 * 
	 * */
	public static RegistrationService getRegistrationService() {
		return registrationService = new RegistrationServiceImpl();
	}
	
	/*
	 * @param-type: Doesn't take any parameter
	 * @return-type: Logince
	 * 
	 * */
	public static LoginService getLoginService() {
		return loginService = new LoginServiceimpl();
	}
	
	/*
	 * This method will provide the DB connection
	 * @return-type: method will return boolean value
	 * */
	public static Connection dbConnection() throws ClassNotFoundException {
		String dbUrl = "jdbc:mysql://localhost:3306/loginDB";
		String name ="root";
		String pass = "root";
		
		Connection connection = null;
		Class.forName("com.mysql.jdbc.Driver");
		try{
			connection = DriverManager.getConnection(dbUrl,name,pass);
			System.out.println("Connection is established!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;	
	}

	public static JSONArray getJsonArray() {
		return jsonArray = new JSONArray();
	}
}

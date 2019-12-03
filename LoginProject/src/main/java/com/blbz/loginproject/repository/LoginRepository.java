package com.blbz.loginproject.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.loginproject.util.Utility;

public class LoginRepository {

	public static JSONArray getAuthenticatedUser(JSONObject jsonObject) throws ClassNotFoundException, SQLException {
		
		String uname = (String) jsonObject.get("username");
		String pswd = (String)jsonObject.get("password");
		String query = "SELECT * from userdetails WHERE UserName=? AND Password=?";
		ResultSet rs = null;
		try (Connection con = Utility.dbConnection(); PreparedStatement pstmt = con.prepareStatement(query);) {
			pstmt.setString(1, uname);
			pstmt.setString(2, pswd);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return RegistrationRepository.findAll();
			}
		}
		return null;
	}
	
}

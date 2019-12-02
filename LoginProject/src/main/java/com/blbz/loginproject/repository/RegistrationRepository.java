package com.blbz.loginproject.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.loginproject.util.Utility;

public class RegistrationRepository {

	static JSONArray array = Utility.getJsonArray();
	
	public static JSONArray addUser(JSONObject jsonObject) {
		String query = "INSERT into userdetails values(?,?,?,?,?,?)";
		
		try (Connection con = Utility.dbConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {

			pstmt.setString(1, jsonObject.get("firstname").toString());
			pstmt.setString(2, jsonObject.get("lastname").toString());
			pstmt.setString(3, jsonObject.get("username").toString());
			pstmt.setString(4, jsonObject.get("email").toString());
			pstmt.setString(5, jsonObject.get("phone").toString());
			pstmt.setString(6, jsonObject.get("password").toString());
			
			if(pstmt!=null) {
				System.out.println("Coming inside if block!!!");
				pstmt.executeUpdate();
				return findAll();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public static JSONArray findAll() throws ClassNotFoundException, SQLException {
		JSONObject jsonObject = null;
		String userDetails = "SELECT * from userdetails";
		ResultSet rs = null;
		
		try (Connection con = Utility.dbConnection();PreparedStatement pstmt = con.prepareStatement(userDetails);) {
	
			rs = pstmt.executeQuery();
			while(rs.next()) {
				jsonObject = Utility.getJsonObject();
				jsonObject.put("firstname", rs.getString("FirstName"));
				jsonObject.put("lastname", rs.getString("LastName"));
				jsonObject.put("username", rs.getString("UserName"));
				jsonObject.put("email", rs.getString("Email"));
				jsonObject.put("contact", rs.getString("Mobile"));
				jsonObject.put("password", rs.getString("Password"));
				array.add(jsonObject);
				//System.out.println("DB :"+array.toString());
			}

		}
		return array;
		
	}

}

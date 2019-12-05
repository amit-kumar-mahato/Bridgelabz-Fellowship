package com.blbz.loginproject.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.loginproject.util.Utility;

public class UserDetailsRepository {
	static JSONArray array;

	public static boolean addUser(JSONObject jsonObject) {
		String query = "INSERT into userdetails values(?,?,?,?,?,?)";

		try (Connection con = Utility.dbConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {

			pstmt.setString(1, jsonObject.get("firstname").toString());
			pstmt.setString(2, jsonObject.get("lastname").toString());
			pstmt.setString(3, jsonObject.get("username").toString());
			pstmt.setString(4, jsonObject.get("email").toString());
			pstmt.setString(5, jsonObject.get("phone").toString());
			pstmt.setString(6, jsonObject.get("password").toString());

			int result = pstmt.executeUpdate();
			if(result>0)
				return true;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	public static JSONArray getAuthenticatedUser(JSONObject jsonObject) throws ClassNotFoundException, SQLException {

		array = Utility.getJsonArray();
		String uname = (String) jsonObject.get("username");
		String pswd = (String) jsonObject.get("password");
		String query = "SELECT * from userdetails WHERE UserName=? AND Password=?";
		ResultSet rs = null;
		try (Connection con = Utility.dbConnection(); PreparedStatement pstmt = con.prepareStatement(query);) {
			pstmt.setString(1, uname);
			pstmt.setString(2, pswd);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				return UserDetailsRepository.findAll();
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static JSONArray findAll() throws ClassNotFoundException, SQLException {
		JSONObject jsonObject = null;
		array = Utility.getJsonArray();
		String userDetails = "SELECT * from userdetails";
		ResultSet rs = null;

		try (Connection con = Utility.dbConnection(); PreparedStatement pstmt = con.prepareStatement(userDetails);) {

			rs = pstmt.executeQuery();
			while (rs.next()) {
				jsonObject = Utility.getJsonObject();
				jsonObject.put("firstname", rs.getString("FirstName"));
				jsonObject.put("lastname", rs.getString("LastName"));
				jsonObject.put("username", rs.getString("UserName"));
				jsonObject.put("email", rs.getString("Email"));
				jsonObject.put("contact", rs.getString("Mobile"));
				jsonObject.put("password", rs.getString("Password"));
				array.add(jsonObject);
				// System.out.println("DB :"+array.toString());
			}

		}
		return array;

	}
	
	@SuppressWarnings("unchecked")
	public static JSONObject getOneUserDetails(String name) throws ClassNotFoundException, SQLException {
		JSONObject object = Utility.getJsonObject();
		String editUser = "SELECT * FROM userdetails WHERE UserName=?";
		ResultSet rs =null;
		try(Connection con = Utility.dbConnection();PreparedStatement pstmt = con.prepareStatement(editUser)){
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				object = Utility.getJsonObject();
				object.put("firstname", rs.getString("FirstName"));
				object.put("lastname", rs.getString("LastName"));
				object.put("username", rs.getString("UserName"));
				object.put("email", rs.getString("Email"));
				object.put("contact", rs.getString("Mobile"));
				object.put("password", rs.getString("Password"));
				
			}
		}
		return object;
	}
	/*
	 * This method will delete the UserDetails
	 * @param-type: String
	 * @return-type: boolean
	 * 
	 * */
	public static boolean delete(String username) throws ClassNotFoundException, SQLException {
		String deleteUser = "DELETE FROM userdetails where UserName=?";
		try(Connection con = Utility.dbConnection();PreparedStatement pstmt = con.prepareStatement(deleteUser);){
			pstmt.setString(1, username);
			boolean rowDeleted = pstmt.executeUpdate()>0;
			return rowDeleted;
		}
	}
	
	/*
	 * This method will update the UserDetails
	 * @param-type: JSONObject
	 * @return-type: boolean
	 * 
	 * */
	public static boolean update(JSONObject jsonObject) throws ClassNotFoundException, SQLException {
		String updateUser = "UPDATE userdetails SET FirstName=?,LastName=?,Email=?,Mobile=? WHERE UserName=?";
		try(Connection con = Utility.dbConnection();PreparedStatement pstmt = con.prepareStatement(updateUser);){
			pstmt.setString(1, jsonObject.get("firstname").toString());
			pstmt.setString(2, jsonObject.get("lastname").toString());
			pstmt.setString(3, jsonObject.get("email").toString());
			pstmt.setString(4, jsonObject.get("phone").toString());
			pstmt.setString(5, jsonObject.get("username").toString());
			boolean rowDeleted = pstmt.executeUpdate()>0;
			return rowDeleted;
		}
	}

	public static boolean userNameChecker(String username) {
		String userAvailable = "SELECT * FROM userdetails WHERE UserName=?";
		return false;
		
	}
}

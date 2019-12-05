package com.blbz.loginproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.loginproject.customexception.UserAlreadyExistException;
import com.blbz.loginproject.model.Registration;
import com.blbz.loginproject.repository.UserDetailsRepository;
import com.blbz.loginproject.service.UserDetailsService;
import com.blbz.loginproject.util.Utility;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	Registration userDetails = Utility.getRegistration();
	// RegistrationService registrationService = Utility.getRegistrationService();
	UserDetailsService userDetailsService = Utility.getUserService();
	JSONArray array = null;
	JSONObject jsonObject;
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		String fName = req.getParameter("firstName");
		String lName = req.getParameter("lastName");
		String uName = req.getParameter("userName");
		String email = req.getParameter("email");
		String contactNumber = req.getParameter("contactNumber");
		String password = req.getParameter("password");

		userDetails.setFirstName(fName);
		userDetails.setLastName(lName);
		userDetails.setUserName(uName);
		userDetails.setEmail(email);
		userDetails.setMobile(contactNumber);
		userDetails.setPassword(password);

		try {
			jsonObject = UserDetailsRepository.getOneUserDetails(uName);
			if (jsonObject != null) {
				
			//	out.print("<script language='JavaScript'>alert('Hello');</script>");
				//req.setAttribute("useravailable", "User is already exist");
			//	throw new UserAlreadyExistException("User is already exist");
			} else {
				boolean result = userDetailsService.addUser(userDetails);
				if (result) {
					req.setAttribute("insert", "Data is added into the table successfully!!!");
					resp.sendRedirect("index.jsp");
				} else {
					req.setAttribute("message", "Something went wrong!!!");
					resp.sendRedirect("error.jsp");
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

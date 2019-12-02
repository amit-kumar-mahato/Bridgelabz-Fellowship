package com.blbz.loginproject.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import com.blbz.loginproject.model.Registration;
import com.blbz.loginproject.service.RegistrationService;
import com.blbz.loginproject.util.Utility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet{
	Registration userDetails = Utility.getRegistration();
	RegistrationService registrationService = Utility.getRegistrationService();
	JSONArray array = null;
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
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
		
		//req.setAttribute("uname", userDetails.getUserName());
		array = registrationService.addUser(userDetails);
		/*if(result) {
			HttpSession session = req.getSession();
			session.setAttribute("username", uName);
			req.setAttribute("insert", "Data is added into the table successfully!!!");
			resp.sendRedirect("index.jsp");
		}
		else {
			req.setAttribute("message", "Something went wrong!!!");
			resp.sendRedirect("error.jsp");
		}*/
		
		System.out.println("User Details:\n"+array.size());
	}
	
}

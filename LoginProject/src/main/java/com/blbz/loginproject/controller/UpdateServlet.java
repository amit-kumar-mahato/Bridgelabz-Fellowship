package com.blbz.loginproject.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import com.blbz.loginproject.model.Registration;
import com.blbz.loginproject.repository.UserDetailsRepository;
import com.blbz.loginproject.service.UserDetailsService;
import com.blbz.loginproject.serviceimpl.UserDetailsServiceImpl;
import com.blbz.loginproject.util.Utility;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{

	Registration userDetails = Utility.getRegistration();
	UserDetailsService userService = new UserDetailsServiceImpl();
	JSONArray array = Utility.getJsonArray();
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String uname = req.getParameter("userName");
		String email = req.getParameter("email");
		String contactNumber = req.getParameter("contactNumber");
		
		userDetails.setFirstName(fname);
		userDetails.setLastName(lname);
		userDetails.setUserName(uname);
		userDetails.setEmail(email);
		userDetails.setMobile(contactNumber);
		
		try {
			if(userService.updateUserDetails(userDetails)) {
				array = UserDetailsRepository.findAll();
				req.setAttribute("jsonArray", array);
				
				RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
				rd.forward(req, resp);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

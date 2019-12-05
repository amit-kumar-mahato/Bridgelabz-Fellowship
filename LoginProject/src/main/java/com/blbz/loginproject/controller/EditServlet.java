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
import org.json.simple.JSONObject;

import com.blbz.loginproject.model.Registration;
import com.blbz.loginproject.repository.UserDetailsRepository;
import com.blbz.loginproject.service.UserDetailsService;
import com.blbz.loginproject.serviceimpl.UserDetailsServiceImpl;
import com.blbz.loginproject.util.Utility;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	JSONObject jsonObject = null;
	JSONArray array = null;
	Registration userDetails = Utility.getRegistration();
	UserDetailsService userService = new UserDetailsServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("user");

		try {
			jsonObject = UserDetailsRepository.getOneUserDetails(name);
			if(jsonObject!=null) {
				System.out.println("Coming inside if block");
				req.setAttribute("userdetails", jsonObject);

				RequestDispatcher rd = req.getRequestDispatcher("edit.jsp");
				rd.forward(req, resp);
			}
			else {
				
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

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

import com.blbz.loginproject.repository.UserDetailsRepository;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	JSONArray array = null;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("user");
		try {
			array = UserDetailsRepository.getOneUserDetails(name);
			req.setAttribute("userdetails", array);
			RequestDispatcher rd = req.getRequestDispatcher("edit.jsp");
			rd.forward(req, resp);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

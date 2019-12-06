package com.blbz.loginproject.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import com.blbz.loginproject.repository.UserDetailsRepository;
import com.blbz.loginproject.service.UserDetailsService;
import com.blbz.loginproject.util.Utility;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{
	
	UserDetailsService service = Utility.getUserService();
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		JSONArray array = Utility.getJsonArray();
		String name = req.getParameter("user");
		//System.out.println("Coming inside DeleteServlet :"+name);
		boolean result;
		
		try {
			result = service.deleteUserDetails(name);
			if(result) {
		
				array = UserDetailsRepository.findAll();
				req.setAttribute("jsonArray", array);
				RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
				rd.forward(req, resp);
			}
			else {
				req.setAttribute("message", "exist/notexist");
				resp.sendRedirect("error.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

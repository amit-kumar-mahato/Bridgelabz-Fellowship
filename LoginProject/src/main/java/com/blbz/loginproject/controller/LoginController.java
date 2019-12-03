package com.blbz.loginproject.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;

import com.blbz.loginproject.model.Login;
import com.blbz.loginproject.service.LoginService;
import com.blbz.loginproject.util.Utility;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	Login login = Utility.getLogin();
	LoginService loginService = Utility.getLoginService();
	JSONArray array = null;

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("userName");
		String password = req.getParameter("password");

		login.setUsername(uname);
		login.setPassword(password);
		
		try {
			array = loginService.authenticateUser(login);
			req.setAttribute("jsonArray", array);
			if (array!=null) {

				HttpSession httpSession = req.getSession();
				httpSession.setAttribute("username", uname);
				 RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
				 rd.forward(req, resp);
				 
				//resp.sendRedirect("success.jsp");
			} else {
				req.setAttribute("message", "Invalid Username/Password");
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, resp);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

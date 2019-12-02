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

import com.blbz.loginproject.model.Login;
import com.blbz.loginproject.service.LoginService;
import com.blbz.loginproject.util.Utility;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	Login login = Utility.getLogin();
	LoginService loginService = Utility.getLoginService();

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("userName");
		String password = req.getParameter("password");

		login.setUsername(uname);
		login.setPassword(password);

		req.setAttribute("username", login);

		boolean result;
		try {
			result = loginService.authenticateUser(login);

			if (result) {

				HttpSession httpSession = req.getSession();
				httpSession.setAttribute("username", uname);
				/*
				 * RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
				 * rd.forward(req, resp);
				 */
				resp.sendRedirect("success.jsp");
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

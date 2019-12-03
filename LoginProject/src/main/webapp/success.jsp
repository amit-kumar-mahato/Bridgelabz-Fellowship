<%@page import="org.json.simple.JSONArray"%>
<%@page import= "org.json.simple.JSONObject"%>
<%@page import="com.blbz.loginproject.model.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.blbz.loginproject.controller.LoginController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/css/bootstrap.min.css"
	integrity="sha384-SI27wrMjH3ZZ89r4o+fGIJtnzkAnFs3E4qz9DIYioCQ5l9Rd/7UAa8DHcaL8jkWt"
	crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="CSS/success.css" />

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="JS/formvalidation.js"></script>
</head>
<body>
	
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		response.setHeader("Pragma", "no-cache");

		if (session.getAttribute("username") == null) {
			response.sendRedirect("index.jsp");
		} else {
			/* String name = (String)session.getAttribute("username");
			out.println("Welcome :"+name); */
		
	%>
	<div class="container">
	<p>Congratulation <%=session.getAttribute("username") %> you are successfully Logged In!!!!</p>
	<table>
		<tr class="heading">
			<td>First Name</td>
			<td>Last Name</td>
			<td>User Name</td>
			<td>Email</td>
			<td>Mobile</td>
			<td>Action</td>
		</tr>
		<%
			JSONArray array = (JSONArray) request.getAttribute("jsonArray");

				for (int i = 0; i < array.size(); i++) {
					JSONObject userInfo = (JSONObject) array.get(i);
		%>
		<tr>
			<td><%=userInfo.get("firstname")%></td>
			<td><%=userInfo.get("lastname")%></td>
			<%String uname = (String)userInfo.get("username"); %>
			<td><%=uname%></td>
			<td><%=userInfo.get("email")%></td>
			<td><%=userInfo.get("contact")%></td>
			<td>
				<!-- <button type="button" class="btn btn-primary">Edit</button>
				<button type="button" class="btn btn-danger">Delete</button> -->
				<a class="btn btn-primary">Edit</a>
				<form action="delete">
					<input type="hidden" id="deleteuserdetails" value="uname">
					<button type="button" >Delete</button>
				</form>
			</td>
		</tr>
		<%
			}
			}
		%>
	</table>
	<form action="logout">
		<div>
			<input type="submit" class="btn btn-primary" value="Logout">
		</div>
	</form>
	</div>
</body>
</html>
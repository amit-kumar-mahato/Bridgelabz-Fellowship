<%@page import="org.json.simple.JSONObject"%>
<html>
<!-- Latest compiled and minified CSS -->
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/css/bootstrap.min.css"
	integrity="sha384-SI27wrMjH3ZZ89r4o+fGIJtnzkAnFs3E4qz9DIYioCQ5l9Rd/7UAa8DHcaL8jkWt"
	crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="CSS/registration.css" />

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
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
<%
	JSONObject jsonObject = (JSONObject)request.getAttribute("userdetails");
%>
	<div class="container registration">
		<fieldset class="border p-2">
			<legend class="w-auto">Registration Form</legend>
			<form action="update" method="post" id="registrationForm" onsubmit="return validation();">
				<div class="row" style="padding-bottom: 20px">
					<div class="col">
						<label>First Name</label>
						<input type="text" class="form-control" name="firstName"
							id="fname" value="<%=jsonObject.get("firstname")%>">
							<span id="firstname" class="text-danger font-weight-bold"></span>
					</div>
					<div class="col">
						<label>Last Name</label>
						<input type="text" class="form-control" name="lastName"
							id="lname" value="<%=jsonObject.get("lastname")%>">
							<span id="lastname" class="text-danger font-weight-bold"></span>
					</div>
				</div>
				<div class="row" style="padding-bottom: 20px">
					<div class="col">
						<label>User Name</label>
						<input type="text" class="form-control" name="userName"
							id="uname" value="<%=jsonObject.get("username")%>" readonly="readonly">
							<span id="username" class="text-danger font-weight-thin"></span>
					</div>
				</div>
				<div class="row" style="padding-bottom: 20px">
					<div class="col">
						<label>Email</label>
						<input type="text" class="form-control" name="email"
							id="email" value="<%=jsonObject.get("email")%>">
							<span id="mailid" class="text-danger font-weight-bold"></span>
					</div>
					<div class="col">
						<label>Contact Number</label>
						<input type="number" class="form-control" name="contactNumber"
							id="ph" value="<%=jsonObject.get("contact")%>">
							<span id="mobile" class="text-danger font-weight-bold"></span>
					</div>
				</div>
				
				<button class="btn btn-primary" type="submit">SUBMIT</button>
				<%} %>
			</form>
		</fieldset>
	</div>
	
	<script type="text/javascript">
	
	function validation(){
		//alert("Coming inside if block");
		var firstName = document.getElementById('fname').value;
		var lastName = document.getElementById('lname').value;
		var userName = document.getElementById('uname').value;
		var email = document.getElementById('email').value;
		var contact = document.getElementById('ph').value;
		
		var letters = /^[A-Za-z]+$/;
		var mobilePattern = /^[7-9][0-9]{9}$/;
		
		if(firstName == ""){
			document.getElementById('firstname').innerHTML ="Please fill the First Name field";
			return false;
		}
		if(!firstName.match(letters)){
			document.getElementById('firstname').innerHTML ="Please Enter only alphabets";
			return false;
		}
		
		if(lastName == ""){
			document.getElementById('lastname').innerHTML ="Please fill the Last Name field";
			return false;
		}
		if(!lastName.match(letters)){
			document.getElementById('lastname').innerHTML ="Please Enter only alphabets";
			return false;
		}
		
		if(userName == ""){
			document.getElementById('username').innerHTML ="Please fill the User Name field";
			return false;
		}
		if((userName.length <= 5) || (userName.length>10)){
			document.getElementById('username').innerHTML ="Username must be greater than 5 and less than 10";
			return false;
		}
		
		if(email == ""){
			document.getElementById('mailid').innerHTML ="Please fill the Email field";
			return false;
		}
		if(contact == ""){
			document.getElementById('mobile').innerHTML ="Please fill the Contact field";
			return false;
		}
		if(contact.length>10){
			document.getElementById('mobile').innerHTML ="Invalid Contact Number";
			return false;
		}
	}
	
	</script>
</body>
</html>

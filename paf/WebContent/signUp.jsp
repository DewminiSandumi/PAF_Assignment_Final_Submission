<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.Connection" %>
    <%@page import="java.sql.DriverManager" %>
    <%@page import="java.sql.Statement" %>
    <%@page import="java.sql.ResultSet" %>
    <%ResultSet resultset = null; %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> book club</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/responsive-slider.css" rel="stylesheet">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/magnific-popup.css"> 
	<link href="css/style.css" rel="stylesheet">	
"WebContent/signUp.jsp"

			
  </head>
  <body>
  
  <%
  	try{
  		Class.forName("com.mysql.jdbc.Driver");
  		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paf","root","");
  		Statement st=con.createStatement();
  		resultset=st.executeQuery("select * from interest");
  		
  	}
  	catch(Exception ex){
  		ex.printStackTrace();
  	}
  	
  %>
  
	<header>
		<div class="container">
			<div class="row">
				<nav class="navbar navbar-default" role="navigation">
					<div class="container-fluid">
						<div class="navbar-header">
							<div class="navbar-brand">
								<a href="home.jsp"><h1>WELCOME TO 4C KNOWLEDGE !</h1></a>
							</div>
						</div>
						<div class="menu">
							<ul class="nav nav-tabs" role="tablist">
								<li role="presentation" class="active"><a href="home.jsp">Home</a></li>								
								<li role="presentation"><a href="signUp.jsp">Sign Up</a></li>						
							</ul>
						s</div>
					</div>			
				</nav>
			</div>
		</div>
	</header>
	
	
	<div class="container">
		<div class="row">			
			<div class="media-body">
				<div class="navbar-header">
					<div class="navbar-brand">
						<a href="signUp.jsp"><h1>SignUp Here</h1></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	<div class="container">
		<div class="row">
			<hr>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-lg-6">	
				<form role="form" action="${pageContext.request.contextPath}/signUp" method="post" >
					<div class="form-group">
						<input type="text" class="form-control" name="fname" placeholder="First Name" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="lname" placeholder="Last Name" required>
					</div>
					<div class="form-group">
						<input type="date" class="form-control" name="DOB" placeholder="Date of birth" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="pAddress" placeholder="Permenant Address" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="cAddress" placeholder="Current Address" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="mobile" placeholder="Mobile" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="phone" placeholder="Home Telephone" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="email" placeholder="Email" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="password" placeholder="Password" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="cPassword" placeholder="Confirm Password" required>
					</div>
					
					<div class="company">
						<div class = "button">
							<a href="" alt="">Select your favourites</a>
							<p>(* for mutiple selections select items with ctrl)</p>						
							<select name="favourites" style="width:400px;height:200px" multiple="multiple"  required>
							<%
								while(resultset.next())
								{
									%>
									<option>
										<%= resultset.getString(2)%>
									</option>
									<%
								}
								%>
							</select>
							
						</div>

					</div>
						<button type="submit" class="btn btn-default">Submit</button>
						<button type="reset" class="btn btn-default">Reset</button>
				</form>

			</div>
			
			<div class="col-lg-6">
				<div class="image">						
						<img src="img/home/signup.jpg" width="500px" height="500px" class="img-responsive" alt="" />
					</div>										
			</div>			
	</div>
	
	<div class="container">
		<div class="row">
			<hr>
		</div>
	</div>
		

  </body>
</html>
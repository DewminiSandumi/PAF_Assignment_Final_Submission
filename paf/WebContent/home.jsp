<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
  </head>
  <body>
    
    <header>
		<div class="container">
			<div class="row">
				<nav class="navbar navbar-default" role="navigation">
					<div class="container-fluid">
						<div class="navbar-header">
							<div class="navbar-brand">
								<a href="index.html"><h1>WELCOME TO 4C KNOWLEDGE !</h1></a>
							</div>
						</div>
						<div class="menu">
							<ul class="nav nav-tabs" role="tablist">
								<li role="presentation" class="active"><a href="home.jsp">Home</a></li>	
								<!--  li role="presentation" class="active"><a href="Admin.jsp">Admin</a></li-->							
								<li role="presentation"><a href="signUp.jsp">Sign Up</a></li>						
							</ul>
						</div>
					</div>			
				</nav>
			</div>
		</div>
	</header>
    
	
	<div class="container">
		<div class="row">			
			<div class="media-body">
				<div class="list-group-item">
					<h5 class="media-heading">Books make your mind sharper..	 Life more exciting..	 Spirits higher..	Stress levels lower..	Heart more compassionate..</h5>	
				</div>
			</div>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="page-header">
					<div class="image">						
						<img src="img/home/home.jpg" class="img-responsive"alt="" />	
						
						<p>Find your favourite books ..</p>
						
						<section class="portfolio">
							<div class="container">
								<div class="row">
									<div class="popup-gallery">
										<div class="col-md-1">
											<a href="img/books/ai2.jpg" title="The Cleaner"><img src="img/books/ai2.jpg" width="100" height="150" class="img-responsive"alt="" /></a>
											<p>Programming Game AI by Example</p>											
										</div>
										<div class="col-md-1">					
											<a href="img/books/ai3.jpg" title="The Cleaner"><img src="img/books/ai3.jpg" width="100" height="150"  class="img-responsive"alt="" /></a>
											<p>Introduction to Artificial Intelligence</p>
										</div>
										<div class="col-md-1">
											<a href="img/books/ai4.jpg" title="The Cleaner"><img src="img/books/ai4.jpg" width="100" height="150"  class="img-responsive"alt="" /></a>
											<p>Artificial Intelligence</p>	
										</div>	
										<div class="col-md-1">
											<a href="img/books/mw1.jpg" title="The Cleaner"><img src="img/books/mw1.jpg" width="100" height="150"  class="img-responsive"alt="" /></a>
											<p>The complete book of middleware</p>											
										</div>
										<div class="col-md-1">					
											<a href="img/books/mw2.jpg" title="The Cleaner"><img src="img/books/mw2.jpg" width="100" height="150"  class="img-responsive"alt="" /></a>
											<p>IT architecture and middleware</p>
										</div>
										<div class="col-md-1">
											<a href="img/books/ps2.png" title="The Cleaner"><img src="img/books/ps2.png" width="100" height="150"  class="img-responsive"alt="" /></a>
											<p>Friendship and Politics</p>	
										</div>	
										<div class="col-md-1">
											<a href="img/books/sc2.jpg" title="The Cleaner"><img src="img/books/sc2.jpg" width="100" height="150"  class="img-responsive"alt="" /></a>
											<p>The elegant universe</p>	
										</div>		
									</div>
								</div>
							</div>
						</section>

					</div>
				</div>				
			</div>
			
			
			<div class="col-md-4">
				<form class="form-search" action="login" method="post" >
					<input class="form-control" type="text" placeholder="Username" name="userName" required>
					<input class="form-control" type="password" placeholder="Password" name="password" required>
					
					<div class = "button">
						<button type="submit" class="btn btn-default">Sign in</button></br>
					</div>
					
					<div>
						<a href="signUp.jsp" alt="">Not a member? Sign up now !</a>
					</div>
					
					
				</form>
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong>Popular Posts</strong>
					</div>
					<div class="panel-body">
						<div class="media">
							<a class="media-left" href="#">
								<img src="img/books/ai.jpg" alt="" style="width:100px;height:150px;"></br>
							</a>
							<div class="media-body">
								<h4 class="media-heading">Artificial Intelligence: Foundations of Computational Agents</h4>
								<p>A textbook aimed at junior to senior undergraduate students and first-year graduate students. It presents artificial intelligence (AI) using a coherent framework to study the design of intelligent computational agents.
								</p>
								<div class="ficon">
									<a href="" alt="">Sign up for more books..</a> 
								</div>
							</div>
						</div>
					</div>
				</div>			
			</div>				
		</div>
	</div>

  </body>
</html>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.bean.Register"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Google font -->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700"
	rel="stylesheet">

<!-- Bootstrap -->
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

<!-- Slick -->
<link type="text/css" rel="stylesheet" href="css/slick.css" />
<link type="text/css" rel="stylesheet" href="css/slick-theme.css" />

<!-- nouislider -->
<link type="text/css" rel="stylesheet" href="css/nouislider.min.css" />

<!-- Font Awesome Icon -->
<link rel="stylesheet" href="css/font-awesome.min.css">

<!-- Custom stlylesheet -->
<link type="text/css" rel="stylesheet" href="css/style.css" />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

</head>
<body>
	<!-- HEADER -->
	<header>
		<!-- TOP HEADER -->
		<div id="top-header">
			<div class="container">
				<ul class="header-links pull-left">
					<li><a href="#"><i class="fa fa-phone"></i>8293677716</a></li>
					<li><a href="#"><i class="fa fa-envelope-o"></i>dhruv@gmail.com</a></li>
					<li><a href="#"><i class="fa fa-map-marker"></i> 57,Adajan Surat</a></li>
				</ul>
				<ul class="header-links pull-right">
				<li><a href="contact.jsp"><i class="fa fa-phone-square" aria-hidden="true"></i>Contact</a></li>
				<% 
				  Register u=null;
				if(session!=null){
				   if(session.getAttribute("u")!=null){
				        u=(Register)session.getAttribute("u");
				%>
				    <li><a href="seller_profile.jsp"><i class="fa fa-user-o"></i>Profile</a></li>
				    <li><span style="color:white;"><b>Welcome <%=u.getFname() %></b></span></li>
					<li><a href="seller_changepassword.jsp"><i aria-hidden="true"></i>Change Password</a></li>
					<li><a href="logout.jsp"><i aria-hidden="true"></i>Logout</a></li>
					
				<%
				}	   
				else
				{
				%>	
					<li><a href="register.jsp"><i class="fa fa-user-o"></i>Register</a></li>
					<li><a href="login.jsp"><i aria-hidden="true"></i>Login</a></li>
					<%
				      }
				}
				else{
					%>
					<li><a href="register.jsp"><i class="fa fa-user-o"></i>Register</a></li>
					<li><a href="login.jsp"><i aria-hidden="true"></i>Login</a></li>
					 <%
				         }
				     %>
				</ul>
			</div>
		</div>
		<!-- /TOP HEADER -->

		<!-- MAIN HEADER -->
		<div id="header">
			<!-- container -->
			<div class="container">
				<!-- row -->
				<div class="row">
					<!-- LOGO -->
					<div class="col-md-3">
						<div class="header-logo">
							<a href="#" class="logo"> <img src="./img/logo.png" alt="">
							</a>
						</div>
					</div>
					<!-- /LOGO -->
					<% 
					Register u1=null;
					if(session!=null){
					   if(session.getAttribute("u")!=null){
						    u1=(Register)session.getAttribute("u");
					%>
					<!-- SEARCH BAR -->
					<div class="col-md-6">
						<div class="header-search">
							<form>
								<select class="input-select">
									<option value="0">All Categories</option>
									<option value="1">Category 01</option>
									<option value="1">Category 02</option>
								</select> <input class="input" placeholder="Search here">
								<button class="search-btn">Search</button>
							</form>
						</div>
					</div>
					<!-- /SEARCH BAR -->

					<!-- ACCOUNT -->
					<div class="col-md-3 clearfix">
						<div class="header-ctn">
							<!-- Wishlist -->
							<div>
								<a href="seller_add_product.jsp"> <i class="fa fa-plus"></i> <span>Add Product</span>
								</a>
							</div>
							<!-- /Wishlist -->

							<!-- Cart -->
							<div class="dropdown">
								<a href="seller_view_product.jsp"><i class="fa fa-list"></i> 
								<span>View Product</span></a>
								
							
						</div>
					</div>
					<!-- /ACCOUNT -->
					 <% 
					 }
					   else{
						   
					   }
					}
					
					%>
				</div>
				<!-- row -->
			</div>
			<!-- container -->
		</div>
		<!-- /MAIN HEADER -->
	</header>
	<!-- /HEADER -->

	<!-- NAVIGATION -->
	<nav id="navigation">
		<!-- container -->
		<div class="container">
			<!-- responsive-nav -->
			<div id="responsive-nav">
				<!-- NAV -->
				<ul class="main-nav nav navbar-nav">
					<li class="active"><a href="seller_index.jsp">Home</a></li>
				</ul>
				<!-- /NAV -->
			</div>
			<!-- /responsive-nav -->
		</div>
		</nav>
	<!-- /NAVIGATION -->
</body>
</html>

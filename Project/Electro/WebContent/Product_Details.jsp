<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<%@page import="com.bean.Product"%>
<%@page import="com.controller.ProductController"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.dao.WishlistDao"%>
<%@page import="com.dao.CartDao"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<title>Electro - HTML Ecommerce Template</title>

</head>
<body>
	
	<!-- SECTION -->
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">

				<!-- Products tab & slick -->
				<div class="col-md-12">
					<div class="row">
						<div class="products-tabs">
							<!-- tab -->
							<div id="tab1" class="tab-pane active">
								<div class="products-slick" data-nav="#slick-nav-1">
								
								<%
								 int pid=Integer.parseInt(request.getParameter("pid"));     
								 Product p=ProductDao.getProductsById(pid);
                                %>
									<!-- product -->
									<div class="product">
										<div class="product-img">
											<img src="Product_Images/<%=p.getProd_img()%>" alt="">
										</div>
										<div class="product-body">
											<p class="product-category"><%=p.getProd_category()%></p>
											<h3 class="product-name">
												<a href="#"><%=p.getProd_name()%></a>
											</h3>
											<h4 class="product-price">Rs. <%=p.getProd_price()%></h4>
											<div class="product-rating">
												<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i>
											</div>
											<p class="product-details"><%=p.getProd_desc()%></p>
											
											<%
											    if(session.getAttribute("u")!=null){
											    	boolean flag=WishlistDao.checkWishlist(u.getCno(),p.getPid());
											    	if(flag==false){
											%>
											  <a href="add_to_wishlist.jsp?pid=<%=p.getPid()%>&cno=<%=u.getCno()%>">
											      <input type="submit" value="Add to wishlist" class="btn btn-primary">
											  </a>
											  <%
											    	}
											    	else
											    	{										    		
											  %>
								          <a href="remove_from_wishlist.jsp?pid=<%=p.getPid()%>&cno=<%=u.getCno()%>">
							              <input type="submit" value="Remove from wishlist" class="btn btn-danger">
							              </a>
											  <% 
											    }
											  }  	
											    else {
											  %>
											
											<a href="login.jsp">
											<input type="submit" value="Buy Product" class="btn btn-danger">
											</a>
											
											<%
											    }
											%>
										</div>
										
								        <%
								             if(session.getAttribute("u")!=null){
								            	 boolean flag=CartDao.checkCart(u.getCno(),p.getPid());
								            	 if(flag==false){
								        %>
								            		 <div class="add-to-cart">
													    <a href="add_to_cart.jsp?cno=<%=u.getCno()%>&pid=<%=p.getPid()%>">
														<button class="add-to-cart-btn">
															<i class="fa fa-shopping-cart"></i> Add to Cart
														</button>
													   </a>
													</div>
													
									<%
								            	 }
								            	 else{
								    %>        		 
								            
								            <div class="add-to-cart">
													    <a href="remove_from_cart.jsp?cno=<%=u.getCno()%>&pid=<%=p.getPid()%>">
														<button class="add-to-cart-btn">
															<i class="fa fa-shopping-cart"></i> Remove From Cart
														</button>
													   </a>
													</div>
						    	    <%         
								            	 }
								             }else{
								    %>
										
								<%
							          }
								%>	    
						    	    </div>
									<!-- /product -->
								</div>
								<div id="slick-nav-1" class="products-slick-nav"></div>
							</div>
							<!-- /tab -->
						</div>
					</div>
				</div>
				<!-- Products tab & slick -->
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /SECTION -->
    <br><br>
	 <!-- FOOTER -->
	<footer id="footer">
		<!-- top footer -->
		<div class="section">
			<!-- container -->
			<div class="container">
				<!-- row -->
				<div class="row">
					<div class="col-md-3 col-xs-6">
						<div class="footer">
							<h3 class="footer-title">About Us</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut.</p>
							<ul class="footer-links">
								<li><a href="#"><i class="fa fa-map-marker"></i>1734
										Stonecoal Road</a></li>
								<li><a href="#"><i class="fa fa-phone"></i>+021-95-51-84</a></li>
								<li><a href="#"><i class="fa fa-envelope-o"></i>email@email.com</a></li>
							</ul>
						</div>
					</div>

					<div class="col-md-3 col-xs-6">
						<div class="footer">
							<h3 class="footer-title">Categories</h3>
							<ul class="footer-links">
								<li><a href="#">Hot deals</a></li>
								<li><a href="#">Laptops</a></li>
								<li><a href="#">Smartphones</a></li>
								<li><a href="#">Cameras</a></li>
								<li><a href="#">Accessories</a></li>
							</ul>
						</div>
					</div>

					<div class="clearfix visible-xs"></div>

					<div class="col-md-3 col-xs-6">
						<div class="footer">
							<h3 class="footer-title">Information</h3>
							<ul class="footer-links">
								<li><a href="#">About Us</a></li>
								<li><a href="contact.jsp">Contact Us</a></li>
								<li><a href="#">Privacy Policy</a></li>
								<li><a href="#">Orders and Returns</a></li>
								<li><a href="#">Terms & Conditions</a></li>
							</ul>
						</div>
					</div>

					<div class="col-md-3 col-xs-6">
						<div class="footer">
							<h3 class="footer-title">Service</h3>
							<ul class="footer-links">
								<li><a href="#">My Account</a></li>
								<li><a href="#">View Cart</a></li>
								<li><a href="#">Wishlist</a></li>
								<li><a href="#">Track My Order</a></li>
								<li><a href="#">Help</a></li>
							</ul>
						</div>
					</div>
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /top footer -->

		<!-- bottom footer -->
		<div id="bottom-footer" class="section">
			<div class="container">
				<!-- row -->
				<div class="row">
					<div class="col-md-12 text-center">
						<ul class="footer-payments">
							<li><a href="#"><i class="fa fa-cc-visa"></i></a></li>
							<li><a href="#"><i class="fa fa-credit-card"></i></a></li>
							<li><a href="#"><i class="fa fa-cc-paypal"></i></a></li>
							<li><a href="#"><i class="fa fa-cc-mastercard"></i></a></li>
							<li><a href="#"><i class="fa fa-cc-discover"></i></a></li>
							<li><a href="#"><i class="fa fa-cc-amex"></i></a></li>
						</ul>
						<span class="copyright"> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							Copyright &copy;<script>
								document.write(new Date().getFullYear());
							</script>
							All rights reserved | This template is made with <i
							class="fa fa-heart-o" aria-hidden="true"></i> by <a
							href="https://colorlib.com" target="_blank">Colorlib</a> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						</span>
					</div>
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /bottom footer -->
	</footer>
	<!-- /FOOTER -->

	<!-- jQuery Plugins -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/slick.min.js"></script>
	<script src="js/nouislider.min.js"></script>
	<script src="js/jquery.zoom.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>

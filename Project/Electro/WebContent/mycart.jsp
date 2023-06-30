<%@page import="java.util.Random"%>
<%@page import="com.dao.WishlistDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<%@page import="com.bean.Cart"%>
<%@page import="com.bean.Product"%>
<%@page import="com.controller.ProductController"%>
<%@page import="com.dao.CartDao"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="java.util.List"%>

<%
 	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1000000);
 %>
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

				<!-- section title -->
				<div class="col-md-12">
					<div class="section-title">
						<h3 class="title">Cart</h3>
					</div>
				</div>
				<!-- /section title -->

				<!-- Products tab & slick -->
				<div class="col-md-12">
					<div class="row">
						<div class="products-tabs">
							<!-- tab -->
							<div id="tab1" class="tab-pane active">
								<div class="products-slick" data-nav="#slick-nav-1">

									<%
								     int net_price=0;
								     List<Cart> list=CartDao.getCartByUser(u.getCno());
								     for(Cart c: list)
								     {
								    	   net_price=net_price+c.getTotal_price();
								    	   Product p=ProductDao.getProductsById(c.getPid());
								    	  
								    %>
									<!-- product -->
									<div class="product">
										<div class="product-img">
											<img src="Product_Images/<%=p.getProd_img()%>" alt="">
											<div class="product-label">
												<span class="sale">-30%</span> <span class="new">NEW</span>
											</div>
										</div>
										<div class="product-body">
											<p class="product-category"><%=p.getProd_category()%></p>
											<h3 class="product-name">
												<a href="#"><%=p.getProd_name()%></a>
											</h3>
											<h4 class="product-price">
												Rs.
												<%=p.getProd_price()%></h4>
											<p class="product-model"><%=p.getProd_model()%></p>

											<div class="product-rating"></div>

											<form action="CartController" name="changeqty" method="post">
												<input type="hidden" name="cid" value="<%=c.getCid()%>">
												<h3 class="product-name">
													<b>Quantity:</b> <input type="number" min="1" max="10"
														value="<%=c.getProd_qty()%>" name="prod_qty"
														onchange="this.form.submit();">
												</h3>
											</form>

											<div class="product-rating"></div>
											<h3 class="product-name">Total Price:</h3>
											<h4 class="product-price">
												Rs.
												<%=c.getTotal_price()%></h4>

											<div class="product-rating"></div>

											<a href="Product_Details.jsp?pid=<%=p.getPid()%>"> <input
												type="button" class="btn btn-primary" value="Details">
											</a>
										</div>
									</div>
									<%
								       }
									%>

									<form method="post" action="pgRedirect.jsp">
										<table border="1">
											<tbody>
												<tr>
													<th>S.No</th>
													<th>Label</th>
													<th>Value</th>
												</tr>
												<tr>
													<td>1</td>
													<td><label>ORDER_ID::*</label></td>
													<td><input id="ORDER_ID" tabindex="1" maxlength="20"
														size="20" name="ORDER_ID" autocomplete="off"
														value="ORDS_<%=randomInt%>"></td>
												</tr>
												<tr>
													<td>2</td>
													<td><label>CUSTID ::*</label></td>
													<td><input id="CUST_ID" tabindex="2" maxlength="30"
														size="12" name="CUST_ID" autocomplete="off"
														value="CUST001"></td>
												</tr>
												<tr>
													<td>3</td>
													<td><label>INDUSTRY_TYPE_ID ::*</label></td>
													<td><input id="INDUSTRY_TYPE_ID" tabindex="4"
														maxlength="12" size="12" name="INDUSTRY_TYPE_ID"
														autocomplete="off" value="Retail"></td>
												</tr>
												<tr>
													<td>4</td>
													<td><label>Channel ::*</label></td>
													<td><input id="CHANNEL_ID" tabindex="4" maxlength="12"
														size="12" name="CHANNEL_ID" autocomplete="off" value="WEB">
													</td>
												</tr>
												<tr>
													<td>5</td>
													<td><label>txnAmount*</label></td>
													<td><input title="TXN_AMOUNT" tabindex="10"
														type="text" name="TXN_AMOUNT" value="<%=net_price%>">
													</td>
												</tr>
												<tr>
													<td></td>
													<td></td>
													<td><input value="CheckOut" type="submit" onclick="" class="btn btn-danger"></td>
												</tr>
											</tbody>
										</table>
										* - Mandatory Fields
									</form>
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
							</script> All rights reserved
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

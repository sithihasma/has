<jsp:include page="Header.jsp"></jsp:include>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />



<div id="myContainer"
	style="height: 500px; width: 100%; overflow: hidden; cursor: pointer">
	<div id="myCarousel" class="carousel slide" data-ride="carousel"
		data-interval="2000">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>

			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="${cp}/resources/images/kh2.jpg" alt="Chania"
					style="height: 500px; width: 100%; overflow: hidden; cursor: pointer">
			</div>

			<div class="item">
				<img src="${cp}/resources/images/hb.jpg" alt="Chania"
					style="height: 500px; width: 100%; overflow: hidden; cursor: pointer">
			</div>

			<div class="item">
				<img src="${cp}/resources/images/mv.jpg" alt="Flower"
					style="height: 500px; width: 100%; overflow: hidden; cursor: pointer">
			</div>

		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>

	<!-- Cards -->
</div>
<div class="row" style="height: 400px; width: 100%;">

	<ul class="nav-justified">
		<li><div class="card ">
				<a href="${cp }/viewlist/iphone"></a><img class="card-img-top"
					src="${cp}/resources/images/stand.JPG" alt="Card image cap"
					style="height: 300px; padding: 8%; width: 100%; overflow: hidden; cursor: pointer"></a>

			</div></li>
		<li><div class="card">
				<a href="${cp }/viewlist/ipad"></a><img class="card-img-top"
					src="${cp}/resources/images/ex.jpg" alt="Card image cap"
					style="height: 300px; padding: 8%; width: 100%; overflow: hidden; cursor: pointer"></a>

			</div></li>
		<li><div class="card">
				<a href="${cp }/viewlist/mac"></a><img class="card-img-top"
					src="${cp}/resources/images/vroad.jpg" alt="Card image cap"
					style="height: 300px; padding: 8%; width: 100%; overflow: hidden; cursor: pointer"></a>

			</div></li>
	</ul>
</div>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bikers Shop</title>
</head>
<body>
	<div class=" container-fluid">
		<table class="table table-striped">
			<thead>
				<title>Bootstrap Example</title>
				<meta charset="utf-8">
				<meta name="viewport" content="width=device-width, initial-scale=1">
				<link rel="stylesheet"
					href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
				<script
					src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
				<script
					src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
				<style>
/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar {
	margin-bottom: 50px;
	border-radius: 0;
}

/* Remove the jumbotron's default bottom margin */
.jumbotron {
	margin-bottom: 0;
}

/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f2f2f2;
	padding: 25px;
}
</style>
				</head>
				<body>



					<div class="container">
						<div class="row">
							<div class="col-sm-3" style="height: 200px; width: 275px">
								<div class="panel panel-primary">
									<div class="panel-heading">Monsoon DEAL 50% Off</div>
									<div class="panel-body">
										<a href="${cp}/Exhaust"><img
											src="${cp}/resources/images/exhaust.jpg"
											class="img-responsive" style="height: 150px; width: 250px"
											alt="Image">
									</div>

									<div class="panel-footer">
										<b><center>Mobiles</center></b></a>
									</div>
								</div>
							</div>
							<div class="col-sm-3" style="height: 200px; width: 275px">
								<div class="panel panel-danger">
									<div class="panel-heading"> 50% flat Off</div>
									<div class="panel-body">
										<a href="${cp}/Helmets"><center>
												<img src="${cp}/resources/images/helmet.jpg"
													} class="img-responsive"
													style="height: 150px; width: 250px" alt="Image">
									</div>
									</center>
									<div class="panel-footer">
										<b><center>:Laptops</center></b></a>
									</div>
								</div>
							</div>
							<div class="col-sm-3" style="height: 200px; width: 275px">
								<div class="panel panel-success">
									<div class="panel-heading">30% flat Off</div>
									<div class="panel-body">
										<a href="${cp}/Gloves"><img
											src="${cp}/resources/images/gloves.jpg"
											class="img-responsive" style="height: 150px; width: 250px"
											alt="Image">
									</div>
									<div class="panel-footer">
										<b><center>Tab</center></b></a>
									</div>
								</div>
							</div>
							<div class="col-sm-4" style="height: 200px; width: 275px">
								<div class="panel panel-primary">
									<div class="panel-heading">Monsoon DEAL</div>
									<div class="panel-body">
										<a href="${cp}/SafetyGuards"><img
											src=${cp}/resources/images/safety.jpg class="img-responsive"
											style="height: 150px; width: 250px" alt="Image">
									</div>
									<div class="panel-footer">
										<b><center>Safety Guards</center></b></a>
									</div>
								</div>
							</div>

						</div>

						<br /> <br /> <br /> <br /> <br /> <br />


						<div class="row">
							<div class="col-sm-3" style="height: 200px; width: 275px">
								<div class="panel panel-primary">
									<div class="panel-heading">Monsoon DEAL</div>
									<div class="panel-body">
										<a href="/Accessories"><img
											src=${cp}/resources/images/accessories.png
											class="img-responsive" style="height: 150px; width: 250px"
											alt="Image">
									</div>
									<div class="panel-footer">
										<b><center>Accessories</center></b></a>
									</div>
								</div>
							</div>

							<div class="col-sm-3" style="height: 200px; width: 275px">
								<div class="panel panel-primary">
									<div class="panel-heading">Monsoon DEAL</div>
									<div class="panel-body">
										<a href="/Shoes"><img src=${cp}/resources/images/shoes.jpg
											class="img-responsive" style="height: 150px; width: 250px"
											alt="Image"></a>
									</div>
									<div class="panel-footer">
										<b><center>Shoes</center></b></a>
									</div>
								</div>
							</div>
							<div class="col-sm-3" style="height: 200px; width: 275px">
								<div class="panel panel-primary">
									<div class="panel-heading">Monsoon DEAL</div>
									<div class="panel-body">
										<a href="/lights"><img
											src=${cp}/resources/images/lights.jpg class="img-responsive"
											style="height: 150px; width: 250px" alt="Image">
									</div>
									<div class="panel-footer">
										<b><center>Cpu</center></b></a>
									</div>
								</div>
							</div>
							<div class="col-sm-3" style="height: 200px; width: 275px">
								<div class="panel panel-primary">
									<div class="panel-heading">Monsoon DEAL</div>
									<div class="panel-body">
										<a href="/Jackets"><img
											src=${cp}/resources/images/jacket.jpg class="img-responsive"
											style="height: 150px; width: 250px" alt="Image">
									</div>
									<div class="panel-footer">
										<b><center>Cpu</center></b></a>
									</div>
								</div>
							</div>
						</div>
						<br> <br>


						</tbody>
		</table>
	</div>
</body>
</html>
<jsp:include page="Footer.jsp"></jsp:include>
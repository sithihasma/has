<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />

<jsp:include page="Header.jsp"></jsp:include>
<h1>Sign-Up</h1>
<script>
	function validateForm() {

		var email = document.formLogin.email.value;
		var password = document.formLogin.password.value;
		if (email == null || email == "") {
			alert("username cant be left blank");
			return false;
		} else if (password.length < 8) {
			alert("Password must be atleast 8 character long");
			return false;
		}
	}
</script>
<div class="content">
	<div class="container">
		<c:if test="${not empty message }">
			<div class="row">
				<div class="col-md-offset-3 col-md-6">
					<div class="alert alert-danger">${message}</div>
				</div>
			</div>
	

</c:if>
</div>
</div>
<form class="form-horizontal"
	action="${cp}/login" method="post" id="loginForm">
	<div class="form-group">
		<label for="inputUsername" class="control-label col-xs-2">User
			Name</label>
		<div class="col-xs-2">
			<input type="text" name="username" class="form-control" id="username"
				placeholder="Username" required>
		</div>
	</div>
	<div class="form-group">
		<label for="inputPassword" class="control-label col-xs-2">Password</label>
		<div class="col-xs-2">
			<input type="password" name="password" class="form-control" id="password"
				placeholder="Password" required>
		</div>
	</div>
	0o<div class="form-group">
		<div class="col-xs-offset-2 col-xs-10">
			<div class="checkbox">
				<label><input type="checkbox">Remember me</label>
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="col-xs-offset-2 col-xs-10">
			<button type="submit" class="btn btn-primary">Login</button>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
			<button type="reset" class="btn btn-primary">Reset</button>

		</div>
	</div>


</form>

<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<jsp:include page="Footer.jsp"></jsp:include>
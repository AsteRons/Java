<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
<<<<<<< HEAD
	<title>Company Home Page</title>
=======
<<<<<<< HEAD
	<title>luv2code Company Home Page</title>
>>>>>>> master
</head>

<body>
	<h2>Company Home Page</h2>
	<hr>
	
	<p>
<<<<<<< HEAD
	Welcome to the  company home page!
=======
	Welcome to the luv2code company home page!
=======
	<title>Company Home Page</title>
</head>

<body>
	<h2>Company Home Page</h2>
	<hr>
	
	<p>
	Welcome to the  company home page!
>>>>>>> fb5d52c9c1fea16ee95f536da79ca6f6f1325c0c
>>>>>>> master
	</p>
	
	
	<!-- display user name and role -->
	
	<p>
		User: <security:authentication property="principal.username"/>
		<br><br>
		Role(s):  <security:authentication property="principal.authorities"/>
		
	</p>
	
<<<<<<< HEAD
	<security:authorize access = "hasRole('MANAGER')">
	<!--  Add a link to point to/leaders .. this is for the manager -->
		
		<p>
			<a href="${pageContext.request.contextPath}/leaders"> LeaderShip Meeting for Manager
			</a>
			(Only for Manager peeps)
		</p>
		
	</security:authorize>
		
	<security:authorize access = "hasRole('ADMIN')">	
		<!--  Add link to point to /systems ... for this -->
=======
<<<<<<< HEAD
	<hr>
>>>>>>> master

		<p>
			<a href="${pageContext.request.contextPath}/systems"> IT Systems Meeting
			</a>
			(Only for Admin peeps)
		</p>
	</security:authorize>
	
<<<<<<< HEAD
	<hr>

=======
=======
	<security:authorize access = "hasRole('MANAGER')">
	<!--  Add a link to point to/leaders .. this is for the manager -->
		
		<p>
			<a href="${pageContext.request.contextPath}/leaders"> LeaderShip Meeting for Manager
			</a>
			(Only for Manager peeps)
		</p>
		
	</security:authorize>
		
	<security:authorize access = "hasRole('ADMIN')">	
		<!--  Add link to point to /systems ... for this -->

		<p>
			<a href="${pageContext.request.contextPath}/systems"> IT Systems Meeting
			</a>
			(Only for Admin peeps)
		</p>
	</security:authorize>
	
	<hr>

>>>>>>> fb5d52c9c1fea16ee95f536da79ca6f6f1325c0c
>>>>>>> master
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" 
			   method="POST">
	
		<input type="submit" value="Logout" />
	
	</form:form>
	
</body>

</html>










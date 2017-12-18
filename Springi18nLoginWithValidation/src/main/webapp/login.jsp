<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="login.do" method="POST" modelAttribute="loginDataBean" >
		<table>
			<tr>
				<td>
					<form:label path="">User Name</form:label>
				</td>
				<td>
					<form:input path="UserName" name="UserName" />	
				</td>
				<td>
					<form:errors path="UserName"></form:errors>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="">Password</form:label>
				</td>
				<td>
					<form:password path="password" name="password"/>
				</td>
				<td>
					<form:errors path="password"></form:errors>
				</td>
			</tr>
		</table>
		<input type="submit" value="LogIn">  

	</form:form> <br> <br> 
	<h1><a href="index.jsp">Home</a></h1>




</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Application</title>
</head>
<center>
	<a href="registration.foo?lang=hin">Hindi</a><br> <br>
	<a href="registration.foo?lang=en">English</a><br> <br>
	<a href="index.jsp">Home</a><br> <br>
</center>
<body>

	<form:form action="registration.do" method="POST" modelAttribute="registerDataBean" >
		<table>
			<tr>
				<td><spring:message code="user.name" text="User Name"></spring:message></td>
				<td><form:input path="UserName" name="UserName" /></td>
				<td><font color="RED"> <form:errors path="UserName"></form:errors></font> </td>
			</tr>
			<tr>
				<td><spring:message code="user.password" text="Password"></spring:message></td>
				<td><form:password path="password" name="password"/></td>
				<td><form:errors path="password"></form:errors></td>
			</tr>
			<tr>
				<td><spring:message code="user.email" text="E-mail"></spring:message></td>
				<td><form:input path="email" name="email"/></td>
				<td><form:errors path="email"></form:errors></td>
			</tr>
			<tr>
				<td><spring:message code="user.gender" text="Gender"></spring:message> </td>
				<td><form:radiobutton path="sex" value="M"/> Male 
					<form:radiobutton path="sex" value="F"/> Female  </td>
				<td><form:errors path="sex"></form:errors></td>	
			</tr>
		</table>
		<input type="submit" value="Register ME">  

	</form:form>

	






</body>
</html>
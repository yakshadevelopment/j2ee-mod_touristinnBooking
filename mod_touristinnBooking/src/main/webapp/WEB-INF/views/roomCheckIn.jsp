<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="font-family:Monotype Corsiva;color:orange">Add New Client</h1>  
<div align="center">
       <form:form method="post" action="saveClient"  modelAttribute="clientRecord"> 
       <form:hidden path="clientId" value="0"/>
 <h4 style="color:red">* marked items entry is compulsory</h4>
 <br/>
 <h3 style="font-family:Lucida Calligraphy;color:purple">   
 <table cellpadding="5">
 
<td>*Enter Type of Rooms to Book:</td>
<td><form:input path="roomType"/></td>   
</tr>
<tr>
<td>*Enter Number of Rooms to Book:</td>
<td><form:input path="totalBookedRoom"/></td>  
</tr>
</table>
<input type="submit" value="submit"/> 
</h3>
</form:form>
</div>
</body>
</html>
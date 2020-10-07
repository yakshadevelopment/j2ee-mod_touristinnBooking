<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<body>
<h1 align="center" style="font-family:Monotype Corsiva;color:orange">Remove Client</h1>  
<div align="center">
       <form method="post" action="removeClient"> 
       
 <h4 style="color:red">* marked items entry is compulsory</h4>
 <br/>
 <h3 style="font-family:Lucida Calligraphy;color:purple">   
 <table cellpadding="5">
 
<td>*Enter Client Id for Check Out:</td>
<td><input type="text" name="id"/></td>   
</tr>
<tr>

</table>
<input type="submit" value="submit"/> 
</h3>
</form>
</div>
</body>
</html>
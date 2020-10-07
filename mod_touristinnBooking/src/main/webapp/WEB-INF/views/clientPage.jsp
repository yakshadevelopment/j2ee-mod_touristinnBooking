
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Details</title>
</head>
<body>
<h1 align="center" style="font-family:Monotype Corsiva;color:orange">
<u>Client Details</u>
</h1>
<hr size="3" color="lightgreen"/>

<div align="center">
    <table border="1" cellpadding="10">
        <thead>
            <tr>
             <th>Client Id</th>
                <th>Room Type</th>
                <th>Number of Rooms Booked</th>
              </tr>
        </thead>
        <tbody>
         <c:forEach var="client" items="${clientList}">   
            <tr>
               <td>${client.clientId}</td>
            	<td>${client.roomType}</td>
                <td>${client.totalBookedRoom}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    <br/>
    <a href="start">Return</a>
</div>    

</body>
</html>
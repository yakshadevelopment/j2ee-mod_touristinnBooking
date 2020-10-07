
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course Details</title>
</head>
<body>
<h1 align="center" style="font-family:Monotype Corsiva;color:orange">
<u>Room Details</u>
</h1>
<hr size="3" color="lightgreen"/>
<h4><i>
<div align="center">
<a href="RoomCheckIn">Room Check In</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="showClients">Show Client List</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="RoomCheckOut">Room Check Out</a>
</div>
</i></h4>
<div align="center">
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>Room Type</th>
                <th>Availability</th>
                
                
                </tr>
        </thead>
        <tbody>
         <c:forEach var="room" items="${roomList}">   
            <tr>
            	<td>${room.roomType}</td>
                <td>${room.availableRooms}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</div>    

</body>
</html>
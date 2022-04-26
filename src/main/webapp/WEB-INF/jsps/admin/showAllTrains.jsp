<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALL TRAINS</title>
</head>
<body>
<h2>ALL TRAINS</h2>
<Table>
<tr>
<th>NAME</th>
<th>DEPARTURE CITY</th>
<th>ARRIVAL CITY</th>
<th>DEPARTURE TIME</th>
<th>FARE</th>
</tr>

<c:forEach items="${trains}" var="train">
<tr>
<td>${train.name}</td>
<td>${train.departureCity}</td>
<td>${train.arrivalCity}</td>
<td>${train.estimatedDepartureTime}</td>
<td>${train.fare}</td>
</tr>
</c:forEach>
</Table>

</body>
</html>
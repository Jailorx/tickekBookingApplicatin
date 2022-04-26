<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Trains Page</title>
</head>
<body>
<h2>Find Trains</h2>
<form action="findTrains" method="post">
From:<input type="text" name="from"/>
To:<input type="text" name="to"/>
Date:<input type="text" name="date"/>
<input type="submit" value="Search"/>
</form>

</body>
</html>
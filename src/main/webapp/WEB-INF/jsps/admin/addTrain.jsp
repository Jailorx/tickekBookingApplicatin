<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Train</title>
</head>
<body>
<h2>Add Train</h2>
<form action="addTrain" method="post">
<pre>
Train Number: <input type="text" name="trainNumber"/>
Train Name: <input type="text" name="name"/>
Departure City: <input type="text" name="departureCity"/>
Arrival City: <input type="text" name="arrivalCity"/>
Fare: <input type="number" name="fare"/>
Date of Departure: <input type="date" name="dateOfDeparture"/>
<input type="submit" value="Add"/>
</pre>
</form>

</body>
</html>
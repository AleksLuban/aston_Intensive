
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert Details</title>
</head>
<body>

<h2>Fill in the details</h2>

<form action="./InsertLecturer" method="post">
    <table>
        <tr>
            <td>ID:</td>
            <td><input type="text" name="id" maxlength="6" size="7" /></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" maxlength="30" size="25" /></td>
        </tr>
        <tr>
            <td>Email Id:</td>
            <td><input type="text" name="email" maxlength="40" size="35" /></td>
        </tr>
        <tr>
            <td>Phone Number:</td>
            <td><input type="text" name="phnum" maxlength="10" size="11" /></td>
        </tr>
        <tr>
            <td>Specialization:</td>
            <td><input type="text" name="specialization" maxlength="10" size="11" /></td>
        </tr>
        <tr />
    </table>
    <br /> <input type="submit" value="Insert Data" />

</form>
<br />
<input type="button" value="Return to Home"
       onclick="window.location.href='index.jsp'" />


</body>

</html>
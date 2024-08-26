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

<form action="./InsertStudent_lecturer" method="post">
    <table>
        <tr>
            <td>Student_ID:</td>
            <td><input type="text" name="student_id" maxlength="6" size="7" /></td>
        </tr>
        <tr>
            <td>Lecturer_ID:</td>
            <td><input type="text" name="lecturer_id" maxlength="6" size="7" /></td>
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

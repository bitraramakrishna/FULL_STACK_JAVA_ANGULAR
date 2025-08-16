<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Employee</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            font-size: 12px;
            padding: 10px;
            color: #000;
        }

        h2 {
            font-size: 14px;
            text-align: center;
            margin-bottom: 10px;
        }

        form {
            max-width: 500px;
            margin: 0 auto;
        }

        label {
            display: block;
            margin-top: 5px;
        }

        input[type="text"], select, button {
            font-size: 12px;
            padding: 4px 6px;
            margin-top: 2px;
            width: 100%;
        }

        button {
            margin-top: 8px;
            cursor: pointer;
        }

        a {
            font-size: 12px;
            margin-left: 5px;
            text-decoration: none;
        }
    </style>
</head>
<body>
<h2>Edit Employee</h2>

<form action="../update/${emp.id}" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${emp.name}" required>

    <label for="type">Type:</label>
    <select name="type" id="type">
        <option value="regular" <c:if test="${emp.type == 'regular'}">selected</c:if>>Regular</option>
        <option value="contract" <c:if test="${emp.type == 'contract'}">selected</c:if>>Contract</option>
    </select>

    <label for="dept">Department:</label>
    <input type="text" id="dept" name="dept" value="<c:out value='${emp.department != null ? emp.department.name : ""}'/>">

    <label>Address:</label>
    <input type="text" name="street" placeholder="Street" value="<c:out value='${emp.address != null ? emp.address.street : ""}'/>">
    <input type="text" name="city" placeholder="City" value="<c:out value='${emp.address != null ? emp.address.city : ""}'/>">
    <input type="text" name="state" placeholder="State" value="<c:out value='${emp.address != null ? emp.address.state : ""}'/>">
    <input type="text" name="zip" placeholder="Zip" value="<c:out value='${emp.address != null ? emp.address.zip : ""}'/>">

    <button type="submit">Save</button>
    <a href="../">Cancel</a>
</form>

</body>
</html>

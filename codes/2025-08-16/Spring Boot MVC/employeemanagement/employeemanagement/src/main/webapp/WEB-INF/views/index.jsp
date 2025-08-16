<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employees</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            font-size: 12px;
            padding: 10px;
            color: #000;
        }

        h2, h3 {
            font-size: 14px;
            margin-bottom: 10px;
        }

        form {
            margin-bottom: 15px;
        }

        input[type="text"], select, button {
            font-size: 12px;
            padding: 4px 6px;
            margin: 2px;
        }

        button {
            cursor: pointer;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            font-size: 12px;
        }

        th, td {
            border: 1px solid #000;
            padding: 4px 6px;
            text-align: left;
        }

        th {
            font-weight: bold;
        }

        a {
            font-size: 12px;
            text-decoration: none;
            margin-right: 5px;
        }
    </style>
</head>
<body>

<h2>Employee Directory</h2>

<!-- Search Form -->
<form method="get" action="">
    <input type="text" name="q" placeholder="Search by name" value="${param.q}" />
    <button type="submit">Search</button>
    <a href="./">Reset</a>
</form>

<!-- Add Employee Form -->
<h3>Add Employee</h3>
<form action="add" method="post">
    <input type="text" name="name" placeholder="Name" required />
    <select name="type">
        <option value="regular">Regular</option>
        <option value="contract">Contract</option>
    </select>
    <input type="text" name="dept" placeholder="Department" />
    <input type="text" name="street" placeholder="Street" />
    <input type="text" name="city" placeholder="City" />
    <input type="text" name="state" placeholder="State" />
    <input type="text" name="zip" placeholder="Zip" />
    <button type="submit">Create</button>
</form>

<!-- Employees Table -->
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Type</th>
            <th>Department</th>
            <th>City</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${employees}" var="e">
            <tr>
                <td>${e.id}</td>
                <td>${e.name}</td>
                <td>${e.type}</td>
                <td><c:out value="${e.department != null ? e.department.name : ''}" /></td>
                <td><c:out value="${e.address != null ? e.address.city : ''}" /></td>
                <td>
                    <a href="edit/${e.id}">Edit</a>
                    <a href="delete/${e.id}" onclick="return confirm('Delete employee ${e.name}?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>

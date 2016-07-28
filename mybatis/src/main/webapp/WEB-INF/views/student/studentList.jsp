<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>/student/studentList.jsp</h1>
	
	<table>
		<thead>
			<tr>
				<th> StudentNo </th>
				<th> Name </th>
				<th> Age </th>
				<th> Major</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="list" items="${studentList}">
			<tr>
				<td> ${list.studentNo} </td>
				<td><a href="/viewStudentInfo/${list.studentNo}">${list.name}</a></td>
				<td> ${list.age} </td>
				<td> ${list.major} </td>
			</tr>
			</c:forEach>
		</tbody>
	
	</table>
	
	<a href="/">HOME</a>

</body>
</html>
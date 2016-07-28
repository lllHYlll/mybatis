<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>/student/studentInsert.jsp</h1>
	
	<form action="/signUp" method="POST">
		<p>
			<label for="name">NAME : </label>
			<input type="text" name="name">
		</p>
		<p>
			<label for="age">AGE : </label>
			<input type="number" name="age">
		</p>
		<p>
			<label for="major">MAJOR : </label>
			<select name="major">
				<option value="Programmer">Programmer</option>
				<option value="Designer">Designer</option>
				<option value="Professor">Professor</option>
			</select>
		</p>
		
		<p><input type="submit" value="SUBMIT"></p>
	</form>

</body>
</html>
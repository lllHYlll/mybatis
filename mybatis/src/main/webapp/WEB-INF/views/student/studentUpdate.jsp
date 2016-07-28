<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>/student/studentUpdate.jsp</h1>

	<form action="/modifyStudent" method="POST">
		
		<p> StudentNumber : ${studentOneList.studentNo} 님의 정보수정화면
		
		<input type="hidden" name="studentNo" value="${studentOneList.studentNo}">
		<p>
			<label for="name">NAME</label>
			<input type="text" name="name" id="name" value="${studentOneList.name}">
		</p>
		<p>
			<label for="age">AGE</label>
			<input type="number" name="age" id="age" value="${studentOneList.age}">
		</p>
		<p>
			<label for="major">MAJOR</label>
			<select name="major" >
				<option value="Programmer">Programmer</option>
				<option value="Designer">Designer</option>
				<option value="Professor">Professor</option>
			</select>
		</p>
		
		<input type="submit" value="編集">
	</form>
	
</body>
</html>
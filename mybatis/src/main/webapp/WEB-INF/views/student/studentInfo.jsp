<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>/student/studentInfo.jsp</h1>
	
	<h3>Hello ${studentOneList.name} !</h3>
	
	<p> Student Number : ${studentOneList.studentNo} </p>
	<p> Student Name : ${studentOneList.name} </p>
	<p> Student Age : ${studentOneList.age} </p>
	<p> Student Major : ${studentOneList.major} </p>

	<a href="/modifyStudent/${studentOneList.studentNo }"> 編集する</a>
	<a href="/deleteStudent/${studentOneList.studentNo }"> 削除する</a>
	<a href="/">HOME</a>
</body>
</html>
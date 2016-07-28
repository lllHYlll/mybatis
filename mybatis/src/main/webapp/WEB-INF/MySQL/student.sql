CREATE TABLE student(
	studentNo int(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	age int(3) NOT NULL,
	major VARCHAR(20) NOT NULL
);

INSERT INTO 
	student
		(name, age, major)
	VALUES
		('Sara', 20, 'Programmer');
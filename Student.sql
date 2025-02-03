show databases;
create database Student;
use Student;

create table Student_Details(
	id int,
	name varchar(10),
    age int,
    mark int
);

select * from Student_details;
SELECT * FROM Student_Details where id=101;

truncate table Student_details;



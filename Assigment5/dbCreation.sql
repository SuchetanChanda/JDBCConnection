
SELECT * FROM Proffessor;
SELECT * FROM Subject;

 
drop table course;
create table Proffessor(p_id int AUTO_INCREMENT primary key,
p_name varchar(100),
p_age int,
p_address varchar(100),
course int);

insert into Proffessor(p_id,p_name,p_age,p_address,course) values(1001,'Anupam',30,'Jadavpur',3001);
insert into Proffessor(p_name,p_age,p_address,course) values('Anurag',35,'Burdwan',3002);
insert into Proffessor(p_name,p_age,p_address,course) values('Joydeep',40,'Malda',3003);
insert into Proffessor(p_name,p_age,p_address,course) values('Mukesh',30,'Bihar',3004);


create table Subject(
sub_id int AUTO_INCREMENT PRIMARY KEY,
s_name  varchar(200),
p_id int ,foreign key(sub_id) references Proffessor(p_id));


insert into Subject values(3001,'Cpp',1001);
insert into Subject(s_name,p_id) values('Java',1001);
insert into Subject(s_name,p_id) values('DBMS',1002);
insert into Subject(s_name,p_id) values('SQL',1002);
insert into Subject(s_name,p_id) values('Computer Networks',1003);
insert into Subject(s_name,p_id) values('OOps',1004);
insert into Subject(s_name,p_id) values('HTML',1001);
insert into Subject(s_name,p_id) values('CSS',1002);
insert into Subject(s_name,p_id) values('JavaScript',1003);



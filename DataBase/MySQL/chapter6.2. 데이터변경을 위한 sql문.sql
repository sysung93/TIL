use sqldb;

-- insert
create table testtbl1 (id int, username char(3), age int);
insert into testtbl1 values(1, '홍길동', 25);
select * from testtbl1;

insert into testtbl1(id, username) values (2, '설현');
select * from testtbl1;

-- auto_increment
create table testtbl2(id int auto_increment primary key, username char(3), age int);
insert into testtbl2 values (null, '지민', 25);
insert into testtbl2 values (null, '유나', 22);
insert into testtbl2 values (null, '유경', 21);
select * from testtbl2;

-- id 입력값 변경
select last_insert_id();
alter table testtbl2 AUTO_INCREMENT = 100;
insert into testtbl2 value (null, '찬미', 23);
select * from testtbl2;

-- id 초기값 1000, 증가값 3
create table testtbl3(id int AUTO_INCREMENT PRIMARY key, username char(3), age int);
alter table testtbl3 auto_increment = 1000;
set @@auto_increment_increment = 3;
insert into testtbl3 values (null, '나연', 20);
insert into testtbl3 values (null, '정연', 18);
insert into testtbl3 values (null, '모모', 19);
select * from testtbl3;

-- 대량의 샘플 데이터 생성
create table testtbl4 (id int, fname varchar(50), lname varchar(50));
insert into testtbl4
select emp_no, first_name, last_name
from employees.employees;
select * from testtbl4;

-- 데이터 수정(kyoichi의 lastname을 없음으로 변경)
UPDATE testtbl4
set lname = '없음'
where fname = 'kyoichi';

-- 데이터 삭제(aameer 사용자 삭제)
delete from testtbl4 where fname = 'aamer';


use sqldb;

-- example3
create table bigtbl1(SELECT * from employees.employees);
create table bigtbl2(SELECT * from employees.employees);
create table bigtbl3(SELECT * from employees.employees);

delete from bigtbl1; -- 한행씩 삭제
drop table bigtbl2; -- 테이블 전체삭제
truncate bigtbl3; -- 테이블 전체삭제

-- example4
create table membertbl (select userid, name, addr from usertbl limit 3);
alter table membertbl add CONSTRAINT pk_membertbl primary key (userid);
select * from membertbl;

insert into membertbl values('BBK', '비비코', '미국');
insert into membertbl values('SJH', '서장훈', '서울');
insert into membertbl values('HJY', '현주엽', '경기');
SELECT * from membertbl;

-- 오류나면 무시하고 다음으로 넘어감
insert ignore into membertbl values('BBK', '비비코', '미국');
insert ignore into membertbl values('SJH', '서장훈', '서울');
insert ignore into membertbl values('HJY', '현주엽', '경기');
SELECT * from membertbl;

-- 기본 키가 중복되면 데이터 수정
insert into membertbl values('BBK', '비비코', '미국') ON DUPLICATE KEY UPDATE name = '비비코', addr = '미국';
insert into membertbl values('DJM', '동짜몽', '일본') ON DUPLICATE KEY UPDATE name = '동짜몽', addr = '일본';
SELECT * FROM membertbl;


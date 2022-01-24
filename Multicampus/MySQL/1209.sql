use classicmodels;

-- customers 테이블의 모든 내용을 확인한다. 
-- 워크벤치에서는 1000개 까지만 보여준다  
select * from customers;

-- 테이블구조를 알아보는 명령어 
desc customers;

-- sql은 대소문자
select customerNumber, customername from customers;

-- ailas : 테이블이나 필드에 별명을 붙여서 사용이 가능하다  
select  a.customername, a.phone, addressline1  
from customers  a;

-- dbms 문자열을 더하는 연산자를 제공하는 경우도 있고 안하는 경우도 있다
-- 문자열을 합산하는 함수의 이름은 concatenate
-- 함수는 모든 dbms 가 약속을 안해서 다 다르다 
select  concat(contactLastName, " ", contactFirstname) as contactname 
from customers;

-- as 생략가능 
select  concat(contactLastName, " ", contactFirstname)  contactname 
from customers;


-- join 연산 - 각테이블에서 연관된 필드로 묶어서 가져올 수 있다 
select  customerName, concat(firstname, " ", lastname) as empname 
from customers
inner join employees on customers.salesRepEmployeeNumber 
= employees.employeenumber ;

-- alias를 사용해 join 함 
select  customerName, concat(firstname, " ", lastname) as empname 
from customers a
inner join employees b on a.salesRepEmployeeNumber 
= b.employeenumber ;

-- mysql 전용
show databases;
use employees;
show tables;

select * from employees; 

-- limit 명령어는 mysql에만 있다. 
select * from employees limit 1000;

use employees;
select count(*) from employees;

select * from titles limit 1000;

desc titles;

desc employees;

select * from employees limit 5;

insert into employees(emp_no, birth_date, first_name, last_name, gender, hire_date)
values(10000, '1998-09-09', 'Tom', 'Feet', 'M', '2021-01-07');


--  Error Code: 1062. Duplicate entry '10001' for key 'employees.PRIMARY'   

select emp_no, birth_date, first_name, last_name, gender
from employees 
where gender='M';

-- mysql만 데이터 대소문자를 무시한다. 
select emp_no, birth_date, first_name, last_name, gender
from employees 
where first_name='tom';

select emp_no, birth_date, first_name, last_name, gender
from employees 
where emp_no =10000;

-- 1998년생  -- 데이터베이스는 
select emp_no, birth_date, first_name, last_name, gender
from employees 
where substr(birth_date,1,4) = '1998';

select emp_no, substr(birth_date,1,4) , first_name, last_name, gender
from employees 
limit 10;

use classicmodels;

-- 문제1. customers 테이블에서  country가 USA  인 사람들의  고객번호, 이름, 전화번호 만 출력하기 

select customerNumber, customers, phone
from customers

where country = 'USA'

-- 문제2. customers 테이블에서 postal code 가 4로 시작하는 고객번호, 이름, 전화번호, postal code 만 출력하기









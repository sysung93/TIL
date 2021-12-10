use classicmodels;

desc customers; -- primary key customerNumber
desc employees; -- pri key employyNumber
desc offices; -- pri key officeCode
desc orderdetails; -- pri key orderNumber / productCode
desc orders; -- pri key orderNumberfilm_actorfilm_actor

select * from information_schema.tables;

select * from information_schema.columns
where table_schema = 'classicmodel';

-- 원하는 컬럼명을 직접 기술하는 것이 속도가 빠르다
select customernumber, customername from customers;alter

-- 테이블명은 ailas를 설정해주는것이 좋다.
select a.customernumber, a.customername from customers a;

-- 데이터가 숫자타입일 경우 where customernumber = 1;
-- 그 밖의 경우 데이터를 '  ' 어퍼스트로피로 감싼다
select a.customernumber, a.customername, a.city
from customers a
where a.city = 'Nantes';

select a.customernumber, a.customername, a.city
from customers a
where a.customernumber > 200;

select a.customernumber, a.customername, a.city
from customers a
where a.city <> 'Nantes';

-- between 연산자는 다른 dbms에 없다
-- between 명령어는 값을 포함한다.
select * from Products
where buyprice between 50 and 60;

select * from products
where buyprice >= 50 and buyprice <= 60;

select count(*) from products
where buyprice between 50 and 60;

select count(*) from products
where buyprice >= 50 and  buyprice <= 60;

-- 사원번호가 151, 187, 201, 204, 209, 112, 114 선택
/* select *
where customernumber = 151 or customernumber = 201 or customernumber = 204 or customernumber = 209 or customernumber = 112 or customernumber = 114; */

-- in 연산자 500개 까지
select *
from customers
where customerNumber in (151, 187, 201, 204, 209, 112, 114);

select *
from customers
where customerNumber in (151, 187, 201, 204, 209, 112, 114)
or customerNumber in (129, 166, 168, 175);

select *
from customers
where state in ('nv', 'ca');

select * 
from customers
where contactLastname = 'King';

-- like % 가 들어가면 ~로 시작하는, ~가 들어있는, ~로 끝나는 k%, %k%, %k
select *
from customers
where contactlastname like 'k%';

select *
from products
where productname like '%aston%';

select * from customers
where country = 'germany' and city = 'berlin' ;

-- 데이터가 중복도리때 distinct를 사용한다. 중복 제거하고 알려줌 
select country from customers;
select distinct country from customers;

-- country 와 customername을 모두 조합해서 중복을 제고, 그래서 데이터 다 나옴
select distinct country, customername from customer;

-- 오스트리아나 러시아 포함
select *
from customers
where country = 'austria' or country = 'russia';

select *
from customers
where country in('austria', 'russia');

-- 오스트리아나 러시아 제외
select *
from customers
where country not in('austria', 'russia');

use mydb;
select * from emp;

select empno, ename, sal/12 from emp;

-- 테이블 만들기
create table score (
id int primary key auto_increment,
name varchar(40),
kor int,
eng int,
mat int
);

insert into score(name, kor, eng, mat) values('홍길동', 90, 90, 90);
insert into score(name, kor, eng, mat) values('임꺽정', 80, 80, 70);
insert into score(name, kor, eng, mat) values('장길산', 60, 90, 80);
insert into score(name, kor, eng, mat) values('홍경래', 100, 100, 90);
insert into score(name, kor, eng, mat) values('장승엽', 90, 90, 100);

select * from score;

select name, kor, eng, mat, (kor+eng+mat) total
from score;

-- dbms에 따라 오류 가능 가급적 사용안하는게 좋은 표현
select *, (kor+eng+mat) total
from score;

-- 데이터삭제
-- delete from score;

-- 테이블삭제
-- drop table score;

delete from score where kor = 90;

set sql_safe_updates = 0;

use classicmodels;
select customername from customers;

select customerNumber, customerName, city from customers
order by customerName asc;

-- asc : 오름차순, 생략가능 / desc : 내림차순
select customernumber, customername, city 
from customers
order by customername desc;

-- customernumber < 300 이하일때
select customernumber, customername, city 
from customers
where customerNumber <= 300
order by city asc, customername desc;

-- 문제 1 products 테이블에서 product line이 'classic cars', 'vintage cars' 중에서
-- productcode, productname, productdescription을 필드를 가져오는 buyprice를 내림차순으로 정렬하여 출력하기

select  productcode, productname, productdescription
from products
where  productline in ('classic cars', 'vintage cars')
order by buyprice desc;

 
-- 문제2 . PRODUCTS 테이블에서 productname 에 'ford' 가 들어간 제품중에서 productcode, productname, productscale, productdescription 을 필드를 
-- productline 은 오름차순, 동일 차순일때 productname 은 내림차순으로 정렬하여 출력하기 

select productcode, productname, productscale, productdescription
from products
where productname like '%ford%'
order by productline, productname desc;

-- 문제3 customers 테이블의 state 필드값이 null 있는데 null 값이 아닌것만 출력
select * from customers where state is null;
select * from dustomers where state is not null;

use mydb
-- sal 급여, comm(커미션)이 있는 사람도 있고 없는 사람도있는데
-- sal + comm
-- 연산자 컬럼의 값이 null 이면 (연산할 수 없는) null 어떤 연산을 수행해도 결과는 null이다.
select ename, sal, comn, (sal+ comn) from emp

-- ifnull 함수, 자바에서의 함수와 동일해서
-- ifnull(필드, 값) 만일 필드의 값이 null이 아니면 필드값을 반환, null이면 두번째 전달자인 값을 반환한다.
-- 함수는 공통이 없어서 모든 dbms가 다 다르다

select comm, ifnull(comm, 0) from emp;
-- 데이터베이스 조회하는 방법

-- 현재 서버 데이터베이스 확인
show databases;
-- 사용하고자하는 데이터베이스 지정
use employees;
-- 사용하고자 하는 데이터베이스에 있는 테이블의 정보를 조회
show table status;
-- employees 테이블의 열 확인
describe employees;
-- 조회하고자 하는 데이터 선택
select first_name, gender from employees;
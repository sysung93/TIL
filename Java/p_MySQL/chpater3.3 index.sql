-- indexTBL 만들기
create table indexTBL
(first_name varchar(14), last_name varchar(16), hire_date date);

-- indexTBL에 샘플DB employees에서 데이터 복사해오기
insert into indexTBL
select first_name, last_name, hire_date
from employees.employees
limit 500;

select * from indexTBL;

-- indexTBL의 이름 중 mary 찾아보기
select * from indexTBL where first_name = 'mary';

-- indexTBL의 first_name에 인덱스 생성하기
create index idx_indexTBL_firstname on indexTBL(first_name);


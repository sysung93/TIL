use sqldb;
select * from usertbl;

-- 김경호 찾기
select * from usertbl where name = '김경호';

-- 1970년 이후 출생하고 신장 182 이상 사람의 아이디와 이름 조회
select userID, name from usertbl
where birthyear >= 1970 and height >= 182;

-- 1970년 이후 출생했거나 신장 182 이상 사람의 아이디 와 이름 조회
select userID, name from usertbl
where birthyear >= 1970 or  height >= 182;

-- 키가 180 ~ 183인 사람 이름 조회
select name, height from usertbl
where height BETWEEN 180 and 183;

-- 지역이 경남, 전남, 경북 사람의 이름 조회
select name, addr from usertbl
where addr in('경남', '전남', '경북');

-- 김씨 조회하기
select name from usertbl
where name like '김%';

-- 종신 조회하기
select name from usertbl
where name like '_종신';

-- 김경호보다 키가 크거나 같은 사람의 이름과 키 출력하기
select name, height from usertbl
where height > (select height from usertbl where name = '김경호');

-- 지역이 경남 사람의 키보다 키가 크거나 같은 사람을 추출하기
select name, height from usertbl
where height >= any(select height from usertbl where addr = '경남');

select name, height from usertbl
where height >= all(select height from usertbl where addr = '경남');

-- 키는 내림차순, 이름은 오름차순으로 정렬하기
select name, height from usertbl
order by name asc, height desc;

-- 회원들의 거주지역이 몇군데인지 알아보기
select addr from usertbl;
select distinct addr from usertbl;
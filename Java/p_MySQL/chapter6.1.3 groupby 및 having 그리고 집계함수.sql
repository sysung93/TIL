use sqldb;
select * from buytbl;

-- 사용자가 구매한 물품의 개수 조회하기
select userid, amount from buytbl
order by userid;

-- 사용자별로 sum 함수로 구매개수 조회하기
select userid, sum(amount) from buytbl
GROUP BY userid;

-- 별칭써서 보기 좋게 만들기
select userid as '사용자 아이디', sum(amount) as '총 구매 개수' from buytbl
GROUP BY userid;

-- 구매액의 총합을 출력하기
select userid as ' 사용자 아이디', sum(price * amount) as '총 구매액' from buytbl
group by userid;

-- 전체 구매자가 구매한 물품의 개수의 평균 구하기
select avg(amount) as '평균 구매 개수' from buytbl;

-- 각 사용자별로 한번 구매시 물건을 평균 몇개 구매했는지 확인하기
select userid as '사용자 아이디', avg(amount) as '평균 구매 개수' from buytbl
group by userid;

-- 가장 큰 키와 가장 작은키의 회원 이름과 키를 출력하기
select name, max(height), min(height) from usertbl
where height = (select max(height)from usertbl) or height = (select min(height)from Usertbl)
group by name;

-- 휴대폰이 있는 사용자의 수 카운트하기
select count(mobile1) as '휴대폰이 있는 사용자' from usertbl;

-- 총 구매액이 1000 이상인 사용자 조회하기
select userid as '사용자', sum(price*amount) as '총 구매액' from buytbl
GROUP BY userid
HAVING sum(price*amount) > 1000
order by sum(price * amount);

-- 항목별 분류별로 합계 및 총합 구하기
select num, groupname, sum(price * amount) as '비용' from buytbl
GROUP BY groupname, num
with rollup;

-- 분류별로 합계 및 총합 구하기
select num, groupname, sum(price * amount) as '비용' from buytbl
GROUP BY groupname
with rollup;
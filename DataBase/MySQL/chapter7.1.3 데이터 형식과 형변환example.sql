USE sqldb;

select * from buytbl;
select avg(amount) as '평균 구매 개수' from buytbl;

-- 정수로 보이기 위해 함수 사용
select cast(avg(amount) as signed integer) as '평균 구매 개수'  from buytbl;
select convert(avg(amount), SIGNED integer) as '평균 구매 개수' from buytbl;

-- 날짜
SELECT cast('2021$12$13' as date);
select cast('2021/12/13' as date);
select cast('2021%12%13' as date);
select cast('2021@12@13' as date);

-- 쿼리의 결과를 보기 좋게 만들 때 사용

select num, concat(cast(price as char(10)), 'X', cast(amount as char(4)), '=') 
as '단가, 수량', price * amount as '구매액'
from buytbl;

-- 암시적 변환
select '100' + '200'; -- 문자+문자(정수로 처리)
select concat('100', '200'); -- 문자+문자(문자로 처리)
select concat(100, '200'); -- 정수+문자(문자로처리)
-- 비교시 true = 1 faulse = 0
select 1 > '2mega'; -- 정수 2로 변환되어 비교
select 3 > '2MEGA'; -- 정수 2로 변환되어서 비교
select 0 = 'mega2'; -- 문자는 0으로 변환


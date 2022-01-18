-- with절과 cte

use sqldb;
select userid as '사용자', sum(price*amount) as '총 구매액' from buytbl group by userid;

with abc(userid, total) 
AS (select userid, sum(price * amount) from buytbl group by userid)
select * from abc order by total desc;

-- example
select addr, max(height) from usertbl group by addr;
with cte_usertbl(addr, maxheight)
as (select addr, max(height) from usertbl group by addr)
select avg (maxheight * 1.0) as '각 지역별 최고키의 평균' from cte_usertbl;
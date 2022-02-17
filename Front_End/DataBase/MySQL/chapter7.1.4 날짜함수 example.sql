-- adddate(날짜, 차이). subdate(날짜, 차이) / 날짜를 기준으로 차이를 더하거나 뺀 날짜
SELECT adddate('2025-01-01', interval 31 day), adddate('2025-01-01', interval 1 month);
select subdate('2025-01-01', interval 31 day), subdate('2025-01-01', interval 1 month);

-- addtime(날짜/시간, 시간), subtime(날짜/시간, 시간) / 날짜/시간ㅇ르 기준으로 시간을 더하거나 뺀 결과
select addtime('2025-01-01- 23:59:59', '1:1:1'), addtime('15:00:00', '2:10:10');
select subtime('2025-01-01 23:59:59', '1:1:1'), subtime('15:00:00', '2:10:10');

-- curdate(), curtime(), now, sysdate() / 현재 연-월-일, 현재 시:분:초, 현재'연-월-일 시:분:초'
SELECT curdate(), curtime();
select now(), sysdate();

-- year(날짜), month(날짜), day(날짜), hour(시간), minute(시간), second(시간), microsecond(시간) / 날짜 또는 시간에서 연,월, 일, 시, 분, 초, 밀리초를 구한다.
select year(curdate()), month(curdate()), day(curdate()), dayofmonth(curdate());
select hour(curtime()), minute(current_time()), second(current_time()), microsecond(current_time);

-- date(), time() / datetime 형식에서 연-월-일-및 시:분:초만 추출한다
select date(now()), time(now());

-- datedifF(날짜1, 날짜2), timediff(날짜1 또는 시간1, 날짜1 또는 시간2) / 날짜1-날짜2의 일수를 결과로 구한다. 시간1-시간2의 결과를 구한다
select datediff('2025-01-01', now()), timediff(curtime(), '01:00:00');

-- dayofweek(날짜), monthname(), dayofyear(날짜) / 요일 및 1년 중에 몇번째 날짜인지 구한다
select dayofweek(curdate()), monthname(curdate()), dayofyear(curdate());

-- last_Day(날짜) / 주어진 날짜의 마지막 날짜를 구한다
select last_day('2025-02-01');

-- makedate(연도, 정수) / 연도에서 중사만큼 지난 날짜를 구한다.
select makedate(2022, 30);

-- maketime(시, 분, 초) / 시, 분, 초를 이용해 '시:분:초'의 time 형식을 만든다.
select maketime(12, 11, 10);

-- period_add(연월, 개월수) / 연월에서 개월만큼의 개월이 지난 연월을 구한다
select period_add(202501, 11);

-- period_difF(연월1, 연월2) / 연월1 - 연월2의 개월수를 구한다
select period_diff(202501, 202312)

-- quarter(날짜) / 4분기 중 몇 분기인지 반환
select quarter(2021-12-14);

-- time_to_sec(시간) / 시간을 초단위로 반환
select time_to_sec('12:11:10');

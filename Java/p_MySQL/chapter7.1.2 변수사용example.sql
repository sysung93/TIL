USE sqldb;

-- 변수사용
set @myvar1 = 5;
set @myvar2 = 3;
set @myvar3 = 4.25;
set @myvar4 = '가수 이름 ==> ';

select @myvar1;
select @myvar2 + @myvar3;

select @myvar4, name from usertbl where height > 180;

-- limit 변수사용
set @myvar5 = 3;
prepare myquery from 'select name, height from usertbl order by height limit ?';
execute myquery using @myvar5;
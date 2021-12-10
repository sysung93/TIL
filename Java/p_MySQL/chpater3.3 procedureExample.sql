select * from memberTBL where membername = '당탕이';
select * from productTBl where productname = '냉장고';

-- 스토어드 프로시저만들기
-- delimiter는 구분문자를 의미. 뒤에 //가 나오면 기존의 ;을 //로 대신한다는 의미이다.
-- create ~ end 까지를 하나의 단락으로 묶어주는 효과
-- 마지막 행에서 ;으로 돌려놔야 한다.

delimiter //
create procedure myproc()
begin
select * from memberTBL where membername = '당탕이';
select * from productTBl where productname = '냉장고';
end //
delimiter ;

-- 방금 생성한 스토어드 프로시저를 call 스토어드 프로시저_이름()으로 실행
call myproc();
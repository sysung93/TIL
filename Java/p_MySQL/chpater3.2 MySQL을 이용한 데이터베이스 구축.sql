-- select의 기본형식은 select 열이름 from 테이블이름 (where조건) 형식을 갖는다.
-- *은 모든 열을 의미한다

-- 회원 테이블의 모든 열을 보여주세요
select * from memberTBL;

-- 회원테이블의 이름, 주소열만 보여주세요
select memberName, memberAddress from memberTBL;

-- 회원테이블에서 상길이만 보여주세요
select * from memberTBL where membername = '상길이';

-- sql문으로 새로운 테이블 만들기
create table mytable(id int);

-- ; 콜론은 써도 되고 안써도 되지만 쓰는 습관을 들이자.
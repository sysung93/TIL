-- 트리거? 테이블에 부착되어서 테이블에 insert나 update 또는 delete 작업이 발생하면 실행되는 코드

-- 회원 테이블에 새로운 회원정보 입력
insert into membertbl values ('figure', '연아', '경기도 군포시 당정동');
select * from membertbl;

-- 회원 테이블에서 회원삭제
delete from membertbl where membername = '연아';
select * from membertbl;

-- trigger만들기
-- 지워진 데이터를 보관할 테이블 만들기
create table deletedmemberTBL(
memeberID CHAR(8),
memberName CHAR(5),
memeberAddress CHAR(20), 
deletedDate DATE -- 삭제한 날짜
);

-- 회원테이블에 delete 작업이 일어나면 백업테이블에 지워진 데이터가 기록되는 트리거 생성하기
delimiter // -- delimiter 시작선언 ; > //으로 변환
create trigger trg_deletedmembertbl -- 트리거 이름
after delete -- 삭제 후에 작동하게 지정
on membertbl -- 트리거를 부착할 테이블
for each row -- 각 행마다 적용시킴
begin -- 테이블의 내용을 백업 테이블에 삽입
insert into deletedmemberTBL
values(old.memberID, old.membername, old.memberaddress, curdate());
end // -- delimiter 끝 선언
delimiter ; -- // > ; 으로 변환

select * from membertbl;

delete from membertbl where membername = '한주연';

select * from membertbl;

select * from deletedmembertbl;


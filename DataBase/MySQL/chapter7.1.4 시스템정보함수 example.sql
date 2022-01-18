-- user(), database() / 현재 사용자 및 현재 선택된 데이터베이스를 구한다.
select current_user(), database();

-- found_rows() / 바로 앞의 select 문에서 조회된 행의 개수를 구한다
use sqldb;
select * from usertbl;
select found_rows();

-- row_count() / 바로 앞의 insert, update, delete문에서 입력, 수정, 삭제된 행의 개수를 구한다.
-- create, drop문은 0을 반환하고, select 문은 -1을 반환
use sqldb;
update buytbl set price = price * 2;
select row_count();

-- version() / 현재 MySQL의 버전을 구한다

-- sleep(초) / 쿼리의 실행을 잠깐 멈춘다
SELECT sleep(5);
select '5초후에 이게보여요';






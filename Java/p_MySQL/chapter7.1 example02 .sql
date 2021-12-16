create database moviedb;

use moviedb;
create table movietbl(
moive_id int,
moive_title VARCHAR(30),
moive_director varchar(20),
movie_star VARCHAR(20),
moive_script LONGTEXT,
moive_film longblob
) default charset = utf8mb4;

insert into movietbl values(1, '쉰들러 리스트', '스필버그', '리암니슨',
load_file('C:\P_MySQL\movies\Schindler.txt'), load_file('C:\P_MySQL\movies\Schindler.mp4'));

select * from movietbl;

show variables like 'max_allowed_packet';
show variables like 'secure_file_priv';

use moviedb;
truncate movietbl;

insert into movietbl values(1, '쉰들러 리스트', '스필버그', '리암니슨',
load_file('C:\P_MySQL\movies\Schindler.txt'), load_file('C:\P_MySQL\movies\Schindler.mp4'));
insert into movietbl values(2, '쇼생크 탈출', '프랭크 다라본트', '팀 로빈스',
load_file('C:\P_MySQL\movies\Shawshank.txt'), load_file('C:\P_MySQL\movies\Shawshank.mp4'));
insert into movietbl values(3, '라스트 모히칸', '마이클 만', '다니엘 데이 루이스',
load_file('C:\P_MySQL\movies\Mohican.txt'), load_file('C:\P_MySQL\movies\Mohican.mp4'));







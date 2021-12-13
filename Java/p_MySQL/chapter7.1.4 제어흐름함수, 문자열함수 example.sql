-- if(수식, 참, 거짓)
select if (100 > 200, '참이다', '거짓이다');
select if (100 > 200, '정답', '정답이아님');

-- ifnull(수식1, 수식2)
-- 수식1이 null이 아니면 수식1이 반환, 수식1이 null이면 수식2가 반환
select ifnull(null, '널이군요'), ifnull(100, '널이군요');

-- nullif(수식1, 수식2)
-- 수식1과 수식2가 같으면 null 반환, 다르면 수식1 반환
select nullif(100,100), nullif(200,100);

-- case ~when ~ else ~ end
-- case 뒤의 값이 반환. 해당사항이 없으면 else 반환 , end as는 출력될 열의 별칭
select case 1
when 1 then '일'
when 5 then '오'
when 10 then '십'
else '모름'
end as 'case 연습';

-- ascii, char
-- 문자의 아스키 코드를 반환하거나, 숫자의 아스키 코드값에 해당하는 문자를 반환
select ASCII('a'), CHAR(70);

-- BIT_LENGHT(문자열), CHAR_LENGTH(문자열), LENGTH(문자열)
-- 할당된 bit 크기 또는 문자 크기를 반환
select bit_length('abc'), char_length('abc'), length('abc');
select bit_length('가나다'), char_length('가나다'), length('가나다');

-- concat(문자열1, 문자열 2, ....) concat_ws(구분자, 문자열1, 문자열2, ...)
select concat_ws('/', '2021', '12', '13');
select concat_ws('_', '성소영', '계해범', '유자');

-- ELT(위치, 문자열1, 문자열2, ...), field(찾을 문자열, 문자열1, 문자열2,....)
select elt(2, '하나', '둘', '셋'); -- 위치에 해당하는 문자 반환
select field('나비', '하나', '둘', '나비'); -- 찾을 문자열의 위치를 반환

-- find_in_set(찾을 문자열, 문자열리스트), instr(기준문자열, 부분문자열)
select find_in_set('셋', '하나,둘,셋,넷,다섯'); -- 공백이 없어야함, 위치를 반환
select instr('하나둘셋넷다섯', '둘'); -- 부분 문자열 위치 찾아서 시작위치 반환

-- locate(부분문자열, 기준문자열)
select locate('둘', '하나둘셋넷'); -- instr와 비슷, 파라미터만 반대로

-- format(숫자, 소수점 자리수)
select format(123456.123456, 4); -- 숫자를 소수점 아래 자리수까지 표현, 1000단위마다 , 표시

-- bin(숫자), hex(숫자), oct(숫자)
select bin(31); -- 2진수
select hex(31); -- 16진수
select oct(31); -- 8진수

-- insert(기준 문자열, 위치, 길이, 삽입할 문자열)
-- 기준 문자열의 위치부터 길이만큼 지우고 삽입할 문자열 끼워넣기
select insert('abcdefg', 3, 4, '@@@@');

-- left(문자열, 길이), right(문자열, 길이)
-- 문자열의 길이만큼 반환
select left('가나다라마바사', 3);
select right('abcdefg',3);

-- upper(문자열), lower(문자열)
select upper('abcdefg');
select lower('ABCDEFG');

-- LPAD(문자열, 길이, 채울문자열) RPAD(문자열, 길이, 채울 문자열)
select lpad('이것이', 5, '##');
select rpad('이것이', 5, '@@');

-- ltrim(문자열), rtrim(문자열); 공백제거
select ltrim('        이것이');
select rtrim('이것이       ');

-- trim(문자열), trim(방향 자를_문자열 from문자열)
select trim('       이것이        '); -- 공백 모두제거
select trim(both 'ㅋ' from('ㅋㅋㅋㅋㅋ재밌어요ㅋㅋㅋㅋ'));

-- replace(문자열, 원래 문자열, 바꿀 문자열)
SELECT replace('이것이 MySQL이다', '이것이', 'this is');

-- reverse(문자열) 문자 순서 거꾸로
select reverse('가나다라마바사');

-- space(길이) 길이만큼 공백 반환
SELECT concat('이것이', space(10), 'MySQL이다');

-- substring(문자열, 시작위치, 길이) 또는 substring(문자열 from 시작위치 for 길이)
select substring('대한민국만세', 3, 2);

-- substring_index(문자열, 구분자, 횟수)
-- 문자열에서 구분자가 왼쪽부터 양수 횟수 번째 나오면 그 이후의 오른쪽은 버린다.
-- 문자열에서 구분자가 오른쪽부터 음수 횟수 번째 나오면 그 이후의 왼쪽은 버린다.
select substring_index('cafe.naver.com', '.', 2);
select substring_index('cafe.naver.com', '.', -2);



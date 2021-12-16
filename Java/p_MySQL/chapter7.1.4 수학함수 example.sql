-- abs(숫자), 절댓값 반환
select abs(-100); 

-- acos(숫자), asin(숫자), atan(숫자), atam2(숫자1, 숫자2), sin(숫자), cos(숫자), tan(숫자), 삼각함수와 관련된 함수
-- ceiling(숫자), floor(숫자), round(숫자) / 올림, 내림, 반올림 계산
select ceiling(4.7), floor(4.7), round(4.7);

-- conv(숫자, 원래 진수, 변환할 진수) / 숫자를 원래 진수에서 변환할 진수로 계산
select conv('AA', 16, 2), conv(100, 10, 8);

-- degrees(숫자), randians(숫자), pi(숫자) / 라디안을 각도값으로, 각도값을 라디안으로 변환, 파이값 변환
select degrees(pi()), radians(180);

-- exp(x), ln(숫자), log(숫자), log(밑수, 숫자), log2(숫자), log10(숫자) / 지수, 로그와 관련된 함수 제공
-- mod(숫자1, 숫자2) 또는 숫자1 % 숫자2 또는 숫자1 mod 숫자2 / 숫자1을 숫자2로 나눈 나머지 값을 구한다.
select mod(157,10), 157%10, 157 mod 10;

-- pow(숫자1, 숫자2), sqrt(숫자) / 거듭제고값 및 제곱근을 구한다
select pow(2, 3), sqrt(9);

-- rand() / 0이상 1미만의 실수를 구한다.
select rand(), floor(1 + (rand() * (7-1)));

-- sign(숫자) / 숫자가 양수, 0, 음수인지 구한다 결과는 1, 0, -1 셋 중 하나를 반환한다.
SELECT sign(100), sign(0), sign(-100.123);

-- truncate(숫자, 정수) / 숫자를 소수점 기준으로 정수 위치까지 구하고 나머지는 버린다.
select truncate(123475.12345, 2), truncate(12345.12345, -2);




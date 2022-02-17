use sqldb;
select JSON_OBJECT('name', name, 'height',height) as 'json 값' 
from usertbl
where height >= 180;

set @json = '{"usertbl" : [
{"name" : 임재범, "height" : 182}
{"name" : 이승기, "height" : 182}
{"name" : 성시경, "height" : 186}
]}';

select json_valid(@json) as json_valid;
select json_search(@json, 'one', '성시경') as json_search;
select json_extract(@json, '$.usertbl[2].name') as json_extract;
select json_insert(@json, '$.usertbl[0].mdate', '2009-09-09') as json_insert;
select json_replace(@json, '$.usertbl[0].name', '홍길동') as json_replace;
select json_remove(@json, '$.usertbl[0]') as json_remove;


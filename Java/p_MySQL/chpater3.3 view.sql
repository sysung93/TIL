create view uv_memberTBL 
as
select memberID, memberaddress from memberTBL;

select * from uv_memberTBL;
use sqldb;
select * 
	from buytbl
		inner join usertbl
			on buytbl.userID = usertbl.userID
		where buytbl.userid = 'jyp';
        
select * 
	from buytbl
		inner join usertbl
			on buytbl.userID = usertbl.userID
	ORDER BY num;
    
select buytbl.userID, name, prodName, addr, concat(mobile1, mobile2) as '연락처'
	from buytbl
		inner join usertbl
			on buytbl.userID = usertbl.userID;
            
select buytbl.userID, usertbl.name, buytbl.prodName, usertbl.addr, concat(usertbl.mobile1, usertbl.mobile2) as '연락처'
	from buytbl
		inner join usertbl
			on buytbl.userID = usertbl.userID;
            
select B.userID, U.name, B.prodName, U.addr, concat(U.mobile1, U.mobile2) as '연락처'
	from buytbl B
		inner join usertbl U
			on B.userID = U.userID;
            
select B.userID, U.name, B.prodName, U.addr, concat(U.mobile1, U.mobile2) as '연락처'
	from usertbl U
		inner join Buytbl B
			on u.userID = b.userID
		where b.userid = 'jyp';

select B.userID, U.name, B.prodName, U.addr, concat(U.mobile1, U.mobile2) as '연락처'
	from usertbl U
		inner join Buytbl B
			on u.userID = b.userID
		order by u.userID;
    
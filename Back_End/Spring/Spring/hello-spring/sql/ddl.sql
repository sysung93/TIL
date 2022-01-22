use springdatabase;

create table member (
	id bigint not null auto_increment primary key ,
    name VARCHAR(255)
);


insert into member(id, name) value(null, "spring");
insert into member(id, name) value(2, "spring2");
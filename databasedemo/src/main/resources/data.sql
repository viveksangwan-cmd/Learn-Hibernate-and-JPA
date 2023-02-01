
create table person(
 id Integer not null,
 name varchar(255) not null,
 location varchar(255),
 birth_date timestamp,
 primary key(id)
);

insert into person(id,name,location,birth_date) values(1001,'XYZ','MUMBAI',CURRENT_DATE());
insert into person(id,name,location,birth_date) values(1002,'ABC','Delhi',CURRENT_DATE());
insert into person(id,name,location,birth_date) values(1003,'OPQ','LONDON',CURRENT_DATE());
insert into person(id,name,location,birth_date) values(1004,'TUV','NK',CURRENT_DATE());
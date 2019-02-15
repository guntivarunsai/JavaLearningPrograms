use world;

SELECT id,name,countrycode,district,population from CITY;

select * from country;

select * from countrylanguage;

select count(distinct countrycode) from city;

select * from city where not countrycode='IND' and population>1000000;

select * from city where  countrycode='IND' and population>1000000;

select * from city where countrycode='IND' and population>1000000 order by district desc;

select * from city where countrycode='IND' and population>1000000 order by 4 desc;

create table leaders(lno int not null,leader_name varchar(20), salary float, city_id int,
					primary key(lno),
                    foreign key (city_id) references city(id));

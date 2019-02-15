use world;

SELECT id,name,countrycode,district,population from CITY;

select * from country;

select * from countrylanguage;

select count(distinct countrycode) from city;

select * from city where not countrycode='IND' and population>1000000;

select * from city where  countrycode='IND' and population>1000000;

select * from city where countrycode='IND' and population>1000000 order by district desc;

select * from city where countrycode='IND' and population>1000000 order by 4 desc;






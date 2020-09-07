CREATE TABLE configuration (
	id integer primary key auto_increment,
	name varchar(35) not null unique,
	description varchar(70) not null
)
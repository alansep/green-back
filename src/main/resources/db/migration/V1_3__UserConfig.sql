CREATE TABLE user_config (
	id integer primary key auto_increment,
	id_config integer not null,
	config_value varchar(40) not null,
	foreign key (id_config) references configuration(id)
)

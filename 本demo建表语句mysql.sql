create database demohot_demos default charset=utf8;

CREATE TABLE demos.`user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255),
  `age` int,
  `user_type` int,
  PRIMARY KEY (`user_id`)
);

create table demos.demo(
	demo_id bigint not null auto_increment,
	title varchar(255),
	content varchar(10000),
	demo_type int,
	primary key(demo_id)
);
create database  if not exists sqltest;
use sqltest;
drop table if exists `user`;
create table `user`(
  `id` integer primary key,
  `name` char(10) ,
  `password` char(20)
);

insert into `user` values(1,'zhangsan','111');
insert into `user` (`id`,`name`,`password`) values(2,'lisi','222');
insert into `user` (`id`,`name`,`password`) values(3,'admin','123');
insert into `user` (`id`,`name`,`password`) values(4,'guest','123');

drop table if exists department;
create table `department` (
    `id` integer primary key ,
    `departmentName` char(20) not null
);

insert into department values(1, 'dpt1');
insert into department values(2, 'dpt2');
insert into department values(3, 'dpt3');
insert into department values(4, 'dpt4');

drop table if exists employee;
create table employee (
  `id` integer primary key ,
  `name` char(20) not null,
  `departmentId` integer not null
);

insert into employee values (1,'emp1',1);
insert into employee values (2,'emp2',2);
insert into employee values (3,'emp3',3);
insert into employee values (4,'emp4',4);

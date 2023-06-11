--liquibase formatted sql

--changeset alex:1
create schema save_logs;

--changeset alex:2
create table save_logs.jdbc_save(
    id_jdbc int primary key auto_increment,
    line VARCHAR(10) NOT NULL,
    date VARCHAR(30) NOT NULL,
    threadName VARCHAR(35) NOT NULL,
    logName VARCHAR(35) NOT NULL,
    className VARCHAR(35) NOT NULL,
    methodName VARCHAR(35) NOT NULL,
    level VARCHAR(35) NOT NULL,
    message VARCHAR(100) NOT NULL
);
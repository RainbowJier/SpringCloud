create table member
(
    id     bigint auto_increment comment 'id'
        primary key,
    NAME   varchar(64) null comment '用户名',
    pwd    varchar(32) null comment '密码',
    mobile varchar(20) null comment '手机号码',
    email  varchar(64) null comment '邮箱',
    gender tinyint     null comment '性别'
);


create table member
(
    id     bigint auto_increment comment 'id'
        primary key,
    NAME   varchar(64) null comment '用户名',
    pwd    varchar(32) null comment '密码',
    mobile varchar(20) null comment '手机号码',
    email  varchar(64) null comment '邮箱',
    gender tinyint     null comment '性别'
);

INSERT INTO member (id, NAME, pwd, mobile, email, gender)
VALUES (1, 'smith', '123', '123456789000', 'smith@sohu.com', 0);
INSERT INTO member (id, NAME, pwd, mobile, email, gender)
VALUES (2, 'RainbowJier', '112233', 'test', 'test', 1);
INSERT INTO member (id, NAME, pwd, mobile, email, gender)
VALUES (7, 'test', 'test', 'test', 'test', 0);

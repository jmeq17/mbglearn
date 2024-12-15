DROP DATABASE IF EXISTS db_school_system;

CREATE DATABASE IF NOT EXISTS db_school_system;

USE db_school_system;

DROP TABLE IF EXISTS t_student;

CREATE TABLE IF NOT EXISTS t_student
(
    id             INT AUTO_INCREMENT PRIMARY KEY COMMENT '主键，自增',
#     id2             INT DEFAULT 1 COMMENT '主键',
    name            VARCHAR(50)     NOT NULL COMMENT '学生姓名',
    age             INT             NOT NULL COMMENT '学生年龄',
    gender          ENUM ('M', 'F') NOT NULL COMMENT '学生性别，M 表示男性，F 表示女性',
    class           VARCHAR(20) COMMENT '班级名称',
    enrollment_date DATE            NOT NULL COMMENT '入学日期'
#    , PRIMARY KEY (id1, id2)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='学生信息表';

-- 插入测试数据
INSERT INTO t_student (name, age, gender, class, enrollment_date)
VALUES ('张三', 18, 'F', 'Class A', '2023-09-01'),
       ('李小红', 19, 'M', 'Class B', '2022-09-01'),
       ('王大锤', 17, 'M', 'Class A', '2024-09-01'),
       ('李四', 20, 'F', 'Class C', '2021-09-01'),
       ('马强', 18, 'M', 'Class B', '2023-09-01');
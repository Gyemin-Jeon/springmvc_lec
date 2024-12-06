DROP DATABASE IF EXISTS db_myapp;
CREATE DATABASE IF NOT EXISTS db_myapp;

USE db_myapp;

DROP TABLE IF EXISTS tbl_blog;
CREATE TABLE IF NOT EXISTS tbl_blog
(
  blog_id    INT AUTO_INCREMENT COMMENT '블로그아이디',
  title      VARCHAR(1000) NOT NULL COMMENT '제목',
  contents   TEXT COMMENT '내용',
  user_email VARCHAR(100) NOT NULL COMMENT '작성자이메일',
  hit        INT COMMENT '블로그조회수', 
  modify_dt  DATETIME COMMENT '수정일시',
  create_dt  DATETIME COMMENT '작성일시',
  CONSTRAINT pk_blog PRIMARY KEY (blog_id)
) ENGINE=InnoDB COMMENT '블로그';

INSERT INTO tbl_blog VALUES (NULL, '축구', '축구의 역사', 'aaa@naver.com', 100, NULL, '2024-12-05 10:00:30');
INSERT INTO tbl_blog VALUES (NULL, '농구', '농구의 역사', 'bbb@naver.com', 100, NULL, '2024-12-06 12:10:30');
INSERT INTO tbl_blog VALUES (NULL, '야구', '야구의 역사', 'ccc@naver.com', 100, NULL, '2024-12-07 17:15:30');
INSERT INTO tbl_blog VALUES (NULL, '배구', '배구의 역사', 'ddd@naver.com', 100, NULL, '2024-12-08 13:46:30');
INSERT INTO tbl_blog VALUES (NULL, '족구', '족구의 역사', 'eee@naver.com', 100, NULL, '2024-12-09 16:57:30');
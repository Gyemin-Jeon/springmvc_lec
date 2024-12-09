DROP DATABASE IF EXISTS db_app07;
CREATE DATABASE IF NOT EXISTS db_app07;
USE db_app07; 

DROP TABLE IF EXISTS tbl_board;
DROP TABLE IF EXISTS tbl_user;

CREATE TABLE IF NOT EXISTS tbl_user
(
  usr_id    INT AUTO_INCREMENT,
  usr_email VARCHAR(100) NOT NULL UNIQUE,
  usr_name   VARCHAR(100),
  CONSTRAINT pk_user PRIMARY KEY (usr_id)
) ENGINE=InnoDB COMMENT='사용자';

CREATE TABLE IF NOT EXISTS tbl_board
(
  board_id  INT AUTO_INCREMENT,
  title     VARCHAR(100) NOT NULL,
  contents  TEXT,
  create_dt DATETIME,
  usr_id    INT,
  CONSTRAINT pk_board PRIMARY KEY (board_id),
  CONSTRAINT pk_user_board FOREIGN KEY (usr_id) REFERENCES tbl_user (usr_id) ON DELETE SET NULL
) ENGINE=InnoDB COMMENT='게시판';

INSERT INTO tbl_user VALUES (NULL, 'jeon@naver.com', 'jeon');
INSERT INTO tbl_user VALUES (NULL, 'gye@naver.com', 'gye');
INSERT INTO tbl_user VALUES (NULL, 'min@naver.com', 'min');

INSERT INTO tbl_board VALUES (NULL, '운동', '축구, 야구, 족구', '2024-12-05 10:00:00', 1);
INSERT INTO tbl_board VALUES (NULL, '게임', '롤, 피파, 서든', '2024-12-06 10:00:00', 1);
INSERT INTO tbl_board VALUES (NULL, '브랜드', '나이키, 아디다스, 미즈노', '2024-12-07 10:00:00', 2);

COMMIT;

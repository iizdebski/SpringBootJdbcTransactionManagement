DROP DATABASE IF EXISTS springjdbcdb;
CREATE DATABASE springjdbcdb CHARACTER SET utf8 COLLATE utf8_general_ci;

USE springjdbcdb;

DROP TABLE IF EXISTS icici_bank;

CREATE TABLE icici_bank
(
  account_no LONG NOT NULL,
  account_type VARCHAR(100) NOT NULL,
  account_balance DOUBLE NOT NULL,
  account_holder_name VARCHAR(100) NOT NULL
)
  ENGINE = innoDB
  DEFAULT CHARACTER SET = utf8
;

INSERT INTO icici_bank(account_no,account_balance,account_type,account_holder_name) VALUES('1122330056','100000','Savina','John');
INSERT INTO icici_bank(account_no,account_balance,account_type,account_holder_name) VALUES('3355330099','20000','Savina','Martin');
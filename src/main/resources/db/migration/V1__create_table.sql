-- テーブルが重複しないよう存在チェック、あれば削除します
DROP TABLE IF EXISTS m_user;
DROP TABLE IF EXISTS r_bookuser;
DROP TABLE IF EXISTS t_user_progress;

-- 簡易なマスタテーブル
CREATE TABLE `springboot-flyway`.`m_user` (
  `uid` VARCHAR(256) NOT NULL,
  `uname` VARCHAR(256),
  `description` VARCHAR(2000),
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `springboot-flyway`.`r_bookuser` (
  `uid` VARCHAR(256) NOT NULL,
  `isbn` VARCHAR(16) NOT NULL,
  `status` VARCHAR(1),
  `progress` int,
  `memo` VARCHAR(2000),
  PRIMARY KEY (`uid`,`isbn`),
  CONSTRAINT fk_uid_r_bookuser
  FOREIGN KEY (uid)
  REFERENCES `springboot-flyway`.`m_user` (uid)
  ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `springboot-flyway`.`t_user_progress` (
  `uid` VARCHAR(256) NOT NULL,
  `ymd` datetime NOT NULL,
  `isbn` VARCHAR(16) NOT NULL,
  `progress` int,
  PRIMARY KEY (`uid`,`ymd`),
  CONSTRAINT fk_uid_t_user_progress
    FOREIGN KEY (uid) REFERENCES `springboot-flyway`.`m_user`(uid)
    ON DELETE RESTRICT ON UPDATE RESTRICT
--  CONSTRAINT fk_isbn
--    FOREIGN KEY (isbn) REFERENCES `springboot-flyway`.`r_bookuser`(isbn)
--    ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



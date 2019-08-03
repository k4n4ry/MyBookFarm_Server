-- テーブルが重複しないよう存在チェック、あれば削除します
DROP TABLE IF EXISTS currency;
DROP TABLE IF EXISTS r_bookuser;

-- 簡易なマスタテーブル
CREATE TABLE `currency` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) NOT NULL,
  `symbol` VARCHAR(10) NOT NULL,
  `amount` DECIMAL(40, 20),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--CREATE TABLE `m_user` (
--  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
--  `address` VARCHAR(256) NOT NULL,
--  `password` VARCHAR(256) NOT NULL,
--  PRIMARY KEY (`id`)
--) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  CONSTRAINT fk_uid
  FOREIGN KEY (uid)
  REFERENCES `springboot-flyway`.`m_user` (uid)
  ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


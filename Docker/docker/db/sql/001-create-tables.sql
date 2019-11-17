---- drop ----
DROP TABLE IF EXISTS `dama_table`;
DROP TABLE IF EXISTS `user_table`;

---- create ----
create table IF not exists `dama_table`
(
 `id`               INT(20) AUTO_INCREMENT,
 `name`             VARCHAR(20) NOT NULL,
 `created_at`       Datetime DEFAULT NULL,
 `updated_at`       Datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


create table IF not exists `user_table`
(
 `id`               INT(20) AUTO_INCREMENT,
 `name`             VARCHAR(20) NOT NULL,
 `password`       VARCHAR(20) NOT NULL,
    PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

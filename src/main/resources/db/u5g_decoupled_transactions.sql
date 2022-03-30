CREATE SCHEMA IF NOT EXISTS `U5G_ACS_TRANSACTIONS`;
USE `U5G_ACS_TRANSACTIONS`;

DROP TABLE IF EXISTS `DECOUPLED`;
CREATE TABLE `DECOUPLED`
(
    `TRANSACTION_ID`              varchar(45)               NOT NULL,
    `TOKEN_PAN`                   varchar(32)               NOT NULL,
    `TRANSACTION_STATUS`          ENUM('PENDING', 'DONE')   NOT NULL DEFAULT 'PENDING',
    `TRANSACTION_CREATION_DATE`   timestamp                 DEFAULT CURRENT_TIMESTAMP,
    `TRANSACTION_EXPIRATION_DATE` timestamp                 DEFAULT CURRENT_TIMESTAMP,
    `ISSUER_CODE`                 varchar(255)              NOT NULL,
    `SUB_ISSUER_CODE`             varchar(255)              NOT NULL,
    `CARDHOLDER_ID`               varchar(255)              NOT NULL,
    `THREE_DS_REQUESTOR_NAME`     varchar(255)              NOT NULL,
    `CONVERTED_AMOUNT`            integer                   NOT NULL,
    `ACS_SESSION`                 longblob                  NOT NULL,
    PRIMARY KEY (`TRANSACTION_ID`) USING BTREE,
    INDEX `TOKEN_PAN` (`TOKEN_PAN`),
    INDEX `TRANSACTION_STATUS`(`TRANSACTION_STATUS`),
    INDEX `TRANSACTION_EXPIRATION_DATE` (`TRANSACTION_EXPIRATION_DATE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
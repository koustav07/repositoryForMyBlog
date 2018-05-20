--CREATE DATABASE inventoryMgmt;
drop table TASK_MASTER;

CREATE TABLE `task_master` (
	`task_id` INT(11) NOT NULL AUTO_INCREMENT,
	`task_name` VARCHAR(50) NULL DEFAULT NULL,
	`task_description` VARCHAR(200) NULL DEFAULT NULL,
	`delete_ind` VARCHAR(1) NULL DEFAULT NULL,
	`created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	`created_by` VARCHAR(50) NULL DEFAULT NULL,
	`updated_date` TIMESTAMP NULL DEFAULT NULL,
	`updated_by` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`task_id`)
);

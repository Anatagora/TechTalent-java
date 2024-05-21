/*
SQLyog Enterprise v12.5.0 (64 bit)
MySQL - 5.7.33 : Database - cmalldb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demodb` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `demodb`;

/*Table structure for table `ums_user` */

DROP TABLE IF EXISTS `ums_user`;

CREATE TABLE `ums_user` (
  `id` bigint(20) unsigned NOT NULL COMMENT '主键',
  `username` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '账号',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '密码',
  `nickname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '昵称',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '邮箱',
  `status` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '用户状态：1(已启用) 0(已禁用)',
  `is_deleted` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '逻辑删除：1(已删除) 0(未删除)',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `create_by` bigint(50) DEFAULT NULL,
  `update_by` bigint(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `ums_user` */

insert  into `ums_user`(`id`,`username`,`password`,`nickname`,`email`,`status`,`is_deleted`,`create_time`,`update_time`,`create_by`,`update_by`) values 
(1420628065898041346,'111','stri222ng','111','string',0,0,'2021-07-29 14:11:40','2021-07-29 14:11:40',1000,NULL),
(1420631015789793281,'111','stri222ng','111','string',0,0,'2021-07-29 14:23:23','2021-07-29 14:23:23',1000,NULL),
(1420631101273903105,'111','stri222ng','111','string',0,0,'2021-07-29 14:23:43','2021-07-29 14:23:43',1000,NULL),
(1420632350929031170,'111','stri222ng','111','string',0,0,'2021-07-29 14:28:41','2021-07-29 14:28:41',1000,NULL),
(1420632837988388865,'111','stri222ng','111','string',0,0,'2021-07-29 14:30:37','2021-07-29 14:30:37',1000,NULL),
(1420632838978244610,'111','stri222ng','111','string',0,0,'2021-07-29 14:30:38','2021-07-29 14:30:38',1000,NULL),
(1420637321212825602,'111','stri222ng','111','string',0,0,'2021-07-29 14:48:26','2021-07-29 14:48:26',1000,NULL),
(1443505874488057858,'string','string','string','string',0,0,'2021-09-30 17:19:54','2021-09-30 17:19:54',1000,NULL),
(1446088051692212226,'111','string','string','string',0,0,'2021-10-07 20:20:33','2021-10-07 20:20:33',1000,NULL),
(1446088053365739521,'111','string','string','string',0,0,'2021-10-07 20:20:34','2021-10-07 20:20:34',1000,NULL),
(1446088053428654081,'111','string','string','string',0,0,'2021-10-07 20:20:34','2021-10-07 20:20:34',1000,NULL),
(1446088057635540993,'111','string','string','string',0,0,'2021-10-07 20:20:35','2021-10-07 20:20:35',1000,NULL),
(1446088057698455554,'111','string','string','string',0,0,'2021-10-07 20:20:35','2021-10-07 20:20:35',1000,NULL),
(1446088057698455555,'111','string','string','string',0,0,'2021-10-07 20:20:35','2021-10-07 20:20:35',1000,NULL),
(1446088061976645633,'111','string','string','string',0,0,'2021-10-07 20:20:36','2021-10-07 20:20:36',1000,NULL),
(1446088061976645634,'111','string','string','string',0,0,'2021-10-07 20:20:36','2021-10-07 20:20:36',1000,NULL),
(1446088132210266113,'111','string','string','string',0,0,'2021-10-07 20:20:52','2021-10-07 20:20:52',1000,NULL),
(1446098560873205762,'111','string','string','string',0,0,'2021-10-07 21:02:19','2021-10-07 21:02:19',1000,NULL),
(1446098564216066050,'111','string','string','string',0,0,'2021-10-07 21:02:20','2021-10-07 21:02:20',1000,NULL),
(1446098564216066051,'111','string','string','string',0,0,'2021-10-07 21:02:20','2021-10-07 21:02:20',1000,NULL),
(1446098568485867522,'111','string','string','string',0,0,'2021-10-07 21:02:21','2021-10-07 21:02:21',1000,NULL),
(1446098568485867523,'111','string','string','string',0,0,'2021-10-07 21:02:21','2021-10-07 21:02:21',1000,NULL),
(1446098568485867524,'111','string','string','string',0,0,'2021-10-07 21:02:21','2021-10-07 21:02:21',1000,NULL),
(1446098572776640513,'111','string','string','string',0,0,'2021-10-07 21:02:22','2021-10-07 21:02:22',1000,NULL),
(1446098572776640514,'111','string','string','string',0,0,'2021-10-07 21:02:22','2021-10-07 21:02:22',1000,NULL),
(1446098664640286721,'111','string','string','string',0,0,'2021-10-07 21:02:44','2021-10-07 21:02:44',1000,NULL),
(1446099525814784001,'111','string','string','string',0,0,'2021-10-07 21:06:09','2021-10-07 21:06:09',1000,NULL),
(1446099534228557825,'111','string','string','string',0,0,'2021-10-07 21:06:11','2021-10-07 21:06:11',1000,NULL),
(1446099935527030786,'111','string','string','string',0,0,'2021-10-07 21:07:47','2021-10-07 21:07:47',1000,NULL),
(1446099937099894786,'111','string','string','string',0,0,'2021-10-07 21:07:47','2021-10-07 21:07:47',1000,NULL),
(1446099937162809346,'111','string','string','string',0,0,'2021-10-07 21:07:47','2021-10-07 21:07:47',1000,NULL),
(1446099941424222209,'111','string','string','string',0,0,'2021-10-07 21:07:48','2021-10-07 21:07:48',1000,NULL),
(1446099941424222210,'111','string','string','string',0,0,'2021-10-07 21:07:48','2021-10-07 21:07:48',1000,NULL),
(1446099941424222211,'111','string','string','string',0,0,'2021-10-07 21:07:48','2021-10-07 21:07:48',1000,NULL),
(1446099945694023682,'111','string','string','string',0,0,'2021-10-07 21:07:49','2021-10-07 21:07:49',1000,NULL),
(1446099945756938241,'111','string','string','string',0,0,'2021-10-07 21:07:49','2021-10-07 21:07:49',1000,NULL),
(1446099949305319425,'111','string','string','string',0,0,'2021-10-07 21:07:50','2021-10-07 21:07:50',1000,NULL),
(1446099955802296322,'111','string','string','string',0,0,'2021-10-07 21:07:51','2021-10-07 21:07:51',1000,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

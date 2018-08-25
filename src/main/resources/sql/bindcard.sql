
-- ----------------------------
-- Table structure for bindcard
-- ----------------------------
DROP TABLE IF EXISTS `bindcard`;
CREATE TABLE `bindcard` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `personId` varchar(32) DEFAULT NULL,
  `bankCard` varchar(32) DEFAULT NULL,
  `bankMobile` varchar(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blacklist
-- ----------------------------
DROP TABLE IF EXISTS `blacklist`;
CREATE TABLE `blacklist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `personId` int(11) DEFAULT NULL COMMENT '客户id',
  `reason` varchar(255) DEFAULT NULL COMMENT '理由',
  `startTime` datetime DEFAULT NULL COMMENT '封禁起始时间',
  `endTime` datetime DEFAULT NULL COMMENT '封禁结束时间',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `realName` varchar(255) DEFAULT NULL COMMENT '姓名',
  `idNumber` varchar(255) DEFAULT NULL COMMENT '身份证',
  `mobile` varchar(255) DEFAULT NULL COMMENT '手机号',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

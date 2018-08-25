-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `personId` varchar(32) DEFAULT NULL,
  `title` varchar(64) DEFAULT NULL COMMENT '标题',
  `price` decimal(20,2) DEFAULT NULL,
  `rentType` varchar(256) DEFAULT NULL,
  `houseType` varchar(256) DEFAULT NULL COMMENT '房屋类型',
  `houseCenter` varchar(32) DEFAULT NULL COMMENT '房屋楼层',
  `houseArea` varchar(256) DEFAULT NULL COMMENT '房屋小区',
  `address` varchar(256) DEFAULT NULL COMMENT '详细地址',
  `message` text COMMENT '具体信息',
  `mobile` varchar(11) DEFAULT NULL COMMENT '联系手机号',
  `status` varchar(255) DEFAULT NULL COMMENT '消息有效性',
  `createTime` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

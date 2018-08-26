-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `personId` int(11) DEFAULT NULL COMMENT '客户id',
  `communityName` varchar(255) DEFAULT NULL,
  `address` varchar(512) DEFAULT NULL,
  `houseType` varchar(255) DEFAULT NULL COMMENT '32190代表3室1厅1卫共90平方米',
  `houseDirection` varchar(255) DEFAULT NULL COMMENT '房屋方向，只能是8个方向值。东南西北',
  `houseDecoration` varchar(255) DEFAULT NULL COMMENT '房屋装修',
  `houseFloor` varchar(255) DEFAULT NULL COMMENT '房屋楼层： 6/8 代表共8层在第六层',
  `price` decimal(20,2) DEFAULT NULL COMMENT '价格 单元：1234元/月',
  `priceContain` varchar(255) DEFAULT NULL COMMENT '租金包含费用：水费，电费，燃气费，网费，其他',
  `payType` varchar(255) DEFAULT NULL COMMENT '支付方式：压一付一',
  `contractTime` varchar(255) DEFAULT NULL COMMENT '合同签订的时间：6个月',
  `watchDate` varchar(255) DEFAULT NULL COMMENT '看房时间 仅周末 仅工作日 随时看房',
  `checkInDate` varchar(255) DEFAULT NULL COMMENT '最早入住时间',
  `personSum` varchar(255) DEFAULT NULL COMMENT '宜住人数',
  `sexRequire` varchar(255) DEFAULT NULL COMMENT '性别要求',
  `title` varchar(255) DEFAULT NULL COMMENT '消息标题',
  `houseDescription` varchar(255) DEFAULT NULL,
  `contactMobile` varchar(255) DEFAULT NULL COMMENT '联系手机',
  `contactName` varchar(255) DEFAULT NULL COMMENT '联系人',
  `status` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

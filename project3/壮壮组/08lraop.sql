/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : lraop

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-11-11 14:11:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `aff`
-- ----------------------------
DROP TABLE IF EXISTS `aff`;
CREATE TABLE `aff` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(500) DEFAULT NULL,
  `adate` date DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aff
-- ----------------------------
INSERT INTO `aff` VALUES ('3', 'ghtjyj,.', '2019-11-04', '我是中国人');
INSERT INTO `aff` VALUES ('4', 'ghtjyj,.', '2019-11-08', '中国');
INSERT INTO `aff` VALUES ('5', 'ghtjyj,.', '2019-11-08', '小学国中');
INSERT INTO `aff` VALUES ('6', 'ghtjyj,.', '2019-11-08', '咿呀咿呀');
INSERT INTO `aff` VALUES ('7', '2', '2019-11-10', '1');
INSERT INTO `aff` VALUES ('8', '测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试', '2019-11-10', '关于呲呲呲呲呲呲呲呲');
INSERT INTO `aff` VALUES ('9', '测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试', '2019-11-10', '测试测试');
INSERT INTO `aff` VALUES ('10', '测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试', '2019-11-10', '测试测试');
INSERT INTO `aff` VALUES ('11', '测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试', '2019-11-10', '测试测试');
INSERT INTO `aff` VALUES ('12', '测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试', '2019-11-10', '测试测试');
INSERT INTO `aff` VALUES ('13', '测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试', '2019-11-10', '测试测试');
INSERT INTO `aff` VALUES ('14', '123123333333333333333333333333333333', '2019-11-10', '123123');
INSERT INTO `aff` VALUES ('15', '啊实打实大大大苏打实打实的', '2019-11-10', '啊实打实大苏打');
INSERT INTO `aff` VALUES ('16', '这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真   这是个测试文本   不要太较真', '2019-11-10', '我说了这只是个测试');
INSERT INTO `aff` VALUES ('17', 'dfghjkl;lkjhsdgjkl;lkjhgfdfghjklfdsdfghjklkjgfdjkl;lkjhfdsdfgjklkjgsd', '2019-11-10', 'sdfghjk');
INSERT INTO `aff` VALUES ('18', '1233', '2019-11-11', '123');
INSERT INTO `aff` VALUES ('19', '1233', '2019-11-11', '123');
INSERT INTO `aff` VALUES ('20', '1233', '2019-11-11', '123');
INSERT INTO `aff` VALUES ('21', '1233', '2019-11-11', '123');
INSERT INTO `aff` VALUES ('22', 'werwer', '2019-11-11', '111');
INSERT INTO `aff` VALUES ('23', '今天是个好日子', '2019-11-11', '本月总结');
INSERT INTO `aff` VALUES ('24', 'asdasdasd', '2019-11-11', 'hh');
INSERT INTO `aff` VALUES ('25', 'asdasdasdasdasdasdas', '2019-11-11', 'fasfsf');
INSERT INTO `aff` VALUES ('26', 'adsdasdasdasds', '2019-11-11', 'dddd');
INSERT INTO `aff` VALUES ('27', 'qweqweqwe', '2019-11-11', 'qweqwe');
INSERT INTO `aff` VALUES ('28', 'ccc', '2019-11-11', 'ccc');
INSERT INTO `aff` VALUES ('29', '555', '2019-11-11', '555');
INSERT INTO `aff` VALUES ('30', '123餐厅', '2019-11-11', '我');

-- ----------------------------
-- Table structure for `apply`
-- ----------------------------
DROP TABLE IF EXISTS `apply`;
CREATE TABLE `apply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `reason` varchar(200) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `s_date` date DEFAULT NULL,
  `q_date` date DEFAULT NULL,
  `z_date` date DEFAULT NULL,
  `pdate` date DEFAULT NULL,
  `sid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_7` (`sid`),
  KEY `FK_apply` (`uid`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`sid`) REFERENCES `state` (`id`),
  CONSTRAINT `FK_apply` FOREIGN KEY (`uid`) REFERENCES `employee` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of apply
-- ----------------------------
INSERT INTO `apply` VALUES ('8', '1', '腿疼', '病假', '2019-11-05', '2019-11-05', '2019-11-05', '2019-11-05', '1');
INSERT INTO `apply` VALUES ('9', '1', '头疼', '病假', '2019-11-05', '2019-11-05', '2019-11-05', '2019-11-07', '2');

-- ----------------------------
-- Table structure for `attendance`
-- ----------------------------
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_13` (`eid`),
  CONSTRAINT `FK_Reference_13` FOREIGN KEY (`eid`) REFERENCES `employee` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendance
-- ----------------------------
INSERT INTO `attendance` VALUES ('2', '5', '2019-11-08 12:07:57');
INSERT INTO `attendance` VALUES ('3', '1', '2019-11-09 16:39:10');
INSERT INTO `attendance` VALUES ('4', '1', '2019-11-09 17:36:58');
INSERT INTO `attendance` VALUES ('5', '1', '2019-11-10 20:34:38');
INSERT INTO `attendance` VALUES ('6', '1', '2019-11-10 23:55:16');
INSERT INTO `attendance` VALUES ('7', '1', '2019-11-11 10:51:13');
INSERT INTO `attendance` VALUES ('10', '1', '2019-11-11 13:50:39');

-- ----------------------------
-- Table structure for `baoxiao`
-- ----------------------------
DROP TABLE IF EXISTS `baoxiao`;
CREATE TABLE `baoxiao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bid` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `money` double DEFAULT NULL,
  `sid` int(11) DEFAULT NULL,
  `use` varchar(100) DEFAULT NULL,
  `pdate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_baoxiao` (`bid`),
  KEY `FK_baoxiao1` (`uid`),
  KEY `FK_baoxiao2` (`sid`),
  CONSTRAINT `FK_baoxiao` FOREIGN KEY (`bid`) REFERENCES `type` (`bid`),
  CONSTRAINT `FK_baoxiao1` FOREIGN KEY (`uid`) REFERENCES `employee` (`eid`),
  CONSTRAINT `FK_baoxiao2` FOREIGN KEY (`sid`) REFERENCES `state` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of baoxiao
-- ----------------------------
INSERT INTO `baoxiao` VALUES ('1', '1', '1', '2019-11-04', '1234', '1', 'gfjfhk', '2019-11-04');
INSERT INTO `baoxiao` VALUES ('2', '3', '3', '2019-11-04', '5476', '3', 'tgjkluilil', '2019-11-07');
INSERT INTO `baoxiao` VALUES ('3', '1', '5', '2019-11-04', '500', '2', '出差', '2019-11-08');
INSERT INTO `baoxiao` VALUES ('23', '1', '1', '2019-11-11', '100', '1', '吃饭', null);
INSERT INTO `baoxiao` VALUES ('26', '1', '1', '2019-11-11', '123', '1', '213', null);
INSERT INTO `baoxiao` VALUES ('27', '1', '1', '2019-11-11', '123213', '1', '123123123', null);

-- ----------------------------
-- Table structure for `cg_apply`
-- ----------------------------
DROP TABLE IF EXISTS `cg_apply`;
CREATE TABLE `cg_apply` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `iid` int(11) DEFAULT NULL,
  `sta_id` int(11) DEFAULT NULL,
  `c_number` int(11) DEFAULT NULL,
  `pdate` date DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`pid`),
  KEY `FK_Reference_28` (`iid`),
  KEY `FK_Reference_30` (`sta_id`),
  KEY `FK_cg_apply` (`uid`),
  CONSTRAINT `FK_Reference_28` FOREIGN KEY (`iid`) REFERENCES `property` (`iid`),
  CONSTRAINT `FK_Reference_30` FOREIGN KEY (`sta_id`) REFERENCES `state` (`id`),
  CONSTRAINT `FK_cg_apply` FOREIGN KEY (`uid`) REFERENCES `employee` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cg_apply
-- ----------------------------
INSERT INTO `cg_apply` VALUES ('5', '2', '2', '6', '2019-11-07', '2');
INSERT INTO `cg_apply` VALUES ('6', '3', '1', '1', '2019-11-07', '3');
INSERT INTO `cg_apply` VALUES ('7', '1', '1', '1', '2019-11-09', '3');

-- ----------------------------
-- Table structure for `daily`
-- ----------------------------
DROP TABLE IF EXISTS `daily`;
CREATE TABLE `daily` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL,
  `wdef` varchar(500) DEFAULT NULL,
  `wdate` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`did`),
  KEY `FK_Reference_20` (`eid`),
  CONSTRAINT `FK_Reference_20` FOREIGN KEY (`eid`) REFERENCES `employee` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of daily
-- ----------------------------
INSERT INTO `daily` VALUES ('1', '1', '奥术大师大所多 ', '2019-11-07');
INSERT INTO `daily` VALUES ('2', '1', 'fhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhufhrhu', '2019-11-07');
INSERT INTO `daily` VALUES ('5', '5', 'aaa', '2019-11-07');

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '财务部');
INSERT INTO `department` VALUES ('2', '人力资源部');
INSERT INTO `department` VALUES ('3', '行政部');
INSERT INTO `department` VALUES ('4', '后勤部');

-- ----------------------------
-- Table structure for `destory`
-- ----------------------------
DROP TABLE IF EXISTS `destory`;
CREATE TABLE `destory` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `iid` int(11) DEFAULT NULL,
  `pcount` int(11) DEFAULT NULL,
  `preason` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pid`),
  KEY `FK_Reference_27` (`iid`),
  CONSTRAINT `FK_Reference_27` FOREIGN KEY (`iid`) REFERENCES `property` (`iid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of destory
-- ----------------------------
INSERT INTO `destory` VALUES ('1', '1', '1', 'sdfgsdfgsdgf');
INSERT INTO `destory` VALUES ('2', '2', '2', 'sdfgsdgfsdfg');
INSERT INTO `destory` VALUES ('3', '3', '10', '阿斯顿发送到');
INSERT INTO `destory` VALUES ('4', '3', '10', '阿斯顿发送到');
INSERT INTO `destory` VALUES ('5', '3', '10', '阿斯顿发送到');
INSERT INTO `destory` VALUES ('6', '3', '10', '阿斯顿发送到');
INSERT INTO `destory` VALUES ('7', '3', '10', '阿斯顿发送到');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(20) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `zid` int(11) DEFAULT NULL,
  `bid` int(11) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`eid`),
  KEY `FK_Reference_5` (`bid`),
  KEY `FK_Reference_6` (`zid`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`bid`) REFERENCES `department` (`id`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`zid`) REFERENCES `position` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', 'xxl', '男', '1', '1', '1008611', '2019-11-04', '123');
INSERT INTO `employee` VALUES ('2', 'admin', '女', '2', '4', '34465812354', '2019-11-03', '888');
INSERT INTO `employee` VALUES ('3', 'lisa', '女', '2', '2', '12325379', '2019-10-10', '345');
INSERT INTO `employee` VALUES ('5', '宝宝', '女', '2', '3', '879165368', '2019-11-05', '321');

-- ----------------------------
-- Table structure for `file`
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `atitle` varchar(50) DEFAULT NULL,
  `eid` int(11) DEFAULT NULL,
  `adept` varchar(50) DEFAULT NULL,
  `adate` date DEFAULT NULL,
  `lian` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_18` (`eid`),
  CONSTRAINT `FK_Reference_18` FOREIGN KEY (`eid`) REFERENCES `employee` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='1';

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES ('1', '哈哈', '5', '宝宝', '2019-11-05', '啦啦');
INSERT INTO `file` VALUES ('3', '问问', '2', '哦哦', '2019-11-05', '小小');
INSERT INTO `file` VALUES ('5', '姗姗', '5', '兰兰', '2019-11-05', '然然');

-- ----------------------------
-- Table structure for `gh_apply`
-- ----------------------------
DROP TABLE IF EXISTS `gh_apply`;
CREATE TABLE `gh_apply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apid` int(11) DEFAULT NULL,
  `ghdatetime` date DEFAULT NULL,
  `sid` int(11) DEFAULT NULL,
  `pdate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_21` (`apid`),
  KEY `FK_Reference_25` (`sid`),
  CONSTRAINT `FK_Reference_21` FOREIGN KEY (`apid`) REFERENCES `ly_apply` (`apid`),
  CONSTRAINT `FK_Reference_25` FOREIGN KEY (`sid`) REFERENCES `state` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gh_apply
-- ----------------------------
INSERT INTO `gh_apply` VALUES ('1', '1', '2019-11-05', '2', '2019-11-09');
INSERT INTO `gh_apply` VALUES ('2', '9', '2019-11-06', '2', '2019-11-09');

-- ----------------------------
-- Table structure for `ly_apply`
-- ----------------------------
DROP TABLE IF EXISTS `ly_apply`;
CREATE TABLE `ly_apply` (
  `apid` int(11) NOT NULL AUTO_INCREMENT,
  `iid` int(11) DEFAULT NULL,
  `eid` int(11) DEFAULT NULL,
  `sta_id` int(11) DEFAULT NULL,
  `apnumber` int(11) DEFAULT NULL,
  `apdate` date DEFAULT NULL,
  `pdate` date DEFAULT NULL,
  PRIMARY KEY (`apid`),
  KEY `FK_iid` (`iid`),
  KEY `FK_eid` (`eid`),
  KEY `FK_sta_id` (`sta_id`),
  CONSTRAINT `FK_eid` FOREIGN KEY (`eid`) REFERENCES `employee` (`eid`),
  CONSTRAINT `FK_iid` FOREIGN KEY (`iid`) REFERENCES `property` (`iid`),
  CONSTRAINT `FK_sta_id` FOREIGN KEY (`sta_id`) REFERENCES `state` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ly_apply
-- ----------------------------
INSERT INTO `ly_apply` VALUES ('1', '3', '1', '2', '2', '2019-11-05', '2019-11-09');
INSERT INTO `ly_apply` VALUES ('9', '1', '5', '1', '1', '2019-11-08', null);
INSERT INTO `ly_apply` VALUES ('10', '1', '5', '2', '1', '2019-11-08', '2019-11-09');
INSERT INTO `ly_apply` VALUES ('12', '1', '1', '2', '1', '2019-11-08', null);
INSERT INTO `ly_apply` VALUES ('13', '1', '5', '2', '1', '2019-11-08', null);

-- ----------------------------
-- Table structure for `position`
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', '经理');
INSERT INTO `position` VALUES ('2', '员工');

-- ----------------------------
-- Table structure for `property`
-- ----------------------------
DROP TABLE IF EXISTS `property`;
CREATE TABLE `property` (
  `iid` int(11) NOT NULL AUTO_INCREMENT,
  `iname` varchar(50) DEFAULT NULL,
  `iclass` varchar(50) DEFAULT NULL,
  `itype` varchar(50) DEFAULT NULL,
  `iunit` varchar(50) DEFAULT NULL,
  `inumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`iid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of property
-- ----------------------------
INSERT INTO `property` VALUES ('1', '电脑', '惠普', 'x-123', '台', '22');
INSERT INTO `property` VALUES ('2', '键盘', '阿斯蒂芬', 'g25', '个', '26');
INSERT INTO `property` VALUES ('3', '鼠标', '热太阳', 'gf242', '个', '12');

-- ----------------------------
-- Table structure for `state`
-- ----------------------------
DROP TABLE IF EXISTS `state`;
CREATE TABLE `state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `state` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of state
-- ----------------------------
INSERT INTO `state` VALUES ('1', '审核中');
INSERT INTO `state` VALUES ('2', '通过');
INSERT INTO `state` VALUES ('3', '驳回');

-- ----------------------------
-- Table structure for `task`
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL,
  `tdef` varchar(500) DEFAULT NULL,
  `sdate` date DEFAULT NULL,
  `edate` date DEFAULT NULL,
  PRIMARY KEY (`tid`),
  KEY `FK_Reference_19` (`eid`),
  CONSTRAINT `FK_Reference_19` FOREIGN KEY (`eid`) REFERENCES `employee` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task
-- ----------------------------
INSERT INTO `task` VALUES ('1', '1', '个梵蒂冈的闪光点', '2017-10-10', '2017-10-10');

-- ----------------------------
-- Table structure for `type`
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `bname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('1', '交通');
INSERT INTO `type` VALUES ('2', '住宿');
INSERT INTO `type` VALUES ('3', '餐饮');

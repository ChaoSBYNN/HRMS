/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50704
Source Host           : 127.0.0.1:3306
Source Database       : hrms

Target Server Type    : MYSQL
Target Server Version : 50704
File Encoding         : 65001

Date: 2016-04-19 07:31:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_article
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `articleId` int(11) NOT NULL AUTO_INCREMENT,
  `articleClassId` int(11) DEFAULT NULL,
  `issuerId` int(11) DEFAULT NULL,
  `articleName` varchar(255) DEFAULT NULL,
  `articleType` varchar(255) DEFAULT NULL,
  `content` text,
  `issuedate` datetime DEFAULT NULL,
  PRIMARY KEY (`articleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_article
-- ----------------------------

-- ----------------------------
-- Table structure for t_article_class
-- ----------------------------
DROP TABLE IF EXISTS `t_article_class`;
CREATE TABLE `t_article_class` (
  `articleClassId` int(11) NOT NULL AUTO_INCREMENT,
  `fatherId` int(11) DEFAULT NULL,
  `articleClassName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`articleClassId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_article_class
-- ----------------------------

-- ----------------------------
-- Table structure for t_dept
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `deptId` int(11) NOT NULL AUTO_INCREMENT,
  `deptName` varchar(255) DEFAULT NULL,
  `fatherId` int(11) DEFAULT NULL,
  PRIMARY KEY (`deptId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('1', '开发部', '0');
INSERT INTO `t_dept` VALUES ('2', '行政部', '0');
INSERT INTO `t_dept` VALUES ('3', '后勤部', '0');
INSERT INTO `t_dept` VALUES ('4', '测试部', '0');
INSERT INTO `t_dept` VALUES ('5', '111111111', '0');

-- ----------------------------
-- Table structure for t_emp
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp` (
  `empId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`empId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_emp
-- ----------------------------
INSERT INTO `t_emp` VALUES ('1', '1');
INSERT INTO `t_emp` VALUES ('2', '2');

-- ----------------------------
-- Table structure for t_emp_base_info
-- ----------------------------
DROP TABLE IF EXISTS `t_emp_base_info`;
CREATE TABLE `t_emp_base_info` (
  `empBaseId` int(11) NOT NULL AUTO_INCREMENT,
  `empId` int(11) DEFAULT NULL,
  `empAge` int(11) DEFAULT NULL,
  `stationId` int(11) DEFAULT NULL,
  `idCard` int(18) DEFAULT NULL,
  `empSex` varchar(255) DEFAULT NULL,
  `empName` varchar(255) DEFAULT NULL,
  `empEducation` varchar(255) DEFAULT NULL,
  `empbirthday` datetime DEFAULT NULL,
  PRIMARY KEY (`empBaseId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_emp_base_info
-- ----------------------------
INSERT INTO `t_emp_base_info` VALUES ('1', '1', '22', '45', '19930426', '0', '张宪晨', '本科', '1993-04-26 00:00:00');
INSERT INTO `t_emp_base_info` VALUES ('2', '2', '22', '45', '19930426', '0', '张宪晨', '本科', '1993-04-26 00:00:00');
INSERT INTO `t_emp_base_info` VALUES ('7', '1', '111', '45', '1111', '0', '111', '本科', '1111-11-11 00:00:00');
INSERT INTO `t_emp_base_info` VALUES ('8', '1', '111', '45', '111', '0', '1111', '本科', '1111-11-11 00:00:00');
INSERT INTO `t_emp_base_info` VALUES ('9', '1', '111', '45', '111', '0', '111', '本科', '1111-11-11 00:00:00');
INSERT INTO `t_emp_base_info` VALUES ('10', '1', '111', '45', '111', '0', '111', '本科', '1111-11-11 00:00:00');
INSERT INTO `t_emp_base_info` VALUES ('11', '1', '222', '45', '2222', '0', '222', '本科', '2223-10-22 00:00:00');
INSERT INTO `t_emp_base_info` VALUES ('12', '1', '333', '45', '333', '0', '333', '本科', '3335-10-03 00:00:00');

-- ----------------------------
-- Table structure for t_emp_contact_info
-- ----------------------------
DROP TABLE IF EXISTS `t_emp_contact_info`;
CREATE TABLE `t_emp_contact_info` (
  `empContactId` int(11) NOT NULL AUTO_INCREMENT,
  `empId` int(11) DEFAULT NULL,
  `officePhone` int(11) DEFAULT NULL,
  `homePhone` int(11) DEFAULT NULL,
  `mobilePhone` int(11) DEFAULT NULL,
  `empEmail` varchar(255) DEFAULT NULL,
  `empAddress` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`empContactId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_emp_contact_info
-- ----------------------------
INSERT INTO `t_emp_contact_info` VALUES ('1', '1', '11', '11', '11', '11', '11');
INSERT INTO `t_emp_contact_info` VALUES ('2', '1', '11111111', '111', '111', '111', '111');
INSERT INTO `t_emp_contact_info` VALUES ('3', '1', '222', '222', '222', '222', '222');
INSERT INTO `t_emp_contact_info` VALUES ('4', '1', '333', '333', '333', '333', '333');

-- ----------------------------
-- Table structure for t_emp_education_info
-- ----------------------------
DROP TABLE IF EXISTS `t_emp_education_info`;
CREATE TABLE `t_emp_education_info` (
  `empEducationId` int(11) NOT NULL AUTO_INCREMENT,
  `empId` int(11) DEFAULT NULL,
  `schoolName` varchar(255) DEFAULT NULL,
  `enterdate` datetime DEFAULT NULL,
  `leavedate` datetime DEFAULT NULL,
  PRIMARY KEY (`empEducationId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_emp_education_info
-- ----------------------------
INSERT INTO `t_emp_education_info` VALUES ('1', '1', '111', null, null);
INSERT INTO `t_emp_education_info` VALUES ('2', '1', '1111111', '1111-11-11 00:00:00', '1111-11-11 00:00:00');
INSERT INTO `t_emp_education_info` VALUES ('3', '1', '222', '2223-10-22 00:00:00', '2223-10-22 00:00:00');
INSERT INTO `t_emp_education_info` VALUES ('4', '1', '333', '3335-10-03 00:00:00', '3335-10-03 00:00:00');

-- ----------------------------
-- Table structure for t_emp_office_info
-- ----------------------------
DROP TABLE IF EXISTS `t_emp_office_info`;
CREATE TABLE `t_emp_office_info` (
  `empOfficeId` int(11) NOT NULL AUTO_INCREMENT,
  `empId` int(11) DEFAULT NULL,
  `officeType` int(11) DEFAULT NULL,
  `hiredate` datetime DEFAULT NULL,
  `resigndate` datetime DEFAULT NULL,
  `isResign` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`empOfficeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_emp_office_info
-- ----------------------------

-- ----------------------------
-- Table structure for t_emp_work_info
-- ----------------------------
DROP TABLE IF EXISTS `t_emp_work_info`;
CREATE TABLE `t_emp_work_info` (
  `empWorkId` int(11) NOT NULL AUTO_INCREMENT,
  `empId` int(11) DEFAULT NULL,
  `companyName` varchar(255) DEFAULT NULL,
  `exstation` varchar(255) DEFAULT NULL,
  `duty` varchar(255) DEFAULT NULL,
  `enterdate` datetime DEFAULT NULL,
  `leavedate` datetime DEFAULT NULL,
  PRIMARY KEY (`empWorkId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_emp_work_info
-- ----------------------------

-- ----------------------------
-- Table structure for t_mission
-- ----------------------------
DROP TABLE IF EXISTS `t_mission`;
CREATE TABLE `t_mission` (
  `missionId` int(11) NOT NULL AUTO_INCREMENT,
  `issuerId` int(11) DEFAULT NULL,
  `missionName` varchar(255) DEFAULT NULL,
  `missionInfo` varchar(255) DEFAULT NULL,
  `issuedate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`missionId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_mission
-- ----------------------------
INSERT INTO `t_mission` VALUES ('1', '1', '', '222', null);

-- ----------------------------
-- Table structure for t_resume
-- ----------------------------
DROP TABLE IF EXISTS `t_resume`;
CREATE TABLE `t_resume` (
  `resumeId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `resumePath` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resumeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_resume
-- ----------------------------

-- ----------------------------
-- Table structure for t_station
-- ----------------------------
DROP TABLE IF EXISTS `t_station`;
CREATE TABLE `t_station` (
  `stationId` int(11) NOT NULL AUTO_INCREMENT,
  `deptId` int(11) DEFAULT NULL,
  `fatherId` int(11) DEFAULT NULL,
  `stationName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stationId`)
) ENGINE=InnoDB AUTO_INCREMENT=258 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_station
-- ----------------------------
INSERT INTO `t_station` VALUES ('1', '1', '0', '技术');
INSERT INTO `t_station` VALUES ('2', '1', '0', '产品');
INSERT INTO `t_station` VALUES ('3', '1', '0', '设计');
INSERT INTO `t_station` VALUES ('4', '2', '0', '运营');
INSERT INTO `t_station` VALUES ('5', '2', '0', '市场');
INSERT INTO `t_station` VALUES ('6', '2', '0', '职能');
INSERT INTO `t_station` VALUES ('7', '2', '0', '金融');
INSERT INTO `t_station` VALUES ('8', '1', '1', '后端开发');
INSERT INTO `t_station` VALUES ('9', '1', '1', '移动开发');
INSERT INTO `t_station` VALUES ('10', '1', '1', '前端开发');
INSERT INTO `t_station` VALUES ('11', '1', '1', '测试');
INSERT INTO `t_station` VALUES ('12', '1', '1', '运维');
INSERT INTO `t_station` VALUES ('13', '1', '1', 'DBA');
INSERT INTO `t_station` VALUES ('14', '1', '1', '技术高端职位');
INSERT INTO `t_station` VALUES ('15', '1', '1', '项目管理');
INSERT INTO `t_station` VALUES ('16', '1', '1', '硬件开发');
INSERT INTO `t_station` VALUES ('17', '1', '1', '企业软件');
INSERT INTO `t_station` VALUES ('18', '1', '2', '产品经理');
INSERT INTO `t_station` VALUES ('19', '1', '2', '产品设计师');
INSERT INTO `t_station` VALUES ('20', '1', '2', '产品高端职位');
INSERT INTO `t_station` VALUES ('21', '1', '3', '视觉设计');
INSERT INTO `t_station` VALUES ('22', '1', '3', '用户研究');
INSERT INTO `t_station` VALUES ('23', '1', '3', '设计高端职位');
INSERT INTO `t_station` VALUES ('24', '1', '3', '交互设计');
INSERT INTO `t_station` VALUES ('25', '1', '4', '运营');
INSERT INTO `t_station` VALUES ('26', '1', '4', '编辑');
INSERT INTO `t_station` VALUES ('27', '2', '4', '客服');
INSERT INTO `t_station` VALUES ('28', '2', '4', '运营高端职位');
INSERT INTO `t_station` VALUES ('29', '2', '5', '市场营销');
INSERT INTO `t_station` VALUES ('30', '2', '5', '公关');
INSERT INTO `t_station` VALUES ('31', '2', '5', '销售');
INSERT INTO `t_station` VALUES ('32', '2', '5', '市场高端职位');
INSERT INTO `t_station` VALUES ('33', '2', '5', '供应链');
INSERT INTO `t_station` VALUES ('34', '2', '5', '采购');
INSERT INTO `t_station` VALUES ('35', '2', '5', '投资');
INSERT INTO `t_station` VALUES ('36', '2', '6', '人力资源');
INSERT INTO `t_station` VALUES ('37', '2', '6', '行政');
INSERT INTO `t_station` VALUES ('38', '2', '6', '财务');
INSERT INTO `t_station` VALUES ('39', '2', '6', '职能高端职位');
INSERT INTO `t_station` VALUES ('40', '2', '6', '法务');
INSERT INTO `t_station` VALUES ('41', '2', '7', '投融资');
INSERT INTO `t_station` VALUES ('42', '2', '7', '风控');
INSERT INTO `t_station` VALUES ('43', '2', '7', '审计税务');
INSERT INTO `t_station` VALUES ('44', '2', '7', '金融高端职位');
INSERT INTO `t_station` VALUES ('45', '1', '8', 'Java');
INSERT INTO `t_station` VALUES ('47', '1', '8', 'Python');
INSERT INTO `t_station` VALUES ('48', '1', '8', 'PHP');
INSERT INTO `t_station` VALUES ('49', '1', '8', '.NET');
INSERT INTO `t_station` VALUES ('50', '1', '8', 'C#');
INSERT INTO `t_station` VALUES ('51', '1', '8', 'C++');
INSERT INTO `t_station` VALUES ('52', '1', '8', 'C');
INSERT INTO `t_station` VALUES ('53', '1', '8', 'Ruby');
INSERT INTO `t_station` VALUES ('54', '1', '8', 'Hadoop');
INSERT INTO `t_station` VALUES ('55', '1', '8', 'Node.js');
INSERT INTO `t_station` VALUES ('56', '1', '8', '数据挖掘');
INSERT INTO `t_station` VALUES ('57', '1', '8', '自然语言处理');
INSERT INTO `t_station` VALUES ('58', '1', '8', '搜索算法');
INSERT INTO `t_station` VALUES ('59', '1', '8', '后端开发其他');
INSERT INTO `t_station` VALUES ('60', '1', '9', 'HTML5');
INSERT INTO `t_station` VALUES ('61', '1', '9', 'Android');
INSERT INTO `t_station` VALUES ('62', '1', '9', 'IOS');
INSERT INTO `t_station` VALUES ('63', '1', '9', 'WP');
INSERT INTO `t_station` VALUES ('64', '1', '9', '移动开发其他');
INSERT INTO `t_station` VALUES ('65', '1', '10', 'WEB前端开发');
INSERT INTO `t_station` VALUES ('66', '1', '10', 'Flash');
INSERT INTO `t_station` VALUES ('67', '1', '10', 'HTML5');
INSERT INTO `t_station` VALUES ('68', '1', '10', 'JavaScript');
INSERT INTO `t_station` VALUES ('69', '1', '10', 'U3D');
INSERT INTO `t_station` VALUES ('70', '1', '10', '前端开发其他');
INSERT INTO `t_station` VALUES ('71', '1', '11', '测试工程师');
INSERT INTO `t_station` VALUES ('72', '1', '11', '自动化测试');
INSERT INTO `t_station` VALUES ('73', '1', '11', '功能测试');
INSERT INTO `t_station` VALUES ('74', '1', '11', '性能测试');
INSERT INTO `t_station` VALUES ('75', '1', '11', '测试开发');
INSERT INTO `t_station` VALUES ('76', '1', '11', '游戏测试');
INSERT INTO `t_station` VALUES ('77', '1', '11', '白盒测试');
INSERT INTO `t_station` VALUES ('78', '1', '11', '灰盒测试');
INSERT INTO `t_station` VALUES ('79', '1', '11', '黑盒测试');
INSERT INTO `t_station` VALUES ('80', '1', '11', '手机测试');
INSERT INTO `t_station` VALUES ('81', '1', '11', '硬件测试');
INSERT INTO `t_station` VALUES ('82', '1', '11', '测试经理');
INSERT INTO `t_station` VALUES ('83', '1', '11', '测试其他');
INSERT INTO `t_station` VALUES ('84', '1', '12', '运维工程师');
INSERT INTO `t_station` VALUES ('85', '1', '12', '运维开发工程师');
INSERT INTO `t_station` VALUES ('86', '1', '12', '网络工程师');
INSERT INTO `t_station` VALUES ('87', '1', '12', '系统工程师');
INSERT INTO `t_station` VALUES ('88', '1', '12', 'IT支持');
INSERT INTO `t_station` VALUES ('89', '1', '12', '系统管理员');
INSERT INTO `t_station` VALUES ('90', '1', '12', 'WEB安全');
INSERT INTO `t_station` VALUES ('91', '1', '12', '网络安全');
INSERT INTO `t_station` VALUES ('92', '1', '12', '系统安全');
INSERT INTO `t_station` VALUES ('93', '1', '12', '运维经理');
INSERT INTO `t_station` VALUES ('94', '1', '12', '运维其他');
INSERT INTO `t_station` VALUES ('95', '1', '13', 'MySQL');
INSERT INTO `t_station` VALUES ('96', '1', '13', 'SQLServer');
INSERT INTO `t_station` VALUES ('97', '1', '13', 'Oracle');
INSERT INTO `t_station` VALUES ('98', '1', '13', 'DB2');
INSERT INTO `t_station` VALUES ('99', '1', '13', 'MongoDB');
INSERT INTO `t_station` VALUES ('100', '1', '13', 'ETL');
INSERT INTO `t_station` VALUES ('101', '1', '13', '数据仓库');
INSERT INTO `t_station` VALUES ('102', '1', '13', 'DBA其他');
INSERT INTO `t_station` VALUES ('103', '1', '14', '技术经理');
INSERT INTO `t_station` VALUES ('104', '1', '14', '技术总监');
INSERT INTO `t_station` VALUES ('105', '1', '14', '架构师');
INSERT INTO `t_station` VALUES ('106', '1', '14', 'CTO');
INSERT INTO `t_station` VALUES ('107', '1', '14', '运维总监');
INSERT INTO `t_station` VALUES ('108', '1', '14', '技术合伙人');
INSERT INTO `t_station` VALUES ('109', '1', '14', '项目总监');
INSERT INTO `t_station` VALUES ('110', '1', '14', '测试总监');
INSERT INTO `t_station` VALUES ('111', '1', '14', '安全专家');
INSERT INTO `t_station` VALUES ('112', '1', '14', '高端技术职位其他');
INSERT INTO `t_station` VALUES ('113', '1', '15', '项目经理');
INSERT INTO `t_station` VALUES ('114', '1', '15', '项目助理');
INSERT INTO `t_station` VALUES ('115', '1', '16', '硬件');
INSERT INTO `t_station` VALUES ('116', '1', '16', '嵌入式');
INSERT INTO `t_station` VALUES ('117', '1', '16', '自动化');
INSERT INTO `t_station` VALUES ('118', '1', '16', '单片机');
INSERT INTO `t_station` VALUES ('119', '1', '16', '电路设计');
INSERT INTO `t_station` VALUES ('120', '1', '16', '驱动开发');
INSERT INTO `t_station` VALUES ('121', '1', '16', '系统集成');
INSERT INTO `t_station` VALUES ('122', '1', '16', '硬件开发其他');
INSERT INTO `t_station` VALUES ('123', '1', '17', '实施工程师');
INSERT INTO `t_station` VALUES ('124', '1', '17', '售前工程师');
INSERT INTO `t_station` VALUES ('125', '1', '17', '售后工程师');
INSERT INTO `t_station` VALUES ('126', '1', '17', '企业软件其他');
INSERT INTO `t_station` VALUES ('127', '1', '18', '产品经理');
INSERT INTO `t_station` VALUES ('128', '1', '18', '网页产品经理');
INSERT INTO `t_station` VALUES ('129', '1', '18', '移动产品经理');
INSERT INTO `t_station` VALUES ('130', '1', '18', '产品助理');
INSERT INTO `t_station` VALUES ('131', '1', '18', '数据产品经理');
INSERT INTO `t_station` VALUES ('132', '1', '18', '电商产品经理');
INSERT INTO `t_station` VALUES ('133', '1', '18', '游戏策划');
INSERT INTO `t_station` VALUES ('134', '1', '18', '产品实习生');
INSERT INTO `t_station` VALUES ('135', '1', '19', '网页产品设计师');
INSERT INTO `t_station` VALUES ('136', '1', '19', '无线产品设计师');
INSERT INTO `t_station` VALUES ('137', '1', '20', '产品部经理');
INSERT INTO `t_station` VALUES ('138', '1', '20', '产品总监');
INSERT INTO `t_station` VALUES ('139', '1', '20', '游戏制作人');
INSERT INTO `t_station` VALUES ('140', '1', '21', '网页设计师');
INSERT INTO `t_station` VALUES ('141', '1', '21', 'Flash设计师');
INSERT INTO `t_station` VALUES ('142', '1', '21', 'APP设计师');
INSERT INTO `t_station` VALUES ('143', '1', '21', 'UI设计师');
INSERT INTO `t_station` VALUES ('144', '1', '21', '平面设计师');
INSERT INTO `t_station` VALUES ('145', '1', '21', '美术设计师');
INSERT INTO `t_station` VALUES ('146', '1', '21', '广告设计师');
INSERT INTO `t_station` VALUES ('147', '1', '21', '多媒体设计师');
INSERT INTO `t_station` VALUES ('148', '1', '21', '游戏场景');
INSERT INTO `t_station` VALUES ('149', '1', '22', '数据分析师');
INSERT INTO `t_station` VALUES ('150', '1', '22', '用户研究院');
INSERT INTO `t_station` VALUES ('151', '1', '22', '游戏数值策划');
INSERT INTO `t_station` VALUES ('152', '1', '23', '设计经理');
INSERT INTO `t_station` VALUES ('153', '1', '23', '设计总监');
INSERT INTO `t_station` VALUES ('154', '1', '23', '视觉设计经理');
INSERT INTO `t_station` VALUES ('155', '1', '23', '设觉设计总监');
INSERT INTO `t_station` VALUES ('156', '1', '23', '交互设计经理');
INSERT INTO `t_station` VALUES ('157', '1', '23', '交互设计总监');
INSERT INTO `t_station` VALUES ('158', '1', '23', '用户研究经理');
INSERT INTO `t_station` VALUES ('159', '1', '23', '用户研究总监');
INSERT INTO `t_station` VALUES ('160', '1', '24', '网页交互设计师');
INSERT INTO `t_station` VALUES ('161', '1', '24', '交互设计师');
INSERT INTO `t_station` VALUES ('162', '1', '24', '无线交互设计师');
INSERT INTO `t_station` VALUES ('163', '1', '24', '硬件交互设计师');
INSERT INTO `t_station` VALUES ('164', '2', '25', '内容运营');
INSERT INTO `t_station` VALUES ('165', '2', '25', '产品运营');
INSERT INTO `t_station` VALUES ('166', '2', '25', '数据运营');
INSERT INTO `t_station` VALUES ('167', '2', '25', '活动运营');
INSERT INTO `t_station` VALUES ('168', '2', '25', '商家运营');
INSERT INTO `t_station` VALUES ('169', '2', '25', '游戏运营');
INSERT INTO `t_station` VALUES ('170', '2', '25', '网络推广');
INSERT INTO `t_station` VALUES ('171', '2', '25', '运营经理');
INSERT INTO `t_station` VALUES ('172', '2', '26', '副主编');
INSERT INTO `t_station` VALUES ('173', '2', '26', '内容编辑');
INSERT INTO `t_station` VALUES ('174', '2', '26', '文案策划');
INSERT INTO `t_station` VALUES ('175', '2', '26', '记着');
INSERT INTO `t_station` VALUES ('176', '2', '27', '售前咨询');
INSERT INTO `t_station` VALUES ('177', '2', '27', '售后客服');
INSERT INTO `t_station` VALUES ('178', '2', '27', '客服经理');
INSERT INTO `t_station` VALUES ('179', '2', '28', '主编');
INSERT INTO `t_station` VALUES ('180', '2', '28', '运营总监');
INSERT INTO `t_station` VALUES ('181', '2', '28', 'COO');
INSERT INTO `t_station` VALUES ('182', '2', '28', '客服总监');
INSERT INTO `t_station` VALUES ('183', '2', '29', '市场策划');
INSERT INTO `t_station` VALUES ('184', '2', '29', '市场顾问');
INSERT INTO `t_station` VALUES ('185', '2', '29', '市场营销');
INSERT INTO `t_station` VALUES ('186', '2', '29', '市场推广');
INSERT INTO `t_station` VALUES ('187', '2', '29', 'SEO');
INSERT INTO `t_station` VALUES ('188', '2', '29', 'SEM');
INSERT INTO `t_station` VALUES ('189', '2', '29', '活动策划');
INSERT INTO `t_station` VALUES ('190', '2', '30', '媒介经理');
INSERT INTO `t_station` VALUES ('191', '2', '30', '广告协调');
INSERT INTO `t_station` VALUES ('192', '2', '30', '品牌公关');
INSERT INTO `t_station` VALUES ('193', '2', '31', '销售专员');
INSERT INTO `t_station` VALUES ('194', '2', '31', '销售经理');
INSERT INTO `t_station` VALUES ('195', '2', '31', '客户代表');
INSERT INTO `t_station` VALUES ('196', '2', '31', '销售助理');
INSERT INTO `t_station` VALUES ('197', '2', '31', '电话销售');
INSERT INTO `t_station` VALUES ('198', '2', '31', '销售顾问');
INSERT INTO `t_station` VALUES ('199', '2', '32', '市场总监');
INSERT INTO `t_station` VALUES ('200', '2', '32', '销售总监');
INSERT INTO `t_station` VALUES ('201', '2', '32', '商务总监');
INSERT INTO `t_station` VALUES ('202', '2', '32', 'CMO');
INSERT INTO `t_station` VALUES ('203', '2', '32', '公关总监');
INSERT INTO `t_station` VALUES ('204', '2', '32', '采购总监');
INSERT INTO `t_station` VALUES ('205', '2', '32', '投资总监');
INSERT INTO `t_station` VALUES ('206', '2', '33', '物流');
INSERT INTO `t_station` VALUES ('207', '2', '33', '仓储');
INSERT INTO `t_station` VALUES ('208', '2', '34', '采购专员');
INSERT INTO `t_station` VALUES ('209', '2', '34', '采购经理');
INSERT INTO `t_station` VALUES ('210', '2', '34', '商品经理');
INSERT INTO `t_station` VALUES ('211', '2', '35', '分析师');
INSERT INTO `t_station` VALUES ('212', '2', '35', '投资顾问');
INSERT INTO `t_station` VALUES ('213', '2', '35', '投资经理');
INSERT INTO `t_station` VALUES ('214', '2', '36', '人事HR');
INSERT INTO `t_station` VALUES ('215', '2', '36', '培训经理');
INSERT INTO `t_station` VALUES ('216', '2', '36', '薪资福利经理');
INSERT INTO `t_station` VALUES ('217', '2', '36', '绩效考核经理');
INSERT INTO `t_station` VALUES ('218', '2', '36', '人力资源');
INSERT INTO `t_station` VALUES ('219', '2', '36', '招聘');
INSERT INTO `t_station` VALUES ('220', '2', '36', '员工关系');
INSERT INTO `t_station` VALUES ('221', '2', '37', '助理');
INSERT INTO `t_station` VALUES ('222', '2', '37', '前台');
INSERT INTO `t_station` VALUES ('223', '2', '37', '行政');
INSERT INTO `t_station` VALUES ('224', '2', '37', '文秘');
INSERT INTO `t_station` VALUES ('225', '2', '38', '会计');
INSERT INTO `t_station` VALUES ('226', '2', '38', '出纳');
INSERT INTO `t_station` VALUES ('227', '2', '38', '财务');
INSERT INTO `t_station` VALUES ('228', '2', '38', '结算');
INSERT INTO `t_station` VALUES ('229', '2', '38', '税务');
INSERT INTO `t_station` VALUES ('230', '2', '38', '审计');
INSERT INTO `t_station` VALUES ('231', '2', '39', '行政总监');
INSERT INTO `t_station` VALUES ('232', '2', '39', '财务总监');
INSERT INTO `t_station` VALUES ('233', '2', '39', 'HRM');
INSERT INTO `t_station` VALUES ('234', '2', '39', 'CFO');
INSERT INTO `t_station` VALUES ('235', '2', '39', 'CEO');
INSERT INTO `t_station` VALUES ('236', '2', '40', '法务');
INSERT INTO `t_station` VALUES ('237', '2', '40', '律师');
INSERT INTO `t_station` VALUES ('238', '2', '40', '专利');
INSERT INTO `t_station` VALUES ('239', '2', '41', '投资经理');
INSERT INTO `t_station` VALUES ('240', '2', '41', '分析师');
INSERT INTO `t_station` VALUES ('241', '2', '41', '投资助理');
INSERT INTO `t_station` VALUES ('242', '2', '41', '融资');
INSERT INTO `t_station` VALUES ('243', '2', '41', '并购');
INSERT INTO `t_station` VALUES ('244', '2', '41', '行业研究');
INSERT INTO `t_station` VALUES ('245', '2', '41', '理财顾问');
INSERT INTO `t_station` VALUES ('246', '2', '42', '风控');
INSERT INTO `t_station` VALUES ('247', '2', '42', '稽查');
INSERT INTO `t_station` VALUES ('248', '2', '43', '审计');
INSERT INTO `t_station` VALUES ('249', '2', '43', '清算');
INSERT INTO `t_station` VALUES ('250', '2', '44', '投资总监');
INSERT INTO `t_station` VALUES ('251', '2', '44', '融资总监');
INSERT INTO `t_station` VALUES ('252', '2', '44', '并购总监');
INSERT INTO `t_station` VALUES ('253', '2', '44', '风控总监');
INSERT INTO `t_station` VALUES ('254', '2', '44', '副总裁');
INSERT INTO `t_station` VALUES ('255', '7', '7', '');
INSERT INTO `t_station` VALUES ('256', '7', '7', '');
INSERT INTO `t_station` VALUES ('257', '0', '0', 'TestStation7');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'chaos', 'chaos');
INSERT INTO `t_user` VALUES ('2', 'test', 'test');

/*
 Navicat Premium Data Transfer

 Source Server         : 本地数据库
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : wancheng_test_demo1

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 23/10/2022 18:09:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `permissionid` int(0) NOT NULL,
  `permissionname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `modifiedby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` int(0) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`permissionid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, '权限管理', NULL, '2022-10-19 21:05:04', NULL, 0);
INSERT INTO `permission` VALUES (2, '用户管理', NULL, '2022-10-19 21:05:04', NULL, 0);
INSERT INTO `permission` VALUES (3, '数据删除', NULL, '2022-10-19 21:05:04', NULL, 0);
INSERT INTO `permission` VALUES (4, '数据上传', NULL, '2022-10-19 21:05:04', NULL, 0);
INSERT INTO `permission` VALUES (5, '数据读写', NULL, '2022-10-19 21:05:04', NULL, 0);

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project`  (
  `pid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `pname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `powner` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `modifiedby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '修改人',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` int(0) NULL DEFAULT 0 COMMENT '逻辑删除',
  `ownerid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所有用户id',
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('1', '赫章至六枝', '杨老板', NULL, '2022-10-19 21:05:06', '2022-10-23 15:38:42', 0, '1583093602148417536');
INSERT INTO `project` VALUES ('1582729048780439552', '清镇至白云', '凌凌漆', NULL, '2022-10-19 21:43:06', NULL, 0, NULL);
INSERT INTO `project` VALUES ('1583053771317968896', '安顺到重庆', '乔总', NULL, '2022-10-20 19:13:27', NULL, 0, NULL);
INSERT INTO `project` VALUES ('1584087247165063168', '清镇至白云', '杨老板', NULL, '2022-10-23 15:40:05', '2022-10-23 15:40:36', 0, '1583093602148417536');
INSERT INTO `project` VALUES ('2', '赫章至六枝高速公路', '独孤求败', NULL, '2022-10-19 21:05:06', NULL, 0, NULL);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `roleid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `roleName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `modifiedby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` int(0) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`roleid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for rolepermission
-- ----------------------------
DROP TABLE IF EXISTS `rolepermission`;
CREATE TABLE `rolepermission`  (
  `roleid` varchar(0) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `rolename` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `permissionid` varchar(0) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `permissioname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `modifiedby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` int(0) NULL DEFAULT 0 COMMENT '逻辑删除'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rolepermission
-- ----------------------------

-- ----------------------------
-- Table structure for section
-- ----------------------------
DROP TABLE IF EXISTS `section`;
CREATE TABLE `section`  (
  `sid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `stesting` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `scons` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `spid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `modifiedby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` int(0) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of section
-- ----------------------------
INSERT INTO `section` VALUES ('1', '赫六标', '贵州交通有限', '中铁十八', '2', NULL, '2022-10-19 21:05:11', NULL, 0);
INSERT INTO `section` VALUES ('1582730308011163648', 'testSection', 'testtesting', 'testScon', '2', NULL, '2022-10-19 21:48:06', NULL, 0);
INSERT INTO `section` VALUES ('1582736588033490944', 'testSection-test', 'testtesting', 'testScon', '2', NULL, '2022-10-19 22:13:03', NULL, 0);
INSERT INTO `section` VALUES ('2', '赫六标3', '四川交检', '中铁二局', '1', NULL, '2022-10-19 21:05:11', NULL, 0);
INSERT INTO `section` VALUES ('3', '赫六标4', '贵州交通有限', '中铁十八', '2', NULL, '2022-10-19 21:05:11', NULL, 0);
INSERT INTO `section` VALUES ('4', '赫五标2', '贵州交通有限', '中铁十八', '1', NULL, '2022-10-19 21:05:11', NULL, 0);

-- ----------------------------
-- Table structure for segment
-- ----------------------------
DROP TABLE IF EXISTS `segment`;
CREATE TABLE `segment`  (
  `segid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `segrange` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `segdesign` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `segdate` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `segsid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `roadway` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '路幅',
  `pavement_tp` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '0' COMMENT '温度',
  `roadhandle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '桩号处理',
  `modifiedby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` int(0) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`segid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of segment
-- ----------------------------
INSERT INTO `segment` VALUES ('1', 'FK0+218-FK0+726', '237', '2021/01/27', '1', '左幅', '16', '逆桩号', NULL, '2022-10-19 21:05:12', '2022-10-20 16:14:58', 0);
INSERT INTO `segment` VALUES ('1582730509283229696', 'test-range-change', 'test-design-change-I', 'test-date-change', '2', '左幅', '18', '逆桩号', NULL, '2022-10-19 21:48:53', '2022-10-20 16:14:59', 0);
INSERT INTO `segment` VALUES ('1583008243783827456', 'snow-test-id-tt', 'test-design', 'test-date', '2', '左幅', '0', '逆桩号', NULL, '2022-10-20 16:12:30', '2022-10-20 16:14:59', 0);
INSERT INTO `segment` VALUES ('2', 'DK0+770-DK0+928', '237', '2021/01/27', '2', '右幅', '20', '顺桩号', NULL, '2022-10-19 21:05:12', '2022-10-20 16:16:16', 0);
INSERT INTO `segment` VALUES ('3', 'CK0+440-CK0+676', '237', '2021/01/27', '3', '右幅', '17', '顺桩号', NULL, '2022-10-19 21:05:12', '2022-10-20 16:16:26', 0);
INSERT INTO `segment` VALUES ('4', 'CK0+560-CK0+774', '237', '2021/01/26', '4', '右幅', '23', '顺桩号', NULL, '2022-10-19 21:05:12', '2022-10-20 16:16:31', 0);

-- ----------------------------
-- Table structure for site
-- ----------------------------
DROP TABLE IF EXISTS `site`;
CREATE TABLE `site`  (
  `siteid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sitecode` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sitelane` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `lmax` int(0) NOT NULL,
  `lmin` int(0) NOT NULL,
  `deflectio1` int(0) NOT NULL,
  `rmax` int(0) NOT NULL,
  `rmin` int(0) NOT NULL,
  `deflectio2` int(0) NOT NULL,
  `lfindex` float NOT NULL DEFAULT 0,
  `rfindex` float NOT NULL DEFAULT 0,
  `tindex` float NOT NULL DEFAULT 1,
  `siteremark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sitesid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `modifiedby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` int(0) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`siteid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of site
-- ----------------------------
INSERT INTO `site` VALUES ('1', 'K0000+560', 'm', 4712, 4712, 0, 3693, 3678, 30, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('10', 'K0000+360', 'm', 4214, 4200, 28, 4198, 4196, 4, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('11', 'K0000+340', 'm', 4221, 4200, 42, 4415, 4415, 0, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('12', 'K0000+320', 'm', 4260, 4246, 28, 4337, 4330, 14, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('13', 'K0000+300', 'm', 4218, 4206, 24, 4274, 4265, 18, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('14', 'K0000+280', 'm', 4089, 4087, 4, 4124, 4116, 16, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('15', 'K0000+260', 'm', 4232, 4221, 22, 4332, 4328, 8, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('1582730633724035072', 'snow-add-test-site', 'm', 4221, 4200, 42, 4415, 4415, 0, 0, 0, 1, 'add-test-siteremark', '1', NULL, '2022-10-19 21:49:23', NULL, 0);
INSERT INTO `site` VALUES ('16', 'K0000+240', 'm', 3987, 3985, 4, 4418, 4411, 14, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('17', 'K0000+790', 'm', 4132, 4123, 18, 4231, 4211, 40, 0, 0, 1, NULL, '3', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('18', 'K0000+810', 'm', 4233, 4225, 16, 4324, 4316, 16, 0, 0, 1, NULL, '3', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('19', 'K0000+830', 'm', 4040, 4038, 4, 4206, 4178, 56, 0, 0, 1, NULL, '3', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('2', 'K0000+540', 'm', 4708, 3482, 2452, 4159, 4157, 4, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('20', 'K0000+850', 'm', 4423, 4359, 128, 4414, 4414, 0, 0, 0, 1, NULL, '3', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('21', 'K0000+870', 'm', 4340, 4331, 18, 4200, 4194, 12, 0, 0, 1, NULL, '3', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('22', 'K0000+890', 'm', 4637, 4630, 14, 4318, 4293, 50, 0, 0, 1, NULL, '3', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('23', 'K0000+600', 'm', 4209, 4181, 56, 4404, 4371, 66, 0, 0, 1, NULL, '4', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('24', 'K0000+580', 'm', 4207, 4187, 40, 4415, 4404, 22, 0, 0, 1, NULL, '4', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('25', 'K0000+560', 'm', 4246, 4235, 22, 3647, 3643, 8, 0, 0, 1, NULL, '4', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('26', 'K0000+540', 'm', 4566, 4556, 20, 4415, 4414, 2, 0, 0, 1, NULL, '4', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('27', 'K0000+520', 'm', 4374, 4361, 26, 4403, 4397, 12, 0, 0, 1, NULL, '4', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('28', 'K0000+500', 'm', 4430, 4428, 4, 3968, 3945, 46, 0, 0, 1, NULL, '4', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('29', 'K0000+480', 'm', 4474, 4452, 44, 4414, 4403, 22, 0, 0, 1, NULL, '4', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('3', 'K0000+520', 'm', 4366, 3489, 1754, 4387, 4380, 14, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('30', 'K0000+560', 'm', 4106, 4064, 84, 4260, 4235, 50, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('31', 'K0000+580', 'm', 4322, 3486, 1672, 3463, 3218, 490, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('32', 'K0000+600', 'm', 4345, 3495, 1700, 3749, 3218, 1062, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('33', 'K0000+620', 'm', 4200, 4160, 80, 3831, 3822, 18, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('34', 'K0000+640', 'm', 4247, 4015, 464, 4170, 3219, 1902, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('35', 'K0000+680', 'm', 4356, 4351, 10, 4043, 4043, 0, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('36', 'K0000+720', 'm', 4200, 4179, 42, 3553, 3536, 34, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('37', 'K0000+796', 'm', 4162, 4106, 112, 3816, 3771, 90, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('38', 'K0000+400', 'm', 4231, 4221, 20, 3775, 3758, 34, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('39', 'K0000+360', 'm', 4204, 4184, 40, 3970, 3909, 122, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('4', 'K0000+500', 'm', 4535, 4533, 4, 4376, 4368, 16, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('40', 'K0000+340', 'm', 4300, 4243, 114, 3923, 3866, 114, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('41', 'K0000+300', 'm', 4162, 4061, 202, 3948, 3930, 36, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('42', 'K0000+200', 'm', 4146, 3485, 1322, 3570, 3561, 18, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('43', 'K0000+160', 'm', 4184, 4147, 74, 3709, 3693, 32, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('44', 'K0000+120', 'm', 4175, 4144, 62, 3691, 3672, 38, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('45', 'K0000+060', 'm', 4294, 4288, 12, 4004, 3986, 36, 0, 0, 1, NULL, '2', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('5', 'K0000+480', 'm', 4475, 3496, 1958, 4415, 3219, 2392, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('6', 'K0000+460', 'm', 4360, 4360, 0, 4303, 4303, 0, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('7', 'K0000+440', 'm', 4617, 4610, 14, 4116, 4112, 8, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('8', 'K0000+420', 'm', 4380, 4363, 34, 4415, 4414, 2, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);
INSERT INTO `site` VALUES ('9', 'K0000+400', 'm', 4088, 4084, 8, 4415, 4414, 2, 0, 0, 1, NULL, '1', NULL, '2022-10-19 21:05:14', NULL, 0);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `pwd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `mail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `modifiedby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` int(0) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1583093602148417536', 'young', 'young', '开发', NULL, NULL, NULL, '2022-10-20 21:51:41', NULL, 0);
INSERT INTO `user` VALUES ('1583413377034616832', 'admin', '123123', '前端开发', NULL, NULL, NULL, '2022-10-21 19:02:22', NULL, 0);
INSERT INTO `user` VALUES ('1584085090911125504', 'tester', '123123', '前端开发', NULL, NULL, NULL, '2022-10-23 15:31:31', NULL, 0);
INSERT INTO `user` VALUES ('6617666', '孙悟空', '0000', '花果山福地~水帘洞洞天', NULL, NULL, NULL, '2022-10-19 21:05:17', NULL, 0);

-- ----------------------------
-- Table structure for userrole
-- ----------------------------
DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole`  (
  `uid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `roleid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `rolename` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `modifiedby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` int(0) NULL DEFAULT 0 COMMENT '逻辑删除',
  INDEX `IXFK_userrole_role`(`roleid`) USING BTREE,
  INDEX `IXFK_userrole_user`(`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userrole
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;

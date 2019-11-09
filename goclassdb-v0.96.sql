/*
 Navicat Premium Data Transfer

 Source Server         : goclass
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : lede.dalaomai.cn:5006
 Source Schema         : goclass

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 08/11/2019 19:33:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_administrative_class
-- ----------------------------
DROP TABLE IF EXISTS `tb_administrative_class`;
CREATE TABLE `tb_administrative_class`  (
  `administrative_classroom_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `administrative_class_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '行政班名称',
  `grade` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '行政班所属年级',
  `master_id` int(11) NULL DEFAULT NULL COMMENT '班主任id',
  `classroom_id` bigint(11) NULL DEFAULT NULL COMMENT '所在教室id',
  `student_count` int(11) NULL DEFAULT NULL COMMENT '行政班学生人数',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`administrative_classroom_id`) USING BTREE,
  INDEX `教室id`(`classroom_id`) USING BTREE,
  CONSTRAINT `教室id` FOREIGN KEY (`classroom_id`) REFERENCES `tb_classroom` (`classroom_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '行政班信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_administrator
-- ----------------------------
DROP TABLE IF EXISTS `tb_administrator`;
CREATE TABLE `tb_administrator`  (
  `administrator_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `administrator_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员姓名',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`administrator_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '管理员信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_classroom
-- ----------------------------
DROP TABLE IF EXISTS `tb_classroom`;
CREATE TABLE `tb_classroom`  (
  `classroom_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `classroom_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教室名称',
  `building_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教室所在楼宇名称',
  `max_size` int(11) NULL DEFAULT NULL COMMENT '教室容量',
  `is_empty` int(11) NULL DEFAULT 1 COMMENT '教室是否留空，0:留空，1：不留空 默认不留空',
  `classroom_type` int(11) NULL DEFAULT 1 COMMENT '教室类型 1：普通教室 2：实验室 3：音乐教室 4：电脑教室 默认为普通教室',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`classroom_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教室信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_classroom
-- ----------------------------
INSERT INTO `tb_classroom` VALUES (1, '教室0', '汇通楼', NULL, 1, 1, '2019-11-05 11:25:03', '2019-11-05 11:25:11');
INSERT INTO `tb_classroom` VALUES (2, '教室1', '汇通楼', NULL, 1, 1, '2019-11-05 11:24:29', '2019-11-05 11:24:44');
INSERT INTO `tb_classroom` VALUES (3, '教室2', '汇通楼', NULL, 1, 1, '2019-11-05 11:22:33', '2019-11-05 11:24:03');
INSERT INTO `tb_classroom` VALUES (4, '教室3', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (5, '教室4', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (6, '教室5', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (7, '教室6', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (8, '教室7', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (9, '教室8', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (10, '教室9', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (11, '教室10', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (12, '教室11', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (13, '教室12', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (14, '教室13', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (15, '教室14', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (16, '教室15', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');
INSERT INTO `tb_classroom` VALUES (17, '教室16', '汇通楼', NULL, 1, 1, '2019-10-28 14:43:12', '2019-10-28 14:43:12');

-- ----------------------------
-- Table structure for tb_fiveresult_datavalue
-- ----------------------------
DROP TABLE IF EXISTS `tb_fiveresult_datavalue`;
CREATE TABLE `tb_fiveresult_datavalue`  (
  `fiveresult_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fiveresult_datavalue` mediumblob NULL COMMENT '第五阶段二进制数据',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`fiveresult_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '第五阶段数据存储表\r\n' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_fiveresult_datavalue
-- ----------------------------
INSERT INTO `tb_fiveresult_datavalue` VALUES (1, 0xACED000573720018636F6D2E676F636C6173732E706F6A6F2E53747564656E74DA6B10DC8ACE02DE0200064C0009676D744372656174657400104C6A6176612F7574696C2F446174653B4C000B676D744D6F64696669656471007E00014C0007677261646549647400134C6A6176612F6C616E672F496E74656765723B4C000E73747564656E74436C617373496471007E00024C000973747564656E7449647400104C6A6176612F6C616E672F4C6F6E673B4C000B73747564656E744E616D657400124C6A6176612F6C616E672F537472696E673B7870707070707372000E6A6176612E6C616E672E4C6F6E673B8BE490CC8F23DF0200014A000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B0200007870000000000000000174000761736461617364, NULL, NULL);

-- ----------------------------
-- Table structure for tb_grade
-- ----------------------------
DROP TABLE IF EXISTS `tb_grade`;
CREATE TABLE `tb_grade`  (
  `grade_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `grade_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '年级名称',
  `teacher_count` int(11) NULL DEFAULT NULL COMMENT '老师数量',
  `student_count` int(11) NULL DEFAULT NULL COMMENT '学生数量',
  `master_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '级长姓名',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`grade_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '年级信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_grade
-- ----------------------------
INSERT INTO `tb_grade` VALUES (1, '2020级', NULL, NULL, NULL, '2019-10-28 10:16:40', '2019-10-28 15:29:24');

-- ----------------------------
-- Table structure for tb_grade_subject
-- ----------------------------
DROP TABLE IF EXISTS `tb_grade_subject`;
CREATE TABLE `tb_grade_subject`  (
  `relationship_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `grade_id` bigint(11) NOT NULL COMMENT '学科的年级id',
  `grade_teacher_count` int(11) NULL DEFAULT NULL COMMENT '本年级的学科教师人数',
  `course_id` bigint(11) NULL DEFAULT NULL,
  `course_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade_student_count` int(11) NULL DEFAULT NULL COMMENT '本年级的学该学科的学生人数',
  `period_per_week` int(11) NULL DEFAULT 0 COMMENT '每周课时',
  `subject_master_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科科长姓名',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`relationship_id`) USING BTREE,
  INDEX `年级id`(`grade_id`) USING BTREE,
  INDEX `学科id`(`course_id`) USING BTREE,
  CONSTRAINT `学科id` FOREIGN KEY (`course_id`) REFERENCES `tb_subject` (`subject_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `年级id` FOREIGN KEY (`grade_id`) REFERENCES `tb_grade` (`grade_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学科年级关系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_grade_subject
-- ----------------------------
INSERT INTO `tb_grade_subject` VALUES (1, 1, 8, 1, '语文', 706, 6, NULL, '2019-10-28 15:26:42', '2019-10-28 15:39:59');
INSERT INTO `tb_grade_subject` VALUES (2, 1, 8, 2, '数学', 706, 6, NULL, '2019-10-28 15:26:42', '2019-10-28 15:40:25');
INSERT INTO `tb_grade_subject` VALUES (3, 1, 8, 3, '英语', 706, 6, NULL, '2019-10-28 15:26:42', '2019-10-28 15:40:26');
INSERT INTO `tb_grade_subject` VALUES (4, 1, 4, 4, '物理', 500, 4, NULL, '2019-10-28 15:26:42', '2019-10-28 15:40:30');
INSERT INTO `tb_grade_subject` VALUES (5, 1, 2, 5, '历史', 206, 4, NULL, '2019-10-28 15:26:42', '2019-10-28 15:40:40');
INSERT INTO `tb_grade_subject` VALUES (6, 1, 2, 6, '政治', 279, 4, NULL, '2019-10-28 15:26:42', '2019-10-28 15:40:56');
INSERT INTO `tb_grade_subject` VALUES (7, 1, 3, 7, '地理', 364, 4, NULL, '2019-10-28 15:26:42', '2019-10-28 15:40:59');
INSERT INTO `tb_grade_subject` VALUES (8, 1, 3, 8, '生物', 449, 4, NULL, '2019-10-28 15:26:42', '2019-10-28 15:41:07');
INSERT INTO `tb_grade_subject` VALUES (9, 1, 3, 9, '化学', 320, 4, NULL, '2019-10-28 15:26:42', '2019-10-28 15:41:14');
INSERT INTO `tb_grade_subject` VALUES (10, 1, 16, 10, '班会', 706, 1, NULL, '2019-10-28 15:26:42', '2019-10-28 15:41:28');
INSERT INTO `tb_grade_subject` VALUES (11, 1, 2, 11, '信息技术', 706, 1, NULL, '2019-10-28 15:26:42', '2019-10-28 15:41:33');
INSERT INTO `tb_grade_subject` VALUES (12, 1, 2, 12, '音乐', 706, 1, NULL, '2019-10-28 15:26:42', '2019-10-28 15:41:33');
INSERT INTO `tb_grade_subject` VALUES (13, 1, 3, 13, '体育', 706, 2, NULL, '2019-10-28 15:26:42', '2019-10-28 15:41:33');

-- ----------------------------
-- Table structure for tb_menu_permission
-- ----------------------------
DROP TABLE IF EXISTS `tb_menu_permission`;
CREATE TABLE `tb_menu_permission`  (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单名称',
  `menu_path` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单地址',
  `menu_state` int(11) NULL DEFAULT 1 COMMENT '菜单状态 1：正常 0：异常',
  `menu_type` int(11) NOT NULL COMMENT '菜单功能类型',
  `parent_id` int(11) NOT NULL COMMENT '父菜单编号 等于自己为根菜单',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '菜单权限信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role`  (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_role
-- ----------------------------
INSERT INTO `tb_role` VALUES (1, 'user', '2019-11-03 12:49:04', '2019-11-03 12:49:04');
INSERT INTO `tb_role` VALUES (2, 'admin', '2019-11-03 12:48:57', '2019-11-03 12:48:57');
INSERT INTO `tb_role` VALUES (3, 'db_admin', '2019-11-03 12:48:42', '2019-11-03 12:48:42');

-- ----------------------------
-- Table structure for tb_school
-- ----------------------------
DROP TABLE IF EXISTS `tb_school`;
CREATE TABLE `tb_school`  (
  `school_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `school_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学校名称',
  `teacher_count` int(11) NULL DEFAULT NULL COMMENT '老师数量',
  `student_count` int(11) NULL DEFAULT NULL COMMENT '学生数量',
  `principal_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '校长姓名',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`school_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学校信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_selection_detailed
-- ----------------------------
DROP TABLE IF EXISTS `tb_selection_detailed`;
CREATE TABLE `tb_selection_detailed`  (
  `selection_detailed_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `student_id` bigint(11) NOT NULL COMMENT '学生编号',
  `course_combination_id` int(11) NULL DEFAULT NULL COMMENT '课程组合',
  `course_combination_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程组合简称。13：物化生，21：物化地，37：物化政，25：物生地，41：物生政，49：物地政，14：历化生，22：历化地，38：历化政，26：历生地，42：历生政，50：历地政',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`selection_detailed_id`) USING BTREE,
  INDEX `学生id`(`student_id`) USING BTREE,
  CONSTRAINT `学生id` FOREIGN KEY (`student_id`) REFERENCES `tb_student` (`student_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 707 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生选课详细表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_selection_detailed
-- ----------------------------
INSERT INTO `tb_selection_detailed` VALUES (1, 1, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (2, 2, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (3, 3, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (4, 4, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (5, 5, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (6, 6, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (7, 7, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (8, 8, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (9, 9, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (10, 10, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (11, 11, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (12, 12, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (13, 13, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (14, 14, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (15, 15, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (16, 16, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (17, 17, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (18, 18, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (19, 19, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (20, 20, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (21, 21, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (22, 22, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (23, 23, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (24, 24, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (25, 25, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (26, 26, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (27, 27, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (28, 28, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (29, 29, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (30, 30, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (31, 31, 49, '史化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (32, 32, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (33, 33, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (34, 34, 49, '史化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (35, 35, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (36, 36, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (37, 37, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (38, 38, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (39, 39, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (40, 40, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (41, 41, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (42, 42, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (43, 43, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (44, 44, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (45, 45, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (46, 46, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (47, 47, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (48, 48, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (49, 49, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (50, 50, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (51, 51, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (52, 52, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (53, 53, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (54, 54, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (55, 55, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (56, 56, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (57, 57, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (58, 58, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (59, 59, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (60, 60, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (61, 61, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (62, 62, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (63, 63, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (64, 64, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (65, 65, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (66, 66, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (67, 67, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (68, 68, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (69, 69, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (70, 70, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (71, 71, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (72, 72, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (73, 73, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (74, 74, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (75, 75, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (76, 76, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (77, 77, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (78, 78, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (79, 79, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (80, 80, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (81, 81, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (82, 82, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (83, 83, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (84, 84, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (85, 85, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (86, 86, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (87, 87, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (88, 88, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (89, 89, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (90, 90, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (91, 91, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (92, 92, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (93, 93, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (94, 94, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (95, 95, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (96, 96, 49, '史化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (97, 97, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (98, 98, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (99, 99, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (100, 100, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (101, 101, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (102, 102, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (103, 103, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (104, 104, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (105, 105, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (106, 106, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (107, 107, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (108, 108, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (109, 109, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (110, 110, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (111, 111, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (112, 112, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (113, 113, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (114, 114, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (115, 115, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (116, 116, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (117, 117, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (118, 118, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (119, 119, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (120, 120, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (121, 121, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (122, 122, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (123, 123, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (124, 124, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (125, 125, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (126, 126, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (127, 127, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (128, 128, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (129, 129, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (130, 130, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (131, 131, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (132, 132, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (133, 133, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (134, 134, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (135, 135, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (136, 136, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (137, 137, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (138, 138, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (139, 139, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (140, 140, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (141, 141, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (142, 142, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (143, 143, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (144, 144, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (145, 145, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (146, 146, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (147, 147, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (148, 148, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (149, 149, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (150, 150, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (151, 151, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (152, 152, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (153, 153, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (154, 154, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (155, 155, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (156, 156, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (157, 157, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (158, 158, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (159, 159, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (160, 160, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (161, 161, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (162, 162, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (163, 163, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (164, 164, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (165, 165, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (166, 166, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (167, 167, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (168, 168, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (169, 169, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (170, 170, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (171, 171, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (172, 172, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (173, 173, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (174, 174, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (175, 175, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (176, 176, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (177, 177, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (178, 178, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (179, 179, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (180, 180, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (181, 181, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (182, 182, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (183, 183, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (184, 184, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (185, 185, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (186, 186, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (187, 187, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (188, 188, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (189, 189, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (190, 190, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (191, 191, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (192, 192, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (193, 193, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (194, 194, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (195, 195, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (196, 196, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (197, 197, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (198, 198, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (199, 199, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (200, 200, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (201, 201, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (202, 202, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (203, 203, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (204, 204, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (205, 205, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (206, 206, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (207, 207, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (208, 208, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (209, 209, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (210, 210, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (211, 211, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (212, 212, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (213, 213, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (214, 214, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (215, 215, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (216, 216, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (217, 217, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (218, 218, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (219, 219, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (220, 220, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (221, 221, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (222, 222, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (223, 223, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (224, 224, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (225, 225, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (226, 226, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (227, 227, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (228, 228, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (229, 229, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (230, 230, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (231, 231, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (232, 232, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (233, 233, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (234, 234, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (235, 235, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (236, 236, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (237, 237, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (238, 238, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (239, 239, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (240, 240, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (241, 241, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (242, 242, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (243, 243, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (244, 244, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (245, 245, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (246, 246, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (247, 247, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (248, 248, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (249, 249, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (250, 250, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (251, 251, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (252, 252, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (253, 253, 49, '史化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (254, 254, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (255, 255, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (256, 256, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (257, 257, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (258, 258, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (259, 259, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (260, 260, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (261, 261, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (262, 262, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (263, 263, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (264, 264, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (265, 265, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (266, 266, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (267, 267, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (268, 268, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (269, 269, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (270, 270, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (271, 271, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (272, 272, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (273, 273, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (274, 274, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (275, 275, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (276, 276, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (277, 277, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (278, 278, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (279, 279, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (280, 280, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (281, 281, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (282, 282, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (283, 283, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (284, 284, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (285, 285, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (286, 286, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (287, 287, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (288, 288, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (289, 289, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (290, 290, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (291, 291, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (292, 292, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (293, 293, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (294, 294, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (295, 295, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (296, 296, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (297, 297, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (298, 298, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (299, 299, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (300, 300, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (301, 301, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (302, 302, 49, '史化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (303, 303, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (304, 304, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (305, 305, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (306, 306, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (307, 307, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (308, 308, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (309, 309, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (310, 310, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (311, 311, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (312, 312, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (313, 313, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (314, 314, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (315, 315, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (316, 316, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (317, 317, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (318, 318, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (319, 319, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (320, 320, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (321, 321, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (322, 322, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (323, 323, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (324, 324, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (325, 325, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (326, 326, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (327, 327, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (328, 328, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (329, 329, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (330, 330, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (331, 331, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (332, 332, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (333, 333, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (334, 334, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (335, 335, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (336, 336, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (337, 337, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (338, 338, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (339, 339, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (340, 340, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (341, 341, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (342, 342, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (343, 343, 49, '史化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (344, 344, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (345, 345, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (346, 346, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (347, 347, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (348, 348, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (349, 349, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (350, 350, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (351, 351, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (352, 352, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (353, 353, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (354, 354, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (355, 355, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (356, 356, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (357, 357, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (358, 358, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (359, 359, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (360, 360, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (361, 361, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (362, 362, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (363, 363, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (364, 364, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (365, 365, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (366, 366, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (367, 367, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (368, 368, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (369, 369, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (370, 370, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (371, 371, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (372, 372, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (373, 373, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (374, 374, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (375, 375, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (376, 376, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (377, 377, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (378, 378, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (379, 379, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (380, 380, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (381, 381, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (382, 382, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (383, 383, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (384, 384, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (385, 385, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (386, 386, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (387, 387, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (388, 388, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (389, 389, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (390, 390, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (391, 391, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (392, 392, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (393, 393, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (394, 394, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (395, 395, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (396, 396, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (397, 397, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (398, 398, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (399, 399, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (400, 400, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (401, 401, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (402, 402, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (403, 403, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (404, 404, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (405, 405, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (406, 406, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (407, 407, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (408, 408, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (409, 409, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (410, 410, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (411, 411, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (412, 412, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (413, 413, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (414, 414, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (415, 415, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (416, 416, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (417, 417, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (418, 418, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (419, 419, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (420, 420, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (421, 421, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (422, 422, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (423, 423, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (424, 424, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (425, 425, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (426, 426, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (427, 427, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (428, 428, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (429, 429, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (430, 430, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (431, 431, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (432, 432, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (433, 433, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (434, 434, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (435, 435, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (436, 436, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (437, 437, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (438, 438, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (439, 439, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (440, 440, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (441, 441, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (442, 442, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (443, 443, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (444, 444, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (445, 445, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (446, 446, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (447, 447, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (448, 448, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (449, 449, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (450, 450, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (451, 451, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (452, 452, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (453, 453, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (454, 454, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (455, 455, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (456, 456, 49, '史化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (457, 457, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (458, 458, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (459, 459, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (460, 460, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (461, 461, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (462, 462, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (463, 463, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (464, 464, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (465, 465, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (466, 466, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (467, 467, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (468, 468, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (469, 469, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (470, 470, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (471, 471, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (472, 472, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (473, 473, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (474, 474, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (475, 475, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (476, 476, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (477, 477, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (478, 478, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (479, 479, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (480, 480, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (481, 481, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (482, 482, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (483, 483, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (484, 484, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (485, 485, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (486, 486, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (487, 487, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (488, 488, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (489, 489, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (490, 490, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (491, 491, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (492, 492, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (493, 493, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (494, 494, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (495, 495, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (496, 496, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (497, 497, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (498, 498, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (499, 499, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (500, 500, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (501, 501, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (502, 502, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (503, 503, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (504, 504, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (505, 505, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (506, 506, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (507, 507, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (508, 508, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (509, 509, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (510, 510, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (511, 511, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (512, 512, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (513, 513, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (514, 514, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (515, 515, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (516, 516, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (517, 517, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (518, 518, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (519, 519, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (520, 520, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (521, 521, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (522, 522, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (523, 523, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (524, 524, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (525, 525, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (526, 526, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (527, 527, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (528, 528, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (529, 529, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (530, 530, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (531, 531, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (532, 532, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (533, 533, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (534, 534, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (535, 535, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (536, 536, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (537, 537, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (538, 538, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (539, 539, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (540, 540, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (541, 541, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (542, 542, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (543, 543, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (544, 544, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (545, 545, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (546, 546, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (547, 547, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (548, 548, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (549, 549, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (550, 550, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (551, 551, 49, '史化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (552, 552, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (553, 553, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (554, 554, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (555, 555, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (556, 556, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (557, 557, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (558, 558, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (559, 559, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (560, 560, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (561, 561, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (562, 562, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (563, 563, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (564, 564, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (565, 565, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (566, 566, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (567, 567, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (568, 568, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (569, 569, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (570, 570, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (571, 571, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (572, 572, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (573, 573, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (574, 574, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (575, 575, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (576, 576, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (577, 577, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (578, 578, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (579, 579, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (580, 580, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (581, 581, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (582, 582, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (583, 583, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (584, 584, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (585, 585, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (586, 586, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (587, 587, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (588, 588, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (589, 589, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (590, 590, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (591, 591, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (592, 592, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (593, 593, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (594, 594, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (595, 595, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (596, 596, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (597, 597, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (598, 598, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (599, 599, 49, '史化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (600, 600, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (601, 601, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (602, 602, 37, '史化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (603, 603, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (604, 604, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (605, 605, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (606, 606, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (607, 607, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (608, 608, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (609, 609, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (610, 610, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (611, 611, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (612, 612, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (613, 613, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (614, 614, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (615, 615, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (616, 616, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (617, 617, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (618, 618, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (619, 619, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (620, 620, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (621, 621, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (622, 622, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (623, 623, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (624, 624, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (625, 625, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (626, 626, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (627, 627, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (628, 628, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (629, 629, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (630, 630, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (631, 631, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (632, 632, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (633, 633, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (634, 634, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (635, 635, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (636, 636, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (637, 637, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (638, 638, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (639, 639, 14, '物地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (640, 640, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (641, 641, 49, '史化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (642, 642, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (643, 643, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (644, 644, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (645, 645, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (646, 646, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (647, 647, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (648, 648, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (649, 649, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (650, 650, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (651, 651, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (652, 652, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (653, 653, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (654, 654, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (655, 655, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (656, 656, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (657, 657, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (658, 658, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (659, 659, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (660, 660, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (661, 661, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (662, 662, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (663, 663, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (664, 664, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (665, 665, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (666, 666, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (667, 667, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (668, 668, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (669, 669, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (670, 670, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (671, 671, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (672, 672, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (673, 673, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (674, 674, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (675, 675, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (676, 676, 26, '物生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (677, 677, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (678, 678, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (679, 679, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (680, 680, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (681, 681, 42, '物化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (682, 682, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (683, 683, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (684, 684, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (685, 685, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (686, 686, 50, '物化生', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (687, 687, 38, '物化地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (688, 688, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (689, 689, 22, '物生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (690, 690, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (691, 691, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (692, 692, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (693, 693, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (694, 694, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (695, 695, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (696, 696, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (697, 697, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (698, 698, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (699, 699, 21, '史生地', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (700, 700, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (701, 701, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (702, 702, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (703, 703, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (704, 704, 25, '史生政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (705, 705, 41, '史化政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');
INSERT INTO `tb_selection_detailed` VALUES (706, 706, 13, '史地政', '2019-10-22 22:04:11', '2019-10-22 22:04:11');

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student`  (
  `student_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生姓名',
  `grade_id` bigint(11) NULL DEFAULT NULL COMMENT '学生年级id',
  `student_class_id` int(11) NULL DEFAULT NULL COMMENT '所在班级编号',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`student_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 707 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES (1, '钟彬', 1, 14, '2019-10-22 22:03:41', '2019-11-04 15:13:24');
INSERT INTO `tb_student` VALUES (2, '杨紫莹', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:17');
INSERT INTO `tb_student` VALUES (3, '查继航', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:20');
INSERT INTO `tb_student` VALUES (4, '孙俊威', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (5, '黄汉民', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (6, '张增睿', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (7, '黄曼笛', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (8, '麦迪那·斯迪克', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (9, '陈婧滢', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (10, '刘潜能', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (11, '祝晨曦', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (12, '刘易康', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (13, '陈建铧', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (14, '袁卢铁珂', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (15, '林江南', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:30');
INSERT INTO `tb_student` VALUES (16, '马锐涛', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (17, '刘佳慧', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (18, '林灵洲', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (19, '陈睿妍', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (20, '马华勇', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (21, '彭锰园', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (22, '宁馨萍', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (23, '李景山', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (24, '钟嘉鑫', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (25, '苏欣欣', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (26, '林宏伟', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (27, '林展廷', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (28, '樊庆山', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (29, '蔡安琪', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (30, '曾裔杨', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (31, '罗晶', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (32, '周心玥', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (33, '张斯婷', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (34, '李怡璐', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (35, '邱怡欣', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (36, '巴合提努尔·窝肯', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (37, '阿克交力·哈杰提', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (38, '汪卓儒', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (39, '陈昕琦', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (40, '卢凡怡', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (41, '郭婷婷', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (42, '陈志豪', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (43, '文婷', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (44, '陈杰', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (45, '梁豪', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (46, '吴桂芳', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (47, '乔正昊', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (48, '张孟扬', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (49, '许鹏彬', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (50, '吴佳蓉', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (51, '刘少聪', 1, 14, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (52, '李书琪', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (53, '谢舒颖', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (54, '伊米尔阿迪力·阿卜杜海比尔', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (55, '金智丽', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:31');
INSERT INTO `tb_student` VALUES (56, '郑祺轩', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (57, '苏钰萍', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (58, '苏展', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (59, '黄伊洋', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (60, '方洋', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (61, '狩生哲', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (62, '林宇晨', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (63, '柯黎燕', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (64, '龚宇', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (65, '陈豪杰', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (66, '蔡昱堃', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (67, '黄雅玲', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (68, '杨秀文', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (69, '石博豪', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (70, '游棋奕', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (71, '崔文辉', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (72, '刘芸兰', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (73, '胡逸轩', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (74, '帅杰', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (75, '汤正锋', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (76, '熊思嘉', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (77, '张开宏', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (78, '廖若宇', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (79, '崔俊亮', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (80, '林泽华', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (81, '尧书鹏', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (82, '高淳', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (83, '肖涛', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (84, '魏俊华', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (85, '许雪婷', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (86, '林妍', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (87, '黄雅慧', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (88, '林颜钰', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (89, '叶佳成', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (90, '吴书奕', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (91, '陈炜', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (92, '卜海丽齐·亚森', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (93, '李巧儿', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (94, '何金蓉', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (95, '张静瑜', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (96, '白晓磊', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (97, '邓秋琳', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (98, '江珍珍', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (99, '练桂萍', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (100, '肖乔宝', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (101, '廖斯锴', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (102, '潘莹', 1, 13, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (103, '李洪连', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (104, '陈财阳', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:32');
INSERT INTO `tb_student` VALUES (105, '黄子乐', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (106, '黄思伟', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (107, '高文琦', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (108, '林子晨', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (109, '黄培羿', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (110, '郑艳', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (111, '秦雪海', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (112, '叶奕菲', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (113, '洪姝瑀', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (114, '陈榛洁', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (115, '吴梓萌', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (116, '黄欣', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (117, '郑佳宏', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (118, '周继轩', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (119, '张兴睿', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (120, '黄建圣', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (121, '蒋菲', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (122, '石宇洋', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (123, '哈斯提尔·海拉提', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (124, '柴磊', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (125, '李鹏熙', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (126, '苏忠维', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (127, '何杰铭', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (128, '孙恺文', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (129, '胡孜日·伊则木', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (130, '林威敏', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (131, '姚乐之', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (132, '洪熙妍', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (133, '叶俊凯', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (134, '苏鑫怡', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (135, '杨果', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (136, '李牧伦', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (137, '黄俊杰', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (138, '赖淑芝', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (139, '高艺彬', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (140, '李蕙', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (141, '洪茹琦', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (142, '林莉', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (143, '林凯', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:33');
INSERT INTO `tb_student` VALUES (144, '马圳冉', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (145, '陈伊洋', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (146, '吴羿翔', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (147, '徐元熹', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (148, '林雅静', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (149, '曾家怡', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (150, '张宇', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (151, '古丽米热·艾买尔', 1, 12, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (152, '程倩楠', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (153, '符建园', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (154, '江舒琪', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (155, '张延鹭', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (156, '陈烨', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (157, '郑云龙', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (158, '於杭', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (159, '林郅恒', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (160, '吴欣怡', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (161, '陈怡馨', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (162, '陈怡晴', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (163, '陈晓劲旺', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (164, '俞叶璐', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (165, '柯贤聪', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (166, '许怡萱', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (167, '董灿', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (168, '王世文', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (169, '李一凡', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (170, '高启桂', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (171, '郑一钒', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:34');
INSERT INTO `tb_student` VALUES (172, '陈天', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (173, '徐力维', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (174, '胡若凡', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (175, '陈梦旖', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (176, '牟泽原', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (177, '石玉婷', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (178, '屈楠楠', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (179, '迪里达娜·买尔旦', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (180, '陈洋', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (181, '蔡东浩', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (182, '王怡馨', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (183, '谢依玲', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (184, '余梦琳', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (185, '何舒婷', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (186, '叶嘉怡', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (187, '王雅文', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (188, '吴铭煌', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (189, '蔡佳', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (190, '吴采薇', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (191, '柔鲜古丽·奥斯曼', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (192, '陈希杰', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (193, '黄艺俊', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (194, '廖璐颖', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (195, '黄铖智', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (196, '林振中', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (197, '林锴', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (198, '苏小梅', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:35');
INSERT INTO `tb_student` VALUES (199, '何绍炜', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (200, '王晨宇', 1, 11, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (201, '连麒凯', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (202, '詹泽岚', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (203, '余子安', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (204, '章九菲', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (205, '简国豪', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (206, '余依玫', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (207, '朱泺涵', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (208, '马超苹', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (209, '林可静', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (210, '王嘉慧', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (211, '王曦', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (212, '辜嘉益', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (213, '庄铭涛', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (214, '尹璇', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (215, '袁启清', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (216, '徐赫翎', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (217, '林伟祥', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (218, '蔡馨', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (219, '杨扬', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (220, '蔡智伟', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (221, '盛祥喆', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (222, '颜吉羚', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (223, '黄锦明', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (224, '阿依古丽·阿布都热依木', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (225, '朱思勉', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (226, '杨璐', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (227, '李毅', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (228, '黄胤哲', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (229, '黄哲曦', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (230, '杨菲', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (231, '郑方圆', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (232, '王月', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (233, '章晓鹏', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (234, '唐意舒', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (235, '梁景皓', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (236, '肖芝良', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (237, '郑勇燕', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (238, '高冉', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (239, '陈楷晟', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (240, '张程', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (241, '黄骢', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (242, '叶喜燕', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:36');
INSERT INTO `tb_student` VALUES (243, '邱以婷', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (244, '陈璐', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (245, '田茜', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (246, '王妍', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (247, '吴祺', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (248, '谢森宇', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (249, '童钰眉', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (250, '薛祺', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (251, '范嘉星', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (252, '张笑晗', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (253, '巴哈尔古丽', 1, 10, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (254, '柯杰', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (255, '赵馨妍', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (256, '黄祺翔', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (257, '林婧', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (258, '何琪', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (259, '陈曦', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (260, '林晓研', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (261, '陈鹭琪', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (262, '张珑玲', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (263, '温思捷', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (264, '刘文君', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (265, '杨世豪', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (266, '何立杰', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (267, '曾彬彬', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (268, '吴嘉琪', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (269, '邹惠婷', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (270, '林铉豪', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (271, '肖晟宇', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (272, '赖钰芳', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (273, '陈玉兰', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (274, '孙湛', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (275, '林翀', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (276, '阿合娜尔·艾吐尔汗', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (277, '王旭彤', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (278, '谢可昕', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (279, '郑杰', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (280, '王可昂', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (281, '彭子轩', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (282, '许锦斌', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (283, '王珏', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (284, '周怡婕', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (285, '陈磊', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (286, '黄宇轩', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (287, '温凯军', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (288, '陈宇', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (289, '买孜艳·阿布米吉提', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (290, '戴若琳', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (291, '张健杰', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (292, '艾佳瑶', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (293, '黄苇婷', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:37');
INSERT INTO `tb_student` VALUES (294, '彭贞云', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (295, '傅嘉杰', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (296, '王鹭婷', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (297, '吴福杭', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (298, '邱洋', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (299, '江俊杰', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (300, '陈允祺', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (301, '陈祺', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (302, '马桂婷', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (303, '卢昱', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (304, '邵一诺', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (305, '朱芸萱', 1, 9, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (306, '丘俊帆', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (307, '李明轩', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (308, '谢艺新', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (309, '吴芳靖', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (310, '吴利娟', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (311, '何文鑫', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (312, '刘志杰', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (313, '何杰森', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (314, '朱仕辉', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (315, '陈浩亮', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (316, '张盈洁', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (317, '蔡直洋', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (318, '陈奕兵', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (319, '冶鹏娟', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (320, '吴娟', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (321, '周钦滨', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (322, '吾米提·艾力', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (323, '郑燕婷', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (324, '刘晓锋', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (325, '沈建平', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (326, '赖锴元', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (327, '赵冬冬', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (328, '陈瑗', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (329, '施昕妍', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (330, '王鑫', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (331, '姚蝶', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (332, '江婷', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (333, '黄杨城', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (334, '郭振钞', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (335, '叶晴', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:38');
INSERT INTO `tb_student` VALUES (336, '陈蔚然', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (337, '甘依婷', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (338, '高清', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (339, '陈茜鹭', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (340, '王心怡', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (341, '柯雅婧', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (342, '付思奇', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (343, '王梦凡', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (344, '陈馨梅', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (345, '陈知禛', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (346, '杨锋', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (347, '冯萱', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (348, '练福胜', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (349, '郑昕怡', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (350, '陈慧欣', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (351, '许翔宇', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (352, '黄李', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (353, '李承浩', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (354, '陈之辉', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (355, '苏曼亚·热合曼', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (356, '彭佳怡', 1, 8, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (357, '陈嘉凯', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (358, '邹诗琦', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (359, '刘月月', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (360, '王铭建', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (361, '蔡明楷', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (362, '陈源袁', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (363, '温鹏湶', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (364, '肖雨昕', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (365, '夏笛娅·阿不都克力木', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (366, '林炜国', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (367, '陈越', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (368, '王文豪', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (369, '范凯乐', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (370, '蔡晓萌', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (371, '高炳欣', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (372, '金晨', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:39');
INSERT INTO `tb_student` VALUES (373, '沈靖焓', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (374, '彭铭槽', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (375, '黄涵予', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (376, '武佳蓥', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (377, '张学凯', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (378, '李炜翔', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (379, '邓锴雯', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (380, '吴晨旭', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (381, '周夏厦', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (382, '林佳乐', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (383, '李兴奕', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (384, '山子修', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (385, '叶健聪', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (386, '连佳怡', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (387, '王雨菡', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (388, '薛熙豪', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (389, '郑鑫', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (390, '蓝心仪', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (391, '魏国强', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (392, '陈广豪', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (393, '章志燕', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (394, '杨春燕', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (395, '周强', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (396, '范晨璐', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (397, '邹毅天', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (398, '牛天祺', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (399, '梁雅琦', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (400, '江泽源', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (401, '王梓岩', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (402, '林俊恺', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (403, '许异凡', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (404, '陈昕芊', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (405, '张家瑜', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (406, '杨洁', 1, 7, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (407, '沈予婧', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (408, '锜琪', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (409, '黄晓芹', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (410, '娴婧', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (411, '范大魁', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (412, '倪旭豪', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (413, '许松丽', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (414, '林德鑫', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (415, '胡舒豪', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:40');
INSERT INTO `tb_student` VALUES (416, '王为昊', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (417, '熊洁', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (418, '唐腾翔', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (419, '黄伯乐', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (420, '李慧珂', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (421, '罗杰', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (422, '莫笙', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (423, '肖颖婷', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (424, '李胜男', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (425, '阿力木江·麦迪尼亚提', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (426, '陈怡冰', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (427, '刘晨', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (428, '张欣欣', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (429, '叶钰豪', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (430, '罗苇珺', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (431, '马伟灿', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (432, '林睿祺', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (433, '张楷澎', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (434, '俞瑶', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (435, '胡海强', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (436, '林奇', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (437, '胡若非', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (438, '郭炜国', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (439, '贺思琪', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (440, '林昕彤', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (441, '练骏强', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (442, '沈少贤', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (443, '林佳薇', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (444, '林艳萍', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (445, '洪晓亮', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (446, '廖若含', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (447, '郑晨鹭', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (448, '吴以恒', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (449, '范文杰', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (450, '王绎巽', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (451, '林紫祺', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (452, '李桢', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (453, '郭兴', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (454, '吴毅', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (455, '黄金', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (456, '梁岚', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (457, '邓希文', 1, 6, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (458, '黄蔓慧', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (459, '陈渊海', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (460, '洪骏欣', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (461, '邱轩宇', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (462, '陈博斯', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (463, '刘红鑫', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (464, '何夏萱', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (465, '王思雨', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (466, '邹卓睿', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (467, '黄嘉宇', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:41');
INSERT INTO `tb_student` VALUES (468, '李秉轩', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (469, '郑冰菱', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (470, '赵荣祺', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (471, '陈瑞霖', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (472, '魏钧瀚', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (473, '张艺泽', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (474, '付洺由', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (475, '李诗妍', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (476, '敖景圣', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (477, '李紫欣', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (478, '许芃锴', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (479, '俞雅婷', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (480, '王世伟', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (481, '李瑶', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (482, '江朴一', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (483, '林炜', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (484, '陈赫弈', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (485, '吴昊瀚', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (486, '王文冰', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (487, '陈雯', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (488, '肖子歆', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (489, '何韬', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (490, '赖佳倩', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (491, '黄潇颖', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (492, '蔡传基', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (493, '刘浩海', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (494, '张胜', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (495, '江舟', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (496, '张凤楠', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (497, '排孜丽耶·亚森', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (498, '李逸安', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (499, '郭佳', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (500, '徐驰', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (501, '邱凯扬', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (502, '林欣珏', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (503, '吴龄君', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (504, '茹柯耶·阿卜力孜', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (505, '潘舒怡', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (506, '朱翊宁', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (507, '李沁璐', 1, 5, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (508, '王敏杰', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:42');
INSERT INTO `tb_student` VALUES (509, '陈武擎', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (510, '戴宇桐', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (511, '王皓', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (512, '刘晨曦', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (513, '许静怡', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (514, '周菁宇', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (515, '林文凯', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (516, '杨光壕', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (517, '苏嘉艺', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (518, '吴锦曦', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (519, '高得硕', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (520, '陈海洲', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (521, '方锐', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (522, '朱梓柠', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (523, '林骏逸', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (524, '王圣杨', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (525, '洪秋婷', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (526, '吴欣然', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (527, '陈健', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (528, '王黎宇', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (529, '陈思杭', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (530, '王琳', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (531, '陈含香', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (532, '汤昊', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (533, '初祺涵', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (534, '温一寒', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (535, '黄宇杰', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (536, '莫本超', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (537, '陈子信', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (538, '谢俊鸿', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (539, '杨琳', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (540, '陈佳玲', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (541, '彭晨凯', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (542, '陈俊瑜', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (543, '陈艺林', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (544, '张欣儒', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (545, '刘文凯', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:43');
INSERT INTO `tb_student` VALUES (546, '王思涵', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (547, '李心玥', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (548, '李明月', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (549, '肖洋', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (550, '王阮毓', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (551, '柯思羽', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (552, '陈柳萌', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (553, '王弘乐', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (554, '李嘉茵', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (555, '吕佩妮', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (556, '陈亦菲', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (557, '王珞', 1, 4, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (558, '许艺婷', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (559, '饶俊驰', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (560, '黄静雯', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (561, '杨温妍', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (562, '兰雅欣', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (563, '黄智玲', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (564, '张政', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (565, '洪政扬', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (566, '张政宇', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (567, '范彬彬', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (568, '张棱俨', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (569, '肖雨洁', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (570, '谌若愚', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (571, '罗闻丽雅', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (572, '许鑫洋', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (573, '汪劲草', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (574, '黄妍', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (575, '柯彦妃', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (576, '卢纬涛', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (577, '刘含', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (578, '刘天文', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:44');
INSERT INTO `tb_student` VALUES (579, '邱雅萍', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (580, '罗志鹏', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (581, '刘福强', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (582, '王杨浩瀚', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (583, '张兴宁', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (584, '张捷兵', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (585, '林鑫', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (586, '翁宏勇', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (587, '刘萍', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (588, '张厚悦', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (589, '黄馨雨', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (590, '季厅', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (591, '郑欣', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (592, '潘琳娜', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (593, '陈诗尹', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (594, '叶云曼', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (595, '杨佳鑫', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (596, '黄妤昕', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (597, '吴芦伊', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (598, '蔡瑛', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (599, '李杭泽', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (600, '廖芷祺', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (601, '翟涵', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (602, '庄雅然', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (603, '黄书堤', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (604, '张嘉欣', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (605, '洪佳慧', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (606, '古颋', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (607, '王丹璐', 1, 3, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (608, '连大明', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (609, '刘梦婷', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:45');
INSERT INTO `tb_student` VALUES (610, '吴梓航', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (611, '邱源', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (612, '陈静', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (613, '易晓恒', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (614, '吴亦菲', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (615, '张芳', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (616, '沈慧娇', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (617, '陈伟', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (618, '薛嘉豪', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (619, '林梓萌', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (620, '陈璐晗', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (621, '甘远', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (622, '陈思莹', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (623, '许小雅', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (624, '谌春桥', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (625, '白桂森', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (626, '卢馨怡', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (627, '邹雨琳', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (628, '郑钧文', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (629, '张誉腾', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (630, '何艺彬', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (631, '裴世杰', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (632, '杨佳怡', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (633, '黄纵恒', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (634, '刘巧丹', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (635, '吴连洧', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (636, '高林煊', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (637, '查奕婷', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (638, '陈书逸', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (639, '卢嘉', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (640, '徐翔燕', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (641, '林晓靖', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (642, '阿丽米比·叶尔买克', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (643, '林颖', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (644, '张景荣', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (645, '李燕菲', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (646, '周吉安', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:46');
INSERT INTO `tb_student` VALUES (647, '康昊文', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (648, '姚莹', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (649, '郭逸凡', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (650, '麦日排提·伊敏托合提', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (651, '王欣怡', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (652, '黄鹭', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (653, '陈韵贤', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (654, '黄伟峰', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (655, '陈世泽', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (656, '陈佳欣', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (657, '布威海丽且·麦木提敏', 1, 2, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (658, '王思源', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (659, '赵鑫', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (660, '潘海锋', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (661, '詹家晖', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (662, '陈宏宇', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (663, '刘冰雁', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (664, '穆乃外尔·麦麦提艾力', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (665, '戴儀萱', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (666, '杨升', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (667, '丁玲', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (668, '严盼', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (669, '王启帆', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (670, '林诗宇', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (671, '郭雅雯', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (672, '张彧铭', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (673, '吴烨帆', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (674, '李杰', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (675, '陈勰思', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (676, '陈柔彬', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:47');
INSERT INTO `tb_student` VALUES (677, '黄旭', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (678, '裴蔚婷', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (679, '徐建滨', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (680, '林钊薏', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (681, '黄煜', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (682, '蔡林宏', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (683, '燕嘉颖', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (684, '林烨', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (685, '黄铁豪', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (686, '苏永祺', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (687, '尤捷骁', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (688, '苏智昊', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (689, '扎依尔·扎克尔江', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (690, '张迪', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (691, '王璐瑶', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (692, '李妍熙', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (693, '桂咏佳', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (694, '吴萍', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (695, '林嘉恩', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (696, '方钰灵', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (697, '王子奕', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (698, '刘炜翔', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (699, '张博文', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (700, '刘叶', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (701, '郭琳萱', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (702, '陈美安', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (703, '邓雯茜', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (704, '徐雅芝', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (705, '吴悠', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');
INSERT INTO `tb_student` VALUES (706, '张玥琪', 1, 1, '2019-10-22 22:03:41', '2019-11-07 15:15:48');

-- ----------------------------
-- Table structure for tb_subject
-- ----------------------------
DROP TABLE IF EXISTS `tb_subject`;
CREATE TABLE `tb_subject`  (
  `subject_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `subject_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学科名称',
  `subject_min_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学科简称',
  `subject_number` int(11) NOT NULL COMMENT '学科编号',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`subject_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '科目信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_subject
-- ----------------------------
INSERT INTO `tb_subject` VALUES (1, '语文', '语', 64, '2019-10-28 10:12:43', '2019-10-29 10:37:59');
INSERT INTO `tb_subject` VALUES (2, '数学', '数', 128, '2019-10-28 10:13:04', '2019-10-29 10:38:05');
INSERT INTO `tb_subject` VALUES (3, '英语', '英', 256, '2019-10-28 10:13:16', '2019-10-29 10:38:10');
INSERT INTO `tb_subject` VALUES (4, '物理', '物', 2, '2019-10-28 10:13:33', '2019-10-29 10:38:15');
INSERT INTO `tb_subject` VALUES (5, '历史', '史', 1, '2019-10-28 10:13:58', '2019-10-29 10:38:20');
INSERT INTO `tb_subject` VALUES (6, '政治', '政', 8, '2019-10-28 10:14:11', '2019-10-29 10:38:26');
INSERT INTO `tb_subject` VALUES (7, '地理', '地', 4, '2019-10-28 10:14:20', '2019-10-29 10:38:33');
INSERT INTO `tb_subject` VALUES (8, '生物', '生', 16, '2019-10-28 10:14:30', '2019-10-29 10:38:37');
INSERT INTO `tb_subject` VALUES (9, '化学', '化', 32, '2019-10-28 10:14:43', '2019-10-29 10:38:46');
INSERT INTO `tb_subject` VALUES (10, '班会', '会', 4096, '2019-10-28 10:14:54', '2019-10-29 10:39:04');
INSERT INTO `tb_subject` VALUES (11, '信息与技术', '信', 1024, '2019-10-28 10:15:05', '2019-10-29 10:39:12');
INSERT INTO `tb_subject` VALUES (12, '音乐', '音', 2048, '2019-10-28 10:15:21', '2019-10-29 10:39:19');
INSERT INTO `tb_subject` VALUES (13, '体育', '体', 512, '2019-10-28 10:15:28', '2019-10-29 10:39:29');

-- ----------------------------
-- Table structure for tb_subject_class
-- ----------------------------
DROP TABLE IF EXISTS `tb_subject_class`;
CREATE TABLE `tb_subject_class`  (
  `subject_class_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `subject_class_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教学班名称',
  `subject_classroom_id` bigint(20) NULL DEFAULT NULL COMMENT '教学班上课教室id',
  `grade_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教学班所属年级id',
  `group_id` int(11) NULL DEFAULT NULL COMMENT '组别id',
  `subject_id` bigint(11) NOT NULL COMMENT '教学班学科id',
  `subject_student_count` int(11) NULL DEFAULT NULL COMMENT '教学班学生人数',
  `subject_teacher_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教学班老师姓名',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`subject_class_id`) USING BTREE,
  INDEX `教学班学科id`(`subject_id`) USING BTREE,
  INDEX `教室编号id`(`subject_classroom_id`) USING BTREE,
  CONSTRAINT `教学班学科id` FOREIGN KEY (`subject_id`) REFERENCES `tb_subject` (`subject_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `教室编号id` FOREIGN KEY (`subject_classroom_id`) REFERENCES `tb_classroom` (`classroom_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教学班信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_teacher
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher`;
CREATE TABLE `tb_teacher`  (
  `teacher_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '老师姓名',
  `course_id` int(11) NULL DEFAULT NULL COMMENT '学科编号',
  `course_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科名称',
  `is_class_master` int(11) NULL DEFAULT 0 COMMENT '是否为班主任 0:不是 1:是，默认不是',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`teacher_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 65 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_teacher
-- ----------------------------
INSERT INTO `tb_teacher` VALUES (1, '范晶', 1, '语文', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (2, '吕贵', 1, '语文', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (3, '韦才', 1, '语文', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (4, '窦腾', 1, '语文', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (5, '滕承菲', 1, '语文', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (6, '郑燕飘', 1, '语文', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (7, '平发英', 1, '语文', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (8, '余策', 1, '语文', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (9, '云庆朋', 2, '数学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (10, '柳伦利', 2, '数学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (11, '水家', 2, '数学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (12, '鲍哲', 2, '数学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (13, '苏祥海', 2, '数学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (14, '湛世群', 2, '数学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (15, '顾菁', 2, '数学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (16, '孟安', 2, '数学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (17, '顾翠黛', 3, '英语', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (18, '傅玉亚', 3, '英语', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (19, '韦义', 3, '英语', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (20, '魏星邦', 3, '英语', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (21, '金中秀', 3, '英语', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (22, '伍梦', 3, '英语', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (23, '蒋静', 3, '英语', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (24, '罗超', 3, '英语', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (25, '伍义娥', 13, '体育', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (26, '康凡', 13, '体育', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (27, '姜艳学', 13, '体育', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (28, '许鸣', 11, '信息技术', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (29, '钱姬', 11, '信息技术', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (30, '雷江旭', 12, '音乐', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (31, '华民博', 12, '音乐', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (32, '萧政雅', 9, '化学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (33, '唐承顺', 9, '化学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (34, '唐时善', 9, '化学', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (35, '葛泰明', 8, '生物', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (36, '严星', 8, '生物', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (37, '毕轮伯', 8, '生物', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (38, '苗荷', 4, '物理', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (39, '谢滢', 4, '物理', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (40, '湛莲', 4, '物理', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (41, '乐玉', 4, '物理', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (42, '韦露利', 7, '地理', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (43, '罗兴胜', 7, '地理', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (44, '安峰茗', 7, '地理', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (45, '任强竹', 6, '政治', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (46, '平诚蓓', 6, '政治', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (47, '花亨', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (48, '滕楠慧', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (49, '姚强', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (50, '常东', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (51, '柳承', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (52, '鲍鹏士', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (53, '伍行豪', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (54, '康昭蕊', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (55, '严奇', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (56, '邹秀庆', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (57, '秦勇哲', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (58, '袁珊', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (59, '花康', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (60, '卜邦时', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (61, '奚飘', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (62, '曹河筠', 10, '班会', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (63, '秦先士', 5, '历史', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');
INSERT INTO `tb_teacher` VALUES (64, '冯环', 5, '历史', 0, '2019-10-28 15:01:45', '2019-10-28 15:01:45');

-- ----------------------------
-- Table structure for tb_teachers_will
-- ----------------------------
DROP TABLE IF EXISTS `tb_teachers_will`;
CREATE TABLE `tb_teachers_will`  (
  `teachers_will_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `teacher_id` bigint(20) NULL DEFAULT NULL COMMENT '教师id',
  `teacher_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师姓名',
  `time_items` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '意愿时间',
  `statue` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`teachers_will_id`) USING BTREE,
  INDEX `教师id`(`teacher_id`) USING BTREE,
  CONSTRAINT `教师id` FOREIGN KEY (`teacher_id`) REFERENCES `tb_teacher` (`teacher_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_teachers_will
-- ----------------------------
INSERT INTO `tb_teachers_will` VALUES (1, 1, '范晶', '[{\"dateOrder\":0,\"itemDetials\":[{\"courseOrder\":0,\"will\":1}]},{\"dateOrder\":1,\"itemDetials\":[{\"courseOrder\":1,\"will\":1}]},{\"dateOrder\":2,\"itemDetials\":[{\"courseOrder\":5,\"will\":1}]},{\"dateOrder\":4,\"itemDetials\":[{\"courseOrder\":0,\"will\":1}]}]', '1', '2019-11-08 02:50:57', '2019-11-08 02:50:57');

-- ----------------------------
-- Table structure for tb_timer
-- ----------------------------
DROP TABLE IF EXISTS `tb_timer`;
CREATE TABLE `tb_timer`  (
  `timer_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `timer_num` int(11) NULL DEFAULT NULL COMMENT '一天的上课数量，即多少节课',
  `timer_schedul` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '时间安排表',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '时间表名称',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`timer_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_timetable_rule
-- ----------------------------
DROP TABLE IF EXISTS `tb_timetable_rule`;
CREATE TABLE `tb_timetable_rule`  (
  `timetable_rule_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `timetable_rule` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '规则项列表 一个列表项包含：排课规则名、排课规则优先级、排课规则值',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`timetable_rule_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '排课规则表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_timetable_task
-- ----------------------------
DROP TABLE IF EXISTS `tb_timetable_task`;
CREATE TABLE `tb_timetable_task`  (
  `timetable_task_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `timetable_task_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '排课任务名称',
  `timetable_task_ruleid` bigint(20) NOT NULL COMMENT '排课规则id',
  `timetable_task_status` int(11) NULL DEFAULT NULL COMMENT '排课任务状态:0：停止状态 500：服务器内部错误 201：成功 400：客户端错误',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`timetable_task_id`) USING BTREE,
  INDEX `排课规则id`(`timetable_task_ruleid`) USING BTREE,
  CONSTRAINT `排课规则id` FOREIGN KEY (`timetable_task_ruleid`) REFERENCES `tb_timetable_rule` (`timetable_rule_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '排课任务表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_ts_plan
-- ----------------------------
DROP TABLE IF EXISTS `tb_ts_plan`;
CREATE TABLE `tb_ts_plan`  (
  `ts_plan_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '教师排课计划id',
  `teacher_id` int(11) NOT NULL COMMENT '教师id',
  `max_period` int(11) NULL DEFAULT NULL COMMENT '每周课时安排',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`ts_plan_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 65 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师排课计划表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_ts_plan
-- ----------------------------
INSERT INTO `tb_ts_plan` VALUES (1, 1, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (2, 2, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (3, 3, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (4, 4, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (5, 5, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (6, 6, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (7, 7, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (8, 8, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (9, 9, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (10, 10, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (11, 11, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (12, 12, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (13, 13, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (14, 14, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (15, 15, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (16, 16, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (17, 17, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (18, 18, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (19, 19, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (20, 20, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (21, 21, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (22, 22, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (23, 23, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (24, 24, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (25, 25, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (26, 26, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (27, 27, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (28, 28, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (29, 29, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (30, 30, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (31, 31, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (32, 32, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (33, 33, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (34, 34, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (35, 35, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (36, 36, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (37, 37, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (38, 38, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (39, 39, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (40, 40, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (41, 41, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (42, 42, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (43, 43, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (44, 44, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (45, 45, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (46, 46, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (47, 47, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (48, 48, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (49, 49, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (50, 50, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (51, 51, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (52, 52, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (53, 53, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (54, 54, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (55, 55, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (56, 56, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (57, 57, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (58, 58, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (59, 59, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (60, 60, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (61, 61, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (62, 62, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (63, 63, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');
INSERT INTO `tb_ts_plan` VALUES (64, 64, 14, '2019-10-28 15:10:24', '2019-10-28 15:10:24');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `accounts` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '校园帐号',
  `role_id` int(11) NULL DEFAULT NULL,
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '用户状态，0正常，1停用',
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '盐加密，加密字段',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`user_id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'pdh', '6d6b21a4887edcfe11ed2a1de251c536', '20160310235', 3, '0', 'Lfv3+hH1sxC1qcTu2qo1wQ==', '2019-11-02 23:47:36', '2019-11-03 12:48:04');

-- ----------------------------
-- Table structure for tb_user_perms
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_perms`;
CREATE TABLE `tb_user_perms`  (
  `user_perms_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NULL DEFAULT NULL COMMENT '用户id',
  `perms_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户权限名称',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`user_perms_id`) USING BTREE,
  INDEX `userid`(`user_id`) USING BTREE,
  CONSTRAINT `userid` FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户权限表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

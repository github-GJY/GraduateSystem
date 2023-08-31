/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80033
 Source Host           : localhost:3306
 Source Schema         : graduate

 Target Server Type    : MySQL
 Target Server Version : 80033
 File Encoding         : 65001

 Date: 13/08/2023 18:53:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `account` int NULL DEFAULT NULL COMMENT '管理员账号',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '管理员密码'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (2023, '123');

-- ----------------------------
-- Table structure for studentinf
-- ----------------------------
DROP TABLE IF EXISTS `studentinf`;
CREATE TABLE `studentinf`  (
  `graduateID` int NOT NULL COMMENT '毕业生编号',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `gender` char(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '男' COMMENT '性别',
  `ethnic` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '汉' COMMENT '民族',
  `place` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '籍贯',
  `graduatetime` date NULL DEFAULT NULL COMMENT '毕业日期',
  `professional` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '专业',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '政治面貌',
  PRIMARY KEY (`graduateID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of studentinf
-- ----------------------------
INSERT INTO `studentinf` VALUES (20231001, '张恒', '男', '汉', '云南省', '2023-08-01', '软件工程', '团员');
INSERT INTO `studentinf` VALUES (20231002, '王五', '女', '汉', '湖南省', '2023-08-06', '计算机科技与技术', '群众');
INSERT INTO `studentinf` VALUES (20231003, '赵六', '男', '瑶族', '云南省', '2023-08-06', '学前教育', '党员');
INSERT INTO `studentinf` VALUES (20231004, '李琦', '女', '汉', '山西省', '2023-08-01', '商务英语', '群众');
INSERT INTO `studentinf` VALUES (20231005, '刘莽', '男', '汉', '江西省', '2023-08-03', '商务英语', '群众');
INSERT INTO `studentinf` VALUES (20231006, '李春梅', '女', '汉', '陕西省', '2023-08-08', '软件工程', '团员');
INSERT INTO `studentinf` VALUES (20231007, '吴承恩', '男', '汉', '四川省', '2023-08-02', '计算机科技与技术', '群众');
INSERT INTO `studentinf` VALUES (20231008, '李中冰', '男', '汉', '陕西省', '2023-07-11', '学前教育', '群众');
INSERT INTO `studentinf` VALUES (20231009, '吴玉美', '女', '汉', '湖南省', '2023-05-08', '学前教育', '党员');
INSERT INTO `studentinf` VALUES (20231010, '倪易芳', '女', '汉', '湖南省', '2022-12-20', '商务英语', '群众');
INSERT INTO `studentinf` VALUES (20231011, '蒋毅云', '男', '汉', '四川省', '2021-05-01', '计算机科技与技术', '群众');
INSERT INTO `studentinf` VALUES (20231012, '谢延文', '男', '汉', '云南省', '2021-02-01', '软件工程', '团员');
INSERT INTO `studentinf` VALUES (20231013, '吴淑芳', '女', '汉', '江西省', '2022-02-17', '软件工程', '群众');
INSERT INTO `studentinf` VALUES (20231014, '郑怡文', '女', '汉', '江西省', '2022-11-10', '学前教育', '群众');
INSERT INTO `studentinf` VALUES (20231015, '陆志明', '男', '汉', '四川省', '2022-06-22', '商务英语', '群众');
INSERT INTO `studentinf` VALUES (20231016, '李成白', '男', '汉', '陕西省', '2023-06-22', '软件工程', '党员');
INSERT INTO `studentinf` VALUES (20231017, '李晓爱', '女', '汉', '湖南省', '2021-10-21', '计算机科技与技术', '群众');
INSERT INTO `studentinf` VALUES (20231018, '王恩龙', '男', '汉', '云南省', '2022-09-21', '计算机科技与技术', '群众');
INSERT INTO `studentinf` VALUES (20231019, '邓海来', '男', '汉', '山西省', '2022-09-29', '学前教育', '团员');
INSERT INTO `studentinf` VALUES (20231020, '苏紫婷', '女', '汉', '山西省', '2022-06-30', '商务英语', '群众');
INSERT INTO `studentinf` VALUES (20231021, '方一强', '男', '汉', '云南省', '2022-08-12', '软件工程', '群众');
INSERT INTO `studentinf` VALUES (20231022, '林子范', '男', '汉', '四川省', '2022-06-15', '学前教育', '群众');
INSERT INTO `studentinf` VALUES (20231023, '章子怡', '女', '汉', '江西省', '2022-07-14', '学前教育', '党员');
INSERT INTO `studentinf` VALUES (20231024, '陈建好', '男', '汉', '山西省', '2022-01-11', '计算机科技与技术', '群众');
INSERT INTO `studentinf` VALUES (20231025, '黄秋萍', '女', '汉', '四川省', '2023-08-01', '计算机科技与技术', '群众');
INSERT INTO `studentinf` VALUES (20231026, '赵小雪', '女', '汉', '陕西省', '2022-05-24', '学前教育', '群众');
INSERT INTO `studentinf` VALUES (20231027, '丁健', '男', '汉', '湖南省', '2023-05-17', '商务英语', '团员');
INSERT INTO `studentinf` VALUES (20231028, '江平', '男', '汉', '云南省', '2023-06-28', '软件工程', '群众');
INSERT INTO `studentinf` VALUES (20231029, '凡晓芳', '女', '汉', '江西省', '2022-03-17', '计算机科技与技术', '党员');
INSERT INTO `studentinf` VALUES (20231030, '王丹', '女', '汉', '四川省', '2022-02-23', '学前教育', '群众');
INSERT INTO `studentinf` VALUES (20231031, '刘启龙', '男', '汉', '云南省', '2023-03-16', '商务英语', '群众');
INSERT INTO `studentinf` VALUES (20231032, '李卫华', '男', '汉', '山西省', '2023-08-02', '软件工程', '群众');
INSERT INTO `studentinf` VALUES (20231033, '成公', '男', '汉', '四川省', '2023-08-16', ' ', '群众');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `account` int NOT NULL COMMENT '账户',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '123' COMMENT '密码',
  PRIMARY KEY (`account`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (20231001, '123');
INSERT INTO `user` VALUES (20231002, '123');
INSERT INTO `user` VALUES (20231003, '123');
INSERT INTO `user` VALUES (20231004, '123');
INSERT INTO `user` VALUES (20231005, '123');
INSERT INTO `user` VALUES (20231006, '123');
INSERT INTO `user` VALUES (20231007, '123');
INSERT INTO `user` VALUES (20231008, '123');
INSERT INTO `user` VALUES (20231009, '123');
INSERT INTO `user` VALUES (20231010, '123');
INSERT INTO `user` VALUES (20231011, '123');
INSERT INTO `user` VALUES (20231012, '123');
INSERT INTO `user` VALUES (20231013, '123');
INSERT INTO `user` VALUES (20231014, '123');
INSERT INTO `user` VALUES (20231015, '123');
INSERT INTO `user` VALUES (20231016, '123');
INSERT INTO `user` VALUES (20231017, '123');
INSERT INTO `user` VALUES (20231018, '123');
INSERT INTO `user` VALUES (20231019, '123');
INSERT INTO `user` VALUES (20231020, '123');
INSERT INTO `user` VALUES (20231021, '123');
INSERT INTO `user` VALUES (20231022, '123');
INSERT INTO `user` VALUES (20231023, '123');
INSERT INTO `user` VALUES (20231024, '123');
INSERT INTO `user` VALUES (20231025, '123');
INSERT INTO `user` VALUES (20231026, '123');
INSERT INTO `user` VALUES (20231027, '123');
INSERT INTO `user` VALUES (20231028, '123');
INSERT INTO `user` VALUES (20231029, '123');
INSERT INTO `user` VALUES (20231030, '123');
INSERT INTO `user` VALUES (20231031, '123');
INSERT INTO `user` VALUES (20231032, '123');
INSERT INTO `user` VALUES (20231033, '123');

-- ----------------------------
-- Table structure for workinfo
-- ----------------------------
DROP TABLE IF EXISTS `workinfo`;
CREATE TABLE `workinfo`  (
  `graduateID` int NOT NULL COMMENT '毕业生编号',
  `worktime` date NULL DEFAULT NULL COMMENT '就业时间',
  `workplace` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工作单位',
  `worknature` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工作性质',
  `duties` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '职务',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`graduateID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of workinfo
-- ----------------------------
INSERT INTO `workinfo` VALUES (20231001, '2023-08-10', '动力节点', '全职', '老师', '成都市金牛区');
INSERT INTO `workinfo` VALUES (20231002, '2023-08-06', '书亦烧仙草', '服务', '收银员', '成都市郫都区');
INSERT INTO `workinfo` VALUES (20231006, '2023-08-10', '阿里巴巴', '管理', '业务经理', '成都市高新区');
INSERT INTO `workinfo` VALUES (20231007, '2023-08-09', '腾讯', '服务', '客服', '成都市青羊区');
INSERT INTO `workinfo` VALUES (20231008, '2023-08-08', '京东', '服务', '客服', '成都市成华区');
INSERT INTO `workinfo` VALUES (20231009, '2023-08-02', '淘宝', '服务', '客服', '成都市郫都区');
INSERT INTO `workinfo` VALUES (20231010, '2023-08-05', '拼多多', '服务', '客服', '成都市温江区');
INSERT INTO `workinfo` VALUES (20231011, '2023-08-18', '字节跳动', '全职', '老师', '泸州市龙马潭区');
INSERT INTO `workinfo` VALUES (20231012, '2023-08-24', '百度', '其他', '其他', '泸州市江阳区');
INSERT INTO `workinfo` VALUES (20231013, '2023-08-19', '万达', '财务', '收银员', '泸州市纳溪区');
INSERT INTO `workinfo` VALUES (20231014, '2023-08-09', '舞东风', '服务', '理货员', '自贡市贡井区');
INSERT INTO `workinfo` VALUES (20231015, '2023-08-17', '恒大集团', '财务', '会计', '泸州市合江县');
INSERT INTO `workinfo` VALUES (20231016, '2023-08-17', '自主创业', '其他', '其他', '成都市青羊区');
INSERT INTO `workinfo` VALUES (20231017, '2023-08-15', '邮政储蓄银行', '管理', '行政', '成都市高新区');
INSERT INTO `workinfo` VALUES (20231018, '2023-08-09', '沃尔玛', '服务', '保洁', '泸州市龙马潭区');
INSERT INTO `workinfo` VALUES (20231019, '2023-08-09', '极兔速递', '服务', '入库', '成都市青羊区');
INSERT INTO `workinfo` VALUES (20231020, '2023-08-10', '顺丰快运', '服务', '派件', '成都市青羊区');
INSERT INTO `workinfo` VALUES (20231021, '2023-08-10', '申通快递', '服务', '会计', '泸州市合江县');
INSERT INTO `workinfo` VALUES (20231022, '2023-08-14', '韵达快递', '服务', '客服', '成都市成华区');
INSERT INTO `workinfo` VALUES (20231023, '2023-08-04', '圆通速递', '服务', '分拣', '成都市温江区');
INSERT INTO `workinfo` VALUES (20231024, '2023-08-20', '茶百道', '服务', '操作', '成都市温江区');
INSERT INTO `workinfo` VALUES (20231025, '2023-08-03', '茶颜悦色', '服务', '收银员', '泸州市合江县');

SET FOREIGN_KEY_CHECKS = 1;

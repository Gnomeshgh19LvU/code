/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.75.135-3306
 Source Server Type    : MySQL
 Source Server Version : 80034
 Source Host           : 192.168.75.135:3306
 Source Schema         : cloud_user

 Target Server Type    : MySQL
 Target Server Version : 80034
 File Encoding         : 65001

 Date: 28/09/2024 23:50:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `phone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `pwd` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sex` int NULL DEFAULT NULL,
  `img` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `role` int NULL DEFAULT NULL COMMENT '1是普通用户，2是管理员',
  `username` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `wechat` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '123', '666', 1, 'mashifu', '2024-09-09 00:00:00', 1, 'jack', 'mashifu');
INSERT INTO `user` VALUES (2, '2323432', '794666918', 1, 'wwwww', '2024-05-20 04:54:01', 1, '小滴Anna姐姐', 'mashifu-anna');
INSERT INTO `user` VALUES (3, '2323432', '1234435-lw', 1, 'wwwww', '2024-05-20 04:54:42', 1, '二当家小D', 'mashifu-nana');
INSERT INTO `user` VALUES (4, '2323432', '3232323', 1, 'wwwww', '2020-04-20 04:55:07', 1, '老王', 'xdclass-lw');

SET FOREIGN_KEY_CHECKS = 1;

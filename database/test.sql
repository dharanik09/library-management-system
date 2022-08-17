-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES (27,'ABBBBBB'),(28,'BCCCCC'),(29,'CDDDDD'),(30,'DEEEEEE');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(14) DEFAULT NULL,
  `surname` varchar(14) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  `company_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `comapny_id_idx` (`company_id`),
  CONSTRAINT `FK5v50ed2bjh60n1gc7ifuxmgf4` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=185 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (157,'John','Chen','john.chen@xxxx.com','Berlin',55000.00,27),(158,'Ameya','Job','ameya.job@xxx.com','Hamburg',80000.00,27),(159,'Pat','Fay','pat.fey@xxx.com','Munich',60000.00,27),(160,'Smith','Jones','smith.jone@xxx.com','Cologne',50000.00,27),(161,'David','Kumar','david.kumar@xxx.com','Frankfurt',25000.00,27),(162,'Jebin','Parsana','jebin.parsanna@xxx.com','Düsseldorf',35000.00,27),(163,'Dharani','Kumar','dharani.kumar@xxx.com','Stuttgart',15000.00,27),(164,'John','Chen','john.chen@xxxx.com','Berlin',65000.00,28),(165,'Ameya','Job','ameya.job@xxx.com','Hamburg',75000.00,28),(166,'Pat','Fay','pat.fey@xxx.com','Munich',95000.00,28),(167,'Smith','Jones','smith.jone@xxx.com','Cologne',40000.00,28),(168,'David','Kumar','david.kumar@xxx.com','Frankfurt',25000.00,28),(169,'Jebin','Parsana','jebin.parsanna@xxx.com','Düsseldorf',35000.00,28),(170,'Dharani','Kumar','dharani.kumar@xxx.com','Stuttgart',15000.00,28),(171,'John','Chen','john.chen@xxxx.com','Berlin',35000.00,29),(172,'Ameya','Job','ameya.job@xxx.com','Hamburg',70000.00,29),(173,'Pat','Fay','pat.fey@xxx.com','Munich',45000.00,29),(174,'Smith','Jones','smith.jone@xxx.com','Cologne',50000.00,29),(175,'David','Kumar','david.kumar@xxx.com','Frankfurt',25000.00,29),(176,'Jebin','Parsana','jebin.parsanna@xxx.com','Düsseldorf',35000.00,29),(177,'Dharani','Kumar','dharani.kumar@xxx.com','Stuttgart',15000.00,29),(178,'John','Chen','john.chen@xxxx.com','Berlin',65000.00,30),(179,'Ameya','Job','ameya.job@xxx.com','Hamburg',75000.00,30),(180,'Pat','Fay','pat.fey@xxx.com','Munich',60000.00,30),(181,'Smith','Jones','smith.jone@xxx.com','Cologne',50000.00,30),(182,'David','Kumar','david.kumar@xxx.com','Frankfurt',65000.00,30),(183,'Jebin','Parsana','jebin.parsanna@xxx.com','Düsseldorf',35000.00,30);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-17 19:22:17

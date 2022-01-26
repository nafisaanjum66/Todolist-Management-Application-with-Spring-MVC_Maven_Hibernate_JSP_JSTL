CREATE DATABASE  IF NOT EXISTS `tododb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tododb`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: tododb
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'fff','ff'),(2,'hhh','123'),(3,'test','123'),(4,'tester','123'),(5,'roja','123'),(6,'Rojas','123'),(7,'kiara','123'),(8,'mytest','123'),(9,'utest','123'),(10,'ukiara','123'),(11,'upurba','123'),(12,'aaa','123'),(13,'nad','123'),(14,'shamim','123');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registration` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `fullname` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration`
--

LOCK TABLES `registration` WRITE;
/*!40000 ALTER TABLE `registration` DISABLE KEYS */;
INSERT INTO `registration` VALUES (1,'dana','123','Nafisa Anjum','0139568696','2021-12-15','nafisaanjum2711@gmail.com'),(4,'naf','123','new new','0139568696','2021-12-10','nafisaanjumdana@gmail.com'),(15,'sdfsadf','123','Nafisa An','0139568696','2021-12-16','nafisaanjumdana@gmail.com'),(16,'hjfg','234','Nafisa Anjum','0139568696','2022-01-01','nafisaanjum2711@gmail.com'),(17,'gdfs','234','dasfd','0139568696','2021-12-16','nafisaanjum2711@gmail.com'),(18,'sss','123','new new','0139568696','2021-12-23','nafisaanjum2711@gmail.com'),(19,'dd','234','new new','0139568696','2021-12-15','nafisaanjumdana@gmail.com'),(20,'fff','ff','Nafisa An','0139568696','2021-12-16','nafisaanjum2711@gmail.com'),(21,'danas','123','dasfd','0139568696','2021-12-30','nafisaanjumdana@gmail.com'),(22,'hhh','123','Nafisa An','0139568696','2021-12-22','nafisaanjum2711@gmail.com'),(23,'test','123','Nafisa Anjum','0139568696','2021-12-17','nafisaanjumdana@gmail.com'),(24,'tester','123','Nafisa Anjum','0139568696','2021-12-25','nafisaanjumdana@gmail.com'),(25,'roja','123','Nafisa Anjum','0139568696','2021-12-18','nafisaanjumdana@gmail.com'),(26,'Rojas','123','new new','0139568696','2021-12-14','nafisaanjumdana@gmail.com'),(27,'kiara','123','new new','0139568696','2021-12-25','nafisaanjumdana@gmail.com'),(28,'mytest','123','new new','0139568696','2021-12-17','nafisaanjumdana@gmail.com'),(29,'utest','123','new new','0139568696','2021-12-17','nafisaanjumdana@gmail.com'),(30,'ukiara','123','new new','0139568696','2021-12-15','nafisaanjumdana@gmail.com'),(31,'upurba','123','new new','0139568696','2021-12-18','nafisaanjumdana@gmail.com'),(32,'aaa','123','new new','0139568696','2021-12-16','nafisaanjumdana@gmail.com'),(33,'nad','123','asddfwsfv','0139568696','2021-12-22','nafisaanjumdana@gmail.com'),(34,'shamim','123','new new','0139568696','2021-12-17','nafisaanjumdana@gmail.com');
/*!40000 ALTER TABLE `registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `todo`
--

DROP TABLE IF EXISTS `todo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `todo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  `tergetDate` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `todo`
--

LOCK TABLES `todo` WRITE;
/*!40000 ALTER TABLE `todo` DISABLE KEYS */;
INSERT INTO `todo` VALUES (1,'java','slide 1','2012-12-12'),(2,'sdvadv','sghsfdghsfda','2021-12-25'),(6,'java','java read','2021-12-22'),(7,'ad jva','okk','2021-12-23'),(8,'Misir Ali','A Humayun Ahmed creation','2021-12-18');
/*!40000 ALTER TABLE `todo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-27  1:01:34

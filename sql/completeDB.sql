-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: wastage_and_repurposing_database
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `county`
--

DROP TABLE IF EXISTS `county`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `county` (
  `countyid` int NOT NULL,
  `stateid` int DEFAULT NULL,
  `countyname` varchar(20) DEFAULT NULL,
  `population` int NOT NULL,
  PRIMARY KEY (`countyid`),
  UNIQUE KEY `countyname` (`countyname`),
  KEY `stateid` (`stateid`),
  CONSTRAINT `county_ibfk_1` FOREIGN KEY (`stateid`) REFERENCES `state` (`stateid`) ON DELETE CASCADE,
  CONSTRAINT `chk_population` CHECK ((`population` >= 0))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `county`
--

LOCK TABLES `county` WRITE;
/*!40000 ALTER TABLE `county` DISABLE KEYS */;
INSERT INTO `county` VALUES (1,1,'Sandwich',70000),(2,2,'Hamburgerfield',99999),(3,3,'Peter\'s Village',7800),(4,4,'Pizzalia',88888),(5,5,'Ham n\' Swiss town',999999);
/*!40000 ALTER TABLE `county` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entity1`
--

DROP TABLE IF EXISTS `entity1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entity1` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entity1`
--

LOCK TABLES `entity1` WRITE;
/*!40000 ALTER TABLE `entity1` DISABLE KEYS */;
/*!40000 ALTER TABLE `entity1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `state` (
  `stateid` int NOT NULL,
  `statename` varchar(20) DEFAULT NULL,
  `numberofcounties` int DEFAULT NULL,
  PRIMARY KEY (`stateid`),
  UNIQUE KEY `statename` (`statename`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` VALUES (1,'Illinois',102),(2,'Wisconsin',72),(3,'New York',57),(4,'Florida',67),(5,'Texas',254);
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `waste`
--

DROP TABLE IF EXISTS `waste`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `waste` (
  `wasteid` int NOT NULL,
  `countyid` int NOT NULL,
  `totalwaste` int NOT NULL,
  `dayofsample` date DEFAULT NULL,
  `organic` int DEFAULT NULL,
  `plastic` int DEFAULT NULL,
  `metal` int DEFAULT NULL,
  `glass` int DEFAULT NULL,
  `paper` int DEFAULT NULL,
  PRIMARY KEY (`wasteid`),
  KEY `countyid` (`countyid`),
  CONSTRAINT `waste_ibfk_1` FOREIGN KEY (`countyid`) REFERENCES `county` (`countyid`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `waste`
--

LOCK TABLES `waste` WRITE;
/*!40000 ALTER TABLE `waste` DISABLE KEYS */;
INSERT INTO `waste` VALUES (1,1,10000,'2020-01-01',1000,2000,2000,1000,6000),(2,2,20000,'2020-01-03',5000,5000,5000,2500,2500),(3,3,30000,'2020-01-04',10000,15000,3000,1000,1000),(4,4,50000,'2020-01-06',15000,15000,15000,2500,2500),(5,5,50000,'2020-01-08',10000,10000,10000,10000,10000);
/*!40000 ALTER TABLE `waste` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `waste_facility`
--

DROP TABLE IF EXISTS `waste_facility`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `waste_facility` (
  `facilityid` int NOT NULL,
  `countyid` int NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `wastetypeprocessed` varchar(50) DEFAULT NULL,
  `recycleordump` int DEFAULT NULL,
  PRIMARY KEY (`facilityid`),
  UNIQUE KEY `countyid` (`countyid`),
  CONSTRAINT `waste_facility_ibfk_1` FOREIGN KEY (`countyid`) REFERENCES `county` (`countyid`) ON DELETE CASCADE,
  CONSTRAINT `chk_wastetypeprocessed` CHECK ((`wastetypeprocessed` in (_cp850'Organic',_cp850'Metal',_cp850'Plastic',_cp850'Paper',_cp850'Glass')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `waste_facility`
--

LOCK TABLES `waste_facility` WRITE;
/*!40000 ALTER TABLE `waste_facility` DISABLE KEYS */;
INSERT INTO `waste_facility` VALUES (1,1,'1234 Cool Guy street','Paper',1),(2,2,'1254 Random Street','Organic',2),(3,3,'1534 Williams Street','Metal',1),(4,4,'1653 Adam\'s Street','Glass',1),(5,5,'765 Abraham\'s Street','Plastic',1);
/*!40000 ALTER TABLE `waste_facility` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `waste_management`
--

DROP TABLE IF EXISTS `waste_management`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `waste_management` (
  `managementid` int NOT NULL,
  `facilityid` int NOT NULL,
  `totalwaste` int NOT NULL,
  `dayofsample` date DEFAULT NULL,
  `organic` int DEFAULT NULL,
  `metal` int DEFAULT NULL,
  `plastic` int DEFAULT NULL,
  `paper` int DEFAULT NULL,
  `glass` int DEFAULT NULL,
  PRIMARY KEY (`managementid`),
  KEY `facilityid` (`facilityid`),
  CONSTRAINT `waste_management_ibfk_1` FOREIGN KEY (`facilityid`) REFERENCES `waste_facility` (`facilityid`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `waste_management`
--

LOCK TABLES `waste_management` WRITE;
/*!40000 ALTER TABLE `waste_management` DISABLE KEYS */;
INSERT INTO `waste_management` VALUES (1,1,4000,'2021-01-01',400,156,2600,267,144),(2,2,6000,'2021-01-02',2222,219,1111,250,417),(3,3,600,'2021-02-20',250,50,150,100,50),(4,4,900,'2021-03-15',400,150,200,78,20),(5,5,888,'2021-07-03',400,88,175,100,23);
/*!40000 ALTER TABLE `waste_management` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-31 17:42:41

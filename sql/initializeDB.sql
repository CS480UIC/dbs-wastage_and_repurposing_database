CREATE DATABASE wastage_and_repurposing_database;


use  wastage_and_repurposing_database;

CREATE TABLE user
(

  username VARCHAR(50) primary key,
  password VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);

CREATE TABLE entity1 
(

  username VARCHAR(50) primary key,
  password VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);

CREATE TABLE state 
(
  stateid int primary key not null,
  statename VARCHAR(20) unique,
  numberofcounties int
);

CREATE TABLE county (
    countyid int NOT NULL UNIQUE,
    stateid int,
    countyname varchar(20),
    population int NOT NULL,
    PRIMARY KEY(countyid),
    FOREIGN KEY (stateid) REFERENCES state(stateid) ON DELETE CASCADE,
    CONSTRAINT chk_population CHECK (population >= 0)
);

CREATE TABLE waste_facility
(
  facilityid int primary key not null,
  countyid int NOT NULL UNIQUE,
  address VARCHAR(50),
  wastetypeprocessed varchar(50),
  recycleordump int,
  FOREIGN KEY (countyid) REFERENCES county(countyid) ON DELETE CASCADE,
  CONSTRAINT chk_wastetypeprocessed CHECK (wastetypeprocessed IN ('Organic', 'Metal', 'Plastic', 'Paper', 'Glass'))
);

CREATE TABLE waste (
    wasteid int primary key not null,
    countyid int NOT NULL UNIQUE,
    totalwaste int NOT NULL,
    dayofsample date,
    organic int,
    plastic int,
    metal int,
    glass int,
    paper int,
    FOREIGN KEY(countyid) REFERENCES county(countyid) ON DELETE CASCADE
);

CREATE TABLE waste_management 
(
  managementid int primary key NOT NULL,
  facilityid int NOT NULL UNIQUE,
  dayrecorded DATE,
  totalwaste int NOT NULL,
  organic int,
  metal int,
  plastic int,
  paper int,
  glass int,
  FOREIGN KEY (facilityid) REFERENCES waste_facility(facilityid) ON DELETE CASCADE
);

INSERT INTO `state` VALUES (1,'Illinois',102),(2,'Wisconsin',72),(3,'New York',57),(4,'Florida',67),(5,'Texas',254);

INSERT INTO `county` VALUES (1,1,'Sandwich',70000),(2,2,'Hamburgerfield',99999),(3,3,'Peter\'s Village',7800),(4,4,'Pizzalia',88888),(5,5,'Ham n\' Swiss town',999999);

INSERT INTO `waste` VALUES (1,1,10000,'2020-01-01',1000,2000,2000,1000,6000),(2,2,20000,'2020-01-03',5000,5000,5000,2500,2500),(3,3,30000,'2020-01-04',10000,15000,3000,1000,1000),(4,4,50000,'2020-01-06',15000,15000,15000,2500,2500),(5,5,50000,'2020-01-08',10000,10000,10000,10000,10000);

INSERT INTO `waste_facility` VALUES (1,1,'1234 Cool Guy street','Paper',1),(2,2,'1254 Random Street','Organic',2),(3,3,'1534 Williams Street','Metal',1),(4,4,'1653 Adam\'s Street','Glass',1),(5,5,'765 Abraham\'s Street','Plastic',1);

INSERT INTO waste_management VALUES (1,1,4000,'2021-01-01',400,156,2600,267,144),(2,2,6000,'2021-01-02',2222,219,1111,250,417),(3,3,600,'2021-02-20',250,50,150,100,50),(4,4,900,'2021-03-15',400,150,200,78,20),(5,5,888,'2021-07-03',400,88,175,100,23);


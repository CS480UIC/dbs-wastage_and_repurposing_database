CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.2.4` AS
    SELECT 
        `waste`.`countyid` AS `countyid`,
        `waste`.`totalwaste` AS `totalwaste`
    FROM
        `waste`
    GROUP BY `waste`.`countyid`
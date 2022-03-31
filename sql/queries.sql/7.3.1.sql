CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.3.1` AS
    SELECT 
        `county`.`countyname` AS `countyname`,
        `waste`.`totalwaste` AS `totalwaste`
    FROM
        (`county`
        LEFT JOIN `waste` ON ((`county`.`countyid` = `waste`.`countyid`)))

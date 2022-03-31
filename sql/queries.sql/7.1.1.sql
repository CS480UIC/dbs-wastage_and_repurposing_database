CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.1.1` AS
    SELECT 
        `county`.`countyname` AS `countyname`,
        `waste`.`totalwaste` AS `totalwaste`
    FROM
        (`county`
        JOIN `waste`)
CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.2.6` AS
    SELECT 
        `county`.`countyname` AS `countyname`,
        `county`.`stateid` AS `stateid`
    FROM
        `county`
    GROUP BY `county`.`countyname`
    HAVING (AVG(`county`.`population`) > 15000)
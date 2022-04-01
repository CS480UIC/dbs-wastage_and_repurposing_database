CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.2.5` AS
    SELECT 
        `wastage_and_repurposing_database`.`county`.`countyname` AS `countyname`,
        `wastage_and_repurposing_database`.`county`.`stateid` AS `stateid`
    FROM
        `wastage_and_repurposing_database`.`county`
    GROUP BY `wastage_and_repurposing_database`.`county`.`countyname`
    HAVING (AVG(`wastage_and_repurposing_database`.`county`.`population`) > 15000)

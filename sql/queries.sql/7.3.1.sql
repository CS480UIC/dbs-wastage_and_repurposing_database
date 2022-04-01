CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.3.1` AS
    SELECT 
        `wastage_and_repurposing_database`.`county`.`countyname` AS `countyname`,
        `wastage_and_repurposing_database`.`waste`.`totalwaste` AS `totalwaste`
    FROM
        (`wastage_and_repurposing_database`.`county`
        JOIN `wastage_and_repurposing_database`.`waste` ON ((`wastage_and_repurposing_database`.`county`.`countyid` = `wastage_and_repurposing_database`.`waste`.`countyid`)))

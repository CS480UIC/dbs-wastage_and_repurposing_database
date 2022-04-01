CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.1.1` AS
    SELECT 
        `wastage_and_repurposing_database`.`waste`.`countyid` AS `countyid`,
        `wastage_and_repurposing_database`.`waste`.`totalwaste` AS `totalwaste`
    FROM
        `wastage_and_repurposing_database`.`waste`
    ORDER BY `wastage_and_repurposing_database`.`waste`.`totalwaste`

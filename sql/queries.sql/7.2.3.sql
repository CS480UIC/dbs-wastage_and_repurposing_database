CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.2.3` AS
    SELECT 
        `wastage_and_repurposing_database`.`waste`.`countyid` AS `countyid`,
        SUM(`wastage_and_repurposing_database`.`waste`.`totalwaste`) AS `sum(totalwaste)`
    FROM
        `wastage_and_repurposing_database`.`waste`
    GROUP BY `wastage_and_repurposing_database`.`waste`.`countyid`

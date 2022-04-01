CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.2.4` AS
    SELECT 
        AVG(`wastage_and_repurposing_database`.`waste`.`plastic`) AS `plasticAVG`,
        `wastage_and_repurposing_database`.`waste`.`totalwaste` AS `totalwaste`
    FROM
        `wastage_and_repurposing_database`.`waste`
    GROUP BY `wastage_and_repurposing_database`.`waste`.`totalwaste`

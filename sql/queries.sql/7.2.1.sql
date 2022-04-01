CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.2.1` AS
    SELECT 
        SQRT(`wastage_and_repurposing_database`.`waste`.`totalwaste`) AS `SQRT(totalwaste)`
    FROM
        `wastage_and_repurposing_database`.`waste`

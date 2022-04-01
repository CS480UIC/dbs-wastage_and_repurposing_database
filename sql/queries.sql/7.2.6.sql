CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.2.6` AS
    SELECT 
        CONCAT('Chill',
                `wastage_and_repurposing_database`.`state`.`statename`) AS `CONCAT('Chill',statename)`
    FROM
        `wastage_and_repurposing_database`.`state`
    WHERE
        (`wastage_and_repurposing_database`.`state`.`stateid` = 1)

CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.2.2` AS
    SELECT 
        LOWER(`wastage_and_repurposing_database`.`state`.`statename`) AS `LOWER(statename)`
    FROM
        `wastage_and_repurposing_database`.`state`

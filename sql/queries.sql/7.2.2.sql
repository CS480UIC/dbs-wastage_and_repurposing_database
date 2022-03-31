CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.2.2` AS
    SELECT 
        LOWER(`state`.`statename`) AS `LOWER(statename)`
    FROM
        `state`
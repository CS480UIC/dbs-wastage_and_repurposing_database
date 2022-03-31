CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.2.7` AS
    SELECT 
        CONCAT('Chill', `state`.`statename`) AS `CONCAT('Chill',statename)`
    FROM
        `state`
    WHERE
        (`state`.`stateid` = 1)
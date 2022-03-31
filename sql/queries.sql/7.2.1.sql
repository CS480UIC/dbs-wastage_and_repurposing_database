CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.2.1` AS
    SELECT 
        SQRT(`waste`.`totalwaste`) AS `SQRT(totalwaste)`
    FROM
        `waste`
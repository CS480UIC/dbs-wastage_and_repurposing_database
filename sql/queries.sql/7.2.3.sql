CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.2.3` AS
    SELECT 
        `waste`.`countyid` AS `countyid`,
        SUM(`waste`.`totalwaste`) AS `sum(totalwaste)`
    FROM
        `waste`
    GROUP BY `waste`.`countyid`

CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.2.5` AS
    SELECT 
        AVG(`waste`.`plastic`) AS `plasticAVG`,
        `waste`.`totalwaste` AS `totalwaste`
    FROM
        `waste`
    GROUP BY `waste`.`totalwaste`
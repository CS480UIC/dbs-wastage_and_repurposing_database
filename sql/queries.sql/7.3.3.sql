CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.3.3` AS
    SELECT 
        `c`.`countyname` AS `countyname`
    FROM
        `county` `c`
    WHERE
        EXISTS( SELECT 
                `wf`.`facilityid`
            FROM
                `waste_facility` `wf`
            WHERE
                (`wf`.`countyid` = `c`.`countyid`))
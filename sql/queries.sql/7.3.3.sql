CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.3.3` AS
    SELECT 
        `c`.`countyname` AS `countyname`
    FROM
        `wastage_and_repurposing_database`.`county` `c`
    WHERE
        EXISTS( SELECT 
                `wf`.`facilityid`
            FROM
                `wastage_and_repurposing_database`.`waste_facility` `wf`
            WHERE
                (`wf`.`countyid` = `c`.`countyid`))

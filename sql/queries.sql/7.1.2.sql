CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.1.2` AS
    SELECT 
        `wastage_and_repurposing_database`.`waste_facility`.`address` AS `address`
    FROM
        `wastage_and_repurposing_database`.`waste_facility`
    WHERE
        (`wastage_and_repurposing_database`.`waste_facility`.`facilityid` <> 3)
    ORDER BY `wastage_and_repurposing_database`.`waste_facility`.`address`

CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.2.7` AS
    SELECT 
        DAYOFMONTH(`wastage_and_repurposing_database`.`waste_management`.`dayofsample`) AS `DAY(dayofsample)`
    FROM
        `wastage_and_repurposing_database`.`waste_management`
    WHERE
        (`wastage_and_repurposing_database`.`waste_management`.`facilityid` <> 3)

CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.2.3` AS
    SELECT 
        DAYOFMONTH(`waste_management`.`dayrecorded`) AS `DAY(dayrecorded)`
    FROM
        `waste_management`
    WHERE
        (`waste_management`.`facilityid` <> 3)
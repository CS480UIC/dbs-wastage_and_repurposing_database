CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `wastage_and_repurposing_database`.`7.3.2` AS
    SELECT 
        `wastage_and_repurposing_database`.`county`.`countyname` AS `countyname`
    FROM
        `wastage_and_repurposing_database`.`county`
    WHERE
        (`wastage_and_repurposing_database`.`county`.`population` > (SELECT 
                `wastage_and_repurposing_database`.`waste_management`.`totalwaste`
            FROM
                `wastage_and_repurposing_database`.`waste_management`
            WHERE
                (`wastage_and_repurposing_database`.`waste_management`.`facilityid` = 1)))

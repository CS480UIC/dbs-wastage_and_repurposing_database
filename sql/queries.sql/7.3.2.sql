CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.3.2` AS
    SELECT 
        `county`.`countyname` AS `countyname`
    FROM
        `county`
    WHERE
        (`county`.`population` > (SELECT 
                `waste_management`.`totalwaste`
            FROM
                `waste_management`
            WHERE
                (`waste_management`.`facilityid` = 1)))
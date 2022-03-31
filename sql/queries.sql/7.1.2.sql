CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `7.1.2` AS
    SELECT 
        `waste_facility`.`address` AS `address`
    FROM
        `waste_facility`
    WHERE
        (`waste_facility`.`facilityid` <> 3)
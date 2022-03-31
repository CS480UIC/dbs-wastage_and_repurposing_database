use wastage_and_repurposing_database;


CREATE VIEW simple_queries AS
select countyid, totalwaste
from waste
order by totalwaste;

SELECT address FROM wastage_and_repurposing_database.waste_facility
WHERE  facilityid != 3;
use wastage_and_repurposing_database;


CREATE VIEW aggregate_queries AS
select SQRT(totalwaste)
from waste;

select LOWER(statename)
from state;


select countyid, totalwaste
from waste
group by countyid;

SELECT AVG(plastic) as plasticAVG,totalwaste FROM wastage_and_repurposing_database.waste
GROUP BY totalwaste;

SELECT countyname,stateid FROM county
GROUP BY countyname
HAVING AVG(population) > 15000;

SELECT CONCAT('Chill',statename) FROM state
WHERE stateid = 1;

SELECT DAY(dayrecorded) FROM waste_management
WHERE facilityid != 3;


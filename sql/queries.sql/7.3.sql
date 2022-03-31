use wastage_and_repurposing_database;

CREATE VIEW complex_queries AS
select countyname, totalwaste
from county
inner join waste;

SELECT countyname FROM wastage_and_repurposing_database.county
WHERE population > (SELECT totalwaste from waste_management
WHERE facilityid = 1);

SELECT countyname
FROM county c
WHERE EXISTS (SELECT facilityid FROM waste_facility wf WHERE wf.countyid = c.countyid);

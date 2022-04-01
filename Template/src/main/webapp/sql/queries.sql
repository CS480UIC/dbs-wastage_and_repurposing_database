use wastage_and_repurposing_database;

--7.1

select countyid, totalwaste
from waste
order by totalwaste;

SELECT address FROM wastage_and_repurposing_database.waste_facility
WHERE  facilityid != 3
order by address;

--7.2

select SQRT(totalwaste)
from waste;

select LOWER(statename)
from state;

select countyid, sum(totalwaste)
from waste
group by countyid;

SELECT AVG(plastic) as plasticAVG,totalwaste FROM wastage_and_repurposing_database.waste
GROUP BY totalwaste;

SELECT countyname,stateid FROM county
GROUP BY countyname
HAVING AVG(population) > 15000;

SELECT CONCAT('Chill',statename) FROM state
WHERE stateid = 1;

SELECT DAY(dayofsample) FROM waste_management
WHERE facilityid != 3;

--7.3

select county.countyname, waste.totalwaste
from county
left join waste
on county.countyid = waste.countyid;

SELECT countyname FROM wastage_and_repurposing_database.county
WHERE population > (SELECT totalwaste from waste_management
WHERE facilityid = 1);

SELECT countyname
FROM county c
WHERE EXISTS (SELECT facilityid FROM waste_facility wf WHERE wf.countyid = c.countyid);

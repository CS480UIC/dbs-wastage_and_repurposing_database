Starting with the state table, our only case of column dependancy exists with the field statename depending on the field stateid. 
Although the opportunity for redundancy to exist, it is not present in this table as we have assured that each state recieves its
own unique state name that no other state will posesss. So no stateid possesses the same name. Additionally, the number counties can
be the same without violating the terms of normalization.

Moving on to county, the primary key is county id which is depended upon by countyname. To combat redundancy, we've taken the same
course of action mentioned prior. Each county id recieves a unique countyname that is unique to that county id. Population can vary depending on the county.

Now to waste, all dependant variables in waste can be repeated without violating redundancy. The nature of a county could produce multiple entries a day that would
still need to be catalogued.

On to waste_facility, each variable depends on their key, cases may have two facilities sharing the same addres based on time of operation. Although they occupy the same
space, they operated during different times and would still need their metrics stored.

ending with waste_management, its similar to waste but it is needed because it serves as the distinction between waste that is created from the county and waste that is
actively being processed/managed by the facility.



![diagram](https://user-images.githubusercontent.com/77464979/161178963-a4588275-654b-4e45-994f-67d3a4901992.png)

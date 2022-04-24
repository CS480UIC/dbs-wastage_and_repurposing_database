package wastefacility.service;


import java.util.List;

import wastefacility.dao.WasteFacilityDao;
import wastefacility.domain.WasteFacility;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class CountyService {
	private WasteFacilityDao wastefacilityDao = new WasteFacilityDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(WasteFacility form) throws WasteFacilityException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		WasteFacility state = WasteFacilityDao.findByFacilityid(form.getFacilityid());
		if(state.getFacilityid() > 1 && state.getFacilityid() == form.getFacilityid()) throw new WasteFacilityException("This ID has been registered!");
		wastefacilityDao.add(form);
	}
	
	public List<Object> findAddresses() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return wastefacilityDao.findAddresses();
		
	}
	
}

package wastefacility.service;


import wastefacility.dao.WasteFacilityDao;
import wastefacility.domain.WasteFacility;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class WasteFacilityService {
	private WasteFacilityDao entity1Dao = new WasteFacilityDao();
	
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
		entity1Dao.add(form);
	}
	
}

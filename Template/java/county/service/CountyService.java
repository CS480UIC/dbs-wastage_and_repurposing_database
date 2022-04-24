package county.service;


import java.util.List;

import county.dao.CountyDao;
import county.domain.County;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class CountyService {
	private CountyDao countyDao = new CountyDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(County form) throws CountyException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		County entity1 = CountyDao.findBycountyid(form.getCountyid());
		if(entity1.getCountyid()!=null && entity1.getCountyid() == form.getCountyid()) throw new CountyException("This user name has been registered!");
		countyDao.add(form);
	}
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws UserException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public List<Object> findnameandtotal() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return countyDao.findnameandtotal();
		
	}
	
	public List<Object> findcountywithfacility() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return countyDao.findcountywithfacility();
		
	}
	
	
	
	public List<Object> findlowpop() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return countyDao.findlowpop();
		
	}
}

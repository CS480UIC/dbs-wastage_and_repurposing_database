package wastemanagement.service;


import wastemanagement.dao.WasteManagementDao;
import wastemanagement.domain.WasteManagement;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class WasteManagementService {
	private WasteManagementDao entity1Dao = new WasteManagementDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(WasteManagement form) throws WasteManagementException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		WasteManagement wastemanagement = WasteManagementDao.findByManagementid(form.getManagementid());
		if(wastemanagement.getManagementid() > 1 && wastemanagement.getManagementid() == form.getManagementid()) throw new WasteManagementException("This ID name has been registered!");
		entity1Dao.add(form);
	}
	
}

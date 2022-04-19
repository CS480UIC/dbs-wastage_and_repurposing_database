package waste.service;


import waste.dao.WasteDao;
import waste.domain.Waste;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class WasteService {
	private WasteDao wasteDao = new WasteDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Waste form) throws WasteException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		Waste entity1 = wasteDao.findBywasteid(form.getwasteid());
		if(entity1.getwasteid() != null && entity1.getwasteid() == form.getwasteid()) throw new WasteException("This waste has been registered!");
		wasteDao.add(form);
	}

}

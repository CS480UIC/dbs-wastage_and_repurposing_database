package waste.service;


import java.text.ParseException;
import java.util.List;

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
		Waste waste = wasteDao.findBywasteid(form.getwasteid());
		if(waste.getwasteid() != null && waste.getwasteid() == form.getwasteid()) throw new WasteException("This waste has been registered!");
		wasteDao.add(form);
	}
	public List<Object> findidandtotal() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return wasteDao.findidandtotal();
	}
	public List<Object> findidandsumtotal() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return wasteDao.findidandsumtotal();
	}
}

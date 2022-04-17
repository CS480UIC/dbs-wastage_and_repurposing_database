package state.service;


import state.dao.StateDao;
import state.domain.State;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class StateService {
	private StateDao entity1Dao = new StateDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(State form) throws StateException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		State state = StateDao.findByStateid(form.getStateid());
		if(state.getStateid() > 1 && state.getStateid() == form.getStateid()) throw new StateException("This user name has been registered!");
		entity1Dao.add(form);
	}
	
}

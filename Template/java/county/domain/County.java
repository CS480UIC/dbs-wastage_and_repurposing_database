package county.domain;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class County {
	/*
	 * Correspond to the user table
	 */
	
	private Integer countyid;
	private Integer stateid; 
	private String countyname;
	private Integer population;
	/**
	 * @return the countyid
	 */
	public Integer getCountyid() {
		return countyid;
	}



	/**
	 * @param countyid the countyid to set
	 */
	public void setCountyid(Integer countyid) {
		this.countyid = countyid;
	}



	/**
	 * @return the stateid
	 */
	public Integer getStateid() {
		return stateid;
	}



	/**
	 * @param stateid the stateid to set
	 */
	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}



	/**
	 * @return the countyname
	 */
	public String getCountyname() {
		return countyname;
	}



	/**
	 * @param countyname the countyname to set
	 */
	public void setCountyname(String countyname) {
		this.countyname = countyname;
	}



	/**
	 * @return the population
	 */
	public Integer getPopulation() {
		return population;
	}



	/**
	 * @param population the population to set
	 */
	public void setPopulation(Integer population) {
		this.population = population;
	}



	

	@Override
	public String toString() {
		return "County [ countyid=" + countyid + ", stateid="
				+ stateid + ", countyname=" + countyname + ", population=" + population +"]";
	}
}

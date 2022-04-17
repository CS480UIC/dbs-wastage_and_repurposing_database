package state.domain;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class State {
	/*
	 * Correspond to the user table
	 */
	private int stateid;
	private String statename;
	private int numberofcounties;
	
	
	public int getStateid() {
		return stateid;
	}

	public void setStateid(int stateid) {
		this.stateid = stateid;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public int getNumberofcounties() {
		return numberofcounties;
	}

	public void setNumberofcounties(int numberofcounties) {
		this.numberofcounties = numberofcounties;
	}

	@Override
	public String toString() {
		return "State [ stateid=" + stateid + ", statename="
				+ statename + ", numberofcounties=" + numberofcounties +"]";
	}
}

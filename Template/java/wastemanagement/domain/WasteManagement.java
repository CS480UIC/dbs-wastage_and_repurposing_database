package wastemanagement.domain;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class WasteManagement {
	/*
	 * Correspond to the user table
	 */
	private int managementid;
	private int facilityid;
	private int totalwaste;
	private String dayofsample;
	private int organic;
	private int metal;
	private int plastic;
	private int paper;
	private int glass;
	
	
	
	public int getManagementid() {
		return managementid;
	}

	public void setManagementid(int managementid) {
		this.managementid = managementid;
	}
	
	public int getFacilityid() {
		return facilityid;
	}

	public void setFacilityid(int facilityid) {
		this.facilityid = facilityid;
	}
	
	public int getTotalwaste() {
		return totalwaste;
	}

	public void setTotalwaste(int totalwaste) {
		this.totalwaste = totalwaste;
	}

	public String getDayofsample() {
		return dayofsample;
	}

	public void setDayofsample(String dayofsample) {
		this.dayofsample = dayofsample;
	}

	public int getOrganic() {
		return organic;
	}

	public void setOrganic(int organic) {
		this.organic = organic;
	}
	
	public int getMetal() {
		return metal;
	}

	public void setMetal(int metal) {
		this.metal = metal;
	}
	
	public int getPlastic() {
		return plastic;
	}

	public void setPlastic(int plastic) {
		this.plastic = plastic;
	}
	
	public int getPaper() {
		return paper;
	}

	public void setPaper(int paper) {
		this.paper = paper;
	}
	
	public int getGlass() {
		return glass;
	}

	public void setGlass(int glass) {
		this.glass = glass;
	}

	@Override
	public String toString() {
		return "State [ managementid=" + managementid + ", facilityid="
				+ facilityid + ", totalwaste=" + totalwaste + ", dayofsample=" + dayofsample +  ", organic=" + organic +
				 ", metal=" + metal + ", plastic=" + plastic + ", paper=" + paper + ", glass=" + glass +"]";
	}
}

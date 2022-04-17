package wastefacility.domain;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class WasteFacility {
	/*
	 * Correspond to the user table
	 */
	private int facilityid;
	private int countyid;
	private String address;
	private int recycleordump;
	
	public int getFacilityid() {
		return facilityid;
	}

	public void setFacilityid(int facilityid) {
		this.facilityid = facilityid;
	}
	
	public int getCountyid() {
		return countyid;
	}

	public void setCountyid(int countyid) {
		this.countyid = countyid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRecycleordump() {
		return recycleordump;
	}

	public void setRecycleordump(int recycleordump) {
		this.recycleordump = recycleordump;
	}

	@Override
	public String toString() {
		return "WasteFacility [ facilityid=" + facilityid + ", countyid="
				+ countyid + ", address=" + address + ", recycleordump=" + recycleordump +"]";
	}
}

package waste.domain;

import java.util.Date;

/**
 * Waste object
 * 
 * @author Aayush Makharia
 * 
 */
public class Waste {
	/*
	 * Correspond to the user table
	 */
	
	private Integer wasteid;
	private Integer countyid; 
	private Integer totalwaste;
	private Date dayofsample;
	private int organic;
	private int plastic;
	private int metal;
	private int glass;
	private int paper;
	
	
	public Integer getwasteid() {
		return wasteid;
	}

	public void setwasteid(int wasteID) {
		this.wasteid = wasteID;
	}
	
	public int getcountyid() {
		return countyid;
	}

	public void setcountyid(int countyID) {
		this.countyid = countyID;
	}
	
	public int gettotalwaste() {
		return totalwaste;
	}

	public void settotalwaste(int total) {
		this.totalwaste = total;
	}

	public Date getdayofsample() {
		return dayofsample;
	}

	public void setdayofsample(Date sampleDay) {
		this.dayofsample = sampleDay;
	}

	public int getorganic() {
		return organic;
	}

	public void setorganic(int o) {
		this.organic = o;
	}

	public int getplastic() {
		return plastic;
	}

	public void setplastic(int p) {
		this.plastic = p;
	}
	
	public int getmetal() {
		return metal;
	}

	public void setmetal(int m) {
		this.metal = m;
	}
	
	public int getglass() {
		return glass;
	}

	public void setglass(int g) {
		this.glass = g;
	}
	
	public int getpaper() {
		return paper;
	}

	public void setpaper(int p) {
		this.paper = p;
	}
	
	
	
	
	

	@Override
	public String toString() {
		return "waste [ wasteid=" + wasteid + ", countyid="
				+ countyid + ", totalwaste=" + totalwaste + ", dayofsample=" + dayofsample + ", organic="+ organic + ", plastic=" + plastic + ", metal=" + metal + ", glass=" + glass + ", paper=" + paper + "]";
	}
}

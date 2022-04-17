package wastemanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import wastemanagement.domain.WasteManagement;

/**
 * DDL functions performed in database
 */
public class WasteManagementDao {

	public static WasteManagement findByManagementid(int managementid) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		WasteManagement wastemanagement = new WasteManagement();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
		    String sql = "select * from waste_management where managementid=?";
		    
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, managementid);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	
		    	int management_id = resultSet.getInt("managementid");
		    	if(management_id == managementid){
		    		wastemanagement.setManagementid(resultSet.getInt("managementid"));
		    		wastemanagement.setFacilityid(resultSet.getInt("facilityid"));
		    		wastemanagement.setTotalwaste(resultSet.getInt("totalwaste"));
		    		wastemanagement.setDayofsample(resultSet.getString("dayofsample"));
		    		wastemanagement.setOrganic(resultSet.getInt("organic"));
		    		wastemanagement.setMetal(resultSet.getInt("metal"));
		    		wastemanagement.setPlastic(resultSet.getInt("plastic"));
		    		wastemanagement.setPaper(resultSet.getInt("paper"));
		    		wastemanagement.setGlass(resultSet.getInt("glass"));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return wastemanagement;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(WasteManagement form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "insert into waste_management values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getManagementid());
		    preparestatement.setInt(2,form.getFacilityid());
		    preparestatement.setInt(3,form.getTotalwaste());
		    preparestatement.setString(4,form.getDayofsample());
		    preparestatement.setInt(5,form.getOrganic());
		    preparestatement.setInt(6,form.getMetal());
		    preparestatement.setInt(7,form.getPlastic());
		    preparestatement.setInt(8,form.getPaper());
		    preparestatement.setInt(9,form.getGlass());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(WasteManagement form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "UPDATE waste_management SET facilityid = ?, totalwaste = ?, dayofsample = ?, organic = ?, metal = ?, plastic = ?, paper = ?, glass = ? where managementid = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getFacilityid());
		    preparestatement.setInt(2,form.getTotalwaste());
		    preparestatement.setString(3,form.getDayofsample());
		    preparestatement.setInt(4,form.getOrganic());
		    preparestatement.setInt(5,form.getMetal());
		    preparestatement.setInt(6,form.getPlastic());
		    preparestatement.setInt(7,form.getPaper());
		    preparestatement.setInt(8,form.getGlass());
		    preparestatement.setInt(9,form.getManagementid());
		    
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void delete(int managementid) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "delete from waste_management where managementid = ?";
			System.out.println(Integer.toString(managementid));
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,Integer.toString(managementid));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

package wastefacility.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import wastefacility.domain.wastefacilityTotal;

//import java.util.ArrayList;
//import java.util.List;

import wastefacility.domain.WasteFacility;

/**
 * DDL functions performed in database
 */
public class WasteFacilityDao {

	public static WasteFacility findByFacilityid(int facilityid) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		WasteFacility state = new WasteFacility();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
		    String sql = "select * from waste_facility where facilityid=?";
		    
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, facilityid);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	
		    	int facility_id = resultSet.getInt("facilityid");
		    	if(facility_id == facilityid){
		    		state.setFacilityid(resultSet.getInt("facilityid"));
		    		state.setCountyid(resultSet.getInt("countyid"));
		    		state.setAddress(resultSet.getString("address"));
		    		state.setRecycleordump(resultSet.getInt("recycleordump"));		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return state;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(WasteFacility form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "insert into waste_facility values(?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getFacilityid());
		    preparestatement.setInt(2,form.getCountyid());
		    preparestatement.setString(3,form.getAddress());
		    preparestatement.setInt(4,form.getRecycleordump());
		    
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(WasteFacility form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "UPDATE waste_facility SET countyid = ?, address = ?, recycleordump = ? where facilityid = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getCountyid());
		    preparestatement.setString(2,form.getAddress());
		    preparestatement.setInt(3,form.getRecycleordump());
		    preparestatement.setInt(4,form.getFacilityid());
		    
		    
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void delete(int facilityid) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "delete from waste_facility where facilityid = ?";
			System.out.println(Integer.toString(facilityid));
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,Integer.toString(facilityid));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Object> findAddresses() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			String sql = "SELECT facilityid, address FROM wastage_and_repurposing_database.waste_facility WHERE  facilityid != 3 order by address;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				wastefacilityTotal compQuery = new wastefacilityTotal();
				compQuery.setFacilityid(resultSet.getInt("facilityid"));
				compQuery.setAddress(resultSet.getString("address"));
	    		list.add(compQuery);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}

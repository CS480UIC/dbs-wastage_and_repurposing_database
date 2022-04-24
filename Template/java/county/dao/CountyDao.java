package county.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

import county.domain.County;
import county.domain.wastefacilityTotal;
import county.domain.countyfacilityTotal;
import county.domain.countyPop;
import user.domain.User;

/**
 * DDL functions performed in database
 */
public class CountyDao {

	public static County findBycountyid(int countyid) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		County entity1 = new County();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
		    String sql = "select * from county where countyid=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,countyid);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	int curcounty = Integer.parseInt(resultSet.getString("countyid"));
		    	if(curcounty == countyid){
		    		entity1.setCountyid(Integer.parseInt(resultSet.getString("countyid")));
		    		entity1.setStateid(Integer.parseInt(resultSet.getString("stateid")));
		    		entity1.setCountyname(resultSet.getString("countyname"));	
		    		entity1.setPopulation(Integer.parseInt(resultSet.getString("population")));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return entity1;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(County form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "insert into county values(?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getCountyid());
		    preparestatement.setInt(2,form.getStateid());
		    preparestatement.setString(3,form.getCountyname());
		    preparestatement.setInt(4,form.getPopulation());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(County form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "UPDATE county SET stateid = ?, countyname = ?, population = ? where countyid = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getStateid());
			preparestatement.setString(2,form.getCountyname());
		    preparestatement.setInt(3,form.getPopulation());
		    preparestatement.setInt(4, form.getCountyid());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void delete(String countyid) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "delete from county where countyid = ?";
			System.out.println(countyid);
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,Integer.parseInt(countyid));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Object> findnameandtotal() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			String sql = "select countyname, sum(totalwaste) as totalwaste from county join waste on county.countyid = waste.countyid group by countyname";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				wastefacilityTotal compQuery = new wastefacilityTotal();
				compQuery.setCountyname(resultSet.getString("countyname"));
				compQuery.setTotalwaste(Integer.parseInt(resultSet.getString("totalwaste")));
	    		list.add(compQuery);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public List<Object> findcountywithfacility() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			String sql = "SELECT countyname, count(facilityid) as facilities FROM county c inner join waste_facility wf on wf.countyid = c.countyid WHERE EXISTS (SELECT facilityid FROM waste_facility wf WHERE wf.countyid = c.countyid) group by countyname";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				countyfacilityTotal compQuery = new countyfacilityTotal();
				compQuery.setCountyname(resultSet.getString("countyname"));
				compQuery.setFacilities(Integer.parseInt(resultSet.getString("facilities")));
	    		list.add(compQuery);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	
	
	public List<Object> findlowpop() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			String sql = "SELECT countyname, stateid FROM county c where population < (SELECT AVG(population) FROM county) GROUP BY countyname;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				countyPop compQuery = new countyPop();
				compQuery.setCountyname(resultSet.getString("countyname"));
				compQuery.setStateid(Integer.parseInt(resultSet.getString("stateid")));
	    		list.add(compQuery);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}

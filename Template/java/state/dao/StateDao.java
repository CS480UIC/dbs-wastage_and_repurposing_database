package state.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import state.domain.State;

/**
 * DDL functions performed in database
 */
public class StateDao {

	public static State findByStateid(int stateid) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		State state = new State();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
		    String sql = "select * from state where stateid=?";
		    
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, stateid);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	
		    	int state_id = resultSet.getInt("stateid");
		    	if(state_id == stateid){
		    		state.setStateid(resultSet.getInt("stateid"));
		    		state.setStatename(resultSet.getString("statename"));
		    		state.setNumberofcounties(resultSet.getInt("numberofcounties"));		
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
	
	public void add(State form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "insert into state values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,Integer.toString(form.getStateid()));
		    preparestatement.setString(2,form.getStatename());
		    preparestatement.setString(3,Integer.toString(form.getNumberofcounties()));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(State form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "UPDATE state SET statename = ?, numberofcounties = ? where stateid = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getStatename());
			preparestatement.setInt(2,form.getNumberofcounties());
		    preparestatement.setInt(3,form.getStateid());
		    
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void delete(int stateid) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","Alex", "123456");
			
			String sql = "delete from state where stateid = ?";
			System.out.println(Integer.toString(stateid));
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,Integer.toString(stateid));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

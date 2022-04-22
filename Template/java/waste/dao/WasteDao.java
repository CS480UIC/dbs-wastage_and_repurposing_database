package waste.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import user.domain.User;

//import java.util.ArrayList;
//import java.util.List;

import waste.domain.Waste;

/**
 * DDL functions performed in database
 */
public class WasteDao {

	public static Waste findBywasteid(int wasteid) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Waste waste = new Waste();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","root", "Fr3eBuRdDd!@qQ");
		    String sql = "select * from waste where wasteid=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,wasteid);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	int curwasteid = Integer.parseInt(resultSet.getString("wasteid"));
		    	if(curwasteid == wasteid){
		    		waste.setwasteid(curwasteid);
		    		waste.setcountyid(Integer.parseInt(resultSet.getString("countyid")));
		    		waste.settotalwaste(Integer.parseInt(resultSet.getString("totalwaste")));
		    		waste.setdayofsample(java.sql.Date.valueOf(resultSet.getString("dayofsample")));
		    		waste.setorganic(Integer.parseInt(resultSet.getString("organic")));
		    		waste.setplastic(Integer.parseInt(resultSet.getString("plastic")));
		    		waste.setmetal(Integer.parseInt(resultSet.getString("metal")));
		    		waste.setglass(Integer.parseInt(resultSet.getString("glass")));
		    		waste.setpaper(Integer.parseInt(resultSet.getString("paper")));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return waste;
	}	
	
	/**
	 * insert waste
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public  void add(Waste form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","root", "Fr3eBuRdDd!@qQ");
			
			String sql = "insert into waste values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getwasteid());
		    preparestatement.setInt(2,form.getcountyid());
		    preparestatement.setInt(3,form.gettotalwaste());
		    preparestatement.setDate(4,(Date) form.getdayofsample());
		    preparestatement.setInt(5,form.getorganic());
		    preparestatement.setInt(6,form.getplastic());
		    preparestatement.setInt(7,form.getmetal());
		    preparestatement.setInt(8,form.getglass());
		    preparestatement.setInt(9,form.getpaper());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(Waste form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","root", "Fr3eBuRdDd!@qQ");
			
			String sql = "UPDATE waste SET countyid = ?, totalwaste = ?, dayofsample = ?, organic = ?, plastic = ?, metal = ?, glass = ?, paper = ? where wasteid = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getcountyid());
		    preparestatement.setInt(2,form.gettotalwaste());
		    preparestatement.setDate(3,(Date) form.getdayofsample());
		    preparestatement.setInt(4,form.getorganic());
		    preparestatement.setInt(5,form.getplastic());
		    preparestatement.setInt(6,form.getmetal());
		    preparestatement.setInt(7,form.getglass());
		    preparestatement.setInt(8,form.getpaper());
		    preparestatement.setInt(9,form.getwasteid());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void delete(String wasteid) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","root", "Fr3eBuRdDd!@qQ");
			
			String sql = "delete from waste where wasteid = ?";
			System.out.println(wasteid);
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,Integer.parseInt(wasteid));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Object> findidandtotal() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wastage_and_repurposing_database","root", "Fr3eBuRdDd!@qQ");
			String sql = "select countyid, totalwaste from waste order by totalwaste";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				Waste waste = new Waste();
				waste.setcountyid(Integer.parseInt(resultSet.getString("countyid")));
				waste.settotalwaste(Integer.parseInt(resultSet.getString("totalwaste")));
	    		list.add(waste);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}

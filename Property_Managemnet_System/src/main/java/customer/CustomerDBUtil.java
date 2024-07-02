package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil {
	
	//create database connection
	private static Connection con = null;
	private static Statement  stmt = null;
	private static ResultSet  rs = null;
	
	
	

	//create method for read data
	public static List<Customer> validate(String userName, String password){
	
	ArrayList<Customer> cus = new ArrayList<>();
	
	
	//validate
	try {
		
		con = DataBaseConnect.getConnection(); //database connect calling
		stmt = con.createStatement(); 
		String sql = "SELECT * FROM customer WHERE username ='"+userName+"' and password = '"+password+"'";
		rs = stmt.executeQuery(sql);
		
		if(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String phone = rs.getString(4);
			String userU = rs.getString(5);
			String passU = rs.getString(6);
			
			Customer c = new Customer(id,name,email,phone,userU,passU);
			cus.add(c);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return cus;
  }
	
	
	
	
	
	
	
	
	
	
	
	
	//create method for insert data
	public static boolean insertcustomer(String name,String email, String phone, String username, String password) {
		
		    boolean isSuccess = false;
		     
		   
		 	
		 	
		 	try {
		 		
		 		
		 		con = DataBaseConnect.getConnection(); //database connect calling
		 		stmt = con.createStatement();
				String sql = "insert into customer values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				}
				else {
					isSuccess = false;	
				}
					
		 	}catch(Exception e) {
		 		e.printStackTrace();
		 	}
		     return isSuccess;
		    
	 }
	
	
	
	
	
	
	
	
	//create method for update data
	public static boolean updatecustomer(String id, String name,String email, String phone, String username, String password) {
		
		    boolean isSuccess = false;
		    
		 	
		 	try {
		 		
		 		
		 		con = DataBaseConnect.getConnection(); //database connect calling
		 		stmt = con.createStatement();
				String sql = "update customer set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"+"where id='"+id+"'";
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				}
				else {
					isSuccess = false;	
				}
					
		 	}catch(Exception e) {
		 		e.printStackTrace();
		 	}
		     return isSuccess;
		    
	 }
	
	
	
	
	
	
	//create method for update data and rewrite	
	public static List<Customer> getCustomerDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);//convert integer to string
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		try {
	 		
	 		
	 		con = DataBaseConnect.getConnection(); //database connect calling
	 		stmt = con.createStatement();
			String sql = "select * from customer where id='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				Customer c = new Customer(id,name,email,phone,username,password);
				cus.add(c);
			}
				
	 	}catch(Exception e) {
	 		e.printStackTrace();
	 	}
		
		return cus;
		
	}
	
	
	
	
	
	
	
	
	//create method for delete data
	public static boolean deleteCustomer(String id) {
		
		
		boolean isSuccess = false;
		
		int convId = Integer.parseInt(id);
		
		try {
			
			con = DataBaseConnect.getConnection(); //database connect calling
	 		stmt = con.createStatement();
			String sql = "delete from customer where id='"+convId+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;	
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}
	
	
	
	
	
	
}
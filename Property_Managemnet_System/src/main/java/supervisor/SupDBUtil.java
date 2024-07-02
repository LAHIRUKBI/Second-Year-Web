package supervisor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import customer.DataBaseConnect;

public class SupDBUtil {
	
	
	
	
	
	
	
	
	
	//create database connection
		private static Connection con = null;
		private static Statement  stmt = null;
		private static ResultSet  rs = null;
		
		
		
		
		
		
		
		
		
		
		
		
	//data read
	public static List<Supervisor> validate(String branch, String userName, String password){
		
		ArrayList<Supervisor> sup = new ArrayList<>();
		
		//validate
				try {
					
					con = DataBaseConnect.getConnection(); //database connect calling
					stmt = con.createStatement();
					String sql = "select * from supervisor where branch='"+branch+"' and username='"+userName+"' and password='"+password+"' ";	
					rs = stmt.executeQuery(sql);
					
					if(rs.next()) {
						
						int id = rs.getInt(1);
						String name = rs.getString(2);
						String email = rs.getString(3);
						String phone = rs.getString(4);                 
			            String Branch = rs.getString(5);
						String userU = rs.getString(6);
						String passU = rs.getString(7);
						
						Supervisor s = new Supervisor(id,name,email,phone,Branch,userU,passU);
						sup.add(s);
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				
				return sup;
				
			}
		

	
	
	
	
	
	
	//data insert
	public static boolean insertsupervisor(String name, String email, String phone, String branch, String username, String password) {
		
	    boolean isSuccess = false;
	    

	 	try {
	 		
	 		con = DataBaseConnect.getConnection(); //database connect calling
	 		stmt = con.createStatement();
			String sql = "insert into supervisor values (0,'"+name+"','"+email+"','"+phone+"','"+branch+"','"+username+"','"+password+"')";
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
	
	
	
	
	
	
	
	
	//data update
	public static boolean updatesupervisor(String id, String name,String email, String phone, String branch, String username, String password) {
		
	    boolean isSuccess = false;
	    
	 	
	 	try {
	 		
	 		
	 		con = DataBaseConnect.getConnection(); //database connect calling
	 		stmt = con.createStatement();
			String sql = "update supervisor set name='"+name+"',email='"+email+"',phone='"+phone+"',branch='"+branch+"',username='"+username+"',password='"+password+"'"+"where id='"+id+"'";
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
      public static List<Supervisor> getSupervisorDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);//convert integer to string
		
		ArrayList<Supervisor> sup = new ArrayList<>();
		
		try {
	 		
	 		
	 		con = DataBaseConnect.getConnection(); //database connect calling
	 		stmt = con.createStatement();
			String sql = "select * from supervisor where id='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String branch = rs.getString(5);
				String username = rs.getString(6);
				String password = rs.getString(7);
				
				Supervisor s = new Supervisor(id,name,email,phone,branch,username,password);
				sup.add(s);
			}
				
	 	}catch(Exception e) {
	 		e.printStackTrace();
	 	}
		
		
		
		return sup;
		
	}	
      
      
      
      
     
      
    //create method for delete data
  	public static boolean deleteSupervisor(String id) {
  		
  		
  		boolean isSuccess = false;
  		
  		int convId = Integer.parseInt(id);
  		
  		try {
  			
  			con = DataBaseConnect.getConnection(); //database connect calling
  	 		stmt = con.createStatement();
  			String sql = "delete from supervisor where id='"+convId+"'";
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
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
//-------------------------------------------------------------------------------------------------------
  	
    //customer data read by supervisor
	public static List<Customer> getcustomerdetails(){
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		        //validate
				try {
					
					con = DataBaseConnect.getConnection(); //database connect calling
					
					
					stmt = con.createStatement();
					String sql = "select * from customer";
					rs = stmt.executeQuery(sql);
					
					while(rs.next()) {
						
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
		
	
	
	
	
	//customer data delete by supervisor
	public static boolean deleteCustomer(String id) {
		
		boolean isSuccess=false;
		
		int convId=Integer.parseInt(id);
		
		try {
			
			con=DataBaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from customer where id='"+convId+"'";
            int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;	
			}
			
		}catch(Exception e ) {
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
	
	
	
	
	
	
  	
  	
  	
  	
  	
  
	
	
	
	

	
	
	
	
	
	
	
	
  	
   	
    
    
    
}


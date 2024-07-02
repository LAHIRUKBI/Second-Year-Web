package seller;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import java.sql.Connection;

public class sellerDButi {
	
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean  validate(String username, String password)
	
	
	{
		boolean isSuccess = false;
		
		
		try {
			 
			 	con = DBconnect.getConnection();
			 	stmt = con.createStatement();
			 	
			 	String sql = "select * from seller where username='"+username+"' and password='"+password+"'";
			 	rs = stmt.executeQuery(sql);
			 	
			 	
			 	if (rs.next()) {
			 		
			 		isSuccess = true;
			 	}
			 	else {
			 		
			 		isSuccess =false;
			 				 		
			 	}
		}
		
		catch(Exception e ) {
			
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	public static List<seller> getseller(String username) {

	    ArrayList<seller> se = new ArrayList<>();
	    try {
	        con = DBconnect.getConnection();
	        stmt = con.createStatement();

	        String sql = "select * from seller where username ='" + username + "'"; // Use "seller" table here
	        rs = stmt.executeQuery(sql);

	        while (rs.next()) {

	            int id = rs.getInt(1);
	            String name = rs.getString(2);
	            String email = rs.getString(3);
	            String phone = rs.getString(4);
	            String uname = rs.getString(5);
	            String upass = rs.getString(6);

	            seller s = new seller(id, name, email, phone, uname, upass);
	            se.add(s);

	        }

	    } catch (Exception e) {

	    }

	    return se;
	}
	
	public static boolean updateseller (String id, String name, String email, String phone, String username, String password) {
		
		
		boolean isSuccess = false;
		
		try {
				con = DBconnect.getConnection();
				stmt = con.createStatement();
				String sql = "update seller set name = '"+name+"', email = '"+email+"', phone = '"+phone+"', username = '"+username+"'" +
				"where sid = '"+id+"'";
				
				int rs = stmt.executeUpdate(sql);
				
				if (rs > 0)
				{
					isSuccess =true;
				}
				
				else {
					
					isSuccess = false;
				}
				
		}
		catch (Exception e )
		{
			e.printStackTrace();
		}
		return isSuccess;
	}

	
	
	public static boolean delectseller (String id) {
		
		
		boolean isSuccess = true;
	int conId = Integer.parseInt(id.trim());
		
	try { 
			
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			
			String sql ="delete from seller where sid = '"+conId+"'";
			int r = stmt.executeUpdate(sql);
			
				if (r > 0)
				{
					isSuccess = true;
					
				}
				
				else {
					isSuccess = false;
				}		
	}
	
	catch (Exception e)
	{
		e.printStackTrace();
	}
	
	return isSuccess;
	}
	
	
	
	public static boolean insert_property(String title,String type, String location, String description, String owner_name, String owner_phone,String price,double totalcost,String states,double discount) {
		
		boolean isSuccess =false;
		
		try {
			

		 	con = DBconnect.getConnection();
		 	stmt = con.createStatement();
		 	
		 	String sql = "insert into property_details values (0,'"+title+"', '"+type+"','"+location+"','"+description+"','"+owner_name+"','"+owner_phone+"','"+price+"','"+totalcost+"','"+states+"','"+discount+"')";
			int rs = stmt.executeUpdate(sql);
			
			
			
			if ( rs > 0 ) {
				isSuccess = true;
			}
			
			else
				
				isSuccess = false;
				
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
			
		return isSuccess;
	}
	
	
	
	
public static  List <Property> getpropertydetails (String id)
	
	{
			int convertedPID = Integer.parseInt(id.trim());
			
			
			
		ArrayList<Property> pd = new ArrayList<>();
		
		try {
				
			con =DBconnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from property_details";
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				
				int pID = rs.getInt(1);
				String title = rs.getString(2);
				String type = rs.getString(3);
				String location = rs.getString(4);
				String description = rs.getString(5);
				String owner_name = rs.getString(6);	
				String owner_phone = rs.getString(7);
				double price  = rs.getDouble(8);
				double totalcost = rs.getDouble(9);
				String states = rs.getString(10);
				double discount = rs.getDouble(11);
				
				Property p  = new Property (pID,title,type,location,description,owner_name,owner_phone,price,totalcost,states,discount);
				pd.add(p);
												
			}
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
		return pd;
	}

public static  List <Property>get_all_advertistment ( String name,String phone )
{
	
	
	ArrayList<Property> apd = new ArrayList<>();
	
	try {
		
	
	con =DBconnect.getConnection();
	stmt = con.createStatement();
	
	String sql = "select * from property_details where owner_name = '" + name + "' and owner_phone = '" + phone + "'";

	rs = stmt.executeQuery(sql);
	
	while (rs.next()) {
		
		
		
		int pID = rs.getInt(1);
		String title = rs.getString(2);
		String type = rs.getString(3);
		String location = rs.getString(4);
		String description = rs.getString(5);
		String owner_name = rs.getString(6);	
		String owner_phone = rs.getString(7);
		double price  = rs.getDouble(8);
		double totalcost = rs.getDouble(9);
		String states = rs.getString(10);
		double discount = rs.getDouble(11);
		
		Property ap  = new Property  (pID,title,type,location,description,owner_name,owner_phone,price,totalcost,states,discount);
		apd.add(ap);
		
	}
}
	catch (Exception e)
	{
		e.printStackTrace();
		
	}
	
	return apd;
	}








public static boolean updateadvertistment (String pid,String title,String type, String location, String description, String owner_name, String owner_phone,String price,double totalcost,String states,double discount) {
	
	int convertedpid = Integer.parseInt(pid.trim());
	boolean isSuccess = false;
	
	try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "update property_details set title = '"+title+"', type = '"+type+"', location = '"+location+"', description = '"+description+"' , owner_name = '"+owner_name+"', owner_phone = '"+owner_phone+"', price = '"+price+"', totalcost = '"+totalcost+"', states = '"+states+"', discount = '"+discount+"'" +
			"where pid = '"+convertedpid+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if (rs > 0)
			{
				isSuccess =true;
			}
			
			else {
				
				isSuccess = false;
			}
			
	}
	catch (Exception e )
	{
		e.printStackTrace();
	}
	return isSuccess;
}



public static boolean delectAdvertistment (String pid) {
	
	
	boolean isSuccess = true;
int conId = Integer.parseInt(pid.trim());
	
try { 
		
		con = DBconnect.getConnection();
		stmt = con.createStatement();
		
		String sql ="delete from property_details where pid = '"+conId+"'";
		int r = stmt.executeUpdate(sql);
		
			if (r > 0)
			{
				isSuccess = true;
				
			}
			
			else {
				isSuccess = false;
			}		
}

catch (Exception e)
{
	e.printStackTrace();
}

return isSuccess;
}

}







	
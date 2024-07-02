package admin;


import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import java.sql.Connection;

public class adminDButi {
	
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean  validate(String username, String password)
	
	
	{
		boolean isSuccess = false;
		
		
		try {
			 
			 	con = DBconnect.getConnection();
			 	stmt = con.createStatement();
			 	
			 	String sql = "select * from admin where username='"+username+"' and password='"+password+"'";
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
	
	public static List<admin> getadmin(String username){
		

		ArrayList<admin> ad = new ArrayList<>();
		try
		{
			con= DBconnect.getConnection();
			stmt = con.createStatement();
			
		 	String sql = "select * from admin where username='"+username+"'";
		 	rs = stmt.executeQuery(sql);
		 	
		 	while (rs.next()) {
		 		
		 		int id = rs.getInt(1);
		 		String name = rs.getString(2);
		 		String email = rs.getString(3);
		 		String phone = rs.getString(4);
		 		String uname = rs.getString(5);
		 		String upass = rs.getString(6);
		 		
		 		
		 		admin a = new admin(id,name,email,phone,uname,upass);
		 		ad .add(a);
		 				 		
		 	}
		 	
			
		} catch (Exception e) {
			
			
		}
		
		return ad;
	}
	
	public static boolean insert_property(String title,String type, String location, String description, String owner_name, String owner_phone,String price,double totalcost,double discount,String states) {
		
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
	
	
	
		
	public static boolean updateadmin (String id, String name, String email, String phone, String username, String password) {
		
				
		boolean isSuccess = false;
		
		try {
				con = DBconnect.getConnection();
				stmt = con.createStatement();
				String sql = "update admin set name = '"+name+"', email = '"+email+"', phone = '"+phone+"', username = '"+username+"', password = '"+password+"'" +
				"where idAdmin = '"+id+"'";
				
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
	
	public static List <admin> getadmindetails (String id)
	
	{
			int convertedID = Integer.parseInt(id.trim());
			
		ArrayList<admin> ad = new ArrayList<>();
		
		try {
				
			con =DBconnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from admin where idadmin = '"+convertedID+"'";
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int Id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				admin a = new admin(Id,name,email,phone,username,password);
				ad.add(a);
								
			}
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
		return ad;
	}
	
	public static boolean delectAdmin (String id) {
		
	
		boolean isSuccess = true;
	int conId = Integer.parseInt(id.trim());
		
	try { 
			
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			
			String sql ="delete from admin where idAdmin = '"+conId+"'";
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
	
	
	
	public static boolean addAapprove_property (String id , String title,String type, String location, String description, String owner_name, String owner_phone,String price,String totalcost,String status,String discount) {
		
		
		boolean isSuccess = false;
		int convertedPID = Integer.parseInt(id.trim());
		double convertedPrice = Double.parseDouble(price.trim());
		double convertedtotlcost = Double.parseDouble(totalcost.trim());
		double converteddiscount = Double.parseDouble(discount.trim());
		
		
	
		
		try {
				con = DBconnect.getConnection();
				stmt = con.createStatement();
				
				String sql1 = "update property_details set states = '"+status+"'" +
				"where pid = '"+convertedPID+"'";
				
				String sql2 = "insert into approved_property values ( '"+convertedPID+"','"+title+"', '"+type+"','"+location+"','"+description+"','"+owner_name+"','"+convertedPrice+"','"+status+"' ,  '"+converteddiscount+"', '"+convertedtotlcost+"','"+owner_phone+"')";

				
				int rs1 = stmt.executeUpdate(sql1);
				int rs2 = stmt.executeUpdate(sql2);
			
				
				
				if (rs1 > 0 && rs2 > 0 )
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
	
	
	
	
	
	
	public static boolean addDisAapprove_property (String id , String title,String type, String location, String description, String owner_name, String owner_phone,String price,String totalcost,String status,String discount) {
		
		
		int convertedPID = Integer.parseInt(id.trim());
		double convertedPrice = Double.parseDouble(price.trim());
		double convertedtotlcost = Double.parseDouble(totalcost.trim());
		double converteddiscount = Double.parseDouble(discount.trim());

			boolean isSuccess = false;

		try {
				con = DBconnect.getConnection();
				stmt = con.createStatement();
				
				String sql1 = "update property_details set states = '"+status+"'" +
				"where pid ='"+convertedPID+"'";
				
				
				String sql2 = "insert into disapproved_property values ( '"+convertedPID+"','"+title+"', '"+type+"','"+location+"','"+description+"','"+owner_name+"','"+convertedPrice+"','"+status+"' ,  '"+converteddiscount+"', '"+convertedtotlcost+"','"+owner_phone+"')";
				
			
				int rs1 = stmt.executeUpdate(sql1);
				int rs2 = stmt.executeUpdate(sql2);
				
				
				
				if (rs1 > 0 && rs2 > 0 )
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
	
	
	public static  List <Property>get_approved_propertydetails (String id)
	{
		int convertedPID = Integer.parseInt(id.trim());
		
		ArrayList<Property> apd = new ArrayList<>();
		
		try {
			
		
		con =DBconnect.getConnection();
		stmt = con.createStatement();
		
		String sql = "select * from approved_property where pid = '"+convertedPID+"'";
		
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
			
			String states = rs.getString(9);
			double discount = rs.getDouble(10);
			double totalcost = rs.getDouble(11);
			
			
			Property ap  = new Property (pID,title,type,location,description,owner_name,owner_phone,price,totalcost,states,discount);
			apd.add(ap);
			
		}
	}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
		return apd;
		}
	
	
	
	
	public static  List <Property>get_all_approved_propertydetails ()
	{
		
		
		ArrayList<Property> apd = new ArrayList<>();
		
		try {
			
		
		con =DBconnect.getConnection();
		stmt = con.createStatement();
		
		String sql = "select * from approved_property";
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			
			
			int pID = rs.getInt(1);
			String title = rs.getString(2);
			String type = rs.getString(3);
			String location = rs.getString(4);
			String description = rs.getString(5);
			String owner_name = rs.getString(6);	
		
			double price  = rs.getDouble(7);
			
			String states = rs.getString(8);
			double discount = rs.getDouble(9);
			double totalcost = rs.getDouble(10);
			String owner_phone = rs.getString(11);
			
			Property ap  = new Property (pID,title,type,location,description,owner_name,owner_phone,price,totalcost,states,discount);
			apd.add(ap);
			
		}
	}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
		return apd;
		}
	
	
	

	public static   List <Property>get_disapproved_propertydetails (String id)
	{
		int convertedPID = Integer.parseInt(id.trim());
		
		ArrayList<Property> dpd = new ArrayList<>();
		
		try {
			
		
		con =DBconnect.getConnection();
		stmt = con.createStatement();
		
		String sql = "select * from disapproved_property where pid = '"+ convertedPID+"'";
		
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			
			
			int pID = rs.getInt(1);
			String title = rs.getString(2);
			String type = rs.getString(3);
			String location = rs.getString(4);
			String description = rs.getString(5);
			String owner_name = rs.getString(6);	
			
			double price  = rs.getDouble(7);		
			String states = rs.getString(8);
			double discount = rs.getDouble(9);
			double totalcost = rs.getDouble(10);
			String owner_phone = rs.getString(11);
			
			Property dp  = new Property (pID,title,type,location,description,owner_name,owner_phone,price,totalcost,states,discount);
			dpd.add(dp);
			
		}
	}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
		return dpd;
		}
	
	
	
	public static  List <Property>get_all_disapproved_propertydetails ()
	{
		
		
		ArrayList<Property> dpd = new ArrayList<>();
		
		try {
			
		
		con =DBconnect.getConnection();
		stmt = con.createStatement();
		
		String sql = "select * from disapproved_property";
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			
			
			int pID = rs.getInt(1);
			String title = rs.getString(2);
			String type = rs.getString(3);
			String location = rs.getString(4);
			String description = rs.getString(5);
			String owner_name = rs.getString(6);	
		
			double price  = rs.getDouble(7);
			
			String states = rs.getString(8);
			double discount = rs.getDouble(9);
			double totalcost = rs.getDouble(10);
			String owner_phone = rs.getString(11);
			
			Property ap  = new Property (pID,title,type,location,description,owner_name,owner_phone,price,totalcost,states,discount);
			dpd.add(ap);
			
		}
	}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
		return dpd;
		}
	
	
	
	
	
	
	
	
public static  List <Property> getpropertydetails ()
	
	{
			
			
			
			
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
	}

	


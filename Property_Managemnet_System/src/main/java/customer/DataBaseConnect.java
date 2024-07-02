package customer;

import java.sql.Connection;
import java.sql.DriverManager;

//Data Base Connection for all pages
public class DataBaseConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/property";
	private static String userName = "root";
	private static String password = "lahiru";
	
	private static Connection con;
	
	//return connection
	public static Connection getConnection() {
		
		try {
			//create driver
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection(url, userName, password);
		
		
	    }catch(Exception e) {
		    System.out.println("Data Base Connection Faile");
	}
		
		return con;

}
	
}

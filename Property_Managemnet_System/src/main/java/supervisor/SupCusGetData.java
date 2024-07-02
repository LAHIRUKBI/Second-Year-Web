package supervisor;

import java.io.IOException;
import java.util.List;
import customer.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SupCusGetData")
public class SupCusGetData extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
         	 
         	List<Customer> cusDetails = SupDBUtil.getcustomerdetails();
       	    request.setAttribute("cusDetails", cusDetails);
         	 
         	 
          }catch(Exception e) {
         	 e.printStackTrace();
          }
          
          RequestDispatcher dis = request.getRequestDispatcher("SupCus.jsp");
          dis.forward(request, response);
  		
  	}
		
		
	}



package supervisor;
import customer.Customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SupCusDeleteServlet")
public class SupCusDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
         String id = request.getParameter("cusid");
		
		boolean isTrue;
		isTrue = SupDBUtil.deleteCustomer(id);
		
		if(isTrue == true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("SupCus.jsp");
			dispatcher.forward(request, response);
			
		}
		else {
			
			List<Customer> cusDetails = SupDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
		
		
		
		
		
	}

}

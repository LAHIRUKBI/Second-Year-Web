package admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class approve_property_servlet
 */
@WebServlet("/approve_property_servlet")
public class approve_property_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        
		
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String type = request.getParameter("type");
		String location = request.getParameter("location");
		String description = request.getParameter("description");
		String owner_name = request.getParameter("owner");
		String owner_phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String price  = request.getParameter("price");
		String approved = request.getParameter("approve");
		String disapproved = request.getParameter("disapprove");	
		String totalcost = request.getParameter("totalcost");
		String discount = request.getParameter("discount");		
		String view_approve = request.getParameter("view_approve");
		String view_disapprove = request.getParameter( "view_disapprove");
        boolean isTrue;
        
      if ( view_approve != null)
    	  
    	  
    	  {  
			List <Property> apdetails= adminDButi.get_all_approved_propertydetails();
			request.setAttribute("apdetails", apdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_approved_property_details.jsp");
			dis.forward(request, response);
			
			
    	  }
			
			else if ( view_disapprove != null )
				
			{
				List <Property> dpdetails= adminDButi.get_all_disapproved_propertydetails();
				request.setAttribute("dpdetails", dpdetails);
				
				RequestDispatcher dis = request.getRequestDispatcher("admin_disapproved_property_details.jsp");
				dis.forward(request, response);
			}
      
      
    	  
			else if (approved!= null) {
				
		String status= "approve";	
		adminDButi.addAapprove_property (id, title, type, location, description, owner_name, owner_phone, price,totalcost,status,discount);
		
	
				adminDButi.delectAdvertistment (id);
				List <Property> pdetails= adminDButi.getpropertydetails();
				request.setAttribute("pdetails", pdetails);
				
				RequestDispatcher dis = request.getRequestDispatcher("admin_property_details.jsp");
				dis.forward(request, response);			
		
        }
        
        else if (disapproved!= null) 
        
        {
        	String status= "approve";
        	isTrue =  adminDButi.addDisAapprove_property  (id, title, type, location, description, owner_name, owner_phone, price,totalcost,status,discount);
        	
        	adminDButi.delectAdvertistment (id);
			List <Property> pdetails= adminDButi.getpropertydetails();
			request.setAttribute("pdetails", pdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_property_details.jsp");
			dis.forward(request, response);
				   	  		
	}

}
}

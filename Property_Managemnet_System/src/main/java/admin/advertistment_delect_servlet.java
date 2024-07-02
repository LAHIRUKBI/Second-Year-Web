package admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/advertistment_delect_servlet")
public class advertistment_delect_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter ("pid");
		String owner_name = request.getParameter("owner");
		String owner_phone = request.getParameter("phone");
		
		boolean isTrue;
		
		
		isTrue = adminDButi.delectAdvertistment(pid);
		
		
		if ( isTrue = true)
		{
	
			List <Property> pdetails= adminDButi.getpropertydetails();
			request.setAttribute("pdetails", pdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_property_details.jsp");
			dis.forward(request, response);
		
		}
		
		else
		{
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
			
		}
		
		
		
	}}
		
		
		
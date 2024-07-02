package supervisor;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SupLoginServlet")
public class SupLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String branch = request.getParameter("bran");
		String username = request.getParameter("uid");
        String password = request.getParameter("pass");
        
        
        try {
         	 List<Supervisor> supDetails = SupDBUtil.validate(branch, username, password);
         	 request.setAttribute("supDetails", supDetails);
         	
         	 
         	 
          }catch(Exception e) {
         	 e.printStackTrace();
          }
          
       
          RequestDispatcher dis = request.getRequestDispatcher("Supaccount.jsp");
          dis.forward(request, response);
  		
  	}
		
}
		
		


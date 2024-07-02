package supervisor;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SupDeleteServlet")
public class SupDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
        String id = request.getParameter("supid");
		
		boolean isTrue;
		isTrue = SupDBUtil.deleteSupervisor(id);
		
		if(isTrue == true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Supinsert.jsp");
			dispatcher.forward(request, response);
			
		}
		else {
			
			List<Supervisor> supDetails = SupDBUtil.getSupervisorDetails(id);
			request.setAttribute("supDetails", supDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
		
		
	}

}

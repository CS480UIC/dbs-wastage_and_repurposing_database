package wastefacility.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wastefacility.dao.WasteFacilityDao;
import wastefacility.domain.WasteFacility;


/**
 * Servlet implementation class UserServlet
 */

public class WasteFacilityServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WasteFacilityServletRead() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WasteFacility wastefacility = null;
		try {
			wastefacility = WasteFacilityDao.findByFacilityid(Integer.parseInt(request.getParameter("facilityid")));
			System.out.println(Integer.parseInt(request.getParameter("facilityid")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(wastefacility.getFacilityid() > 0){
					System.out.println(wastefacility);
					request.setAttribute("wastefacility", wastefacility);
					request.getRequestDispatcher("/jsps/wastefacility/wastefacility_read_output.jsp").forward(request, response);
				
			}
			else{
			request.setAttribute("msg", "Entity not found");
			request.getRequestDispatcher("/jsps/wastefacility/wastefacility_read_output.jsp").forward(request, response);
		}
	}
}




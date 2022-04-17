package wastemanagement.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wastemanagement.dao.WasteManagementDao;
import wastemanagement.domain.WasteManagement;


/**
 * Servlet implementation class UserServlet
 */

public class WasteManagementServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WasteManagementServletRead() {
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
		WasteManagement wastemanagement = null;
		try {
			wastemanagement = WasteManagementDao.findByManagementid(Integer.parseInt(request.getParameter("managementid")));
			System.out.println(Integer.parseInt(request.getParameter("managementid")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(wastemanagement.getManagementid() > 0){
					System.out.println(wastemanagement);
					request.setAttribute("wastemanagement", wastemanagement);
					request.getRequestDispatcher("/jsps/wastemanagement/wastemanagement_read_output.jsp").forward(request, response);
				
			}
			else{
			request.setAttribute("msg", "Entity not found");
			request.getRequestDispatcher("/jsps/wastemanagement/wastemanagement_read_output.jsp").forward(request, response);
		}
	}
}




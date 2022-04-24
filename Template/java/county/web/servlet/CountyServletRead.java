package county.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import county.dao.CountyDao;
import county.domain.County;
//import entity1.service.Entity1Service;


/**
 * Servlet implementation class UserServlet
 */

public class CountyServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountyServletRead() {
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
		County entity1 = null;
		CountyDao entity1Dao = new CountyDao();
		try {
			entity1 = CountyDao.findBycountyid(Integer.parseInt(request.getParameter("countyid")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getCountyid()!=null){
					System.out.println(entity1);
					request.setAttribute("County", entity1);
					request.getRequestDispatcher("/jsps/county/county_read_output.jsp").forward(request, response);
				
			}
			else{
			request.setAttribute("msg", "County not found");
			request.getRequestDispatcher("/jsps/county/county_read_output.jsp").forward(request, response);
		}
	}
}




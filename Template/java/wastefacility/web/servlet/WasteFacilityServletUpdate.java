package wastefacility.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wastefacility.dao.WasteFacilityDao;
import wastefacility.domain.WasteFacility;
//import entity1.service.Entity1Service;

/**
 * Servlet implementation class UserServlet
 */

public class WasteFacilityServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WasteFacilityServletUpdate() {
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

		String method = request.getParameter("method");
		WasteFacilityDao wastefacilitydao = new WasteFacilityDao();
		WasteFacility wastefacility = null;
		
		if(method.equals("search"))
		{
			try {
				wastefacility = WasteFacilityDao.findByFacilityid(Integer.parseInt(request.getParameter("facilityid")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
//			Entity1Service entity1service = new Entity1Service();		
			if(wastefacility.getFacilityid()>0){
				System.out.println("11");

						System.out.println(wastefacility);
						request.setAttribute("wastefacility", wastefacility);
						request.getRequestDispatcher("/jsps/wastefacility/wastefacility_update_output.jsp").forward(request, response);
					
				}
				else{
					
				request.setAttribute("msg", "Entity not found");
				request.getRequestDispatcher("/jsps/wastefacility/wastefacility_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			WasteFacility form = new WasteFacility();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				
				String[] values = paramMap.get(name);
				info.add(values[0]);
				System.out.println(name + ": " + Arrays.toString(values));
			}
			form.setCountyid(Integer.parseInt(info.get(2)));
			form.setAddress(info.get(3));
			form.setRecycleordump(Integer.parseInt(info.get(4)));
			form.setFacilityid(Integer.parseInt(request.getParameter("facilityid")));

			try {
				wastefacilitydao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Entity Updated");
			request.getRequestDispatcher("/jsps/wastefacility/wastefacility_read_output.jsp").forward(request, response);
		}
	}
}




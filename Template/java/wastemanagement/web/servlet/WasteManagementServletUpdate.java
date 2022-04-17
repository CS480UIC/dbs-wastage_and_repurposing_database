package wastemanagement.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wastemanagement.dao.WasteManagementDao;
import wastemanagement.domain.WasteManagement;
//import entity1.service.Entity1Service;

/**
 * Servlet implementation class UserServlet
 */

public class WasteManagementServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WasteManagementServletUpdate() {
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
		WasteManagementDao wastemanagementdao = new WasteManagementDao();
		WasteManagement wastemanagement = null;
		
		if(method.equals("search"))
		{
			try {
				wastemanagement = WasteManagementDao.findByManagementid(Integer.parseInt(request.getParameter("managementid")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
//			Entity1Service entity1service = new Entity1Service();		
			if(wastemanagement.getManagementid()>0){
				System.out.println("11");

						System.out.println(wastemanagement);
						request.setAttribute("wastemanagement", wastemanagement);
						request.getRequestDispatcher("/jsps/wastemanagement/wastemanagement_update_output.jsp").forward(request, response);
					
				}
				else{
					
				request.setAttribute("msg", "Entity not found");
				request.getRequestDispatcher("/jsps/wastemanagement/wastemanagement_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			WasteManagement form = new WasteManagement();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				
				String[] values = paramMap.get(name);
				info.add(values[0]);
				System.out.println(name + ": " + Arrays.toString(values));
			}
			form.setFacilityid(Integer.parseInt(info.get(2)));
			
			form.setTotalwaste(Integer.parseInt(info.get(3)));
			
			form.setDayofsample(info.get(4));
			
			form.setOrganic(Integer.parseInt(info.get(5)));
			form.setMetal(Integer.parseInt(info.get(6)));
			form.setPlastic(Integer.parseInt(info.get(7)));
			form.setPaper(Integer.parseInt(info.get(8)));
			form.setGlass(Integer.parseInt(info.get(9)));
			form.setManagementid(Integer.parseInt(request.getParameter("managementid")));

			try {
				wastemanagementdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Entity Updated");
			request.getRequestDispatcher("/jsps/wastemanagement/wastemanagement_read_output.jsp").forward(request, response);
		}
	}
}




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

import wastemanagement.domain.WasteManagement;
import wastemanagement.service.WasteManagementException;
import wastemanagement.service.WasteManagementService;


/**
 * Servlet implementation class UserServlet
 */

public class WasteManagementServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WasteManagementServletCreate() {
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
		WasteManagementService stateservice = new WasteManagementService();
		Map<String,String[]> paramMap = request.getParameterMap();
		WasteManagement form = new WasteManagement();
		List<String> info = new ArrayList<String>();
		System.out.println(form);
		
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			System.out.println(name + ": " + Arrays.toString(values));
			System.out.println(info.add(values[0]));

		}
//		System.out.println("1");
//		System.out.println(info);

		form.setManagementid(Integer.parseInt(info.get(1)));
		form.setFacilityid(Integer.parseInt(info.get(2)));
		
		form.setTotalwaste(Integer.parseInt(info.get(4)));
		
		form.setDayofsample(info.get(6));
		
		form.setOrganic(Integer.parseInt(info.get(8)));
		form.setMetal(Integer.parseInt(info.get(10)));
		form.setPlastic(Integer.parseInt(info.get(12)));
		form.setPaper(Integer.parseInt(info.get(14)));
		form.setGlass(Integer.parseInt(info.get(16)));
		
		
		try {
			System.out.println("3");
			stateservice.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | WasteManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}

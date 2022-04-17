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

import wastefacility.domain.WasteFacility;
import wastefacility.service.WasteFacilityException;
import wastefacility.service.WasteFacilityService;


/**
 * Servlet implementation class UserServlet
 */

public class WasteFacilityServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WasteFacilityServletCreate() {
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
		WasteFacilityService stateservice = new WasteFacilityService();
		Map<String,String[]> paramMap = request.getParameterMap();
		WasteFacility form = new WasteFacility();
		List<String> info = new ArrayList<String>();
		System.out.println(form);
		
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			System.out.println(name + ": " + Arrays.toString(values));
			System.out.println(info.add(values[0]));

		}
		System.out.println("1");
		System.out.println(info);

		form.setFacilityid(Integer.parseInt(info.get(1)));
//		System.out.println("1");
//		System.out.println(info.get(1));
		form.setCountyid(Integer.parseInt(info.get(3)));
		
		
		form.setAddress(info.get(5));
//		System.out.println("2");
//		System.out.println(info.get(2));
		
		
		form.setRecycleordump(Integer.parseInt(info.get(7)));		
//		System.out.println("3");
//		System.out.println(info.get(3));
		
		
		try {
			System.out.println("3");
			stateservice.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | WasteFacilityException e) {
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

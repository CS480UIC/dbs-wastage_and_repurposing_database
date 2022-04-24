package waste.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import waste.domain.Waste;
import waste.service.WasteException;
import waste.service.WasteService;


/**
 * Servlet implementation class UserServlet
 */

public class WasteServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WasteServletCreate() {
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
		WasteService entity1service = new WasteService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Waste form = new Waste();
		List<String> info = new ArrayList<String>();
		System.out.println(form);
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			//System.out.println(name + ": " + Arrays.toString(values));
			//System.out.println(info.add(values[0]));

		}
//		System.out.println("1");
//		System.out.println(info);
		System.out.println(info.get(0));
		System.out.println(info.get(1));
		System.out.println(info.get(2));
		System.out.println(info.get(3));
		System.out.println(info.get(4));
		System.out.println(info.get(5));
		System.out.println(info.get(6));
		System.out.println(info.get(7));
		System.out.println(info.get(8));
		form.setwasteid(Integer.parseInt(info.get(0)));

		form.setcountyid(Integer.parseInt(info.get(1)));
//		System.out.println("2");

		form.settotalwaste(Integer.parseInt(info.get(2)));		
//		System.out.println("3");
		form.setdayofsample(java.sql.Date.valueOf(info.get(3)));
		
		form.setorganic(Integer.parseInt(info.get(4)));
		
		form.setplastic(Integer.parseInt(info.get(5)));	
		
		form.setmetal(Integer.parseInt(info.get(6)));
		
		form.setglass(Integer.parseInt(info.get(7)));
		
		form.setpaper(Integer.parseInt(info.get(8)));
		
		try {
			System.out.println("3");
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | WasteException e) {
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

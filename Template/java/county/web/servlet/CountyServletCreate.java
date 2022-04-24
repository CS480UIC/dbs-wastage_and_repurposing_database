package county.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import county.domain.County;
import county.service.CountyException;
import county.service.CountyService;


/**
 * Servlet implementation class UserServlet
 */

public class CountyServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountyServletCreate() {
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
		CountyService entity1service = new CountyService();
		Map<String,String[]> paramMap = request.getParameterMap();
		County form = new County();
		List<String> info = new ArrayList<String>();
		//System.out.println(form);
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			//System.out.println(name + ": " + Arrays.toString(values));
			//System.out.println(info.add(values[0]));

		}

		form.setCountyid(Integer.parseInt(info.get(0)));
//		System.out.println("1");
		form.setStateid(Integer.parseInt(info.get(1)));
//		System.out.println("2");
		form.setCountyname(info.get(2));		
//		System.out.println("3");
		form.setPopulation(Integer.parseInt(info.get(3)));
		
		
		try {
			System.out.println("3");
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | CountyException e) {
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

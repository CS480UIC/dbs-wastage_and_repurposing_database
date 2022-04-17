package state.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import state.domain.State;
import state.service.StateException;
import state.service.StateService;


/**
 * Servlet implementation class UserServlet
 */

public class StateServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StateServletCreate() {
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
		StateService stateservice = new StateService();
		Map<String,String[]> paramMap = request.getParameterMap();
		State form = new State();
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

		form.setStateid(Integer.parseInt(info.get(1)));
//		System.out.println("1");
//		System.out.println(info.get(1));

		form.setStatename(info.get(2));
//		System.out.println("2");
//		System.out.println(info.get(2));
		
		
		form.setNumberofcounties(Integer.parseInt(info.get(4)));		
//		System.out.println("3");
//		System.out.println(info.get(3));
		
		
		try {
			System.out.println("3");
			stateservice.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | StateException e) {
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

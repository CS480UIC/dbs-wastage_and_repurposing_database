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

import waste.dao.WasteDao;
import waste.domain.Waste;
//import entity1.service.Entity1Service;

/**
 * Servlet implementation class UserServlet
 */

public class WasteServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WasteServletUpdate() {
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
		WasteDao entity1dao = new WasteDao();
		Waste entity1 = null;
		
		if(method.equals("search"))
		{
			try {
				entity1 = WasteDao.findBywasteid(Integer.parseInt(request.getParameter("wasteid")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
//			Entity1Service entity1service = new Entity1Service();		
			if(entity1.getwasteid()!=null){
				//System.out.println("11");

						//System.out.println(entity1);
						request.setAttribute("Waste", entity1);
						request.getRequestDispatcher("/jsps/waste/waste_update_output.jsp").forward(request, response);
					
				}
				else{
					
				request.setAttribute("msg", "Waste not found");
				request.getRequestDispatcher("/jsps/waste/waste_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Waste form = new Waste();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				
				String[] values = paramMap.get(name);
				info.add(values[0]);
				//System.out.println(name + ": " + Arrays.toString(values));
			}
			System.out.println(Integer.parseInt(request.getParameter("wasteid")));
			form.setwasteid(Integer.parseInt(info.get(1)));
			form.setcountyid(Integer.parseInt(info.get(2)));
			form.settotalwaste(Integer.parseInt(info.get(3)));
			form.setdayofsample(java.sql.Date.valueOf(info.get(4)));
			form.setorganic(Integer.parseInt(info.get(5)));
			form.setplastic(Integer.parseInt(info.get(6)));
			form.setmetal(Integer.parseInt(info.get(7)));
			form.setglass(Integer.parseInt(info.get(8)));
			form.setpaper(Integer.parseInt(info.get(9)));

			try {
				entity1dao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Waste Updated");
			request.getRequestDispatcher("/jsps/waste/waste_read_output.jsp").forward(request, response);
		}
	}
}




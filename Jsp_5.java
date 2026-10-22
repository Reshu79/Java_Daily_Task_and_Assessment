package controller2;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model2.Get_set;
@WebServlet("/search")
public class Jsp_5 extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		employeeSearch(request,response);
	}
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		employeeSearch(request,response);
	}
	
	public void employeeSearch(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String dept=request.getParameter("dept");
		Get_set gs=new Get_set();
		gs.setDept(dept);
		Jdbc jd=new Jdbc();
		ArrayList<Get_set>datas=new ArrayList<>();
		try {
			datas=jd.toSearch(dept);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("message", datas);
		request.getRequestDispatcher("search_employee.jsp").forward(request, response);
	}
	

}

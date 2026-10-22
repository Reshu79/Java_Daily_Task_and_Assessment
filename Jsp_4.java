package controller2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model2.Get_set;

import java.io.IOException;

import controller2.Jdbc;
@WebServlet("/delete")
public class Jsp_4 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		int id=Integer.valueOf(request.getParameter("id"));
		Get_set gs=new Get_set();
		gs.setId(id);
		Jdbc jd=new Jdbc();
		String result=null;
		try {
			result=jd.toDelete(gs);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(result);
		if("Record wad deleted successfully".equals(result)) {
			response.sendRedirect("displaying");
		}
		else if(result==null){
			request.setAttribute("message", "cant delete this record");
			request.getRequestDispatcher("delete_employee.jsp").forward(request, response);
		}
		else {
			request.setAttribute("message", result);
			request.getRequestDispatcher("delete_employee.jsp").forward(request, response);
			
		}
	}

}

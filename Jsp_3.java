package controller2;
import model2.Get_set;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/update_employee")
public class Jsp_3 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		int id=Integer.valueOf(request.getParameter("id"));
		String dept=request.getParameter("dept");
		int salary=Integer.valueOf(request.getParameter("salary"));
		Get_set gs=new Get_set();
		gs.setDept(dept);
		gs.setSalary(salary);
		gs.setId(id);
		Jdbc jd=new Jdbc();
		String result=null;
		try {
			result=jd.toUpdate(gs);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if("Updated Successfully".equals(result)){
			response.sendRedirect("displaying");
		}
		else {
			request.setAttribute("message", "Incorrect Data");
			request.getRequestDispatcher("update_employee.jsp").forward(request,response);
		}
		
	}

}

package controller2;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model2.Get_set;
@WebServlet("/registeremployee")
public class Jsp extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		String result=null;
		int id=Integer.valueOf(request.getParameter("id"));
		String name=request.getParameter("name");
		int age=Integer.valueOf(request.getParameter("age"));
		String dept=request.getParameter("dept");
		int salary=Integer.valueOf(request.getParameter("salary"));
		String email=request.getParameter("email");
		
		Get_set gs=new Get_set();
		gs.setId(id);
		gs.setName(name);
		gs.setAge(age);
		gs.setDept(dept);
		gs.setSalary(salary);
		gs.setEmail(email);
		
		Jdbc jd=new Jdbc();
		try {
			result=jd.toInsert(gs);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("wdbhv"+result);
		if("Registration success....".equals(result)){
		response.sendRedirect("displaying");//because display na first Jsp tha athula @WebServelet la("/displaying")podrukken
		}
		
		else if(result==null){
			request.setAttribute("message","Registartion failed....");
			request.setAttribute("id", request.getParameter("id"));
		    request.setAttribute("name", request.getParameter("name"));
		    request.setAttribute("age", request.getParameter("age"));
		    request.setAttribute("dept", request.getParameter("dept"));
		    request.setAttribute("salary", request.getParameter("salary"));
		    request.setAttribute("email", request.getParameter("email"));
			request.getRequestDispatcher("employee_2_register.jsp").forward(request, response);
		}
		else {
			request.setAttribute("message", result);
			request.getRequestDispatcher("employee_2_register.jsp").forward(request, response);
			}
		
	}

}

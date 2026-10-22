package controller2;

import java.io.IOException;
import java.util.ArrayList;
import model2.Get_set;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/displaying")
public class Jsp_2 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		Jdbc jd=new Jdbc();
		ArrayList<Get_set>data=new ArrayList<>();
		try {
			data=jd.toDisplay();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("messages", data);
		request.getRequestDispatcher("employee_display.jsp").forward(request, response);;
		
		
	}

}

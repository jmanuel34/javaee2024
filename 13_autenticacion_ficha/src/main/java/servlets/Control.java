package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductosService service = new ProductosService();
		var service = new ProductosService();
		String nombre=request.getParameter("nombre");
		double precio=Double.parseDouble( request.getParameter("precio"));
		String categoria=request.getParameter("categoria");
		
		
	}
}

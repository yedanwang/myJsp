package org.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.dao.SqlRegister;
import com.hb.dao.SqlSaleCar;
import com.imut.javabean.Car;

public class SaleCarServlet extends HttpServlet {
	public SaleCarServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
       
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            Car car = new Car();
		    car.setId(request.getParameter("id").trim());
	        car.setDriving_book_img(request.getParameter("driving_book_img"));
	        car.setEngine_img(request.getParameter("engine_img"));
	        car.setBuy_time(request.getParameter("buy_time"));
	        car.setAdress(request.getParameter("address"));
	        car.setEngine_img(request.getParameter("engine_img"));
	        car.setMileage(Integer.parseInt(request.getParameter("mileage")) );
	        car.setPrice(Integer.parseInt(request.getParameter("price")));
	        car.setCondition(request.getParameter("condition"));
	        car.setIphone(request.getParameter("iphone"));
	        car.setVehicle_type(request.getParameter("iphone"));
	        car.setStatus("0");
	        SqlSaleCar s = new SqlSaleCar();
	        try {
				s.IsSaleInfo(car);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("index.jsp");
	}

	
	public void init() throws ServletException {
		
	}

}




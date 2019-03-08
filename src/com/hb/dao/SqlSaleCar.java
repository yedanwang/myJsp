package com.hb.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hb.util.Te;
import com.imut.javabean.Car;

public class SqlSaleCar {
	public Boolean IsSaleInfo(Car car) throws SQLException
	{
		Connection conn = Te.conn;
		String sqlInsert = "insert into  car (id,driving_book_img,engine_img ,buy_time,vehicle_type," +
				"mileage,price,status,series,address ,condition," +
				"iphone) values("+car.getId()+","+car.getDriving_book_img()+","+car.getEngine_img()+","+car.getBuy_time()+","
				+car.getVehicle_type()+","+car.getMileage()+","+car.getPrice()+","+car.getStatus()+","+car.getAdress()+","+car.getCondition()+","+car.getIphone()+")";
		 System.out.print(sqlInsert);
		 Statement statement;
		 statement = conn.createStatement();
		 statement.execute(sqlInsert);
		 System.out.print("已经插入");
		 return true;
			
		
	     
	}

}

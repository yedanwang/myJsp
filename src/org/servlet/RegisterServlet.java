package org.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.dao.SqlLogin;
import com.hb.dao.SqlRegister;
import com.imut.javabean.Users;


	public class RegisterServlet extends HttpServlet {

		/**
		 * Constructor of the object.
		 */

		public RegisterServlet() {
			super();
		}

		/**
		 * Destruction of the servlet. <br>
		 */
		public void destroy() {
			super.destroy(); // Just puts "destroy" string in log
			// Put your code here
		}

		/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
		public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
	       
		}

		/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
		public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			    String loginName = request.getParameter("loginName").trim();
		        String password = request.getParameter("password");
		     
		        SqlRegister r = new SqlRegister();
				try {
					if(r.IsRegister(loginName, password))
					{
						
						//HttpSession session = request.getSession();//锟斤拷没峄帮拷锟斤拷锟斤拷锟斤拷锟斤拷娴鼻帮拷锟铰硷拷没锟斤拷锟斤拷锟较�
						//session.setMaxInactiveInterval(2*60);
						//session.setAttribute("login", l);			//锟窖伙拷取锟侥讹拷锟襟保达拷锟斤拷 Session 锟斤拷
						response.sendRedirect("index.jsp");	//锟斤拷证锟缴癸拷锟斤拷转锟斤拷锟斤拷迎锟斤拷页 main.jsp
					}
					
					else
					{
					    response.sendRedirect("error.jsp");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		/**
		 * Initialization of the servlet. <br>
		 *
		 * @throws ServletException if an error occurs
		 */
		public void init() throws ServletException {
			// Put your code here
		}

	}



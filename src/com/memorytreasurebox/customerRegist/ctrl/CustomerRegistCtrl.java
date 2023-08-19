package com.memorytreasurebox.customerRegist.ctrl;

import java.io.IOException;

import com.memorytreasurebox.customerRegist.model.CustomerRegistModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCtrl
 */
public class CustomerRegistCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerRegistCtrl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 入力パラメータの取得
		String userID = request.getParameter("userID");
		String password = request.getParameter("password");
		String userSei = request.getParameter("userSei");
		String userMei = request.getParameter("userMei");
		String email = request.getParameter("email");
		
		CustomerRegistModel newAccount = new CustomerRegistModel(userID,password,userSei,userMei,email);
		
		request.setAttribute("newAccount", newAccount);
		
		response.sendRedirect("LoginNewRegistConfirm.jsp");

	}

}

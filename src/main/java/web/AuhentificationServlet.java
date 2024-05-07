package web;

import java.io.IOException;

import beans.User;
import business.UserBusiness;
import business.UserManager;
import dao.OracleDataSource;
import dao.UserDaoImplOrcl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuhentificationServlet extends HttpServlet {
	private UserBusiness business;
	private UserDaoImplOrcl dao;
	public AuhentificationServlet() {
		dao = new UserDaoImplOrcl(new OracleDataSource());
		business = new UserManager(dao);
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		String username = req.getParameter("id");
		String password=req.getParameter("mdp");
		User user=new User(username,password);
		if(business.determineExistant(user)) {
			req.getRequestDispatcher("/views/Page1.jsp").forward(req, resp);
		}
		req.getRequestDispatcher("").forward(req, resp);
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		doGet(req, resp);
	}
}

package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.Stage;
import business.StageBusiness;
import business.StageManager;
import dao.DataSource;
import dao.OracleDataSource;
import dao.StageDao;
import dao.StageDaoImplOrcl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Page1Servlet extends HttpServlet {
	private StageDao sdao;
	private StageBusiness sbusiness ;
	
	
	public void init() throws ServletException {
		sdao = new StageDaoImplOrcl(new OracleDataSource());
		sbusiness = new StageManager(sdao);
	}
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI();
		
		if(url.contains("ByDate")) {
			List<Stage> sl = sbusiness.getAllByDate();
			req.setAttribute("sl", sl);
			req.getRequestDispatcher("views/Page1.jsp").forward(req, resp);	
		}else if(url.contains("ByType")) {
			List<Stage> sl = sbusiness.getAllByType();
			req.setAttribute("sl", sl);
			req.getRequestDispatcher("views/Page1.jsp").forward(req, resp);
		}else if(url.contains("Selection")) {
			int codeStage = Integer.parseInt(req.getParameter("codeStage"));
			System.out.println(codeStage);
			Stage s = sbusiness.getById(codeStage);
			req.setAttribute("s", s);
			req.getRequestDispatcher("views/Page2.jsp").forward(req, resp);
		}
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}

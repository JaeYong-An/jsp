package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.MemberVO;
import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("/memb/*")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	private RequestDispatcher rdp;
	private String destPage;
	private int isOK;
	
	private MemberService msv;
	
    public MemberController() {
        msv = new MemberServiceImpl();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/")+1);
		
		switch (path) {
		case "join" :
			destPage = "/member/join.jsp";
			break;
		case "register":
			try {
				String id = request.getParameter("id");
				String pwd = request.getParameter("pwd");
				String email = request.getParameter("email");
				int age = Integer.parseInt(request.getParameter("age"));
				MemberVO mvo = new MemberVO(id, pwd, email, age);
				isOK = msv.register(mvo);
				if(isOK>0) log.info("성공");
				destPage = "/index.jsp";
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				log.info("join error");
			}
			break;
		case "login" :
			try {
				String id = request.getParameter("id");
				String pwd = request.getParameter("pwd");
				MemberVO mvo = new MemberVO(id, pwd);
				MemberVO loginMvo = msv.login(mvo);
				if(loginMvo != null) {
					HttpSession ses = request.getSession();
					ses.setAttribute("ses", loginMvo);
				}else {
					request.setAttribute("msg_login", -1);
				}
				destPage = "/index.jsp";
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				log.info("login error");
			}
			break;
		case "logout" :
			try {
				HttpSession ses = request.getSession();
				MemberVO mvo = (MemberVO)ses.getAttribute("ses");
				int isOK = msv.lastlogin(mvo.getId());
				ses.invalidate();
				destPage = "/index.jsp";
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				log.info("logout error");
			}
			break;
		case "list" :
			try {
				List<MemberVO> list = msv.getList();
				request.setAttribute("list", list);
				destPage = "/member/list.jsp";
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				log.info("list error");
			}
			break;
		case "detail" :
			try {
				HttpSession ses = request.getSession();
				MemberVO mvo = (MemberVO)ses.getAttribute("ses");
				int isOK = msv.detail(mvo.getId());
				destPage = "/member/detail.jsp";
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				log.info("detail error");
			}
			break;

		}
		
		rdp = request.getRequestDispatcher(destPage);
		rdp.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}

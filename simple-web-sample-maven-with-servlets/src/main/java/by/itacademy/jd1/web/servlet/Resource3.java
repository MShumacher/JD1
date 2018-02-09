package by.itacademy.jd1.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Resource3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie myCookie = new Cookie("testCookie", "cookieValue");
		myCookie.setMaxAge(24 * 60 * 60);
		myCookie.setComment("Hello");
		resp.addCookie(myCookie);
		HttpSession session = req.getSession();
		session.setAttribute("authorized", Boolean.TRUE);
	}
}

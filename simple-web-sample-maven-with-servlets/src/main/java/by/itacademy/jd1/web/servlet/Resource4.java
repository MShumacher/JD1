package by.itacademy.jd1.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Resource4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cookieName = "testCookie";
		String cookieName2 = "testCookie2";
		String cookieValue = "";
		String cookieComment = "";
		Cookie[] myCookies = req.getCookies();
		if (myCookies != null) {
			for (
					int i = 0; i < myCookies.length; i++) {
				Cookie cookie = myCookies[i];
				if (cookieName.equals(cookie.getName())) {
					cookieValue = cookie.getValue();
				}
				if (cookieName2.equals(cookie.getName())) {
					cookieComment = cookie.getValue();
					break;
				}
			}
		}
		resp.getWriter().println("I got the cookie: " + cookieValue + " " + cookieComment);

		HttpSession session = req.getSession();
		Boolean isAuthorized = (Boolean) session.getAttribute("authorized");
		if (isAuthorized != null && isAuthorized) {
			resp.getWriter().println("You are logged in");
		} else {
			resp.getWriter().println("You are anonymous");
		}
	}

}

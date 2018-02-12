package by.itacademy.jd1.web.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter2 implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		PrintWriter writer = response.getWriter();
		writer.println("<h1>");
		writer.println("Filter2 was here");
		writer.println("</h1>");

		System.out.println("before servlet execution Filter2");//выполняется до сервлета
		chain.doFilter(request, response);//вызвать следующий фильтр или сервлет в цепочке, можно не писать и реквест возвращается обратно
//а куда идти дальше,на фильтр или сервлет. пишем в маппинге
		System.out.println("after servlet execution Filter2");//эта строчка выполняется после сервлета
	}

	public void destroy() {
	}

}

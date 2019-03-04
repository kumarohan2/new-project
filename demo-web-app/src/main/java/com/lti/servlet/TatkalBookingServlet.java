package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TatkalBookingServlet
 */
public class TatkalBookingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		ServletConfig sc = getServletConfig();

		int startTime = Integer.parseInt(sc.getInitParameter("startTime"));
		int endTime = Integer.parseInt(sc.getInitParameter("endTime"));

		Calendar cal = Calendar.getInstance();
		int currentTime = cal.get(Calendar.HOUR_OF_DAY);

		if (currentTime >= startTime && currentTime <= endTime)
			out.println("<h1> You are on time, click here to proceed </h1>");
		else
			out.println(
					"<h1>Oops,you are late.Please be on time tommorow if u have to reach your destiny within time</h1>");

	}

}

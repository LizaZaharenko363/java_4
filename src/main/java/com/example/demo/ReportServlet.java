package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reports/*")
public class ReportServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Sales Report</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Product</th><th>Quantity Sold</th><th>Total Revenue</th></tr>");
        out.println("<tr><td>Laptop</td><td>50</td><td>$49,950</td></tr>");
        out.println("<tr><td>Smartphone</td><td>75</td><td>$44,925</td></tr>");
        out.println("</table>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String reportType = request.getParameter("reportType");
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Custom Report Generation</h1>");
        out.println("<p>Report Type: " + reportType + "</p>");
        out.println("<p>Start Date: " + startDate + "</p>");
        out.println("<p>End Date: " + endDate + "</p>");
        out.println("</body></html>");
    }
}
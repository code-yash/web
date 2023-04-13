/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vaniya
 */
public class registerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
            String gender = request.getParameter("gender");
            String city = request.getParameter("city");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javaproject?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";
            String pass = "admin";
            Connection con = DriverManager.getConnection(url, username, pass);

            PreparedStatement st = con.prepareStatement("insert into logindetails(name, age, gender, city, email, password) values(?,?,?,?,?,?)");
            st.setString(1, name);
            st.setInt(2, age);
            st.setString(3, gender);
            st.setString(4, city);
            st.setString(5, email);
            st.setString(6, password);
            st.executeUpdate();
            System.out.println("User Registered! Database Updated Successfully.");
            con.close();

            PrintWriter out = response.getWriter();
            out.println("<h4> User:- " + name + " successfully registered! </h4>");
            out.println("<a href=\"index.html\"> Click here to Login! </a>");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

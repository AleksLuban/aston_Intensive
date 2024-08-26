package com.aston;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/InsertStudent_lecturer")
public class InsertStudent_LecturerServlet extends HttpServlet {

    private static final long serialVersionUID = 3L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Jdbc Connection
        try {
            Class.forName(DbUtil.driver);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        try {
            Connection conn = DriverManager.getConnection(DbUtil.url, DbUtil.user, DbUtil.password);
            System.out.println("connection successful");

            // Query/statement to insert the values
            PreparedStatement st = conn.prepareStatement("insert into students_lecturers values(?, ?)");

            // set values into the query
            st.setInt(1, Integer.valueOf(request.getParameter("student_id")));
            st.setInt(2, Integer.valueOf(request.getParameter("lecturer_id")));

            // Execute the query
            st.executeUpdate();

            st.close();
            conn.close();

            // Redirect the response to success page
            response.sendRedirect("success.jsp?msg=Insert");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.emer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luisc
 */
@WebServlet(name = "RespJSON", urlPatterns = {"/RespJSON"})
public class RespJSON extends HttpServlet {
    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        try{
            out.print("{\"empleados\":[");
            out.print("{\"nombre\":\"Bruno\",\"apellidos\":\"paredes\"},");
            out.print("{\"nombre\":\"Dolores\",\"apellidos\":\"Fuentes\"},");
            out.print("]}");
        }finally{
            out.close();
        }
    }
}
    
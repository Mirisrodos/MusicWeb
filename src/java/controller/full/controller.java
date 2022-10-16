/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.full;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Triss
 */
@WebServlet(urlPatterns = {"/home", "/playlist", "/searchpage", "/singerpage", "/songdetail", "/login"})
public class controller extends HttpServlet {

    private String url = "index.html";

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        url = request.getServletPath();

        switch (url) {
            case "/home":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("index.html");
                    rd.forward(request, response);
                    break;
                }
            case "/playlist":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("playlist.html");
                    rd.forward(request, response);
                    break;
                }
            case "/searchpage":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("searchpage.html");
                    rd.forward(request, response);
                    break;
                }
            case "/singerpage":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("singerpage.html");
                    rd.forward(request, response);
                    break;
                }
            case "/songdetail":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("songdetail.html");
                    rd.forward(request, response);
                    break;
                }
            case "/login":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("login.html");
                    rd.forward(request, response);
                    break;
                }
            default:
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                rd.forward(request, response);
                break;
        }

    }

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

    }
}

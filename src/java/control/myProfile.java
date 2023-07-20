/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import dao.DAO;
import entity.Account;
import entity.Category;
import entity.Product;
import entity.Profile;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Q2602
 */
@WebServlet(name = "myProfile", urlPatterns = {"/myProfile"})
public class myProfile extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        DAO dao = new DAO();
        PrintWriter out = response.getWriter();
        Profile o=dao.getProfile(36);
        out.println(o);
        out.println("<div class=\"row\">\n"
                    + "                <div class=\"col-md-3 border-right\">\n"
                    + "                    <div   class=\"mt-5 text-center\"><a class=\"btn btn-primary profile-button\" type=\"button\" href=\"/Project_banhang/\">Back</a></div>\n"
                    + "\n"
                    + "                    <div class=\"d-flex flex-column align-items-center text-center p-3 py-5\"><img class=\"rounded-circle mt-5\" width=\"150px\" src=\"https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg\">\n"
                    + "                    <span class=\"font-weight-bold\">"+o.getName()+"</span>\n"
                    + "                    <span class=\"text-black-50\">"+o.getGmail()+"</span>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "\n"
                    + "                <div class=\"col-md-5 border-right\">\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "                    <div class=\"p-3 py-5\">\n"
                    + "                        <div class=\"d-flex justify-content-between align-items-center mb-3\">\n"
                    + "                            <h4 class=\"text-right\">Profile Settings</h4>\n"
                    + "\n"
                    + "                        </div>\n"
                    + "                        <div class=\"row mt-2\">\n"
                    + "                            <div class=\"col-md-12\"><label class=\"labels\">Name</label><input type=\"text\" class=\"form-control\" placeholder=\"first name\">${listC.name}</div>\n"
                    + "                        </div>\n"
                    + "                        <div class=\"row mt-3\">\n"
                    + "                            <div class=\"col-md-12\"><label class=\"labels\">Mobile Number</label><input type=\"text\" class=\"form-control\" placeholder=\"enter phone number\" >${listC.mobile} </div>\n"
                    + "                            <div class=\"col-md-12\"><label class=\"labels\">Gmail</label><input type=\"text\" class=\"form-control\" placeholder=\"enter gmail\" >${listC.gmail}</div>\n"
                    + "                            <div class=\"col-md-12\"><label class=\"labels\">State</label><input type=\"text\" class=\"form-control\" placeholder=\"enter address line 2\" >${listC.State}</div>\n"
                    + "                        </div>\n"
                    + "                        <div class=\"row mt-3\">\n"
                    + "                        </div>\n"
                    + "                        <div class=\"mt-5 text-center\"><button class=\"btn btn-primary profile-button\" type=\"button\">Save Profile</button></div>\n"
                    + "                    </div>\n"
                    + "\n"
                    + "                </div>\n"
                    + "\n"
                    + "            </div>");
        
        request.getRequestDispatcher("profile.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

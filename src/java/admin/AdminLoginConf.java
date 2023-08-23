package admin;

import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLoginConf extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
         String user=request.getParameter("user");
         HttpSession session=request.getSession();   //activating session 
                     
         String email=request.getParameter("email");
         session.setAttribute("email", email); 
         String pswd=request.getParameter("pswd");
         DBCon db=new DBCon();
         db.pstmt=db.con.prepareStatement("select * from login where usertype=? and password=? and email=?");
         db.pstmt.setString(1,user);
         db.pstmt.setString(2, pswd);
         db.pstmt.setString(3, email);
         db.rst=db.pstmt.executeQuery();
         if(db.rst.next())
         {
             response.sendRedirect("AdminHome.html");
         }
         else
         {
             out.println("<html>"
                     + "<head>"
                     + "<title>Error Message</title>"
                     + "</head>"
                     + "<body>"
                     + "<center><br><br>"
                     + "<h1 style='color:tomato'>Either Username or Password incorrect</h1>"
                     + "<br>"
                     + "<h3><a href=Adminlogin.html>Try Again</a></h3>"
                     + "</center>"
                     + "</body>"
                     + "</html>");
             
         }
            
        }
        catch(Exception e )
            
        {
            e.printStackTrace();
        }
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

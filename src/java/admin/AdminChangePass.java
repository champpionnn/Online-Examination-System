package admin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdminChangePass", urlPatterns = {"/AdminChangePass"})
public class AdminChangePass extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            
            javax.servlet.http.HttpSession session=request.getSession();
         String email=(String)session.getAttribute("email");//get username
        String o=request.getParameter("op");
        String n=request.getParameter("np");
        String c=request.getParameter("cp");
        DB.DBCon db=new DB.DBCon();
        db.pstmt=db.con.prepareStatement("select * from login where email=? and password=?");
        db.pstmt.setString(1,email );
        db.pstmt.setString(2, o);
        db.rst=db.pstmt.executeQuery();
         if(db.rst.next())
         {
             if(n.equals(c))
             {
                 db.pstmt=db.con.prepareStatement("update login set password=? where email=?");
                 db.pstmt.setString(1,n);
                 db.pstmt.setString(2,email);
                 int i=db.pstmt.executeUpdate();
                 if(i>0)
                 
                     
                 response.sendRedirect("AdminChangePass.jsp?mes=Password updated Successfully");
                 
             
             }
             else
             {
                 response.sendRedirect("AdminChangePass.jsp?mg=New Password and Confirm Password doesn't Match");
             }
        
        }
         else
         {
            response.sendRedirect("AdminChangePass.jsp?msg=old Password is incorrect"); 
         }
        }
        catch(Exception e)
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

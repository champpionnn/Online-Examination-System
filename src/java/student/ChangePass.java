package student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ChangePass", urlPatterns = {"/ChangePass"})
public class ChangePass extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try 
        {
          
            javax.servlet.http.HttpSession session=request.getSession();
         String email=(String)session.getAttribute("user");//get username
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
                 
                     
                 response.sendRedirect("ChangePass.jsp?mes=Password updated Successfully");
                 
             
             }
             else
             {
                 response.sendRedirect("ChangePass.jsp?mg=New Password and Confirm Password doesn't Match");
             }
        
        }
         else
         {
            response.sendRedirect("ChangePass.jsp?msg=old Password is incorrect"); 
         }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
    }

    


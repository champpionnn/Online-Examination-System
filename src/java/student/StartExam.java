
package student;

import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StartExam extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Start Exam</title>");            
            out.println("</head>");
            out.println("<body bgcolor=lightgrey><center>"
                    + "<h1 style='color:DarkOliveGreen'>Question Paper</h1>"
                    + "<form action=SubmitAnswer>"
                    + "<table width=80% border=0 cellspacing=0 cellpadding=10 bgcolor=skyblue>");
            DBCon db= new DBCon();
            HttpSession session=request.getSession();
            String user=session.getAttribute("user").toString();
            db.pstmt=db.con.prepareStatement("select * from result_mstr where stu_id=?");
            db.pstmt.setString(1, user);
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
                out.println("Exam already Submitted");
            }
            else
            {
            db.pstmt=db.con.prepareStatement("select * from ques_mstr");
            db.rst=db.pstmt.executeQuery();
            int count=1;
            while(db.rst.next())
            {
                out.println("<tr><td colspan=2 style='background-color:Azure'><b><span style='color:grey'>Ques"+count+":</span>"+db.rst.getString(2)+"</b></td></tr>");
                out.println("<tr><td><input type=radio name=ans"+count+" value='"+db.rst.getString(3)+"'>"+db.rst.getString(3)+"</td>"
                        + "<td><input type=radio name=ans"+count+" value='"+db.rst.getString(4)+"'>"+db.rst.getString(4)+"</td></tr> ");
             out.println("<tr><td><input type=radio name=ans"+count+" value='"+db.rst.getString(5)+"'>"+db.rst.getString(5)+"</td>"
                        + "<td><input type=radio name=ans"+count+" value='"+db.rst.getString(6)+"'>"+db.rst.getString(6)+"</td></tr>"
                     + "<tr><td colspan=2></td></tr> "
                     + "<input type=hidden name=qid"+count+" value="+db.rst.getString(1)+">");
             
            count++;
            
            if(count>7)
                break;
            
            }
            out.println("<tr bgcolor=grey><th colspan=2><input style='color=green;' type=submit value='Submit Answer'></th></tr>"
                    );
            
            out.println("</table></form></center></body>");
            out.println("</html>");
            
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

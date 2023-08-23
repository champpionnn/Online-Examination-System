package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ChangePass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Change Password</title>\n");
      out.write("    <style>\n");
      out.write("        /* CSS RESET  */\n");
      out.write("        body{\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("            background: url(Images/Student7.jpg);\n");
      out.write("            background-repeat:no-repeat ;\n");
      out.write("           background-size: 1550px 800px;\n");
      out.write("           \n");
      out.write("             \n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        .navbar\n");
      out.write("        {\n");
      out.write("         display: inline-block;\n");
      out.write("         border: 3px solid white;\n");
      out.write("        margin-left: 2%;\n");
      out.write("         margin-top: 25px;\n");
      out.write("         border-radius: 5px;\n");
      out.write("         /* position: fixed; */\n");
      out.write("        }\n");
      out.write("        .navbar li{\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("        .navbar li a{\n");
      out.write("            color: white;\n");
      out.write("            font-size: 23px;\n");
      out.write("            padding:  40px;\n");
      out.write("            text-decoration: none; \n");
      out.write("        }\n");
      out.write("        .navbar li a:hover{\n");
      out.write("           \n");
      out.write("            color: grey;\n");
      out.write("            font-size: 23px;\n");
      out.write("            padding:  40px;\n");
      out.write("            text-decoration: none; \n");
      out.write("        }\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header><center>\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("        <li><a href=\"StuProfile.jsp \"> Profile</a> </li>\n");
      out.write("        <li><a href=\"StartExam\">Exam</a></li>\n");
      out.write("        <li><a href=\"StuResult\">Result</a></li>\n");
      out.write("        <li><a href=\"ChangePass.jsp\">Change Password</a></li>\n");
      out.write("       \n");
      out.write("        <li><a href=\"StuLogout\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div></center><hr>\n");
      out.write("    </header>\n");
      out.write("    <center> <br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div style=\"background-color:grey;width: 400px; height: 300px;\">\n");
      out.write("            <form action=\"ChangePass\"><br>\n");
      out.write("            <h1 > Change Password</h1>\n");
      out.write("            <table cellspacing=\"15\" cellpadding=\"10\"bgcolor=\"lightgrey\">\n");
      out.write("                <tr><td><label>Old Password</label></td><td> :</td><td><input placeholder=\"Old Password\" type=\"password\" name=\"op\"></td></tr>\n");
      out.write("                <tr><td><label>New Password</label></td><td> :</td><td><input placeholder=\"New Password\" type=\"password\" name=\"np\"></td></tr>\n");
      out.write("                <tr><td><label>Confirm Password</label></td><td> :</td><td><input placeholder=\"Confirm Password\" type=\"password\" name=\"cp\"></td></tr>\n");
      out.write("                \n");
      out.write("                    ");

                     if(request.getParameter("msg")!=null)
                   {
                   out.println("<tr><th colspan=3 style='color:red;'>"+request.getParameter("msg")+"</th></tr>");
                   }
                      if(request.getParameter("mes")!=null)
                   {
                   out.println("<tr><th colspan=3 style='color:red;'>"+request.getParameter("mes")+"</th></tr>");
                   }
                       if(request.getParameter("mg")!=null)
                   {
                   out.println("<tr><th colspan=3 style='color:red;'>"+request.getParameter("mg")+"</th></tr>");
                   }
                    
                    
      out.write("\n");
      out.write("                   \n");
      out.write("           \n");
      out.write("                <tr> <td><input type=\"Submit\"value =\"Change\" style=\"cursor: pointer;color: blue;\" >\n");
      out.write("                    </td><td></td><td><input type=\"Reset\" style=\"color: blue;cursor: pointer;\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        </form></div>\n");
      out.write("       </center>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

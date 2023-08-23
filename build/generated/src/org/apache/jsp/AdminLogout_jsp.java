package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Admin Home Page</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Baloo+Bhai+2:wght@800&family=Baloo+Bhaina+2:wght@800&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        /* CSS RESET  */\n");
      out.write("        body{\n");
      out.write("            font-family: 'Baloo Bhai 2', cursive;\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("            background: url(Images/Student7.jpg);\n");
      out.write("            background-repeat:no-repeat ;\n");
      out.write("           background-size: 1550px 800px;  \n");
      out.write("           font-family: Baloo Bhai;  \n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        .navbar\n");
      out.write("        {\n");
      out.write("         display: inline-block;\n");
      out.write("         border: 3px solid white;\n");
      out.write("        margin-left: 0%;\n");
      out.write("         margin-top: 25px;\n");
      out.write("         border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        .navbar li{\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("        .navbar li a{\n");
      out.write("            color: white;\n");
      out.write("            font-size:23px;\n");
      out.write("            padding: 15px;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        .navbar li a:hover{\n");
      out.write("           \n");
      out.write("           color: grey;\n");
      out.write("           font-size:23px;\n");
      out.write("           padding:15px;\n");
      out.write("           text-decoration: none; \n");
      out.write("       }\n");
      out.write("     \n");
      out.write("\n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header><center>\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("        <li><a href=\"StudentList.jsp \"> Student List</a> </li>\n");
      out.write("        <li><a href=\"AddQuestion.jsp \"> Add Question</a> </li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"QuestionList.jsp\">Question List</a></li>\n");
      out.write("        <li> <a href=\"UpDelQues.jsp\">Update/Delete Question</a></li>\n");
      out.write("        <li><a href=\"AdminResult.jsp\">Result</a></li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"AdminChangePass.jsp\">Change Password</a></li>\n");
      out.write("        <li><a href=\"AdminLogout\">Log Out</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div><hr>\n");
      out.write("    </center></header><center>\n");
      out.write("    <div style=\"background-color:skyblue;width: 200px; height: 150px;\">\n");
      out.write("        \n");
      out.write("        <form action=\"AdminLogout\"><br>\n");
      out.write("                <label>\n");
      out.write("                    <h1>Are You Sure??</h1> \n");
      out.write("                </label>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"Logout\">\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("         </div></center>\n");
      out.write("    \n");
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

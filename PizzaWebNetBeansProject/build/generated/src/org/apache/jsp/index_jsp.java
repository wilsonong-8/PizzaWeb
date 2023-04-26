package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image: url(\"Images/background image.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-position: center;\n");
      out.write("                color: rgb(25, 151, 80);\n");
      out.write("            }\n");
      out.write("            div\n");
      out.write("            {\n");
      out.write("                position: relative;\n");
      out.write("                top: 150px;\n");
      out.write("                background: rgb(243, 243, 232);\n");
      out.write("                width: 350px;\n");
      out.write("                border: 8px ridge rgb(25, 151, 80);\n");
      out.write("            }\n");
      out.write("            #homeImage\n");
      out.write("            {   \n");
      out.write("                width: 250px;\n");
      out.write("            }\n");
      out.write("            #title\n");
      out.write("            {\n");
      out.write("                font-family:monospace;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <center>\n");
      out.write("             \n");
      out.write("             <div>\n");
      out.write("        <img src=\"Images/pizza boy image.png\" alt=\"\" id=\"homeImage\"/>\n");
      out.write("        <h1 id=\"title\">Log In to Order</h1>\n");
      out.write("        <form name=\"login\" method=\"POST\" action=\"LoginServlet\">\n");
      out.write("            <table border=\"0\" cellspacing=\"10\">\n");
      out.write("   \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Username:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"user\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password:</td>\n");
      out.write("                        <td><input type=\"password\" name=\"pass\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Login\" /></td>\n");
      out.write("                        <td><input type=\"reset\" value=\"Clear\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>No account yet?</td>\n");
      out.write("                        <td><a href=\"RegistrationPage.jsp\">Sign Up now</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("             \n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

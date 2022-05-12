package org.apache.jsp.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pie_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"container-fluid\" id=\"pie\">\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-sm-5\">Derechos reservados</div>\n");
      out.write("    <div class=\"col-sm-5\">HHB<br>\n");
      out.write("        \n");
      out.write("    <a class=\"bi bi-facebook\" href=\"https://www.facebook.com/hoover.becerra.98\" role=\"button\"></a>\n");
      out.write("    <a class=\"bi bi-whatsapp\" href=\"contactos.jsp\" role=\"button\"></a>\n");
      out.write("    <a class=\"bi bi-instagram\" href=\"https://instagram.com/h_2_hb?utm_medium=copy_link\" role=\"button\"></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-2\">Más información</div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</div>");
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

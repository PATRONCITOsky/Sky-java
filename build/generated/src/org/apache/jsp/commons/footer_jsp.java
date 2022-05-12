package org.apache.jsp.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/commons/cdn.jsp");
  }

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

      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://kit.fontawesome.com/fba76926dc.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Lobster&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\n");
      out.write("\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,300;1,300;1,700&display=swap\" rel=\"stylesheet\">");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"row row-cols-5 py-5 my-5 border-top\">\n");
      out.write("    <div class=\"col\">\n");
      out.write("      <h1>\n");
      out.write("      <a class=\"bi bi-whatsapp\" href=\"contactos.jsp\" role=\"button\"></a>\n");
      out.write("      <a class=\"bi bi-facebook\" href=\"https://www.facebook.com/hoover.becerra.98\" role=\"button\"></a>\n");
      out.write("      <a class=\"bi bi-instagram\" href=\"https://instagram.com/h_2_hb?utm_medium=copy_link\" role=\"button\"></a>\n");
      out.write("      </h1>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col\">\n");
      out.write("      <h5>Section</h5>\n");
      out.write("      <ul class=\"nav flex-column\">\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Home</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Features</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Pricing</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">FAQs</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">About</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col\">\n");
      out.write("      <h5>Section</h5>\n");
      out.write("      <ul class=\"nav flex-column\">\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Home</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Features</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Pricing</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">FAQs</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">About</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col\">\n");
      out.write("      <h5>Section</h5>\n");
      out.write("      <ul class=\"nav flex-column\">\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Home</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Features</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Pricing</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">FAQs</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">About</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </footer>");
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

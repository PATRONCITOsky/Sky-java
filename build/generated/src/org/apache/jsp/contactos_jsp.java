package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/commons/cdn.jsp");
    _jspx_dependants.add("/commons/cabecera.jsp");
    _jspx_dependants.add("/commons/footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
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
      out.write("        <link rel=\"stylesheet\" href=\"css/global.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark sticky-top\">\n");
      out.write("  <!-- Brand -->\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("      <img src=\"img/logos.png\" alt=\"\" width=\"35\"/>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("  <!-- Toggler/collapsibe Button -->\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button> \n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link bi bi-house\" href=\"index.jsp\"> Inicio</a>\n");
      out.write("        \n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link bi bi-cart3\" href=\"Ccar?menu=usuario&accion=productos\">Carrito Compras</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link bi bi-file-earmark-person\" href=\"acerca.jsp\"> Acerca de</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link bi bi-person-lines-fill\" href=\"contactos.jsp\"> Contactos</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link bi bi-ui-checks-grid\" href=\"registro.jsp\"> Registro</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link bi bi-box-arrow-right\" href=\"logueo.jsp\"> Login</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <h1 class=\"text-center\">Cont??ctanos</h1>\n");
      out.write("                <form method=\"POST\" action=\"\">\n");
      out.write("                  <div class=\"row justify-content-center\">  \n");
      out.write("                    \n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <label class=\"font-weight-bold\">Nombre</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese nombre\" name=\"nombres\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <label class=\"font-weight-bold\">Correo Electr??nico</label>\n");
      out.write("                            <input  class=\"form-control\" type=\"email\" placeholder=\"Ingrese el correo\" name=\"correo\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label class=\"font-weight-bold\">N??mero Celular</label>\n");
      out.write("                                <input class=\"form-control\" type=\"tel\"  placeholder=\"Ingrese n??mero celular\" name=\"celular\" pattern=\"\\([0-9]{3}\\) [0-9]{3}[ -][0-9]{4}\" title=\"Un n??mero de tel??fono v??lido consiste en un ??rea de c??digo de 3 d??gitos entre corchetes, un espacio, los tres primeros d??gitos del n??mero, un espacio o gui??n (-), y cuatro d??gitos m??s\" required>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label class=\"font-weight-bold\">Mensaje</label>\n");
      out.write("                                <textarea  class=\"form-control\"  placeholder=\"Ingrese mensaje\" name=\"mensaje\" required=\"\"> </textarea>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"row justify-content-center\">\n");
      out.write("                                <button type=\"submit\" name=\"accion\" value=\"insertar\" class=\"btn btn-success\">Enviar</button>&nbsp\n");
      out.write("                            </div>\n");
      out.write("                            </form>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("<div class=\"container-fluid\" id=\"footer\">\n");
      out.write("<footer class=\"row row-cols-5 py-5 my-5 border-top\" >\n");
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
      out.write("      <h5>M??s Informaci??n</h5>\n");
      out.write("      <ul class=\"nav flex-column\">\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"index.jsp\" class=\"nav-link p-0 text-muted\">Home</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"contactos.jsp\" class=\"nav-link p-0 text-muted\">Cont??ctanos</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"acerca.jsp\" class=\"nav-link p-0 text-muted\">Terminos y Condiciones</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col\">\n");
      out.write("      <h5>Cuidades</h5>\n");
      out.write("      <ul class=\"nav flex-column\">\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Pereira</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Medell??n</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Barranquilla</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Bogot??</a></li>\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Manizales</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col\">\n");
      out.write("      <h5>Derechos reservados</h5>\n");
      out.write("      <ul class=\"nav flex-column\">\n");
      out.write("        <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">??HHB</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("</div>");
      out.write("\n");
      out.write("</body>\n");
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

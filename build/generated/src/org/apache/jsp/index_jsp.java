package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/commons/cdn.jsp");
    _jspx_dependants.add("/commons/cabecera.jsp");
    _jspx_dependants.add("/commons/carrusel.jsp");
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
      out.write("   \n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark sticky-top\">\n");
      out.write("  <!-- Brand -->\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\">D-Compras</a>\n");
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
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("<br>\n");
      out.write("<div id=\"demo\" class=\"carousel slide text-center\" data-ride=\"carousel\">\n");
      out.write("  <ul class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("  </ul>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"https://cdn.pixabay.com/photo/2017/03/26/10/45/welcome-2175196_1280.jpg\" alt=\"Bienvenidos\"  height=\"500\" style=\"width: 80%\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Bienvenid@!</h3>\n");
      out.write("        <p>Gracias por escogernos!</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"https://scontent.feoh4-3.fna.fbcdn.net/v/t1.6435-9/132633332_414926193076229_5790617059996931348_n.jpg?stp=dst-jpg_p720x720&_nc_cat=102&ccb=1-5&_nc_sid=e3f864&_nc_ohc=iiQ31AC45NsAX8KqQrr&_nc_ht=scontent.feoh4-3.fna&oh=00_AT-Bc79eQ3oaCjoLUB-q7WyasDEHOqJ-g7ASigT_O0GgEg&oe=628BA671\" alt=\"Fundador\"  height=\"500\" style=\"width: 40%\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Fundador</h3>\n");
      out.write("        <p>Gracias por elegirnos</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("        <img src=\"https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2018/05/senora-feliz.jpg\" alt=\"happy\" height=\"500\" style=\"width: 80%\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Disfruta</h3>\n");
      out.write("        <p>Simplemente sonrie!</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br>");
      out.write("\n");
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
      out.write("\n");
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

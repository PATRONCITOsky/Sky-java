package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beens.registroBeensUSU;
import DAO.registroDAOUSU;
import java.util.ListIterator;
import java.util.List;

public final class usu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/commons/cdn.jsp");
    _jspx_dependants.add("/commons/CabeceraUsr.jsp");
    _jspx_dependants.add("/commons/sideBar2.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         ");
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
      out.write("         <link rel=\"stylesheet\" href=\"css/global2.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("          <a class=\"nav-link bi bi-house\" href=\"index.jsp\"> Inicio</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 sidebar-col\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("<div class=\"\">\n");
      out.write("    <a href=\"Cusu?menu=Ppal\">Info</a>\n");
      out.write("    <a href=\"productosUsu.jsp\">Productos</a>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-9 main-col\">\n");
      out.write("                    <form action=\"Cusu?menu=usuario\" method=\"POST\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group d-flex\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label>Nombre</label>\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtNombres\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label>Contacto</label>\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getContacto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtContacto\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label>Correo</label>\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getCorreo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtCorreo\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                              \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                            <div class=\"form-group d-flex\">\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                <label>Password</label>\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getPassword()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtClave\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                                \n");
      out.write("                                <button type=\"submit\" name=\"accion\" value=\"modificar\" class=\"btn btn-outline-warning\">\n");
      out.write("                                    <i class=\"fas fa-edit\"></i> Modificar\n");
      out.write("                                </button>\n");
      out.write("                    </form>\n");
      out.write("               \n");
      out.write("                    <h1>Usuario </h1>\n");
      out.write("                    <table class=\"table table-dark table-hover\">\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Nombres</th>\n");
      out.write("                            <th>Contacto</th>\n");
      out.write("                            <th>Correo</th>\n");
      out.write("                            <th>Role</th>\n");
      out.write("                            <th>Actualizar</th>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        ");
 
                            List lis = new registroDAOUSU().getAll();
                            ListIterator list = lis.listIterator();
                            
                                registroBeensUSU regM = (registroBeensUSU)list.next();
                            
                        
      out.write(" \n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getContacto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getCorreo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getRole()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\n");
      out.write("                           ");
      out.write(" \n");
      out.write("                            <td><a class=\"btn btn-outline-success\" href=\"Cusu?menu=usuario&accion=actualiza&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Actualizar</a></td>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        ");
 
                            
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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

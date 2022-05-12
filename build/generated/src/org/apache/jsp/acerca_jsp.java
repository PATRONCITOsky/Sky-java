package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class acerca_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/commons/cdn.jsp");
    _jspx_dependants.add("/commons/cabecera.jsp");
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
      out.write("        <link rel=\"stylesheet\" href=\"css/global4.css\" type=\"text/css\">\n");
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
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                    <h1>Términos y condiciones</h1>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <p>Al ingresar a nuestro sitio web el usuario y/o comprador acepta sujetarse a los Términos\n");
      out.write("                        y Condiciones Generales, junto con todas las demás políticas y principios del mismo, \n");
      out.write("                        Le recomendamos leer y entender esta sección antes de hacer su pedido.\n");
      out.write("                        La mercancía que manejamos está sujeta a disponibilidad del inventario, \n");
      out.write("                        por lo tanto cabe la posibilidad de que el producto que escoja no se encuentre disponible,\n");
      out.write("                        dado el caso que no halla disponibilidad del producto que solicitaste, nosotros como \n");
      out.write("                        empresa nos pondremos en contacto contigo para notificarte cuál producto está agotado \n");
      out.write("                        y brindarte opciones similares disponibles, (si está disponible el producto seleccionado, \n");
      out.write("                        no nos pondremos en contacto contigo sino continuaremos con el proceso normal de despacho \n");
      out.write("                        y llegará a tu correo la guía de envío)</p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <h5 class=\"text-center font-weight-bold\">Póliticas de garántia</h5>\n");
      out.write("                        <p>El comprador es responsable por la veracidad y precisión de los datos ingresados y/o \n");
      out.write("                            suministrados en el sitio durante la realización de las compras en general;  así como, \n");
      out.write("                            en  las condiciones de entrega de los productos,  en consecuencia cualquier error o \n");
      out.write("                            imprecisión en ellos, especialmente en los datos de la dirección o nomenclatura para el \n");
      out.write("                            envío de los productos adquiridos,  serán de su exclusiva responsabilidad, exonerando a \n");
      out.write("                            nuestra tienda de cualquier reclamación por esta circunstancia, o por productos entregados \n");
      out.write("                            en direcciones erradas por culpa de los datos erróneos suministrados por el comprador.\n");
      out.write("\n");
      out.write("                            Al acceder y utilizar nuestro sitio web aceptas que las compras están sujetas a los \n");
      out.write("                            Términos y Condiciones publicados en el sitio, y todas las leyes aplicables regirán y\n");
      out.write("                            se interpretarán de conformidad con las leyes Colombianas.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <h5 class=\"text-center font-weight-bold\">Pólitica de envio</h5>\n");
      out.write("                        <p> Polaron Store realiza despachos a gran parte del territorio Colombiano a través de Servientrega\n");
      out.write("                            o Interrapidisimo, que garantiza la seguridad y cobertura, para que tú compra llegue a la dirección que desees.\n");
      out.write("                            El tiempo de entrega de los productos es aproximadamente 2 a 6 días hábiles para las ciudades de Bogotá, \n");
      out.write("                            Medellín, Cali, y Ciudades principales, hasta 8 días hábiles para otros destinos. Estos tiempos están \n");
      out.write("                            sujetos a cambios de acuerdo a eventos promocionales o externos a nosotros como eventos climáticos \n");
      out.write("                            y propios de la transportadora, el producto será entregado a cualquier persona que se ubique en la dirección \n");
      out.write("                            suministrada en el formulario o en la portería de la unidad residencial o edificio suministrado.</p>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <h5 class=\"text-center font-weight-bold\">¿Cómo realizar un  cambio?</h5>\n");
      out.write("                        <p>Para realizar un cambio de un producto que comprase en nuestra página  :\n");
      out.write("\n");
      out.write("                            comunícate a nuestra línea de WhatsApp +57 310 8827984 o a nuestro correo electrónico en horario de Lunes a Viernes de 8:00 am – 6:00 pm para coordinar el proceso de cambio de tu producto.\n");
      out.write("\n");
      out.write("                            Para realizar el  proceso de devolución, el producto debe estar debidamente embalado. Usa el mismo empaque en el que recibiste el pedido o uno diferente que proteja el producto durante el proceso de transporte.\n");
      out.write("\n");
      out.write("                            Para realizar un cambio, el producto debe estar en perfecto estado, limpio y sin uso.\n");
      out.write("                            * El cambio de un producto puede realizarse hasta noventa (90) días calendario después de realizada tú compra (Fecha de confirmación del pedido).\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ¿Cuál es el proceso?\n");
      out.write("                            1.  Te comunicas con nosotros para estar al tanto y llevar el registro de tu cambio\n");
      out.write("                            2. Debes enviarnos el paquete por medio de la transportadora Interrapidisimo o Envía colvanes, el valor del flete de venida lo debes asumir tu. Nos envías foto de la guía de envío al whatsapp +57 310 8827984 para poder agendarte y llevar el seguimiento.\n");
      out.write("                            3. Cuando llegue el producto verificaremos que todo este bien, nos contactaremos contigo y te enviamos el ítem nuevo. El valor del envío hasta tu casa lo asumimos nosotros.\n");
      out.write("                            4. Si el producto que nos enviaste no cumple con estas condiciones nos podemos reservar la posibilidad de no realizar el cambio.</p>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <h5 class=\"text-center font-weight-bold\">¿Cómo realizar una devolución por garantía?</h5>\n");
      out.write("                        <p>Para hacer una devolución por garantía de algún producto que compraste en nuestra tienda:\n");
      out.write("\n");
      out.write("                            comunícate a nuestra línea de WhatsApp +57 310 8827984 o a nuestro correo electrónico en horario de L-V de 8:00 am – 6:00 pm e informamos sobre la devolución por garantía que deseas hacer, esta se efectuará dependiendo del caso.\n");
      out.write("\n");
      out.write("                            El producto debe estar debidamente embalado (en caso de que se te indique que debes enviárnoslo). Usa un empaque que proteja el producto durante el proceso de transporte.\n");
      out.write("\n");
      out.write("                            En este caso, el gasto de envío corre por cuenta de Polaron Store Recuerda que el reclamo por garantía de un producto puede realizarse hasta noventa (90) días calendario después de realizada tú compra (Fecha de confirmación del pedido). Nos reservamos el derecho de no dar la garantía en caso de que el daño al calzado sea por uso del cliente (Ej: raspones, manchas por rozaduras, daños directos al material, etc.)\n");
      out.write("                            Si el defecto no cumple con las condiciones de las devoluciones por garantía, te informaremos y se enviará el producto nuevamente a la dirección de entrega inicial.</p>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <h5 class=\"text-center font-weight-bold\">Derecho de contrato</h5>\n");
      out.write("                        <p>Para hacer la solicitud de ley de retracto por algún producto que compraste comunícate con nosotros a la línea de WhatsApp +57 310 8827984 o a nuestro correo electrónico en horario de Lunes a Viernes de 8:00 am – 6:00 pm.\n");
      out.write("\n");
      out.write("                            De acuerdo con el derecho de retracto consagrado por la ley 1480 de 2011 art. 47, el término máximo para ejercer este derecho es de 5 días hábiles contados a partir de la entrega del bien o el momento en que recibiste el producto. El producto deberá ser devuelto en las mismas condiciones en que lo recibiste, debe estar en perfecto estado, es decir, sin uso, limpio, con las marquillas y etiquetas. Los costos de transporte y demás, incurridos en la devolución del producto a las instalaciones de Polaron Store serán asumidos por el cliente. En caso de que se cumplan todas las condiciones mencionadas, Polaron Store devolverá la suma equivalente al producto o productos devueltos, el término para la devolución de dinero del producto se hará cuando llegue el producto enviado por el cliente de forma inmediata a la cuenta que el cliente nos suministre para hacer el respectivo reembolso.</p>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
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

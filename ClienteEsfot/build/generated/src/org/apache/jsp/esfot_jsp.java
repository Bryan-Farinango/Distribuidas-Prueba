package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class esfot_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String s_num1, s_num2,s_num3, s_num4,s_num5, s_num6,s_valor;
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h3>CÁLCULO DE HORAS Y SUELDO DE TRABAJADORES</h3>\n");
      out.write("\n");
      out.write("        <form action=\"esfot.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <div>\n");
      out.write("                <label for=\"txt_nombre\">INGRESE EL VALOR POR HORA</label> \n");
      out.write("                <input type=\"text\" name=\"txt_valor\"/>     \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                <p><label for=\"txt_nombre\">Horas trabajadas por día</label> </p>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"txt_nombre\">Día 1</label> \n");
      out.write("                <input type=\"text\" name=\"txt_numl\"/>               \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                <p></p>\n");
      out.write("            <div>  \n");
      out.write("                <label for=\"txt_nombre\">Día 2</label>\n");
      out.write("                <input type=\"text\" name=\"txt_num2\"/>   \n");
      out.write("            </div>\n");
      out.write("                <p></p>\n");
      out.write("            <div>                \n");
      out.write("\n");
      out.write("                <label for=\"txt_nombre\">Día 3</label>\n");
      out.write("                <input type=\"text\" name=\"txt_num3\"/>   \n");
      out.write("            </div>\n");
      out.write("                <p></p>\n");
      out.write("            <div> \n");
      out.write("                <label for=\"txt_nombre\">Día 4</label>\n");
      out.write("                <input type=\"text\" name=\"txt_num4\"/>   \n");
      out.write("            </div>\n");
      out.write("                <p></p>\n");
      out.write("            <div> \n");
      out.write("                <label for=\"txt_nombre\">Día 5</label>\n");
      out.write("                <input type=\"text\" name=\"txt_num5\"/>   \n");
      out.write("            </div>\n");
      out.write("                <p></p>\n");
      out.write("            <div> \n");
      out.write("                <label for=\"txt_nombre\">Día 6</label>\n");
      out.write("                <input type=\"text\" name=\"txt_num6\"/>   \n");
      out.write("            </div>\n");
      out.write("                <p></p>\n");
      out.write("               \n");
      out.write("                 </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group text-center\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\"> CALCULAR</button>                \n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");
      out.write("            \n");
      out.write("            \n");
      out.write("        ");
s_num1= request.getParameter("txt_num1");
      out.write("\n");
      out.write("        ");
s_num2= request.getParameter("txt_num2");
      out.write("\n");
      out.write("         ");
s_num3= request.getParameter("txt_num3");
      out.write("\n");
      out.write("        ");
s_num4= request.getParameter("txt_num4");
      out.write("\n");
      out.write("         ");
s_num5= request.getParameter("txt_num5");
      out.write("\n");
      out.write("        ");
s_num6= request.getParameter("txt_num6");
      out.write("\n");
      out.write("        ");
s_valor= request.getParameter("txt_valor");
      out.write("\n");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	uddi.NewWebService_Service service = new uddi.NewWebService_Service();
	uddi.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	double a = Double.parseDouble(s_num1);
	double b = Double.parseDouble(s_num2);
        double c = Double.parseDouble(s_num3);
	double d = Double.parseDouble(s_num4);
        double e = Double.parseDouble(s_num5);
	double f = Double.parseDouble(s_num6);
        double precio=Double.parseDouble(s_valor);
        double total_horas=a+b+c+d+e+f;
        double valor =precio;
        double horas = total_horas;
        // TODO process result here
        double result = port.sueldo(valor, horas);
      
        out.println("SUELDO = "+result );      
        out.println("HORAS TRABAJADAS= " + horas);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");
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



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>CÁLCULO DE HORAS Y SUELDO DE TRABAJADORES</h3>

        <form action="esfot.jsp" method="POST">
            <div class="form-group">
            <div>
                <label for="txt_nombre">INGRESE EL VALOR POR HORA</label> 
                <input type="text" name="txt_valor"/>     

            </div>
                <p><label for="txt_nombre">Horas trabajadas por día</label> </p>
            <div>
                <label for="txt_nombre">Día 1</label> 
                <input type="text" name="txt_numl"/>               

            </div>
                <p></p>
            <div>  
                <label for="txt_nombre">Día 2</label>
                <input type="text" name="txt_num2"/>   
            </div>
                <p></p>
            <div>                

                <label for="txt_nombre">Día 3</label>
                <input type="text" name="txt_num3"/>   
            </div>
                <p></p>
            <div> 
                <label for="txt_nombre">Día 4</label>
                <input type="text" name="txt_num4"/>   
            </div>
                <p></p>
            <div> 
                <label for="txt_nombre">Día 5</label>
                <input type="text" name="txt_num5"/>   
            </div>
                <p></p>
            <div> 
                <label for="txt_nombre">Día 6</label>
                <input type="text" name="txt_num6"/>   
            </div>
                <p></p>
               
                 </div>

            <div class="form-group text-center">
                <button type="submit" class="btn btn-primary"> CALCULAR</button>                
            </div>
               
        </form>
        
        <%! String s_num1, s_num2,s_num3, s_num4,s_num5, s_num6,s_valor;%>            
            
        <%s_num1= request.getParameter("txt_num1");%>
        <%s_num2= request.getParameter("txt_num2");%>
         <%s_num3= request.getParameter("txt_num3");%>
        <%s_num4= request.getParameter("txt_num4");%>
         <%s_num5= request.getParameter("txt_num5");%>
        <%s_num6= request.getParameter("txt_num6");%>
        <%s_valor= request.getParameter("txt_valor");%>
  
    </body>
</html>
    <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>
    
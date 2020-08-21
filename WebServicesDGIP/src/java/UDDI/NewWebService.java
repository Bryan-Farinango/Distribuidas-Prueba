/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author WENDY
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "sueldo")
   
    public double sueldo (@WebParam(name = "valor") double a, @WebParam(name = "horas") double b){
        return a*b;
    }
    
    
     @WebMethod(operationName = "total_horas")
   
    public double total_horas (@WebParam(name = "dia1") double d1,
            @WebParam(name = "dia2") double d2,
            @WebParam(name = "dia3") double d3,
            @WebParam(name = "dia4") double d4,
            @WebParam(name = "dia5") double d5,
            @WebParam(name = "dia6") double d6,
            @WebParam(name = "dia7") double d7){
        
        return d1+d2+d3+d4+d5+d6+d7;
    }
    
    
}

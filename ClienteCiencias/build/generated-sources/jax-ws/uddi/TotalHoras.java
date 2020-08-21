
package uddi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para total_horas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="total_horas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dia1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dia2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dia3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dia4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dia5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dia6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dia7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "total_horas", propOrder = {
    "dia1",
    "dia2",
    "dia3",
    "dia4",
    "dia5",
    "dia6",
    "dia7"
})
public class TotalHoras {

    protected double dia1;
    protected double dia2;
    protected double dia3;
    protected double dia4;
    protected double dia5;
    protected double dia6;
    protected double dia7;

    /**
     * Obtiene el valor de la propiedad dia1.
     * 
     */
    public double getDia1() {
        return dia1;
    }

    /**
     * Define el valor de la propiedad dia1.
     * 
     */
    public void setDia1(double value) {
        this.dia1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia2.
     * 
     */
    public double getDia2() {
        return dia2;
    }

    /**
     * Define el valor de la propiedad dia2.
     * 
     */
    public void setDia2(double value) {
        this.dia2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia3.
     * 
     */
    public double getDia3() {
        return dia3;
    }

    /**
     * Define el valor de la propiedad dia3.
     * 
     */
    public void setDia3(double value) {
        this.dia3 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia4.
     * 
     */
    public double getDia4() {
        return dia4;
    }

    /**
     * Define el valor de la propiedad dia4.
     * 
     */
    public void setDia4(double value) {
        this.dia4 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia5.
     * 
     */
    public double getDia5() {
        return dia5;
    }

    /**
     * Define el valor de la propiedad dia5.
     * 
     */
    public void setDia5(double value) {
        this.dia5 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia6.
     * 
     */
    public double getDia6() {
        return dia6;
    }

    /**
     * Define el valor de la propiedad dia6.
     * 
     */
    public void setDia6(double value) {
        this.dia6 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia7.
     * 
     */
    public double getDia7() {
        return dia7;
    }

    /**
     * Define el valor de la propiedad dia7.
     * 
     */
    public void setDia7(double value) {
        this.dia7 = value;
    }

}

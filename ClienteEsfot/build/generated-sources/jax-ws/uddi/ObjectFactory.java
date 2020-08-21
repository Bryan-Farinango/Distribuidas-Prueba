
package uddi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uddi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("http://UDDI/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://UDDI/", "helloResponse");
    private final static QName _Sueldo_QNAME = new QName("http://UDDI/", "sueldo");
    private final static QName _SueldoResponse_QNAME = new QName("http://UDDI/", "sueldoResponse");
    private final static QName _TotalHoras_QNAME = new QName("http://UDDI/", "total_horas");
    private final static QName _TotalHorasResponse_QNAME = new QName("http://UDDI/", "total_horasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uddi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Sueldo }
     * 
     */
    public Sueldo createSueldo() {
        return new Sueldo();
    }

    /**
     * Create an instance of {@link SueldoResponse }
     * 
     */
    public SueldoResponse createSueldoResponse() {
        return new SueldoResponse();
    }

    /**
     * Create an instance of {@link TotalHoras }
     * 
     */
    public TotalHoras createTotalHoras() {
        return new TotalHoras();
    }

    /**
     * Create an instance of {@link TotalHorasResponse }
     * 
     */
    public TotalHorasResponse createTotalHorasResponse() {
        return new TotalHorasResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sueldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "sueldo")
    public JAXBElement<Sueldo> createSueldo(Sueldo value) {
        return new JAXBElement<Sueldo>(_Sueldo_QNAME, Sueldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SueldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "sueldoResponse")
    public JAXBElement<SueldoResponse> createSueldoResponse(SueldoResponse value) {
        return new JAXBElement<SueldoResponse>(_SueldoResponse_QNAME, SueldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalHoras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "total_horas")
    public JAXBElement<TotalHoras> createTotalHoras(TotalHoras value) {
        return new JAXBElement<TotalHoras>(_TotalHoras_QNAME, TotalHoras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalHorasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "total_horasResponse")
    public JAXBElement<TotalHorasResponse> createTotalHorasResponse(TotalHorasResponse value) {
        return new JAXBElement<TotalHorasResponse>(_TotalHorasResponse_QNAME, TotalHorasResponse.class, null, value);
    }

}


package controller;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the controller package. 
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

    private final static QName _GetVehiculos_QNAME = new QName("http://controller/", "getVehiculos");
    private final static QName _GetVehiculosResponse_QNAME = new QName("http://controller/", "getVehiculosResponse");
    private final static QName _Hello_QNAME = new QName("http://controller/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://controller/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: controller
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVehiculos }
     * 
     */
    public GetVehiculos createGetVehiculos() {
        return new GetVehiculos();
    }

    /**
     * Create an instance of {@link GetVehiculosResponse }
     * 
     */
    public GetVehiculosResponse createGetVehiculosResponse() {
        return new GetVehiculosResponse();
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
     * Create an instance of {@link Vehiculo }
     * 
     */
    public Vehiculo createVehiculo() {
        return new Vehiculo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehiculos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "getVehiculos")
    public JAXBElement<GetVehiculos> createGetVehiculos(GetVehiculos value) {
        return new JAXBElement<GetVehiculos>(_GetVehiculos_QNAME, GetVehiculos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehiculosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "getVehiculosResponse")
    public JAXBElement<GetVehiculosResponse> createGetVehiculosResponse(GetVehiculosResponse value) {
        return new JAXBElement<GetVehiculosResponse>(_GetVehiculosResponse_QNAME, GetVehiculosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}


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

    private final static QName _CreateAlquiler_QNAME = new QName("http://controller/", "createAlquiler");
    private final static QName _CreateAlquilerResponse_QNAME = new QName("http://controller/", "createAlquilerResponse");
    private final static QName _Hello_QNAME = new QName("http://controller/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://controller/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: controller
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAlquiler }
     * 
     */
    public CreateAlquiler createCreateAlquiler() {
        return new CreateAlquiler();
    }

    /**
     * Create an instance of {@link CreateAlquilerResponse }
     * 
     */
    public CreateAlquilerResponse createCreateAlquilerResponse() {
        return new CreateAlquilerResponse();
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
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Vehiculo }
     * 
     */
    public Vehiculo createVehiculo() {
        return new Vehiculo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAlquiler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "createAlquiler")
    public JAXBElement<CreateAlquiler> createCreateAlquiler(CreateAlquiler value) {
        return new JAXBElement<CreateAlquiler>(_CreateAlquiler_QNAME, CreateAlquiler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAlquilerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "createAlquilerResponse")
    public JAXBElement<CreateAlquilerResponse> createCreateAlquilerResponse(CreateAlquilerResponse value) {
        return new JAXBElement<CreateAlquilerResponse>(_CreateAlquilerResponse_QNAME, CreateAlquilerResponse.class, null, value);
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

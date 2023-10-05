
package com.example.verificationInera.data.itintegration.registry._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the riv.itintegration.registry._1 package. 
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

    private final static QName _LogicalAddress_QNAME = new QName("urn:riv:itintegration:registry:1", "LogicalAddress");
    private final static QName _ServiceContract_QNAME = new QName("urn:riv:itintegration:registry:1", "ServiceContract");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: riv.itintegration.registry._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceContractType }
     * 
     */
    public ServiceContractType createServiceContractType() {
        return new ServiceContractType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:riv:itintegration:registry:1", name = "LogicalAddress")
    public JAXBElement<String> createLogicalAddress(String value) {
        return new JAXBElement<String>(_LogicalAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceContractType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceContractType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:riv:itintegration:registry:1", name = "ServiceContract")
    public JAXBElement<ServiceContractType> createServiceContract(ServiceContractType value) {
        return new JAXBElement<ServiceContractType>(_ServiceContract_QNAME, ServiceContractType.class, null, value);
    }

}

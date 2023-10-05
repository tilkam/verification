
package com.example.verificationInera.data.clinicalprocess.healthcond.description.getcaredocumentationresponder._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the riv.clinicalprocess.healthcond.description.getcaredocumentationresponder._2 package. 
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

    private final static QName _GetCareDocumentation_QNAME = new QName("urn:riv:clinicalprocess:healthcond:description:GetCareDocumentationResponder:2", "GetCareDocumentation");
    private final static QName _GetCareDocumentationResponse_QNAME = new QName("urn:riv:clinicalprocess:healthcond:description:GetCareDocumentationResponder:2", "GetCareDocumentationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: riv.clinicalprocess.healthcond.description.getcaredocumentationresponder._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCareDocumentationType }
     * 
     */
    public GetCareDocumentationType createGetCareDocumentationType() {
        return new GetCareDocumentationType();
    }

    /**
     * Create an instance of {@link GetCareDocumentationResponseType }
     * 
     */
    public GetCareDocumentationResponseType createGetCareDocumentationResponseType() {
        return new GetCareDocumentationResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCareDocumentationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCareDocumentationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:riv:clinicalprocess:healthcond:description:GetCareDocumentationResponder:2", name = "GetCareDocumentation")
    public JAXBElement<GetCareDocumentationType> createGetCareDocumentation(GetCareDocumentationType value) {
        return new JAXBElement<GetCareDocumentationType>(_GetCareDocumentation_QNAME, GetCareDocumentationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCareDocumentationResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCareDocumentationResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:riv:clinicalprocess:healthcond:description:GetCareDocumentationResponder:2", name = "GetCareDocumentationResponse")
    public JAXBElement<GetCareDocumentationResponseType> createGetCareDocumentationResponse(GetCareDocumentationResponseType value) {
        return new JAXBElement<GetCareDocumentationResponseType>(_GetCareDocumentationResponse_QNAME, GetCareDocumentationResponseType.class, null, value);
    }

}

package com.example.verificationInera;

import com.example.verificationInera.data.clinicalprocess.healthcond.description._2.ObjectFactory;
import com.example.verificationInera.data.clinicalprocess.healthcond.description._2.PersonIdType;
import com.example.verificationInera.data.clinicalprocess.healthcond.description.getcaredocumentationresponder._2.GetCareDocumentationType;
import com.example.verificationInera.http.requests.HttpRequest;
import com.example.verificationInera.http.response.HttpResponse;
import org.springframework.http.HttpHeaders;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Experiment {
    public static void main(String[] args) throws JAXBException {

        HttpRequest request = new HttpRequest();
        System.out.println(request.getPayload());
        request.getRandomRequest();
        System.out.println(request.getPayload());
        System.out.println("--------------");
        //printHeaders(head);
        HttpResponse response = new HttpResponse();
        System.out.println(response.getPayload());

    }

    private static void printHeaders(HttpHeaders headers) {
        headers.forEach((key, values) -> {
            String headerValue = String.join(", ", values);
            System.out.println(key + ": " + headerValue);
        });
    }

    private static void convertMessage(JAXBContext contextTest, JAXBElement<GetCareDocumentationType> getCareJax) throws JAXBException {
        Marshaller mar = contextTest.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(getCareJax, System.out);
        mar.marshal(getCareJax, new File("src/main/resources/request.xml"));
    }

    private static void patientRequest(String id, String type, ObjectFactory factory, GetCareDocumentationType getCare) {
        PersonIdType patient = factory.createPersonIdType();
        patient.setType(type);
        patient.setId(id);

        getCare.setPatientId(patient);
    }
}

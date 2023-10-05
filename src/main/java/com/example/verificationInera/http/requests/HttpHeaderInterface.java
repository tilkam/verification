package com.example.verificationInera.http.requests;

import org.springframework.http.HttpHeaders;

import java.util.List;

public interface HttpHeaderInterface {
    HttpHeaders getFaultyHeader();

    List<String> getValues();

    HttpHeaders getHeaders();

    HttpHeaders addHeaderAndValue(String header, String value);

    HttpHeaders addHeaderAndValues(String header, List<String> value);
    HttpHeaders changeValue(String header, String value);

    String getPayload();
}

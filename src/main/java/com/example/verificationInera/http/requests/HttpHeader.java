package com.example.verificationInera.http;

import org.springframework.http.HttpHeaders;

import java.util.List;

public class HttpHeader {
    private String header;
    private String value;
    private List<String> values;
    private HttpHeaders headers;
    private HttpRequestData data = new HttpRequestData();

    public HttpHeader() {
        this.headers = data.getHeader();
    }

    public HttpHeader(String header, String value) {
        this.header = header;
        this.value = value;
    }

    public HttpHeader(String header, List<String> value) {
        this.header = header;
        this.values = value;
    }
    public HttpHeaders getFaultyHeader(){
        headers = data.getFaultyHeader();
        return headers;
    }

    public List<String> getValues() {
        return values;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public String getHeader() {
        return header;
    }

    public String getValue() {
        return value;
    }

    public HttpHeaders addHeaders(String header, String value) {
        if (!headers.containsKey(header)) {
            headers.add(header, value);
        } else {
            headers.add(header, value);
        }
        return headers;
    }

}

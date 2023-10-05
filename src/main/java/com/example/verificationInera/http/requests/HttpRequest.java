package com.example.verificationInera.http.requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;

import java.util.List;

@Setter
@Getter
@Data
public class HttpRequest implements HttpHeaderInterface {

    private List<String> values;
    private HttpHeaders headers;
    private HttpRequestData data = new HttpRequestData();

    public HttpRequest() {
        this.headers = data.getHeaders();
    }

    public HttpRequest(String header, String value){
        this.headers = data.getHeaders();
        this.headers.add(header, value);
    }
    /**
     * @return request with invalid values
     */
    @Override
    public HttpHeaders getFaultyHeader() {
        headers = data.getFaultyHeader();
        return headers;
    }

    /**
     * Add or Update one header with a single value in request
     *
     * @param header the header to add/update
     * @param value the value of header (data)
     * @return updated request
     */

    @Override
    public HttpHeaders addHeaderAndValue(String header, String value) {
        headers.add(header, value);
        return headers;
    }
    /**
     * Add or Update one header with multiple values in request
     *
     * @param header the header to add/update
     * @param value the values of header (data)
     * @return updated request
     */

    @Override
    public HttpHeaders addHeaderAndValues(String header, List<String> value) {
        headers.addAll(header, value);
        return headers;
    }
    /**
     * Overwrite the value of a specific header
     *
     * @param header the header to update
     * @param value the value of header (data)
     * @return updated request
     */
    public HttpHeaders changeValue(String header, String value) {
            headers.set(header, value);
        return headers;
    }

    @Override
    public String getPayload() {
        StringBuilder sb = new StringBuilder();
        sb.append(data.getStartLine()).append("\r\n");
        headers.forEach((key, values) -> {
            String headerValue = String.join(", ", values);
            sb.append(key).append(": ").append(headerValue).append("\r\n");
        });
        return sb.toString();
    }
    public void getRandomRequest(){
        this.headers = data.getRandomRequestHeader();

    }

}

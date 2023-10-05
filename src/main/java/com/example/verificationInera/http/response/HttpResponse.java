package com.example.verificationInera.http.response;

import com.example.verificationInera.http.requests.HttpHeaderInterface;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;

import java.util.List;

@Setter
@Getter
@Data

public class HttpResponse implements HttpHeaderInterface {

    private List<String> values;
    private HttpHeaders headers;
    private HttpResponseData data = new HttpResponseData();

    public HttpResponse() {
        this.headers = data.getHeader();
    }

    public HttpResponse(String header, String value) {
        this.headers = new HttpHeaders();
        headers.add(header, value);
    }

    @Override
    public HttpHeaders getFaultyHeader() {
        headers = data.getFaultyHeader();
        return null;
    }

    @Override
    public HttpHeaders addHeaderAndValue(String header, String value) {
        headers.add(header, value);
        return headers;
    }

    @Override
    public HttpHeaders addHeaderAndValues(String header, List<String> value) {
        headers.addAll(header, value);
        return headers;
    }

    @Override
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
}

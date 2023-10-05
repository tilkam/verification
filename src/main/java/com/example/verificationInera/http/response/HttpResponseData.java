package com.example.verificationInera.http.response;

import com.example.verificationInera.http.requests.CustomHttpHeaders;
import lombok.*;
import org.springframework.http.HttpHeaders;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Setter
@Getter
@Data
public class HttpResponseData {
    private int random;
    private HttpHeaders header;
    public HttpResponseData() {
        header = getResponseHeaders();
    }
    public String getStartLine(){
        return "HTTP/1.1 " + getStatusCodes();
    }

    /**
     * List of type HTTPHeaders with response headers and values,
     * some headers may have more than one value
     *
     * @return list containing headers and values for response
     */

    private HttpHeaders getResponseHeaders() {
        HttpHeaders header = new HttpHeaders();
        header.set(HttpHeaders.DATE, "Wed, 04 Oct 2023 17:30:57 GMT");
        header.set(HttpHeaders.SERVER, "Apache/2.4.6");
        header.set(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        header.set(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "GET");
        header.set(HttpHeaders.ACCESS_CONTROL_MAX_AGE, "3600");
        header.set(CustomHttpHeaders.X_CONTENT_TYPE_OPTIONS_VALUE, "nosniff");
        header.set(CustomHttpHeaders.X_XSS_PROTECTION, "1; mode=block");
        header.set(HttpHeaders.CACHE_CONTROL, "no-cache, no-store, max-age=0, must-revalidate");
        header.set(HttpHeaders.PRAGMA, "no-cache");
        header.set(HttpHeaders.EXPIRES, "0");
        header.set(CustomHttpHeaders.X_FRAME_OPTIONS, "SAMEORIGIN");
        header.set(HttpHeaders.CONTENT_TYPE, "application/xml");
        header.set(HttpHeaders.VIA, CustomHttpHeaders.HOST_VALUE);
        header.set(HttpHeaders.TRANSFER_ENCODING, "chunked");

        return header;
    }

    /**
     * List with headers and values, but the header "Accept" now has the value "Application/Json"
     * Which we don't want since we only handle XML
     *
     * @return a list with one faulty response header
     */

    public HttpHeaders getFaultyHeader() {
        header.put(HttpHeaders.CONTENT_TYPE, CustomHttpHeaders.getFaulty());
        return header;
    }
    private String getStatusCodes(){
        List<String> list = List.of("200 OK", "302 Found", "307 Temporary Redirect");
        random = ThreadLocalRandom.current().nextInt(list.size());
        return list.get(random);
    }
}

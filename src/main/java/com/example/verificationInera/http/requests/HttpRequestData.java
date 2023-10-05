package com.example.verificationInera.http.requests;

import org.springframework.http.HttpHeaders;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class HttpRequestData {
    private int random;
    private HttpHeaders header;
    public HttpRequestData() {
        this.header = getRequestHeader();
    }
    public String getStartLine(){
        return "GET "+ getURL() + " HTTP/1.1";
    }

    /**
     * List of type HTTPHeaders with request headers and values,
     * some headers may have more than one value
     *
     * @return list containing headers and values for request
     */
    private HttpHeaders getRequestHeader() {
        HttpHeaders header = new HttpHeaders();
        header.addAll(HttpHeaders.ACCEPT, CustomHttpHeaders.getAccept());
        header.set(HttpHeaders.ACCEPT_LANGUAGE, Locale.US.toLanguageTag());
        header.set(HttpHeaders.HOST, CustomHttpHeaders.HOST_VALUE);
        header.set(HttpHeaders.USER_AGENT, CustomHttpHeaders.USER_AGENT_VALUE);

        return header;
    }
    public HttpHeaders getRandomRequestHeader(){
        header = getRequestHeader();
        header.set(HttpHeaders.USER_AGENT, getUserAgent());
        header.addAll(HttpHeaders.ACCEPT_LANGUAGE, getAcceptLanguage());
        header.addAll(HttpHeaders.ACCEPT, getAccept());
        HttpHeaders.formatHeaders(header);
        return header;
    }

    /**
     * List with headers and values, but the header "Accept" now has the value "Application/Json"
     * Which we don't want since we only handle XML
     *
     * @return a list with one faulty response header
     */
    public HttpHeaders getFaultyHeader() {
        header.put(HttpHeaders.ACCEPT, CustomHttpHeaders.getFaulty());
        return header;
    }
    public HttpHeaders getHeaders() {
        return header;
    }

    private String getURL(){
        List<String> list = List.of("/coop/api/v1/cooperations?logicalAddressId=1707&serviceContractId=82&include=logicalAddress%2CserviceContract",
                "/en-US/docs/Web/HTTP/Status", "journalia.se");
        random = ThreadLocalRandom.current().nextInt(list.size());
        return list.get(random);
    }
    private String getUserAgent(){
        List<String> list = List.of("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36",
                "curl/7.87.0", "PostmanRuntime/7.33.0");
        random = ThreadLocalRandom.current().nextInt(list.size());
        return list.get(random);
    }

    private List<String> getAcceptLanguage(){
        List<String> list = List.of("sv-SE","sv;q=0.9","en-US;q=0.8","en;q=0.7");
        random = ThreadLocalRandom.current().nextInt(list.size());
        return list.subList(0, random);
    }
    private List<String> getAccept(){
        List<String> list = List.of( "text/html","application/xhtml+xml","application/xml;q=0.9","image/avif,image/webp",
                "image/apng","*/*;q=0.8","application/signed-exchange;v=b3;q=0.7");
        random = ThreadLocalRandom.current().nextInt(list.size());
        return list.subList(0, random);
    }
}

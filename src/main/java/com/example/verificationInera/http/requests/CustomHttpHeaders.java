package com.example.verificationInera.http.requests;

import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomHttpHeaders {
    public static final String HOST_VALUE = "api.ntjp.se";
    public static final String USER_AGENT_VALUE = "curl/7.87.0";
    public static final String X_CONTENT_TYPE_OPTIONS_VALUE = "X-Content-Type-Options";
    public static final String X_XSS_PROTECTION = "X-XSS-Protection";
    public static final String X_FRAME_OPTIONS = "X-Frame-Options";

    public static List<String> getAccept() {
        List<String> accept = new ArrayList<>();
        accept.add(MediaType.ALL_VALUE);
        accept.add(MediaType.APPLICATION_XML_VALUE);
        accept.add(MediaType.TEXT_XML_VALUE);
        accept.add(MediaType.IMAGE_JPEG_VALUE);
        return accept;
    }

    public static List<String> getFaulty() {
        return Collections.singletonList(MediaType.APPLICATION_JSON_VALUE);
    }
}

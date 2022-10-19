package com.airtel.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.Map;

public class Utils<T> {

    public static ResponseEntity sendRequest(RequestBody requestBody, Map<String, String> headers, String url, String method) {

        Headers headersBuilder = Headers.of(headers);

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Request request = new Request.Builder()
                .url(url)
                .method(method, requestBody)
                .headers(headersBuilder)
                .build();

        Response response = null;

        String body=null;

        try {
            response = client.newCall(request).execute();
            body = response.body().string();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ResponseEntity(body, HttpStatus.valueOf(response.code()));
    }

    public static String toJson(Object entity) {
        String json = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(entity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    public T fromJson(String json, Class<T> type) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

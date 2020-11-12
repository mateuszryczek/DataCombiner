package com.mime.datacombiner;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class RestLongDataProvider implements DataProvider<Long> {

    private static final String GET_RANDOM_NUMBER_URL = "https://www.random.org/integers/?num=1&min=-100000&max=100000&col=1&base=10&format=plain&rnd=new";
    private static final int DEFAULT_TIMEOUT = 10;
    private static final long DEFAULT_NUMBER_VALUE = 0L;
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(DEFAULT_TIMEOUT))
            .build();

    @Override
    public Long getData() {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(GET_RANDOM_NUMBER_URL))
                .build();

        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response != null ? Long.parseLong(response.body().trim()) : DEFAULT_NUMBER_VALUE;
    }
}

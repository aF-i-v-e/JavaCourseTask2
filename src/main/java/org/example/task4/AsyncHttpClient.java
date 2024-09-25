package org.example.task4;

import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class AsyncHttpClient {

    private HttpRequest createGetRequest(String uri) {
        return HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();
    }

    private CompletableFuture<HttpResponse<String>> sendGetRequest(String uri) {
        CompletableFuture<HttpResponse<String>> response = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = createGetRequest(uri);
            response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }

    public void printRequestIP(String uri) {
        CompletableFuture<HttpResponse<String>> response = sendGetRequest(uri);
        if (response == null) {
            System.out.println("Ответ на запрос был null!" );
            return;
        }

        response.thenAccept(resp ->
                System.out.printf("Код выполнения запроса: %1$s\n", resp.statusCode())).join();

        response.thenApply(HttpResponse::body)
                .thenAccept(responseBody -> {
                    JSONObject jsonResponse = new JSONObject(responseBody);
                    String ip = jsonResponse.getString("origin" );
                    System.out.println("IP адрес: " + ip);
                }).join();
    }
}

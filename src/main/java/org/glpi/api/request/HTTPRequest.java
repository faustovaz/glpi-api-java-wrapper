package org.glpi.api.request;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class HTTPRequest {

	public HttpResponse<String> get(String url, Map<String, String> headers) throws URISyntaxException, IOException, InterruptedException {
		HttpRequest httpRequest = HttpRequest
			.newBuilder()
			.headers(GLPIHeaders.toArray(headers))
			.uri(new URI(url))
			.GET()
			.build();
		HttpClient httpClient = HttpClient.newHttpClient();
		return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
	}
	
}

package org.glpi.api.request;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

import org.glpi.api.exception.GLPISessionException;

public class GLPICommunicator {

	private final String url;
	private final Map<String, String> headers;
	
	public GLPICommunicator(String url) {
		this.url = url;
		this.headers = new HashMap<>();
	}
	
	public void addHeader(String header, String value) {
		this.headers.put(header, value);
	}
	
	public HttpResponse<String> getAsString(String path) {
		return this.getAsString(path, Map.of());
	}
	
	public HttpResponse<String> getAsString(String path, Map<String, String> requestHeaders) {
		var allHeaders = new HashMap<>(this.headers);
		allHeaders.putAll(requestHeaders);
		HttpRequest httpRequest = HttpRequest
									.newBuilder()
									.headers(GLPIHeaders.toArray(allHeaders))
									.uri(uri(url + path))
									.GET()
									.build();
		return this.send(httpRequest, HttpResponse.BodyHandlers.ofString());
	}
	
	private <T> HttpResponse<T> send(HttpRequest request, HttpResponse.BodyHandler<T> responseType) {
		try {
			HttpClient httpClient = HttpClient.newHttpClient();
			return httpClient.send(request, responseType);
		} catch (IOException | InterruptedException e) {
			throw new GLPISessionException(e.getMessage(), e.getCause());
		}
	}
	
	private URI uri(String url) {
		try {
			return new URI(url);
		} catch (URISyntaxException e) {
			throw new GLPISessionException(e.getMessage(), e.getCause());
		}
	}
	
}

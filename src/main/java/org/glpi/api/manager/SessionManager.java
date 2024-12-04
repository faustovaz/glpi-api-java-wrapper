package org.glpi.api.manager;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.glpi.api.item.GLPISession;
import org.glpi.api.request.HTTPRequest;

public class SessionManager {
	
	private Map<String, String> headers;
	private String url;
	private HTTPRequest httpManager;
	
	public SessionManager(String url) {
		this.url = url + "/initSession";
		this.headers = new HashMap<>(Map.of("Content-Type", "application/json"));
		this.httpManager = new HTTPRequest();
	}
	
	public SessionManager withAppToken(String appToken) {
		this.headers.put("App-Token", appToken);
		return this;
	}
	
	public SessionManager withCredentials(String login, String password) {
		byte[] encoded = Base64.getEncoder().encode(String.format("%s:%s", login, password).getBytes());
		this.headers.put("Authorization", "Basic " + Base64.getEncoder().encodeToString(encoded));
		return this;
	}
	
	public SessionManager withUserToken(String userToken) {
		this.headers.put("Authorization", "user_token " + userToken);
		return this;
	}
	
	public GLPISession build() {	
		HttpResponse<String> response;
		try {
			response = httpManager.get(this.url, this.headers);
			return new GLPISession(response.body());
		} catch (URISyntaxException | IOException | InterruptedException e) {
			return null;
		}
	}

}

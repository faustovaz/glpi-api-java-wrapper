package org.glpi.api.manager;

import java.net.HttpURLConnection;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.glpi.api.exception.GLPISessionException;
import org.glpi.api.item.GLPIItems;
import org.glpi.api.item.GLPISession;
import org.glpi.api.request.GLPICommunicator;
import org.glpi.api.request.GLPIHeaders;

import com.google.gson.Gson;

public class SessionManager {
	
	private final Map<String, String> requestHeaders;
	private final GLPICommunicator communicator;
	
	public SessionManager(String url) {
		this.requestHeaders = new HashMap<String, String>();
		this.communicator = new GLPICommunicator(url);
		this.communicator.addHeader("Content-Type", "application/json");
	}
	
	public SessionManager withAppToken(String appToken) {
		this.communicator.addHeader(GLPIHeaders.APP_TOKEN, appToken);
		return this;
	}
	
	public SessionManager withCredentials(String login, String password) {
		byte[] encoded = Base64.getEncoder().encode(String.format("%s:%s", login, password).getBytes());
		this.requestHeaders.put(GLPIHeaders.AUTHORIZATION, GLPIHeaders.BASIC + new String(encoded));
		return this;
	}
	
	public SessionManager withUserToken(String userToken) {
		this.requestHeaders.put(GLPIHeaders.AUTHORIZATION, GLPIHeaders.USER_TOKEN + userToken);
		return this;
	}
	
	public GLPISession build() {	
		var response = this.communicator.getAsString(GLPIItems.INIT_SESSION.path(), this.requestHeaders);
		if (response.statusCode() != HttpURLConnection.HTTP_OK) {
			throw new GLPISessionException("It was not possible to start a session. Verify your credentials.");
		}
		var gson = new Gson();
		var jsonMap = gson.fromJson(response.body(), Map.class);
		var sessionToken = (String) jsonMap.get("session_token");
		this.communicator.addHeader(GLPIHeaders.SESSION_TOKEN, sessionToken);
		return new GLPISession(communicator);
	}

}

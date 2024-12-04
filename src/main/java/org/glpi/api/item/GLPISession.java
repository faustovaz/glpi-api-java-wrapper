package org.glpi.api.item;

public class GLPISession {
	
	private String sessionToken;

	public GLPISession(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public String getSessionToken() {
		return sessionToken;
	}
	
}

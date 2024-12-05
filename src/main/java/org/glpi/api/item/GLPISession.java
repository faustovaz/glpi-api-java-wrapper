package org.glpi.api.item;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;

import org.glpi.api.exception.GLPISessionException;
import org.glpi.api.request.GLPICommunicator;

public class GLPISession {
	
	private final GLPICommunicator communicator;

	public GLPISession(GLPICommunicator communicator) {
		this.communicator = communicator;
	}
	
	public GLPICommunicator getCommunicator() {
		return this.communicator;
	}
	
	public void killSession() {
		try {
			var response = this.communicator.getAsString(GLPIItems.KILL_SESSION.path());
			if (response.statusCode() != HttpURLConnection.HTTP_OK) {
				throw new GLPISessionException("Error trying to kill glpi session");
			}
			
		} catch (URISyntaxException | IOException | InterruptedException e) {
			throw new GLPISessionException(e.getMessage(), e.getCause());
		}
	}
}

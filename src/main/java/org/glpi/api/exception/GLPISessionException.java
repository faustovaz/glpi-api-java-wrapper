package org.glpi.api.exception;

public class GLPISessionException extends RuntimeException {

	private static final long serialVersionUID = -3078246834201214053L;

	public GLPISessionException() {
		super();
	}

	public GLPISessionException(String message) {
		super(message);
	}
	
	public GLPISessionException(String message, Throwable cause) {
		super(message, cause);
	}
	
}

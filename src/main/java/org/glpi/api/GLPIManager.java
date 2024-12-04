package org.glpi.api;

import org.glpi.api.item.GLPISession;

public class GLPIManager {

	private final GLPISession session;
	
	public GLPIManager(GLPISession session) {
		super();
		this.session = session;
	}

	public GLPISession getSession() {
		return session;
	}
	
}

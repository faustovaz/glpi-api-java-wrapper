package org.glpi.api;

import org.glpi.api.item.GLPISession;

public class GLPIManager {

	private final GLPISession glpiSession;
	
	public GLPIManager(GLPISession glpiSession) {
		this.glpiSession = glpiSession;
	}

	public void killSession() {
		this.glpiSession.killSession();
	}
	
}

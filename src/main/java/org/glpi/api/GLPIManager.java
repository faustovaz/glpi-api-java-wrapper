package org.glpi.api;

import org.glpi.api.item.GLPISession;
import org.glpi.api.manager.ItilCategoryManager;

public class GLPIManager {

	private final GLPISession glpiSession;
	
	public GLPIManager(GLPISession glpiSession) {
		this.glpiSession = glpiSession;
	}

	public void killSession() {
		this.glpiSession.killSession();
	}
	
	public ItilCategoryManager getItilCategoryManager() {
		return new ItilCategoryManager(this.glpiSession);
	}
	
}

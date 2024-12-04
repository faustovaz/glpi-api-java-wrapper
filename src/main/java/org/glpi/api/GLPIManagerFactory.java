package org.glpi.api;

import org.glpi.api.item.GLPISession;
import org.glpi.api.manager.SessionManager;

/**
 * Entrypoint for the API
 */
public final class GLPIManagerFactory {

	/**
	 * 
	 * @param url
	 * @param appToken
	 * @param login
	 * @param password
	 * @return GlpiPanager
	 */
	public static GLPIManager createWithCredentials(String url, String appToken, String login, String password) {
		GLPISession glpiSession = new SessionManager(url)
								.withAppToken(appToken)
								.withCredentials(login, password)
								.build();
		return new GLPIManager(glpiSession);
	}
	
	/**
	 * 
	 * @param url
	 * @param appToken
	 * @param userToken
	 * @return GlpiManager
	 */
	public static GLPIManager createWithUserToken(String url, String appToken, String userToken) {
		GLPISession glpiSession = new SessionManager(url)
								.withAppToken(appToken)
								.withUserToken(userToken)
								.build();
		return new GLPIManager(glpiSession);
	}

}

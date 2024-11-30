package org.glpi.api;

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
		return new GLPIManager();
	}
	
	/**
	 * 
	 * @param url
	 * @param appToken
	 * @param userToken
	 * @return GlpiManager
	 */
	public static GLPIManager createWithAppToken(String url, String appToken, String userToken) {
		return new GLPIManager();
	}

}

package org.glpi.api.manager;

import java.net.HttpURLConnection;
import java.net.http.HttpResponse;

import org.glpi.api.exception.GLPISessionException;
import org.glpi.api.item.GLPIItems;
import org.glpi.api.item.GLPISession;
import org.glpi.api.item.ItilCategory;

import com.google.gson.Gson;

public class ItilCategoryManager {

	private final GLPISession glpiSession;

	public ItilCategoryManager(GLPISession glpiSession) {
		this.glpiSession = glpiSession;
	}
	
	public ItilCategory get(long id) {
		String path = String.format("%s/%s", GLPIItems.ItilCategory.path(), id);
		HttpResponse<String> response = this.glpiSession.getCommunicator().getAsString(path);
		if (response.statusCode() != HttpURLConnection.HTTP_OK) {
			throw new GLPISessionException("Error trying to get ItilCategory with id " + id);
		}
		Gson gson = new Gson();
		return gson.fromJson(response.body(), ItilCategory.class);
	}
	
}

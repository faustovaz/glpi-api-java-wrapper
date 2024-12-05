package org.glpi.api.item;

public enum GLPIItems {

	INIT_SESSION("Init GLPI Session", "/initSession"),
	KILL_SESSION("Kill GLPI Session", "/killSession");
	
	private String description;
	private String path;
	
	GLPIItems(String description, String path) {
		this.description = description;
		this.path = path;
	}

	public String description() {
		return this.description;
	}
	
	public String path() {
		return this.path;
	}
	
}

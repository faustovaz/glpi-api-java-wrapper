package org.glpi.api;

public class Main {

	public static void main(String[] args) {

		GLPIManager manager = GLPIManagerFactory.createWithUserToken("http://172.10.0.4/apirest.php/", "s6R590d3F1DbZfG9joIC2NnfWwyhnKFW68WivcOZ", "0cndqI5uxRqj0gVtbSEvV6uaTEc9w7Xbk0cPaucz");
		System.out.println(manager.getSession().getSessionToken());
		
	}

}

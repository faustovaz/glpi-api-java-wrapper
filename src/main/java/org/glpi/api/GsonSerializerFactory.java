package org.glpi.api;

import org.glpi.api.adapter.IntToBooleanJsonAdapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSerializerFactory {

	public static Gson create() {
		return new GsonBuilder()
					.registerTypeAdapter(Boolean.class, new IntToBooleanJsonAdapter())
					.create();
	}
	
}

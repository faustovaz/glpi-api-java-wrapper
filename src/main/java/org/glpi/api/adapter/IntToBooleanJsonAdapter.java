package org.glpi.api.adapter;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class IntToBooleanJsonAdapter extends TypeAdapter<Boolean> {

	@Override
	public void write(JsonWriter out, Boolean value) throws IOException {
		out.value(value ? 1 : 0);
	}

	@Override
	public Boolean read(JsonReader in) throws IOException {
		return in.nextInt() == 1;
	}

}

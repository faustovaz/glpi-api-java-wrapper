package org.glpi.api.request;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

public class GLPIHeaders {

	public static String[] toArray(Map<String, String> headers) {
		Set<Entry<String, String>> entrySet = headers.entrySet();
		List<String> collect = entrySet
			.stream()
			.map(entry -> List.of(entry.getKey(), entry.getValue()))
			.flatMap(Collection::stream)
			.collect(Collectors.toList());
		return collect.toArray(new String[collect.size()]);
	}
	
}

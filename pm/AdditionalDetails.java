
package com.pm;

import java.util.HashMap;
import java.util.Map;

public class AdditionalDetails {

	private Map<String, Object> additionalProperties = new HashMap<>();

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

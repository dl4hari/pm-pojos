package com.pm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PmapiPolicyResponse {

	private List<Response> response = null;
	private Map<String, Object> additionalProperties = new HashMap<>();

	public List<Response> getResponse() {
		return response;
	}

	public void setResponse(List<Response> response) {
		this.response = response;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

package com.pm;

import java.util.HashMap;
import java.util.Map;

public class OtpRulesFailure {

	private String code;
	private AdditionalDetails additionalDetails;
	private String description;
	private String template;
	private Map<String, Object> additionalProperties = new HashMap<>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public AdditionalDetails getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(AdditionalDetails additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

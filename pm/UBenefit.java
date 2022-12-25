package com.pm;

import java.util.HashMap;
import java.util.Map;

public class UBenefit {

	private String uBenefitId;
	private String effectiveDate;
	private String policyNumber;
	private String uBenefitInd;
	private Map<String, Object> additionalProperties = new HashMap<>();

	public String getuBenefitId() {
		return uBenefitId;
	}

	public void setuBenefitId(String uBenefitId) {
		this.uBenefitId = uBenefitId;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getuBenefitInd() {
		return uBenefitInd;
	}

	public void setuBenefitInd(String uBenefitInd) {
		this.uBenefitInd = uBenefitInd;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
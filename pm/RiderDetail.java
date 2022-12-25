package com.pm;

import java.util.HashMap;
import java.util.Map;

public class RiderDetail {

	private String policyNumber;
	private String companyCode;
	private Integer personNumber;
	private String baseRiderInd;
	private String statusCode;
	private String riderCode;
	private String riderEffDate;
	private Double riderBenefitAmt;
	private String riderDescrip;
	private String firstName;
	private String middleName;
	private String lastName;
	private String paidToDate;
	private RiderForm riderForm;
	private Boolean legacy;
	private Double monthlyPremium;
	private Double quartPremium;
	private Double semiPremium;
	private Double recurringPremium;
	private Double annualPremium;
	private String riderTermDate;
	private Map<String, Object> additionalProperties = new HashMap<>();

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public Integer getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(Integer personNumber) {
		this.personNumber = personNumber;
	}

	public String getBaseRiderInd() {
		return baseRiderInd;
	}

	public void setBaseRiderInd(String baseRiderInd) {
		this.baseRiderInd = baseRiderInd;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getRiderCode() {
		return riderCode;
	}

	public void setRiderCode(String riderCode) {
		this.riderCode = riderCode;
	}

	public String getRiderEffDate() {
		return riderEffDate;
	}

	public void setRiderEffDate(String riderEffDate) {
		this.riderEffDate = riderEffDate;
	}

	public Double getRiderBenefitAmt() {
		return riderBenefitAmt;
	}

	public void setRiderBenefitAmt(Double riderBenefitAmt) {
		this.riderBenefitAmt = riderBenefitAmt;
	}

	public String getRiderDescrip() {
		return riderDescrip;
	}

	public void setRiderDescrip(String riderDescrip) {
		this.riderDescrip = riderDescrip;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPaidToDate() {
		return paidToDate;
	}

	public void setPaidToDate(String paidToDate) {
		this.paidToDate = paidToDate;
	}

	public RiderForm getRiderForm() {
		return riderForm;
	}

	public void setRiderForm(RiderForm riderForm) {
		this.riderForm = riderForm;
	}

	public Boolean getLegacy() {
		return legacy;
	}

	public void setLegacy(Boolean legacy) {
		this.legacy = legacy;
	}

	public Double getMonthlyPremium() {
		return monthlyPremium;
	}

	public void setMonthlyPremium(Double monthlyPremium) {
		this.monthlyPremium = monthlyPremium;
	}

	public Double getQuartPremium() {
		return quartPremium;
	}

	public void setQuartPremium(Double quartPremium) {
		this.quartPremium = quartPremium;
	}

	public Double getSemiPremium() {
		return semiPremium;
	}

	public void setSemiPremium(Double semiPremium) {
		this.semiPremium = semiPremium;
	}

	public Double getRecurringPremium() {
		return recurringPremium;
	}

	public void setRecurringPremium(Double recurringPremium) {
		this.recurringPremium = recurringPremium;
	}

	public Double getAnnualPremium() {
		return annualPremium;
	}

	public void setAnnualPremium(Double annualPremium) {
		this.annualPremium = annualPremium;
	}

	public String getRiderTermDate() {
		return riderTermDate;
	}

	public void setRiderTermDate(String riderTermDate) {
		this.riderTermDate = riderTermDate;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

package com.pm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Response {

	private String policyNumber;
	private String companyCode;
	private String productCode;
	private String coverageCode;
	private String policyKindCode;
	private String longDescription;
	private String effectiveDate;
	private String issueDate;
	private Double benefitAmount;
	private String policyStatus;
	private String issueState;
	private String paidToDate;
	private String nextPayDueDate;
	private String lastPaymentDate;
	private String lastPaymentRecvdDate;
	private Double currentPremiumDue;
	private String currentMode;
	private Double lastPaymentAmt;
	private String lastPaymentDescrip;
	private String lastPaymentTransDate;
	private String lastPaymentType;
	private String billingMethod;
	private Integer issueAge;
	private Double monthyPremium;
	private Double quarterlyPremium;
	private Double semiAnnualPremium;
	private Double annualPremium;
	private Double recurringAchPremium;
	private Double recurringCCPremium;
	private String paymentMethod;
	private String distributionChannel;
	private String lastPmtStatusCode;
	private String suspendCode;
	private Boolean requestBillEligible;
	private String classCode;
	private String policyStatusLong;
	private String familyCode;
	private String statusChangeReasonCode;
	private Boolean migratedInd;
	private String submitDate;
	private String schedule;
	private Boolean showLastPaymentReceived;
	private String netPremium;
	private String adminSystem;
	private List<OtpRulesFailure> otpRulesFailures = null;
	private List<RiderDetail> riderDetails = null;
	private List<Object> beneficiaryDetails = null;
	private Object additionalCoverages;
	private Object riderOffers;
	private List<UBenefit> uBenefits = null;
	private Object discounts;
	private Boolean electronicPaymentAllowed;
	private String policyType;
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

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getCoverageCode() {
		return coverageCode;
	}

	public void setCoverageCode(String coverageCode) {
		this.coverageCode = coverageCode;
	}

	public String getPolicyKindCode() {
		return policyKindCode;
	}

	public void setPolicyKindCode(String policyKindCode) {
		this.policyKindCode = policyKindCode;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public Double getBenefitAmount() {
		return benefitAmount;
	}

	public void setBenefitAmount(Double benefitAmount) {
		this.benefitAmount = benefitAmount;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getIssueState() {
		return issueState;
	}

	public void setIssueState(String issueState) {
		this.issueState = issueState;
	}

	public String getPaidToDate() {
		return paidToDate;
	}

	public void setPaidToDate(String paidToDate) {
		this.paidToDate = paidToDate;
	}

	public String getNextPayDueDate() {
		return nextPayDueDate;
	}

	public void setNextPayDueDate(String nextPayDueDate) {
		this.nextPayDueDate = nextPayDueDate;
	}

	public String getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(String lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public String getLastPaymentRecvdDate() {
		return lastPaymentRecvdDate;
	}

	public void setLastPaymentRecvdDate(String lastPaymentRecvdDate) {
		this.lastPaymentRecvdDate = lastPaymentRecvdDate;
	}

	public Double getCurrentPremiumDue() {
		return currentPremiumDue;
	}

	public void setCurrentPremiumDue(Double currentPremiumDue) {
		this.currentPremiumDue = currentPremiumDue;
	}

	public String getCurrentMode() {
		return currentMode;
	}

	public void setCurrentMode(String currentMode) {
		this.currentMode = currentMode;
	}

	public Double getLastPaymentAmt() {
		return lastPaymentAmt;
	}

	public void setLastPaymentAmt(Double lastPaymentAmt) {
		this.lastPaymentAmt = lastPaymentAmt;
	}

	public String getLastPaymentDescrip() {
		return lastPaymentDescrip;
	}

	public void setLastPaymentDescrip(String lastPaymentDescrip) {
		this.lastPaymentDescrip = lastPaymentDescrip;
	}

	public String getLastPaymentTransDate() {
		return lastPaymentTransDate;
	}

	public void setLastPaymentTransDate(String lastPaymentTransDate) {
		this.lastPaymentTransDate = lastPaymentTransDate;
	}

	public String getLastPaymentType() {
		return lastPaymentType;
	}

	public void setLastPaymentType(String lastPaymentType) {
		this.lastPaymentType = lastPaymentType;
	}

	public String getBillingMethod() {
		return billingMethod;
	}

	public void setBillingMethod(String billingMethod) {
		this.billingMethod = billingMethod;
	}

	public Integer getIssueAge() {
		return issueAge;
	}

	public void setIssueAge(Integer issueAge) {
		this.issueAge = issueAge;
	}

	public Double getMonthyPremium() {
		return monthyPremium;
	}

	public void setMonthyPremium(Double monthyPremium) {
		this.monthyPremium = monthyPremium;
	}

	public Double getQuarterlyPremium() {
		return quarterlyPremium;
	}

	public void setQuarterlyPremium(Double quarterlyPremium) {
		this.quarterlyPremium = quarterlyPremium;
	}

	public Double getSemiAnnualPremium() {
		return semiAnnualPremium;
	}

	public void setSemiAnnualPremium(Double semiAnnualPremium) {
		this.semiAnnualPremium = semiAnnualPremium;
	}

	public Double getAnnualPremium() {
		return annualPremium;
	}

	public void setAnnualPremium(Double annualPremium) {
		this.annualPremium = annualPremium;
	}

	public Double getRecurringAchPremium() {
		return recurringAchPremium;
	}

	public void setRecurringAchPremium(Double recurringAchPremium) {
		this.recurringAchPremium = recurringAchPremium;
	}

	public Double getRecurringCCPremium() {
		return recurringCCPremium;
	}

	public void setRecurringCCPremium(Double recurringCCPremium) {
		this.recurringCCPremium = recurringCCPremium;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getDistributionChannel() {
		return distributionChannel;
	}

	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public String getLastPmtStatusCode() {
		return lastPmtStatusCode;
	}

	public void setLastPmtStatusCode(String lastPmtStatusCode) {
		this.lastPmtStatusCode = lastPmtStatusCode;
	}

	public String getSuspendCode() {
		return suspendCode;
	}

	public void setSuspendCode(String suspendCode) {
		this.suspendCode = suspendCode;
	}

	public Boolean getRequestBillEligible() {
		return requestBillEligible;
	}

	public void setRequestBillEligible(Boolean requestBillEligible) {
		this.requestBillEligible = requestBillEligible;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getPolicyStatusLong() {
		return policyStatusLong;
	}

	public void setPolicyStatusLong(String policyStatusLong) {
		this.policyStatusLong = policyStatusLong;
	}

	public String getFamilyCode() {
		return familyCode;
	}

	public void setFamilyCode(String familyCode) {
		this.familyCode = familyCode;
	}

	public String getStatusChangeReasonCode() {
		return statusChangeReasonCode;
	}

	public void setStatusChangeReasonCode(String statusChangeReasonCode) {
		this.statusChangeReasonCode = statusChangeReasonCode;
	}

	public Boolean getMigratedInd() {
		return migratedInd;
	}

	public void setMigratedInd(Boolean migratedInd) {
		this.migratedInd = migratedInd;
	}

	public String getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Boolean getShowLastPaymentReceived() {
		return showLastPaymentReceived;
	}

	public void setShowLastPaymentReceived(Boolean showLastPaymentReceived) {
		this.showLastPaymentReceived = showLastPaymentReceived;
	}

	public String getNetPremium() {
		return netPremium;
	}

	public void setNetPremium(String netPremium) {
		this.netPremium = netPremium;
	}

	public String getAdminSystem() {
		return adminSystem;
	}

	public void setAdminSystem(String adminSystem) {
		this.adminSystem = adminSystem;
	}

	public List<OtpRulesFailure> getOtpRulesFailures() {
		return otpRulesFailures;
	}

	public void setOtpRulesFailures(List<OtpRulesFailure> otpRulesFailures) {
		this.otpRulesFailures = otpRulesFailures;
	}

	public List<RiderDetail> getRiderDetails() {
		return riderDetails;
	}

	public void setRiderDetails(List<RiderDetail> riderDetails) {
		this.riderDetails = riderDetails;
	}

	public List<Object> getBeneficiaryDetails() {
		return beneficiaryDetails;
	}

	public void setBeneficiaryDetails(List<Object> beneficiaryDetails) {
		this.beneficiaryDetails = beneficiaryDetails;
	}

	public Object getAdditionalCoverages() {
		return additionalCoverages;
	}

	public void setAdditionalCoverages(Object additionalCoverages) {
		this.additionalCoverages = additionalCoverages;
	}

	public Object getRiderOffers() {
		return riderOffers;
	}

	public void setRiderOffers(Object riderOffers) {
		this.riderOffers = riderOffers;
	}

	public List<UBenefit> getuBenefits() {
		return uBenefits;
	}

	public void setuBenefits(List<UBenefit> uBenefits) {
		this.uBenefits = uBenefits;
	}

	public Object getDiscounts() {
		return discounts;
	}

	public void setDiscounts(Object discounts) {
		this.discounts = discounts;
	}

	public Boolean getElectronicPaymentAllowed() {
		return electronicPaymentAllowed;
	}

	public void setElectronicPaymentAllowed(Boolean electronicPaymentAllowed) {
		this.electronicPaymentAllowed = electronicPaymentAllowed;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

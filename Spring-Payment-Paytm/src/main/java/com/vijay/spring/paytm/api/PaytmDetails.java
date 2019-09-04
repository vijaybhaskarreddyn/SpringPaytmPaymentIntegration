package com.vijay.spring.paytm.api;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties("paytm.payment.sandbox")

public class PaytmDetails {

	private String merchantId;

	private String merchantKey;

	private String channelId;

	private String website;

	private String industryTypeId;

	private String paytmUrl;

	private Map<String, String> details;

	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * @return the merchantKey
	 */
	public String getMerchantKey() {
		return merchantKey;
	}

	/**
	 * @param merchantKey the merchantKey to set
	 */
	public void setMerchantKey(String merchantKey) {
		this.merchantKey = merchantKey;
	}

	/**
	 * @return the channelId
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return the industryTypeId
	 */
	public String getIndustryTypeId() {
		return industryTypeId;
	}

	/**
	 * @param industryTypeId the industryTypeId to set
	 */
	public void setIndustryTypeId(String industryTypeId) {
		this.industryTypeId = industryTypeId;
	}

	/**
	 * @return the paytmUrl
	 */
	public String getPaytmUrl() {
		return paytmUrl;
	}

//add some more comments on this model
	/**
	 * @param paytmUrl the paytmUrl to set
	 */
	public void setPaytmUrl(String paytmUrl) {
		this.paytmUrl = paytmUrl;
	}

	/**
	 * @return the details
	 */
	public Map<String, String> getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "PaytmDetails [merchantId=" + merchantId + ", merchantKey=" + merchantKey + ", channelId=" + channelId
				+ ", website=" + website + ", industryTypeId=" + industryTypeId + ", paytmUrl=" + paytmUrl
				+ ", details=" + details + ", getMerchantId()=" + getMerchantId() + ", getMerchantKey()="
				+ getMerchantKey() + ", getChannelId()=" + getChannelId() + ", getWebsite()=" + getWebsite()
				+ ", getIndustryTypeId()=" + getIndustryTypeId() + ", getPaytmUrl()=" + getPaytmUrl()
				+ ", getDetails()=" + getDetails() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
package com.stoxs.Entities;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "id", "sectionId", "sectionName", "webPublicationDate",
		"webTitle", "webUrl", "apiUrl" })
public class Result {

	@JsonProperty("id")
	private String id;
	@JsonProperty("sectionId")
	private String sectionId;
	@JsonProperty("sectionName")
	private String sectionName;
	@JsonProperty("webPublicationDate")
	private String webPublicationDate;
	@JsonProperty("webTitle")
	private String webTitle;
	@JsonProperty("webUrl")
	private String webUrl;
	@JsonProperty("apiUrl")
	private String apiUrl;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The sectionId
	 */
	@JsonProperty("sectionId")
	public String getSectionId() {
		return sectionId;
	}

	/**
	 * 
	 * @param sectionId
	 *            The sectionId
	 */
	@JsonProperty("sectionId")
	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	/**
	 * 
	 * @return The sectionName
	 */
	@JsonProperty("sectionName")
	public String getSectionName() {
		return sectionName;
	}

	/**
	 * 
	 * @param sectionName
	 *            The sectionName
	 */
	@JsonProperty("sectionName")
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	/**
	 * 
	 * @return The webPublicationDate
	 */
	@JsonProperty("webPublicationDate")
	public String getWebPublicationDate() {
		return webPublicationDate;
	}

	/**
	 * 
	 * @param webPublicationDate
	 *            The webPublicationDate
	 */
	@JsonProperty("webPublicationDate")
	public void setWebPublicationDate(String webPublicationDate) {
		this.webPublicationDate = webPublicationDate;
	}

	/**
	 * 
	 * @return The webTitle
	 */
	@JsonProperty("webTitle")
	public String getWebTitle() {
		return webTitle;
	}

	/**
	 * 
	 * @param webTitle
	 *            The webTitle
	 */
	@JsonProperty("webTitle")
	public void setWebTitle(String webTitle) {
		this.webTitle = webTitle;
	}

	/**
	 * 
	 * @return The webUrl
	 */
	@JsonProperty("webUrl")
	public String getWebUrl() {
		return webUrl;
	}

	/**
	 * 
	 * @param webUrl
	 *            The webUrl
	 */
	@JsonProperty("webUrl")
	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	/**
	 * 
	 * @return The apiUrl
	 */
	@JsonProperty("apiUrl")
	public String getApiUrl() {
		return apiUrl;
	}

	/**
	 * 
	 * @param apiUrl
	 *            The apiUrl
	 */
	@JsonProperty("apiUrl")
	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
package com.stoxs.Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "status", "userTier", "total", "startIndex", "pageSize",
		"currentPage", "pages", "orderBy", "results" })
public class Response {

	@JsonProperty("status")
	private String status;
	@JsonProperty("userTier")
	private String userTier;
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("startIndex")
	private Integer startIndex;
	@JsonProperty("pageSize")
	private Integer pageSize;
	@JsonProperty("currentPage")
	private Integer currentPage;
	@JsonProperty("pages")
	private Integer pages;
	@JsonProperty("orderBy")
	private String orderBy;
	@JsonProperty("results")
	private List<Result> results = new ArrayList<Result>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The status
	 */
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status
	 *            The status
	 */
	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 
	 * @return The userTier
	 */
	@JsonProperty("userTier")
	public String getUserTier() {
		return userTier;
	}

	/**
	 * 
	 * @param userTier
	 *            The userTier
	 */
	@JsonProperty("userTier")
	public void setUserTier(String userTier) {
		this.userTier = userTier;
	}

	/**
	 * 
	 * @return The total
	 */
	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	/**
	 * 
	 * @param total
	 *            The total
	 */
	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * 
	 * @return The startIndex
	 */
	@JsonProperty("startIndex")
	public Integer getStartIndex() {
		return startIndex;
	}

	/**
	 * 
	 * @param startIndex
	 *            The startIndex
	 */
	@JsonProperty("startIndex")
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * 
	 * @return The pageSize
	 */
	@JsonProperty("pageSize")
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * 
	 * @param pageSize
	 *            The pageSize
	 */
	@JsonProperty("pageSize")
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 
	 * @return The currentPage
	 */
	@JsonProperty("currentPage")
	public Integer getCurrentPage() {
		return currentPage;
	}

	/**
	 * 
	 * @param currentPage
	 *            The currentPage
	 */
	@JsonProperty("currentPage")
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * 
	 * @return The pages
	 */
	@JsonProperty("pages")
	public Integer getPages() {
		return pages;
	}

	/**
	 * 
	 * @param pages
	 *            The pages
	 */
	@JsonProperty("pages")
	public void setPages(Integer pages) {
		this.pages = pages;
	}

	/**
	 * 
	 * @return The orderBy
	 */
	@JsonProperty("orderBy")
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * 
	 * @param orderBy
	 *            The orderBy
	 */
	@JsonProperty("orderBy")
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	/**
	 * 
	 * @return The results
	 */
	@JsonProperty("results")
	public List<Result> getResults() {
		return results;
	}

	/**
	 * 
	 * @param results
	 *            The results
	 */
	@JsonProperty("results")
	public void setResults(List<Result> results) {
		this.results = results;
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
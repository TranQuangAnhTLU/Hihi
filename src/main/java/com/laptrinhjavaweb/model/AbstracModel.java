package com.laptrinhjavaweb.model;

import java.sql.Timestamp;

public class AbstracModel<T> {
	private Long id;
	private Timestamp createdData;
	private Timestamp modifiedDate;
	private  String createdBy;
	private String modifiedBy;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Timestamp getCreatedData() {
		return createdData;
	}
	public void setCreatedData(Timestamp createdData) {
		this.createdData = createdData;
	}
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String timestamp) {
		this.createdBy = timestamp;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}

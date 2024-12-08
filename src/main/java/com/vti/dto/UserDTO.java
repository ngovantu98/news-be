package com.vti.dto;

import java.sql.Date;

public class UserDTO {

	private String name;
	private String content;
	private Date date;
	private String header;
	private String conclude;
	private int categoryId;
	private String categoryName;

	public UserDTO(String name, String content, Date date, String header, String conclude, int categoryId,
			String categoryName) {
		this.name = name;
		this.content = content;
		this.date = date;
		this.header = header;
		this.conclude = conclude;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public UserDTO() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getConclude() {
		return conclude;
	}

	public void setConclude(String conclude) {
		this.conclude = conclude;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}

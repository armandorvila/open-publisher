package com.armandorv.publisher.dataaccess.jdbc.sql;

public class ArticleSQLWrapping {

	private String create;
	private String modify;
	private String delete;
	private String getById;
	private String getAll;
	private String getLastId;
	private String getByAuthor;

	public String getCreate() {
		return create;
	}

	public void setCreate(String create) {
		this.create = create;
	}

	public String getModify() {
		return modify;
	}

	public void setModify(String modify) {
		this.modify = modify;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getGetById() {
		return getById;
	}

	public void setGetById(String getById) {
		this.getById = getById;
	}

	public String getGetAll() {
		return getAll;
	}

	public void setGetAll(String getAll) {
		this.getAll = getAll;
	}

	public void setGetLastId(String getLastId) {
		this.getLastId = getLastId;
	}

	public String getGetLastId() {
		return getLastId;
	}

	public void setGetByAuthor(String getByAuthor) {
		this.getByAuthor = getByAuthor;
	}

	public String getGetByAuthor() {
		return getByAuthor;
	}

}

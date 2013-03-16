package com.armandorv.publisher.dataaccess.jdbc.sql;


public class UserSQLWrapping  {

	private String create;
	private String modify;
	private String delete;
	private String getByUserName;
	
	
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
	public String getGetByUserName() {
		return getByUserName;
	}
	public void setGetByUserName(String getByUserName) {
		this.getByUserName = getByUserName;
	}

	
	
}

package com.hr.domain;

public class Person {
	
	private Integer id;
	/**
	 * 姓名
	 */
	private String realName;
	/**
	 * 身份证
	 */
	private String idNumber;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 更新时间
	 */
	private String updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", realName=" + realName + ", idNumber=" + idNumber + ", mobile=" + mobile
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}

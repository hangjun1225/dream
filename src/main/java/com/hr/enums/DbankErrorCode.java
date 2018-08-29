package com.hr.enums;

public enum DbankErrorCode {
	/**
	 * 交易成功
	 */
	UC000000("000000","交易成功"),
	/**
	 * 系统异常
	 */
	UC999999("999999","系统异常"),
	/**
	 * 用户名不能为空
	 */
	UC000001("000001","用户名不能为空"),
	/**
	 * 用户名已经存在
	 */
	UC000002("000002","用户名已经存在"),
	/**
	 * 用户不存在
	 */
	UC000003("000003","用户不存在"),
	/**
	 * 密码不正确
	 */
	UC000004("000003","密码不正确")
	;
	
	/**
	 * 错误码
	 */
	private String code;
	/**
	 * 错误码信息
	 */
	private String msg;

	
	DbankErrorCode(String code, String msg) {
		this.code=code;
		this.msg=msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

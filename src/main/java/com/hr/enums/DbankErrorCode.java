package com.hr.enums;

public enum DbankErrorCode {
	UC000001("000000","成功"),
	/**
	 * 系统异常
	 */
	UC000002("999999","失败");
	
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

package com.hr.zException;

import com.hr.enums.DbankErrorCode;

/**
 * 自定义异常类
 * @author Administrator
 *
 */
public class DbankException extends RuntimeException {
	private static final long serialVersionUID = -9033099604517529161L;
	/**
	 * 错误码
	 */
	private String code;
	
	/**
	 * 错误信息在exception中
	 */
	public DbankException(DbankErrorCode resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}
	
	public DbankException(String code, String msg) {
		super(msg);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}

package com.hr.dto;

import com.hr.domain.User;
import com.hr.enums.DbankErrorCode;

/**
 * http请求返回的最外层对象
 * @author Administrator
 *
 */
public class Result<T> {
	/**
	 * 错误码
	 * 默认是000000
	 */
	private String retCode="000000";
	/**
	 * 错误信息
	 * 默认是交易成功
	 */
	private String retMsg="交易成功";
	/**
	 * 数据
	 */
	private T data;
	
	/**
	 * 返回成功
	 */
	public Result() {
		super();
	}
	/**
	 * 返回成功+信息
	 * @param data
	 */
	public Result(T data) {
		this.data = data;
	}
	/**
	 * 返回错误信息使用该方法
	 * @param dbankErrorCode
	 */
	public Result(DbankErrorCode dbankErrorCode) {
		this.retCode = dbankErrorCode.getCode();
		this.retMsg = dbankErrorCode.getMsg();
	}
	/**
	 * 返回错误信息使用该方法
	 * @param dbankErrorCode
	 */
	public Result(DbankErrorCode dbankErrorCode,T data) {
		this.retCode = dbankErrorCode.getCode();
		this.retMsg = dbankErrorCode.getMsg();
		this.data=data;
	}
	
	public String getRetCode() {
		return retCode;
	}
	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetMsg() {
		return retMsg;
	}
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}

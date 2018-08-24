package com.hr.dto;
/**
 * http请求返回的最外层对象
 * @author Administrator
 *
 */
public class Result<T> {
	/**
	 * 错误码
	 */
	private String code;
	/**
	 * 错误信息
	 */
	private String msg;
	/**
	 * 数据
	 */
	private T data;

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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	

}

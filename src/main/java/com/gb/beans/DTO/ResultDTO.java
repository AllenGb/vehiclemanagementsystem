package com.gb.beans.DTO;

//特殊传输对象
public class ResultDTO<T> {
	private boolean success;//通知状态，默认是false
	private String msg;//通知内容
	private T data;//返回实体
	private String error="00000";//错误码
		
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
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
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
}

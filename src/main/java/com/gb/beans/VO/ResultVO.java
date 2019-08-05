package com.gb.beans.VO;

/*结果模型，负责携带数据发送给前端*/
public class ResultVO {
	private boolean success;//是否成功标识
	private String msg;//消息
	private String errorCode;//错误码
	private Object obj;//回传数据
	
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
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public ResultVO(String msg) {
		super();
		this.msg = msg;
	}
	public ResultVO() {
		super();
	}
	
	
}

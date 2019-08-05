package com.gb.beans.POJO;

import java.io.Serializable;

//数据实体
public class Q_Menu implements Serializable{
	private String id;
	private String pid;//父级ID
	private String text;//内容
	private String url;//对应地址
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}

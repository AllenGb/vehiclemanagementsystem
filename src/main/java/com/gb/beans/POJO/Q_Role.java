package com.gb.beans.POJO;

import java.io.Serializable;
import java.util.Set;

public class Q_Role implements Serializable {
	
	private Integer id;
	private String name;//角色名称
	private Set<Q_Menu> menus;//一对多
	
	//给用户指派角色时使用
	private boolean ck=false;
	
	//分页专用
	private int page;
	private int rows;
	
	//角色授权专用
	private String mids;//菜单ID，格式x,x,x
	
	
	public String getMids() {
		return mids;
	}
	public void setMids(String mids) {
		this.mids = mids;
	}
	public boolean isCk() {
		return ck;
	}
	public void setCk(boolean ck) {
		this.ck = ck;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Q_Menu> getMenus() {
		return menus;
	}
	public void setMenus(Set<Q_Menu> menus) {
		this.menus = menus;
	}	
	

	
	
	
	
	
}

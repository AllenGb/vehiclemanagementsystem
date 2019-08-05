package com.gb.util;

//分页工具类
public class Page {
	private int pageIndex=1;
	private int begin=0;
	private int end=0;
	private int pageSize=10;
	
	public Page(int pageIndex, int pageSize) {		
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		
		this.begin=(pageIndex-1)*pageSize+1;
		this.end=this.pageIndex*this.pageSize;
	}
	
	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}

package com.gb.beans.VO;

import java.util.List;

//easyUI/DataGrid视图实体
public class DataGridVO<T> {
	private long total;
	private List<T> rows;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	
}

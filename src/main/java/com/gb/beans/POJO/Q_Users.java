package com.gb.beans.POJO;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

public class Q_Users implements Serializable{
	private Integer id;
	private String lname;//登录名
	private String lpass;//密码，MD5加密
	private String rname;//真实姓名
	private Integer age;//年龄
	private String gender;//性别
	private String address;//地址
	private String phone;//电话
	private Dictionary dept;//多对一
	private Dictionary post;//多对一
	private Date birthday;
	private String card;//身份证
	private Date entrytime;
	private Integer isdisable=1;
	
	
	private Set<Q_Role> roles;//一对多
	
	//分页专用
	private int page;//当前页数
	private int rows;//每页显示的资料数
	
	//多笔删除专用
	private String ids;	
	
	//指派角色专用，格式：1,2,3
	private String rids;
	
	//原始密码,修改密码验证原始密码专用
	private String opass;	
	
	public String getOpass() {
		return opass;
	}
	public void setOpass(String opass) {
		this.opass = opass;
	}
	public Dictionary getDept() {
		return dept;
	}
	public void setDept(Dictionary dept) {
		this.dept = dept;
	}
	public Dictionary getPost() {
		return post;
	}
	public void setPost(Dictionary post) {
		this.post = post;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public Date getEntrytime() {
		return entrytime;
	}
	public void setEntrytime(Date entrytime) {
		this.entrytime = entrytime;
	}
	public Integer getIsdisable() {
		return isdisable;
	}
	public void setIsdisable(Integer isdisable) {
		this.isdisable = isdisable;
	}
	public String getRids() {
		return rids;
	}
	public void setRids(String rids) {
		this.rids = rids;
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
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLpass() {
		return lpass;
	}
	public void setLpass(String lpass) {
		this.lpass = lpass;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Set<Q_Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Q_Role> roles) {
		this.roles = roles;
	}
	
	
	
	
	
	
}

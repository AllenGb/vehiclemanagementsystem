package com.gb.beans.POJO;

import java.io.Serializable;
import java.sql.Date;




//车辆档案表 实体
public class Car implements Serializable {

    private Integer id;
    private String carNo;
    private Dictionary carBrand;//多对一
    private Dictionary carModel;//多对一
    private Integer carColor;//采用本地颜色数据
    private Double carLoad;
    private Integer carSeats;
    private Double oilWear;
    private Integer initMil;
    private Integer maintainMil;
    private Integer maintainPeriod;
    private String engineNum;
    private String frameNum;
    private CurrentUnit sup;//多对一
    private Double purchasePrice;
    private Date purchaseDate;
    private Dictionary dept;//多对一
    private Integer carState;//采用本地车辆状态数据
    private String remarks;
    private Integer isdisable=1;

    //分页专用
    private int page;
    private int rows;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public Dictionary getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(Dictionary carBrand) {
        this.carBrand = carBrand;
    }

    public Dictionary getCarModel() {
        return carModel;
    }

    public void setCarModel(Dictionary carModel) {
        this.carModel = carModel;
    }

    public Integer getCarColor() {
        return carColor;
    }

    public void setCarColor(Integer carColor) {
        this.carColor = carColor;
    }

    public Double getCarLoad() {
        return carLoad;
    }

    public void setCarLoad(Double carLoad) {
        this.carLoad = carLoad;
    }

    public Integer getCarSeats() {
        return carSeats;
    }

    public void setCarSeats(Integer carSeats) {
        this.carSeats = carSeats;
    }

    public Double getOilWear() {
        return oilWear;
    }

    public void setOilWear(Double oilWear) {
        this.oilWear = oilWear;
    }

    public Integer getInitMil() {
        return initMil;
    }

    public void setInitMil(Integer initMil) {
        this.initMil = initMil;
    }

    public Integer getMaintainMil() {
        return maintainMil;
    }

    public void setMaintainMil(Integer maintainMil) {
        this.maintainMil = maintainMil;
    }

    public Integer getMaintainPeriod() {
        return maintainPeriod;
    }

    public void setMaintainPeriod(Integer maintainPeriod) {
        this.maintainPeriod = maintainPeriod;
    }

    public String getEngineNum() {
        return engineNum;
    }

    public void setEngineNum(String engineNum) {
        this.engineNum = engineNum;
    }

    public String getFrameNum() {
        return frameNum;
    }

    public void setFrameNum(String frameNum) {
        this.frameNum = frameNum;
    }

    public CurrentUnit getSup() {
        return sup;
    }

    public void setSup(CurrentUnit sup) {
        this.sup = sup;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Dictionary getDept() {
        return dept;
    }

    public void setDept(Dictionary dept) {
        this.dept = dept;
    }

    public Integer getCarState() {
        return carState;
    }

    public void setCarState(Integer carState) {
        this.carState = carState;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIsdisable() {
        return isdisable;
    }

    public void setIsdisable(Integer isdisable) {
        this.isdisable = isdisable;
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
}

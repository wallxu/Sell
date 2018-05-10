package com.le.isell.entity;


public class OrderModel extends BaseModel{
	private Integer customerUuid;
	private String orderTime;
	private Float totalMoney;
	private Float saveMoney;
	private Integer state;

	public Integer getCustomerUuid() {
		return customerUuid;
	}

	public void setCustomerUuid(Integer customerUuid) {
		this.customerUuid = customerUuid;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public Float getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Float totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Float getSaveMoney() {
		return saveMoney;
	}

	public void setSaveMoney(Float saveMoney) {
		this.saveMoney = saveMoney;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String toString(){
		return "Model"+this.getClass().getName()+"[customerUuid=" + this.getCustomerUuid() + ",orderTime=" + this.getOrderTime() + ",totalMoney=" + this.getTotalMoney() + ",saveMoney=" + this.getSaveMoney() + ",state=" + this.getState() + ",]";
	}	
}

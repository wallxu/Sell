package com.le.isell.entity;


public class OrderDetailModel extends BaseModel{
	private Integer orderUuid;
	private Integer goodsUuid;
	private Integer orderNum;
	private Float price;
	private Float money;
	private Float saveMoney;

	public Integer getOrderUuid() {
		return orderUuid;
	}

	public void setOrderUuid(Integer orderUuid) {
		this.orderUuid = orderUuid;
	}

	public Integer getGoodsUuid() {
		return goodsUuid;
	}

	public void setGoodsUuid(Integer goodsUuid) {
		this.goodsUuid = goodsUuid;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Float getSaveMoney() {
		return saveMoney;
	}

	public void setSaveMoney(Float saveMoney) {
		this.saveMoney = saveMoney;
	}

	public String toString(){
		return "Model"+this.getClass().getName()+"[orderUuid=" + this.getOrderUuid() + ",goodsUuid=" + this.getGoodsUuid() + ",orderNum=" + this.getOrderNum() + ",price=" + this.getPrice() + ",money=" + this.getMoney() + ",saveMoney=" + this.getSaveMoney() + ",]";
	}	
}

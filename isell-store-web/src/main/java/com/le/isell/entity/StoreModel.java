package com.le.isell.entity;


public class StoreModel extends BaseModel{
	private Integer goodsUuid;
	private Integer storeNum;

	public Integer getGoodsUuid() {
		return goodsUuid;
	}

	public void setGoodsUuid(Integer goodsUuid) {
		this.goodsUuid = goodsUuid;
	}

	public Integer getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(Integer storeNum) {
		this.storeNum = storeNum;
	}

	public String toString(){
		return "Model"+this.getClass().getName()+"[goodsUuid=" + this.getGoodsUuid() + ",storeNum=" + this.getStoreNum() + ",]";
	}	
}

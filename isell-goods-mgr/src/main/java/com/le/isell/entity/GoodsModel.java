package com.le.isell.entity;


public class GoodsModel extends BaseModel{
	private String name;
	private String imgPath;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString(){
		return "Model"+this.getClass().getName()+"[name=" + this.getName() + ",imgPath=" + this.getImgPath() + ",description=" + this.getDescription() + ",]";
	}	
}

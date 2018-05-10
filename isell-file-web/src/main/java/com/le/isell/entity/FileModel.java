package com.le.isell.entity;


public class FileModel extends BaseModel{
	private String fileName;
	private String remotePaths;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getRemotePaths() {
		return remotePaths;
	}

	public void setRemotePaths(String remotePaths) {
		this.remotePaths = remotePaths;
	}

	public String toString(){
		return "Model"+this.getClass().getName()+"[fileName=" + this.getFileName() + ",remotePaths=" + this.getRemotePaths() + ",]";
	}	
}

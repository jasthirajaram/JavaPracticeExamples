package com.motivity.jpaxml.entity;

public class JavaBatch {
	private int batchId;
	private String batchName;
	private int batchSize;

	private JavaCeo javaCeo;

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public int getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	@Override
	public String toString() {
		return "JavaBatch [batchId=" + batchId + ", batchName=" + batchName + ", batchSize=" + batchSize + "]";
	}

}

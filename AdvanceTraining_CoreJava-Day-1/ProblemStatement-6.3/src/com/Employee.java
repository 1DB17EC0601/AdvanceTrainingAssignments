package com;

public class Employee {
	
	private int eId;
	private String eName;
	private String eAdd;
	
	public Employee(int eId, String eName, String eAdd) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAdd = eAdd;
	}

	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAdd() {
		return eAdd;
	}

	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}
	
	

}

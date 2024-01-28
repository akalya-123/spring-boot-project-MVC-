package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class College {
    private String deptName;
    private int deptCount;
    @Id
	private int deptId;
	private int staffCount;
	private int labCount;
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptCount() {
		return deptCount;
	}
	public void setDeptCount(int deptCount) {
		this.deptCount = deptCount;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getStaffCount() {
		return staffCount;
	}
	public void setStaffCount(int staffCount) {
		this.staffCount = staffCount;
	}
	public int getLabCount() {
		return labCount;
	}
	public void setLabCount(int labCount) {
		this.labCount = labCount;
	}
	@Override
	public String toString() {
		return "College [deptName=" + deptName + ", deptCount=" + deptCount + ", deptId=" + deptId + ", staffCount="
				+ staffCount + ", labCount=" + labCount + "]";
	}
	
}
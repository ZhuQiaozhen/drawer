package com.drawer.imu.entity;

import javax.persistence.*;

@Cacheable
@Table(name="SSSP_DEPARTMENTS")
@Entity
public class Department {

	private Integer id;
	private String departmentName;

	@GeneratedValue
	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}

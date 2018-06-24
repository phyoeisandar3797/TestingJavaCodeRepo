package com.pesandar.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@SuppressWarnings({ "serial", "unused" })
@Entity
public class MedicalCheckCenter implements Serializable {
	@Id
	private int id;
	
	private String part;
	private String duration;
	private String sideaffect;
	private String cost;
	
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getSideaffect() {
		return sideaffect;
	}
	public void setSideaffect(String sideaffect) {
		this.sideaffect = sideaffect;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

}

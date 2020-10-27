package com.company.management.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "timetable")
public class TimeTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "id_employee")
	private int idEmployee;
	
	@Column(name = "working_days")
	private int working_days;
	
	@Column(name = "working_hours")
	private double working_hours;
	
	@Column(name = "off_days")
	private int offDays;
	
	@Column(name = "off_hours")
	private double offHours;
	
	@Column(name = "total_working_hours")
	private double total_working_hours;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public int getWorking_days() {
		return working_days;
	}

	public void setWorking_days(int working_days) {
		this.working_days = working_days;
	}

	public double getWorking_hours() {
		return working_hours;
	}

	public void setWorking_hours(double working_hours) {
		this.working_hours = working_hours;
	}

	public int getOffDays() {
		return offDays;
	}

	public void setOffDays(int offDays) {
		this.offDays = offDays;
	}

	public double getOffHours() {
		return offHours;
	}

	public void setOffHours(double offHours) {
		this.offHours = offHours;
	}

	public double getTotal_working_hours() {
		return total_working_hours;
	}

	public void setTotal_working_hours(double total_working_hours) {
		this.total_working_hours = total_working_hours;
	}

	@Override
	public String toString() {
		return "TimeTable [id=" + id + ", idEmployee=" + idEmployee + ", working_days=" + working_days
				+ ", working_hours=" + working_hours + ", offDays=" + offDays + ", offHours=" + offHours
				+ ", total_working_hours=" + total_working_hours + "]";
	}

	
	
}

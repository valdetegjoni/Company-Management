package com.company.management.service;

import com.company.management.model.Employee;
import com.company.management.model.TimeTable;

public interface EmployeeService {

	public void insertEmployee(Employee emp);
	public boolean validateEmployee(int empId);
	public Employee updateEmployeeData(Employee emp);
	public TimeTable insertTimeTable(TimeTable tt);
	public void updateTimeTable(TimeTable tt);
	public TimeTable getTimeTable(Employee emp);
	public void getPayCheck(Employee emp);
}

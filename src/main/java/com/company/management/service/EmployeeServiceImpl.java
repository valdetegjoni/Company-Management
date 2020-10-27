package com.company.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.management.dao.EmployeDao;
import com.company.management.model.Employee;
import com.company.management.model.TimeTable;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeDao employeeDao;
	
	

	@Override
	public void insertEmployee(Employee emp) {

		if(!validateEmployee(emp.getId()))
			employeeDao.insertEmployee(emp);
		}

	@Override
	public boolean validateEmployee(int empId) {
		return employeeDao.validateEmployee(empId);
		
	}

	@Override
	public Employee updateEmployeeData(Employee emp) {
		return employeeDao.updateEmployeeData(emp);
	}

	@Override
	public TimeTable insertTimeTable(TimeTable tt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTimeTable(TimeTable tt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TimeTable getTimeTable(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getPayCheck(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	
	
}

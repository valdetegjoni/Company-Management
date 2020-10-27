package com.company.management.dao;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.management.model.Employee;
import com.company.management.model.TimeTable;

@Repository
public class EmployeeDaoImpl implements EmployeDao {

	@Autowired
	private SessionFactory session;
	
	public void setSession(SessionFactory session) {
		this.session = session;
	}

	@Override
	public void insertEmployee(Employee emp) {		
		session.getCurrentSession().saveOrUpdate(emp);
	}

	@Override
	public boolean validateEmployee(int empId) {
		Employee employee = (Employee)session.getCurrentSession().load(Employee.class, empId);
		if(employee != null)
			return true;
		return false;
		
	}

	@Override
	public Employee updateEmployeeData(Employee emp) {
		session.getCurrentSession().update(emp);
		return emp;		
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

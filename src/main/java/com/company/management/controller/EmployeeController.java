package com.company.management.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.company.management.model.Employee;
import com.company.management.service.EmployeeService;






@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService serviceEmp;
	
	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
 //   public ModelAndView newContact(ModelAndView model) {
   public String newContact(@Valid @ModelAttribute("employee") Employee e, BindingResult br) {
		
		if(br.hasErrors())  
        {  			
            return "home";  
        }  
        else  
        {  
        return "employeeForm";  
        }
		
	}
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
        if (employee.getId() == 0) { // if employee id is 0 then creating the
            // employee other updating the employee
        	serviceEmp.insertEmployee(employee);
        } else {
            serviceEmp.updateEmployeeData(employee);
        }
        return new ModelAndView("redirect:/home");
    }
	
	   @RequestMapping(value={"/home"}, method = RequestMethod.GET)
	    public ModelAndView listEmployee(ModelAndView model) throws IOException {
		   List<Employee> listEmployee = new ArrayList<Employee>();
	        model.addObject("listEmployee", listEmployee);
	        model.setViewName("index");
	        return model;
	        
	    }
	
	
	
	
	
}

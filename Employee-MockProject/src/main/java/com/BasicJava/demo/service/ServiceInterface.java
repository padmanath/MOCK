package com.BasicJava.demo.service;

import java.util.List;

import com.BasicJava.demo.Dto.EmployeeDto;
import com.BasicJava.demo.Dto.ProjectDto;

public interface ServiceInterface {

	boolean saveEmployee(EmployeeDto employeeDto);

	boolean saveProject(ProjectDto projectdto);

	public EmployeeDto  getEmployee();

	public ProjectDto getProject();

}

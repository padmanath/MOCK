package com.BasicJava.demo.serviceimpl;

import java.beans.Beans;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BasicJava.demo.Dto.EmployeeDto;

import com.BasicJava.demo.Dto.ProjectDto;
import com.BasicJava.demo.Repository.EmployeeRepository;
import com.BasicJava.demo.Repository.ProjectRepository;
import com.BasicJava.demo.entity.Employee;
import com.BasicJava.demo.entity.ProjectEntity;
import com.BasicJava.demo.service.ServiceInterface;


@Service
public class ServiceImple implements ServiceInterface{

	
	
	@Autowired
	private Employee employee;
	
	@Autowired
	private ProjectEntity projectEntity;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private EmployeeDto employeeDto;
	
	@Autowired
	private ProjectDto projectDto;
	
	
	
	@Override
	public boolean saveEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		BeanUtils.copyProperties(employeeDto, employee);
		employee.setId(employeeDto.getId());
		employee.setName(employeeDto.getName());
		employee.setRoll(employeeDto.getRoll());
		employee.setSalary(employeeDto.getSalary());
	
		Employee save = employeeRepository.save(employee);
	if (save!=null) {
		return true;
	}else
		return false;
	}

	@Override
	public boolean saveProject(ProjectDto projectdto) {
		// TODO Auto-generated method stub
		BeanUtils.copyProperties(projectdto, projectEntity);
		projectEntity.setId(projectdto.getId());
		projectEntity.setProjectname(projectdto.getProjectname());
		projectEntity.setProjecmodule(projectdto.getProjecmodule());
		ProjectEntity save = projectRepository .save(projectEntity);
		if (save!=null) {
			return true;
		}else
			return false;
		}

	@Override
	public EmployeeDto getEmployee() {
		// TODO Auto-generated method stub
		Employee getEmployee = employeeRepository.findById(employee.getId()).orElse(null);
		BeanUtils.copyProperties(getEmployee, employeeDto);
	   return employeeDto;
	}

	@Override
	public ProjectDto getProject() {
		// TODO Auto-generated method stub
		ProjectEntity getProject = projectRepository.findById(projectEntity.getId()).orElse(null);
		BeanUtils.copyProperties(getProject, projectDto);
		return projectDto;
	}

	
		
	
	}

	


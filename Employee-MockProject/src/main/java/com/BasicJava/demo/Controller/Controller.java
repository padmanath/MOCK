package com.BasicJava.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BasicJava.demo.Dto.EmployeeDto;
import com.BasicJava.demo.Dto.ProjectDto;
import com.BasicJava.demo.response.EmployeeResponse;
import com.BasicJava.demo.serviceimpl.ServiceImple;


@RestController
public class Controller {

	@Autowired
	private ServiceImple imple;
	
	@Autowired
	private EmployeeResponse employeeResponse;
	
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<EmployeeResponse> saveEmployee(@RequestBody EmployeeDto employeeDto) {
		boolean saveEmployee = imple.saveEmployee(employeeDto);
		if (saveEmployee == true) {
			employeeResponse.setMessage("your employee saved successfully ");
			employeeResponse.setStatus("200");
			employeeResponse.setData(employeeDto);
			

			return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.ACCEPTED);

		} else {

			employeeResponse.setMessage("your employee not saved ");
			employeeResponse.setStatus("500");

			return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.BAD_REQUEST);

		}

	}
	
	@PostMapping("/saveProject")
	public ResponseEntity<EmployeeResponse> saveProject(@RequestBody ProjectDto dto) {
		 boolean saveProject = imple.saveProject(dto);
		if (saveProject == true) {
			employeeResponse.setMessage("your project saved successfully ");
			employeeResponse.setStatus("200");
			

			return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.ACCEPTED);

		} else {

			employeeResponse.setMessage("your project not saved ");
			employeeResponse.setStatus("500");

			return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.BAD_REQUEST);

		}

	}
	
	@GetMapping("/getEmployee")
	public ResponseEntity<EmployeeResponse> getEmployee(){
		EmployeeDto employee = imple.getEmployee();
		if (employee!=null) {
			employeeResponse.setMessage("your project saved successfully ");
			employeeResponse.setStatus("200");
			

			return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.ACCEPTED);

		} else {

			employeeResponse.setMessage("your project not saved ");
			employeeResponse.setStatus("500");

			return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.BAD_REQUEST);

		}
		
		
	   
		
	}
	@GetMapping("/getEmployee")
	public ResponseEntity<EmployeeResponse> geetProject(){
		ProjectDto project = imple.getProject();
		if (project!=null) {
			employeeResponse.setMessage("your project saved successfully ");
			employeeResponse.setStatus("200");
			

			return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.ACCEPTED);

		} else {

			employeeResponse.setMessage("your project not saved ");
			employeeResponse.setStatus("500");

			return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.BAD_REQUEST);

		}
		
		
	   
		
	}
	
	
	
}

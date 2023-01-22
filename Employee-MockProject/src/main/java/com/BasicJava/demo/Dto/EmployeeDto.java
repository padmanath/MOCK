package com.BasicJava.demo.Dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employee")
public class EmployeeDto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    
	@Column(name="Name")
	private String name;
	@Column(name="Roll")
	private String Roll;
	@Column(name="Salary")
	private Long salary;

	
	
	
	

	
	
	
	
}

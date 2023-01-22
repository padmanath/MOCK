package com.BasicJava.demo.Dto;

import org.springframework.stereotype.Component;


import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="projectname")
	private String projectname;
	@Column(name="projectmodule")
	private String projecmodule;
	
	
	
	
}

package com.BasicJava.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employee")
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    
	@Column(name="Name")
	private String name;
	@Column(name="Roll")
	private String Roll;
	@Column(name="Salary")
	private Long salary;

	
	
	@ManyToMany(targetEntity = ProjectEntity.class,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id",name="Project")
	private ProjectEntity project;
	

	
	
	
	
}

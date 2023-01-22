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

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="project")
public class ProjectEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="projectname")
	private String projectname;
	@Column(name="projectmodule")
	private String projecmodule;
	

	@ManyToMany(targetEntity = Employee.class,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id",name="Employee")
	private Employee employee;
}

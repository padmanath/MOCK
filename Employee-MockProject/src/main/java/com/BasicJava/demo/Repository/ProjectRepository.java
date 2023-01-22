package com.BasicJava.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BasicJava.demo.Dto.ProjectDto;
import com.BasicJava.demo.entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {

}

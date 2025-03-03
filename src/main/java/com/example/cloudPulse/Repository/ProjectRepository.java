package com.example.cloudPulse.Repository;

import com.example.cloudPulse.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ProjectRepository extends JpaRepository<Project,String>{

    public ArrayList<Project> getProjects();

    public Project getProjectById();
} 

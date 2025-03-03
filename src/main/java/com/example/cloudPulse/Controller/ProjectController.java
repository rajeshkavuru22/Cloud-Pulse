package com.example.cloudPulse.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.cloudPulse.Service.ProjectService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloudPulse.Model.Project;


@RestController
public class ProjectController {
    @Autowired
    private final ProjectService projectService;

    public ProjectController( ProjectService projectService){
        this.projectService = projectService;
    }

    @RequestMapping("/projects")
    public ArrayList<Project> getProjects(){
        return projectService.getProjects();
    }

    @RequestMapping("/projects/{projectId}")
    public Project getProjectById(@PathVariable String projectId){
        return projectService.getProjectBtId(projectId);
    }


}

package com.example.cloudPulse.Model;

//import jakarta.persistence.Entity;
//import lombok.AllArgsConstructor;
//import lombok.Data;

public class Project {
    private String projectId;
    private String name;
    private String createTime;
    private String lifecycleState;

    public Project(String projectId, String name, String createTime, String lifecycleState){
        this.projectId = projectId;
        this.name = name;
        this.createTime = createTime;
        this.lifecycleState = lifecycleState;
    }

    public String getProjectId() {
        return projectId;
    }
}

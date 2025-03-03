package com.example.cloudPulse.Service;

import java.util.ArrayList;

import com.example.cloudPulse.Model.Project;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    private static final ArrayList<Project> projectList = new ArrayList<>();

    public ProjectService() {
        projectList.add(new Project("81764r3grbfydn","project_1","12/4/2023","Working"));
        projectList.add(new Project("ndui3hcwbcscd","project_2","19/4/2023","Stopped"));
        projectList.add(new Project("ksjafbiuc","project_3","2/4/2023","Working"));
        projectList.add(new Project("bdcudwefef","project_4","1/4/2023","Active"));
        projectList.add(new Project("64t387revgc","project_5","9/4/2023","Working"));
    }

    public ArrayList<Project> getProjects(){
        return projectList;
    }

    public Project getProjectBtId(String projectId){
        for(Project project : projectList){
            if(project.getProjectId().equals(projectId)){
                return project;
            }
        }
        return null;
    }
}

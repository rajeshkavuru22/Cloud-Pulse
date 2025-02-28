package com.example.cloudPulse.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class Project {
    private String projectId;
    private String name;
    private String createTime;
    private String lifecycleState;
}

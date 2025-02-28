package com.example.cloudPulse.Model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Resource {
    private String version;
    private String discoveryDocumentUri;
    private String discoveryName;
    private String resourceUrl;
}

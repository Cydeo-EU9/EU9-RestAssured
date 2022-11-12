package com.cydeo.pojo;


import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("job_id")
    private String jobId;

    private int salary;
}

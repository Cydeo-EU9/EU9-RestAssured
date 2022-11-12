package com.cydeo.pojo;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.*;

@Getter //from lombok dependency
@Setter //from lombok dependency
@ToString //from lombok dependency
@JsonIgnoreProperties(ignoreUnknown = true)  //this is from jackson dependency
public class Regions {

    private List<Region> items;
    private int count;
}

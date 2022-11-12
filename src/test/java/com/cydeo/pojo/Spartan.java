package com.cydeo.pojo;


import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Getter
@Setter
@ToString

@JsonIgnoreProperties(value = "id",allowSetters = true)
public class Spartan {
        //getter setter
        //toString
        private int id;
        private String name;
        private String gender;
        private long phone;


}

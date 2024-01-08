package com.microservice.courseservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id ;
    private String ref ;
    private String firstname ;
    private String lastname ;

}

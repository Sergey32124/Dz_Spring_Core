package com.example.dz_spring_core.springCreateBean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Data
@Scope("prototype")
public class Student {
    private int id;
    private String name;


}

package com.example.dz_spring_core.springCreateBean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("school")
@Data
@Scope("Singlton")
public class School {
    private String name;
    private String adress;

    public School(@Value("hh") String name, @Value("YYY") String adress) {
        this.name = name;
        this.adress = adress;
    }
}

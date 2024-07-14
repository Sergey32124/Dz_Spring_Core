package com.example.dz_spring_core;

import com.example.dz_spring_core.springCreateBean.School;
import com.example.dz_spring_core.springCreateBean.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* Задача
Имя пакета springCreateBean
Создать класс Student
Свойства id группа и фио
Без конструктора
Ничего не внедрять

Получить 5 объектов этогл класса
Через создание бинов

Так же создать
Класс School
У него будет
Название  и адрес
Получить данный бин
Синглтон
Внедрить свойства через Value*/
@SpringBootApplication
public class DzSpringCoreApplication {

    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(Config.class);
        Student student=new Student();
        student.setId(1);
        student.setName("Ded");
        Student student2=new Student();
        student2.setId(2);
        student2.setName("Dede");
        System.out.println(student.getId()+" "+student.getName());
        System.out.println(student2.getId()+" "+student2.getName());
        School school=new School("JJ","5555");
        System.out.println(school);
    }

}

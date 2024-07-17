package com.example.dz_spring_core;

import com.example.dz_spring_core.springCreateBean.School;
import com.example.dz_spring_core.springCreateBean.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<Student> students=new ArrayList<>();
        ArrayList<School> schools=new ArrayList<>();
                var student=context.getBean("student",Student.class);
        student.setName("BEN");
        student.setId(1);
        var student2=context.getBean("student",Student.class);
        student2.setName("JEN");
        student2.setId(2);
        var student3=context.getBean("student",Student.class);
        student3.setName("LEN");
        student3.setId(3);
//        students.add(student);
//        students.add(student2);
//        students.add(student3);
        students.addAll(Arrays.asList(student,student2,student3));
        for (Student s: students){
            System.out.println(s);
        }
        // create bin class school
        var school=context.getBean("school",School.class);
        school.setName("Школа 1");
        school.setAdress("Ленина 7");
        var school1=context.getBean("school",School.class);
        school1.setName("Школа 12");
        school1.setAdress("Ленина 17");
        var school2=context.getBean("school",School.class);
        school2.setName("Школа 21");
        school2.setAdress("Ленина 27");
        schools.addAll(Arrays.asList(school,school1,school2));
        for (School sd: schools){
            System.out.println(sd);
        }
    }

}

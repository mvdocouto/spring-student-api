package com.example.demo.configuration.student;


import com.example.demo.repository.student.StudentRepository;
import com.example.demo.entity.student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student1 = new Student(
                    "Student 1",
                    "student1@email.com",
                    LocalDate.of(2000, Month.MAY, 10)
            );

            Student student2 = new Student(
                    "Student 2",
                    "student2@email.com",
                    LocalDate.of(1990, Month.NOVEMBER, 25)
            );

            Student student3 = new Student(
                    "Student 3",
                    "student3@email.com",
                    LocalDate.of(2005, Month.DECEMBER, 31)
            );

            repository.saveAll(
                    List.of(student1, student2, student3)
            );
        };
    }

}

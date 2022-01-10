package com.example.demo.student;


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
            Student marcus = new Student(
                    "Marcus",
                    "marcus@email.com",
                    LocalDate.of(2000, Month.MAY, 10)
            );

            Student glauce = new Student(
                    "Glauce",
                    "glauce@email.com",
                    LocalDate.of(2005, Month.NOVEMBER, 19)
            );

            Student joao = new Student(
                    "João",
                    "joao@email.com",
                    LocalDate.of(2005, Month.NOVEMBER, 19)
            );

            repository.saveAll(
                    List.of(marcus, glauce, joao)
            );
        };
    }

}

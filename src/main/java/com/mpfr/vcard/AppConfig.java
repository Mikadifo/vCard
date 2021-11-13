package com.mpfr.vcard;

import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.mpfr.vcard.Model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("registerEmp")
    public List<Employee> nominaEmpleados() {
        final String SLASH = File.separator;
        String jsonFile = System.getProperty("user.dir").concat(SLASH).concat("data").concat(SLASH).concat("info.json");

        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader(jsonFile));
            List<Employee> employees = gson.fromJson(reader, List.class);
            System.out.println(employees);
            return employees;
        } catch (Exception e) {
            System.out.println(e);
            return new ArrayList<>();
        }
    }

}

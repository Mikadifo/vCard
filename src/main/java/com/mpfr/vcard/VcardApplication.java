package com.mpfr.vcard;

import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.mpfr.vcard.Model.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VcardApplication {

    public static void main(String[] args) {
        SpringApplication.run(VcardApplication.class, args);

        final String SLASH = File.separator;
        String jsonFile = System.getProperty("user.dir").concat(SLASH).concat("data").concat(SLASH).concat("info.json");

        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader(jsonFile));
            Employee employee = gson.fromJson(reader, Employee.class);
            System.out.println(employee);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

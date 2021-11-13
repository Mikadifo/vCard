package com.mpfr.vcard;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("EmployeeService")
    public String nominaEmpleados() {
        return "";
    }

}
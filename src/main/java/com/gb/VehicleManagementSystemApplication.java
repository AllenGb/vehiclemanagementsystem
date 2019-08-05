package com.gb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.gb.Dao")
@SpringBootApplication
@EnableSwagger2
@ComponentScan("com.gb.*")
@ServletComponentScan
public class VehicleManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleManagementSystemApplication.class, args);
    }

}

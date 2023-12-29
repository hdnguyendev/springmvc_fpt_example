package com.web.fpt_example;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.spring6.SpringTemplateEngine;




@SpringBootApplication
public class FptExampleApplication {

    public static void main(String[] args) {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.addDialect(new LayoutDialect());
        SpringApplication.run(FptExampleApplication.class, args);
    }

}

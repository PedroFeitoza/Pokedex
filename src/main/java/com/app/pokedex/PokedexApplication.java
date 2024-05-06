package com.app.pokedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.app.pokedex")
public class PokedexApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PokedexApplication.class, args);
	}
}
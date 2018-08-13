package spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@ComponentScan({"spring.project.controller"})



@EnableSwagger2
@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		
		SpringApplication.run(MainApp.class, args);
		
	}

}

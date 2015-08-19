/*******************************************************************************
 * Copyright (c) 2011-2015 Sebastien Soudan
 *
 * All rights reserved.
 *******************************************************************************/
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan
@EnableSwagger2
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}

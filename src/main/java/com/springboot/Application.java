package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
        private Map<String,Object> cache=new HashMap<String,Object>();

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
      //HIS-301 Changes
     public void loadDataToCache(){

           //Logic Here....
       }
}

}

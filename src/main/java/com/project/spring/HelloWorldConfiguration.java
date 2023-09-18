package com.project.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age) {};
record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Ashok";
    }

    @Bean
    public int age(){
        return 21;
    }
    @Bean
    public Person person(){
        return new Person("Ravi",20);
    }

    @Bean(name="address2")
    public Address address(){
        return new Address("Doddanekundi","Bengaluru");
    }
}

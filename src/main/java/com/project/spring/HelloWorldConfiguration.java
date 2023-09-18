package com.project.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) {};
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
        return new Person("Ravi",20,new Address("NA","abc"));
    }
    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(), address());
    }

    @Bean
    @Primary
    public Person person3Parameters(String name, int age, Address address3){//name,age,address2
        return new Person(name,age, address3);
    }

    @Bean(name="address2")
    @Primary
    public Address address(){
        return new Address("Doddanekundi","Bengaluru");
    }
    @Bean(name="address3")
    public Address address3(){
        return new Address("ABC","D");
    }
}

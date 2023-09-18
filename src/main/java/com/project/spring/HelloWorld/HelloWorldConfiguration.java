package com.project.spring.HelloWorld;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Bean
    public Person person4Parameters(String name, int age, @Qualifier("address3qualifier") Address address){//name,age,address2
        return new Person(name,age, address);
    }

    @Bean(name="address2")
    @Primary
    public Address address(){
        return new Address("Doddanekundi","Bengaluru");
    }
    @Bean(name="address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("3ABC","D");
    }
}

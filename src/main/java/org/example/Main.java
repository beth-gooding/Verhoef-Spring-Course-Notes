package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Spring!");

        // configure beans using annotation
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // get the parrot object from the context
        // default behaviour of Spring is that the name of the bean is the name of the function that creates it
        Parrot parrot = context.getBean("parrot2", Parrot.class);
        System.out.println("The parrot's name is: " + parrot.getName());
    }
}
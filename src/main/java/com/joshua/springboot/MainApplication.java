package com.joshua.springboot;

import com.joshua.springboot.controller.Controller;
import com.joshua.springboot.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    private static Controller controller; // reference variable

    public MainApplication(UserController controller) {
        MainApplication.controller = controller; // Create an instance of Controller interface by injecting a class that implements it.
    }

    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class, args);

        controller.callService();

    }

}

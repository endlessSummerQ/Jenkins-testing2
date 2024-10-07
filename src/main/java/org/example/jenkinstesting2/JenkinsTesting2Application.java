package org.example.jenkinstesting2;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
@RequestMapping(value = "/test")
public class JenkinsTesting2Application {

    public static Logger log = Logger.getLogger(JenkinsTesting2Application.class.getName());

    @Autowired
    private static Test test;

    private JsonDto jsonDto = new JsonDto("1", "2");

    @PostConstruct
    public void init() {
        log.info("Initializing JenkinsTesting2Application");
    }

    public static void main(String[] args) {
        log.info("Starting JenkinsTesting2Application");
        SpringApplication.run(JenkinsTesting2Application.class, args);
    }

    @GetMapping
    public Map<String, Object> get() {
        Map<String, Object> screenData = new HashMap<>();

        // Добавляем заголовок и контент
        screenData.put("type", "form");
        screenData.put("title", "Registration Form");

        Map<String, Object> usernameField = new HashMap<>();
        usernameField.put("type", "text");
        usernameField.put("label", "Username");
        usernameField.put("name", "username");
        usernameField.put("placeholder", "Enter your username");

        Map<String, Object> passwordField = new HashMap<>();
        passwordField.put("type", "password");
        passwordField.put("label", "Password");
        passwordField.put("name", "password");
        passwordField.put("placeholder", "Enter your password");

        Map<String, Object> submitButton = new HashMap<>();
        submitButton.put("type", "submit");
        submitButton.put("label", "Register");

        screenData.put("fields", new Map[]{usernameField, passwordField, submitButton});

        return screenData;
    }

}

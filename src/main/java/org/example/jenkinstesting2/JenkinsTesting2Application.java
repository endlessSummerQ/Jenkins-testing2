package org.example.jenkinstesting2;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsTesting2Application {

    public static Logger log = Logger.getLogger(JenkinsTesting2Application.class.getName());

    @PostConstruct
    public void init() {
        log.info("Initializing JenkinsTesting2Application");
    }

    public static void main(String[] args) {
        log.info("Starting JenkinsTesting2Application");
        SpringApplication.run(JenkinsTesting2Application.class, args);
    }

}

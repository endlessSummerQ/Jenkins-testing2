package org.example.jenkinstesting2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JenkinsTesting2ApplicationTests {

    public static Logger log = Logger.getLogger(JenkinsTesting2ApplicationTests.class.getName());

    @Test
    void contextLoads() {
        log.info("Testing JenkinsTesting2ApplicationTests available");
        assertTrue(true);
    }

}

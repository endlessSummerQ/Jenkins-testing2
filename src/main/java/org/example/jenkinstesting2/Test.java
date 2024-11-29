package org.example.jenkinstesting2;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;

@Component
public class Test {

    static int a = 12,c = 12;
    static int b = 12;

    public Test test() {
        return this;
    }

    public static void main(String[] args) throws URISyntaxException {
//        String invalidUrl = "<host>:8080/some/path"; // Неправильный формат
//        URI uri = new URI(invalidUrl); // Это вызовет IllegalArgumentException
        Test test = new Test();
        System.out.println(test.test());
        System.out.println("Hellow orld");
        System.out.println("DADADAS");
    }

    public static void aVoid() {
        b();
    }

    private static void b() {
        throw new RuntimeException("Opps");
    }

    private static Object c() {
        return new BigInteger("3");
    }
}

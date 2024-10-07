package org.example.jenkinstesting2;

import org.springframework.stereotype.Component;

import java.io.Serializable;


public class JsonDto implements Serializable {

    private String id;
    private String name;

    public JsonDto(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

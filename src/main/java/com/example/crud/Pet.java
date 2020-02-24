package com.example.crud;

import lombok.*;

@Getter @Setter @NoArgsConstructor @Data @Builder @AllArgsConstructor
public class Pet {

    private Integer id;
    private String type;
    private String gender;
    private Integer age;

    public Object getid() {
        return id;
    }

}
package com.example.client1.Entity;

import lombok.Data;

@Data
public class UserEntity {
    private long id;
    private String name;
    private String password;
    private Boolean role;
}

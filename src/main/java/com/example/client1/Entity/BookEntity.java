package com.example.client1.Entity;


import lombok.*;





@Data
public class BookEntity {
    private Long id;
    private String title;
    private AuthorEntity author;
    private PublishingEntity publishing;
    private int year;
    private String kind;

}

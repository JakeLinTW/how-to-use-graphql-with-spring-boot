package com.jake.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private int id;
    private String name;
    private int authorId;
}

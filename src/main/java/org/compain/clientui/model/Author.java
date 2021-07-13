package org.compain.clientui.model;

import lombok.Data;

import java.util.Date;

@Data
public class Author {
    private Long idAuthor;
    private String name;
    private String firstname;
    private Date birth;
    private Date death;
}

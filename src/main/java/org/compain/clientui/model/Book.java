package org.compain.clientui.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Book {

    private Long idBook;
    private String title;
    private Author authorDto;
    private Date publicationDate;
    private String summary;
    private Category categoryDto;
    private List<Copy> copies;
    private int numberOfCopies;

}

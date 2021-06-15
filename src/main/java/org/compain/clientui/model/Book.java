package org.compain.clientui.model;

import lombok.Data;

@Data
public class Book {

    public String title;
    public String author;
    public String resume;

    @Override
    public String toString(){
        return "Book{" +
                "title='" + title + "'"+
                ", author='" + author + "'" +
                ", resume='" + resume + "'" +
                "}";
    }
}

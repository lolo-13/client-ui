package org.compain.clientui.model;

import lombok.Data;

@Data
public class Copy {
    private Long idCopy;
    private Book book;
    private Library library;
    private Boolean available;
}

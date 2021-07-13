package org.compain.clientui.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class Borrowing {

    private Long idBorrowing;
    private String title;
    private String author;
    private LocalDateTime borrowingDate;
    private LocalDateTime borrowingLimitDate;
    private Boolean renewal;
    private Boolean returned;


}

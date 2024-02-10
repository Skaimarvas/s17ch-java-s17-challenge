package com.example.s17ch.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * NoArgsConstructor ve Data ile yazmadığım için hata aldım.
 */
@NoArgsConstructor
@Data
public class Grade {
   private int coefficient;
   private String note;

    public Grade(int coefficient, String note) {
        this.coefficient = coefficient;
        this.note = note;
    }
}

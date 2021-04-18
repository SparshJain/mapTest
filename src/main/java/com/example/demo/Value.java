package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Value {
    private String value;
    private Integer valueNum;
    private Boolean flag;
}

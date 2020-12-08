package com.example.demo.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Sample001Form {

    @NotNull
    private int id;

    @NotBlank
    private String name;

}

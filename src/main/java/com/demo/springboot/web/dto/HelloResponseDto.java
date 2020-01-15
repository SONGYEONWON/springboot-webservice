package com.demo.springboot.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
@Setter
public class HelloResponseDto {

    private final String name;
    private final int amount;


}

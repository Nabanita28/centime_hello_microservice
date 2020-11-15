package com.ct.centime.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {

    private static final String HELLO = "Hello";

    public String getStringLiteral(){
        return HELLO;
    }
}

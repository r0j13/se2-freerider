package de.freerider.application;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    int add(int x, int y){
        return x+ y;
    }
}


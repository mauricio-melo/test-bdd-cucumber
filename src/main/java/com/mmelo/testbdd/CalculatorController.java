package com.mmelo.testbdd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CalculatorController.CALCULATOR_ENDPOINT)
public class CalculatorController {

    public static final String CALCULATOR_ENDPOINT = "/calc";

    @GetMapping("/add")
    public int add(int a, int b) {
        return a + b;
    }

    @GetMapping("/sub")
    public int subtract(int a, int b) {
        return a - b;
    }

    @GetMapping("/mul")
    public int multiply(int a, int b) {
        return a * b;
    }

    @GetMapping("/div")
    public int divide(int a, int b) {
        return a / b;
    }
}
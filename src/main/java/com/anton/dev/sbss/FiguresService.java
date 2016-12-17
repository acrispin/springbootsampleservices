/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anton.dev.sbss;

import org.springframework.stereotype.Service;

/**
 *
 * @author anton
 */
@Service(FiguresService.NAME)
public class FiguresService {

    public static final String NAME = "FiguresService";

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int difference(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        } else {
            return secondNumber - firstNumber;
        }
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

}

package com.javacourse.se.lesson11;

public class OperatorSwitch {
    final int value = 2, firstValue = 1, secondValue = 2, thirdValue = 3;
    public void foo(){
        switch (value) {
            case firstValue:
                System.out.println(value);
                break;
            case secondValue:
                System.out.println(firstValue);
                break;
            case thirdValue:
                System.out.println(secondValue);
                break;
            default:
                System.out.println("Not Found");
        }
    }
}

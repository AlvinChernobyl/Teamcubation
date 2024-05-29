package com.example.spring_boot;
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.printFizzBuzz(15);
    }

    public void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(getFizzBuzzValor(i));
        }
    }

    public String getFizzBuzzValor(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(numero);
        }
    }
}

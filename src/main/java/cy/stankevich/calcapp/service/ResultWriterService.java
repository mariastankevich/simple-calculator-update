package cy.stankevich.calcapp.service;

import java.util.Scanner;

import static cy.stankevich.calcapp.util.Calculator.*;

public class ResultWriterService {
    public static void printResult(char operation, float num1, float num2, float result) {
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}

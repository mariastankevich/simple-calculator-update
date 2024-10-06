package cy.stankevich.calcapp.service;

import java.util.Scanner;

import static cy.stankevich.calcapp.util.Calculator.*;

public class ResultWriterService {
    public static void printResult(String operation, int num1, int num2, int result) {
        System.out.println(num1+ " " + operation + " " + num2 + " = " + result);
    }
}

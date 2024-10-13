package cy.stankevich.calcapp._main;

import cy.stankevich.calcapp.service.ResultWriterService;
import cy.stankevich.calcapp.util.Calculator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.out.println("Enter Number 1:");
        float num1 = scan.nextFloat();
        System.out.println("Enter Number 2:");
        float num2 = scan.nextFloat();
        System.out.println("Enter an operation you want to make (+, - or *):");
        char operation = scan.next().charAt(0);
        if (operation == '+') {
            float resultsum = Calculator.sum(num1, num2, operation);
            ResultWriterService.printResult(operation, num1, num2, resultsum);
        }
        if (operation == '-') {
            float resultdeduct = Calculator.deduct(num1, num2, operation);
            ResultWriterService.printResult(operation, num1, num2, resultdeduct);
        }
        if (operation == '*') {
            float resultmultyply = Calculator.multyply(num1, num2, operation);
            ResultWriterService.printResult(operation, num1, num2, resultmultyply);
        }
    }
}

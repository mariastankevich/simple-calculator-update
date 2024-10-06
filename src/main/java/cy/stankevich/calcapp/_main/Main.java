package cy.stankevich.calcapp._main;

import cy.stankevich.calcapp.service.ResultWriterService;
import cy.stankevich.calcapp.util.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.out.println("Enter Number 1:");
        int num1 = scan.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = scan.nextInt();
        System.out.println("Enter an operation you want to make (+, - or *):");
        char operation = scan.next().charAt(0);
        int resultsum = Calculator.sum(num1, num2);
        ResultWriterService.printResult(operation "+", num1, num2, resultsum);
        int resultdeduct = Calculator.deduct(num1, num2);
        ResultWriterService.printResult(operation "-", num1, num2,  num1, num2, resultdeduct);
        int resultmultyply = Calculator.multyply(num1, num2);
        ResultWriterService.printResult(operation "*", num1, num2, resultmultyply);
    }
}

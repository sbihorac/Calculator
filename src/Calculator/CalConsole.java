package Calculator;

import java.util.Scanner;

public class CalConsole {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Calculator calc = null;

        System.out.println("Hello, let's do math.");
        System.out.println("Which calculator do you want to use?\n" +
                "1 - Basic calculator \n" +
                "2 - Advanced calculator");

        int type = input.nextInt();

        if (type == 1){
            calc = new Calculator();
        } else if (type == 2) {
            calc = new AdvancedCalculator();
        }

        System.out.println("We'll do the following operations: " + calc.listOperations());
        System.out.println("Please format your input in the following fashion : <a> <operation> <b>.");


        calc.setA(input.nextDouble());
        calc.setOperation(input.next());
        calc.setB(input.nextDouble());

        try {
            System.out.println(calc.doOperation());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

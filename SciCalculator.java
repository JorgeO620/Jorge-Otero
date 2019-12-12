import java.util.Scanner;
public class SciCalculator {
    public static void main(String[] args) {
        Scanner scanObject = new Scanner(System.in);

        String num1;
        String num2;
        int operator;
        double answer=0;
        int counter = 0;
        double sum = 0;
        double average;
        //double RESULT = 0.0;
        double temp1;
        double temp2;

        System.out.println("Current Result: " + sum);
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println("Enter Menu Selection: ");
            operator = scanObject.nextInt();


            if (0 > operator || 7 < operator || operator == 0 || operator == 7 || operator == 7 && sum == 0) {

                 if (operator > 7 || operator < 0) {
                    System.out.println("Error: Invalid selection!");
                     System.out.println("Enter Menu Selection: ");
                     operator = scanObject.nextInt();
                     if (operator==0) {
                         System.out.println("Thanks for using this calculator. Goodbye!");
                         System.exit(0);
                     }
                }
                if (operator == 0) {
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    System.exit(0);
                }
                if (operator == 7 && sum == 0) {
                    System.out.println("Error: No calculations yet to average!");
                    System.out.println("Enter Menu Selection: ");
                    operator = scanObject.nextInt();
                    if (operator==0){
                        System.out.println("Thanks for using this calculator. Goodbye!");
                        System.exit(0);
                    }
                }
                if (operator == 7){
                    System.out.println("Sum of calculations: " + sum);
                    System.out.println("Number of calculations: " + counter);
                     average= ((sum / counter)*100)/100;
                    System.out.println("Average of calculations: " + (Math.round(average*100) /100.0));
                    System.out.println("Enter Menu Selection: ");
                    operator = scanObject.nextInt();
                    if (operator==0){
                        System.out.println("Thanks for using this calculator. Goodbye!");
                        System.exit(0);
                    }
                }
            }
            System.out.println("Enter first operand: ");
        num1 = scanObject.next();
        if (num1.equals("RESULT")) {
            temp1 = answer;
        }
        else {
            temp1 = Double.valueOf(num1);
        }
        System.out.println("Enter second operand: ");
        num2 = scanObject.next();
        if (num2.equals("RESULT")) {
            temp2 = answer;
        }
        else {
            temp2 = Double.valueOf(num2);
        }
                    switch (operator) {

                        case 1:
                            answer = temp1 + temp2;
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                        case 2:
                            answer = temp1 - temp2;
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                        case 3:
                            answer = temp1 * temp2;
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                        case 4:
                            answer = temp1 / temp2;
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                        case 5:
                            answer = Math.pow(temp1, temp2);
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                        case 6:
                            answer = Math.log(temp1) / Math.log(temp2);
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

            }
            while (operator!=0){

                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("Enter Menu Selection: ");
                operator = scanObject.nextInt();


                if (0 > operator || 7 < operator || operator == 0 || operator ==7 || operator == 7 && sum == 0) {
                    if (operator > 7 || operator < 0) {
                        System.out.println("Error: Invalid selection!");
                        operator = scanObject.nextInt();
                        if (operator==0){
                            System.out.println("Thanks for using this calculator. Goodbye!");
                            System.exit(0);
                        }
                    }
                    if (operator == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye!");
                        System.exit(0);

                    }
                    if (operator == 7 && sum == 0) {

                        System.out.println("Error: No calculations yet to average!");
                        operator = scanObject.nextInt();
                        if (operator==0){
                            System.out.println("Thanks for using this calculator. Goodbye!");
                            System.exit(0);
                        }
                    }
                    if (operator == 7){
                        System.out.println("Sum of calculations: " + sum);
                        System.out.println("Number of calculations: " + counter);
                        average = ((sum / counter)*100)/100;
                        System.out.println("Average of calculations: " + (Math.round(average*100) /100.0));
                        System.out.println("Enter Menu Selection: ");
                        operator = scanObject.nextInt();
                        if (operator==0){
                            System.out.println("Thanks for using this calculator. Goodbye!");
                            System.exit(0);
                        }

                    }
                }
                else {

                    System.out.println("Enter first operand: ");
                    num1 = scanObject.next();
                    if (num1.equals("RESULT")) {
                        temp1 = answer;
                    }
                    else {
                        temp1 = Double.valueOf(num1);
                    }
                    System.out.println("Enter second operand: ");
                    num2 = scanObject.next();
                    if (num2.equals("RESULT")) {
                        temp2 = answer;
                    }
                    else {
                        temp2 = Double.valueOf(num2);
                    }
                    switch (operator) {

                        case 1:
                            answer = temp1 + temp2;
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                        case 2:
                            answer = temp1 - temp2;
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                        case 3:
                            answer = temp1 * temp2;
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                        case 4:
                            answer = temp1 / temp2;
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                        case 5:
                            answer = Math.pow(temp1, temp2);
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                        case 6:
                            answer = Math.log(temp2) / Math.log(temp1);
                            System.out.println("Current Result: " + answer);
                            counter = counter + 1;
                            sum = sum + answer;
                            break;

                    }
                }
            }
        }
    }



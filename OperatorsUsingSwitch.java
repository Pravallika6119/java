package arrays;

public class OperatorsUsingSwitch {
    public static void main(String args[]) {
        char operator = '*';
        Double number1 = 1.4, number2 = -5.3, result;
        switch (operator) {
            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.print(number1 + "+" + number2 + " = " + result);
                break;
            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
                break;
            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + " = " + result);
                break;
            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.print(number1 + "/" + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}

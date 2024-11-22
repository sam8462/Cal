import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cal {
    public static void main(String[] args) {
        // calculator of two number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first value");
        int a = sc.nextInt();
        System.out.println("enter a second value");
        int b = sc.nextInt();
        System.out.println("chose a operator");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println( "Add of this number : " + (a + b));
                break;

            case '-':
                System.out.println( "Substract of this number : "+ (a - b));
                break;

            case '*':
                System.out.println(  "Multiple of this number : "+( a * b));
                break;

            case '/':
                System.out.println(   "Divide of this number : "+ (a / b));
                break;

            case '%':
                System.out.println(  "Modulo of this number : "+ (a % b));
                break;
            default:
                System.out.println("wrong operator");
        }
    }
}
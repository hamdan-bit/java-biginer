import java.util.Scanner;

public class hello{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // cli calculator
        System.out.println("CAlCULATOR");
        int num1;
        int num2;
        char action;
        System.out.println("Choose operation");
        action = scanner.next().charAt(0);
        System.out.println("Enter First Number");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        num2 = scanner.nextInt();

        if (action =='+' ){
            int sum = num1 + num2;
            System.out.println("The sum is "+ sum);
        } else if (action == '-') {
            if (num1>=num2){
                int difference = num1-num2;
                System.out.println("The difference is "+ difference);
            }else {
                System.out.println("Second number is greater than the first Number");
            }

        } else if (action == '/') {
            if (num2 != 0){
                float division =  (float)num1/(float)num2;
                System.out.println("Dividend "+ division);
            }else if(num2 < 0){
                System.out.println("Divisor cannot be less than zero");
            }else{
                System.out.println("Divisor cannot be zero ");
            }
        } else if (action == '*') {
            int product = num1*num2;
            System.out.println("Product is "+ product);
        }else{
            System.out.println("Invalid operator");
        }
        scanner.close();

    }
}

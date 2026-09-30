import java.util.Scanner;

public class driving {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter you name");
        String name = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("your name is " + name);
        System.out.println("your age is "+ age);
         
        input.close();
    }
}

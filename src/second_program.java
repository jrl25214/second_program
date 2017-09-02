import java.util.Scanner;

public class second_program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = sc.next();
        System.out.println("Enter your password");
        String password = sc.next();
        System.out.println("Hello " + username + ", Welcome to CSC200 class! and Your password is " + password);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.println("enter a money");
         money = input.nextDouble();
        System.out.println("Enter a month");
        month = input.nextInt();
        System.out.println("Enter a interestRate");
        interestRate = input.nextDouble();
        double totalInterestRate = 0;
        for(int i = 0; i < month; i++) {
            totalInterestRate += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total interest  " + totalInterestRate);
    }
}

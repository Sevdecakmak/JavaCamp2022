import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Write a second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Write a third number: ");
        int number3 = scanner.nextInt();

        int bigNumber = number1;

        if(number1<number2){
            bigNumber= number2;
        }
        if(number3>number1 && number3>number2) {
            bigNumber = number3;
        }
        System.out.println("The big number is : " +bigNumber);
    }
}

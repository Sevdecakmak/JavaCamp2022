import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //video 22
        //what is the perfect numbers? if the number equal to the sum of its divisors, that number is perfect number
      Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();

        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number %i == 0) {
                total = total + i;
            }
        }
        if(total==number){
            System.out.println("That number is Perfect Number! ");
            }else{
            System.out.println("That is not perfect number!");
        }



    }
}

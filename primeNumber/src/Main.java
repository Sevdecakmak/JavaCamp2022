import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //video 20
        //if the number only divisible by one and itself, that number is prime number
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scan.nextInt();
        int counter =0;
        Boolean isPrime = true;
        if(number==1){
            System.out.println("Number is not prime");
            return;
        }
        if(number<1){
            System.out.println("That number is not a valid");
            return;
        }
        for(int i =2; i<number; i++ ){
            if(number %i ==0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("That number is prime!" +number);
        }else{
            System.out.println("That number is not prime!" +number);
        }

        //video 21
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter letter: ");
        char letter = scan.next().charAt(0);

        switch(letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Bold letter: " +letter);
                break;
            default:
                System.out.println("High letter: ");
       }

    }
}

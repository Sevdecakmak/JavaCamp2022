import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //conditionals
        //int number= 20;
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a Number: ");
        int number= reader.nextInt();

        if(number<20){
            System.out.println("The number is less than 20");
        }else if(number==20){
            System.out.println("The number is equal to 20");
        }else{
            System.out.println("The number is more than 20");
        }
    }
}

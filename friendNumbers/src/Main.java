import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

    System.out.println("Enter your first number: ");
    int number1 = scan.nextInt();
    int total1=0;

    System.out.println("Enter your second number: ");
    int number2 =scan.nextInt();
    int total2=0;

    for(int i=1; i<number1; i++){
        if(number1%i==0){
        total1 = total1+i;
        }
    }
        System.out.println("TOTAL1: " +total1);

        for(int j=1; j<number2; j++){
            if(number2%j==0){
                total2 = total2+j;
            }
        }
        System.out.println("TOTAL2: " +total2);
        if(total1==number2 && total2==number1){
            System.out.println("that is friend number ");
        }else{
            System.out.println("that is not friend number");
        }
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your grade: ");
        Scanner scan = new Scanner(System.in);
        char grade = scan.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent you passed the exam! ");
                break;
            case 'B':
                System.out.println("Great you passed the exam! ");
                break;
            case 'C':
                System.out.println("Good! You passed the exam! ");
                break;
            case 'D':
                System.out.println("Not bad! You passed the exam! ");
                break;
            case 'E':
                System.out.println("Too bad! You failed the exam! ");
                break;
            default:
                System.out.println("Sorry! You entered an invalid grade");
        }
    }
}



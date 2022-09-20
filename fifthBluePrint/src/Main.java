public class Main {

    public static void main(String[] args) {
	//video 12 for

        for(int i=1;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("The For Loop is end! ");

    //video 13 while
        int i=1;
        while(i<10){
            System.out.println(i); //infinitive loop
            i++;
        }
        System.out.println("The While loop is end! ");

    //video 14 do while
        int j=1;
        do{                 //even if the condition does not provide, loop works one time
            System.out.println(j);
            j++;
        } while(j<10);
        System.out.println("The do-While loop is end! ");
    }
}

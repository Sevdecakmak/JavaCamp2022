public class Main {

    public static void main(String[] args) {
        // video 15 Arrays
	 String student1 = "Engin ";
     String student2 = "Derin ";

     String[] students = new String[2];
     students[0] = "Engin";
     students[1] = "Derin";

     for(int i=0; i<students.length; i++){
         System.out.println(students[i]);
     }
     for(String student:students){ //öğrenciler dizisindeki her elemanı gez
         System.out.println(student);
     }
    }
}

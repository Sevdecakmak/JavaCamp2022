import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //video 18
        String message = "The weather is Great today!";
        System.out.println(message);

        System.out.println("Number of elements :" + message.length());
        System.out.println("5th elements: " + message.charAt(4));
        System.out.println(message.concat(" Yey "));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("!"));
        char[] characters = new char[5];
        message.getChars(0,5,characters, 0); // ilk ikisi kaç karakter alınacağı sondaki kaçıncıdan başlanacağı
        System.out.println(characters);
        System.out.println(message.indexOf("ea")); // kaçıncı eleman olduğunu bulur
        System.out.println(message.lastIndexOf("e"));

        // video 19
        String message = "      The weather is great today!        ";
        System.out.println(message);

        String newMessage= message.replace(' ', '-'); //change the characters
        System.out.println(newMessage);
        System.out.println(newMessage.substring(2,5)); // (2) from the second index  //(2,5) from two to five, not including five

        for(String word : message.split(" ")){
            System.out.println(word);
        }
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.toUpperCase(Locale.ROOT));
        System.out.println(message.trim()); // başındaki boşlukları atma


    }
    }
}

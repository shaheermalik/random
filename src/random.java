import java.util.Scanner;



public class random {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner





        System.out.print("Enter a string: ");

        String string = input.nextLine();





        System.out.println(

                "The number of letters in the string \"" +

                        string + "\": " + countLetters(string));

    }




    public static int countLetters(String s) {

        int numberOfLetters = 0; // Counts the number of letters

        for (int i = 0; i < s.length(); i++) {



            if (Character.isLetter(s.charAt(i)))

                numberOfLetters++;

        }

        return numberOfLetters;

    }

}
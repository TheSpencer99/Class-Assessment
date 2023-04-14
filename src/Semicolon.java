 import java.util.Scanner;

    public class Semicolon {
       private static Scanner spence;
        public static void main(String[] args) {
            String string;
            int i;

            spence= new Scanner(System.in);

            System.out.print("\n Please Enter any String to Print =  ");
            string = spence.nextLine();

            for(i = 0; i < string.length(); i++)
            {
                System.out.println(string.charAt(i));

            }
        }
    }


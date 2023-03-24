package eggit;
//To import a scanner we need this library, used to get input


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world of chumps");
        System.out.println("Goodbye world of chumps");

        //These are primitive data types AKA as not changeable
        int aSingleInteger= 5 ;
        double aSingleFloat = 5.1 ;
        boolean aSingleBoolean = true ; //or false lul
        char aSingleChar = 'F'; ///A single string, Single quotation"

        //These date types are not primitive, AKA Changeable
        String aSingleString = "This is a dope string yo";



        System.out.println(aSingleInteger+aSingleInteger);
        System.out.println(aSingleFloat+aSingleFloat);
        System.out.println("Tunnel Snakes rule? "+aSingleBoolean);
        System.out.println(aSingleChar);
        System.out.println(aSingleString);

        Scanner aSingleUserInput = new Scanner(System.in);
        String aSingleInput = aSingleUserInput.next(); ///If i expect an INT it would be .nextInt, a bool .nextBoolean, a double .nextDouble.
        ///But the best way is to receive a string and cover it to the right data type".
        System.out.println(aSingleInput);

    }
}

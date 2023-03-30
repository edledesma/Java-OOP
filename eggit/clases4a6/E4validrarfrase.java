package eggit.clases4a6;

import java.util.Scanner;

public class E4validrarfrase {
    public static void main (String[] args){
        Scanner aNewInput = new Scanner(System.in);
        System.out.print("Input a new phrase: ");
        String aPhrase = aNewInput.nextLine();
        if ((aPhrase.substring(0,1)).equalsIgnoreCase("a")) {
            System.out.println("RIGHT");
        }else{
            System.out.println("WRONG");
        }

    }

}

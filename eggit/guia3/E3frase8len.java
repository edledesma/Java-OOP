package eggit.guia3;

import java.util.Scanner;

public class E3frase8len {
    public static void main (String[] args){
        Scanner aNewInput = new Scanner(System.in);
        System.out.print("Input a new phrase: ");
        String aPhrase = aNewInput.nextLine();
        if (aPhrase.length()==8) {
            System.out.println("RIGHT");
        }else{
            System.out.println("WRONG");
        }

    }

}

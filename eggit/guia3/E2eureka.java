package eggit.guia3;

import java.util.Scanner;

public class E2eureka {
    public static void main(String[] args){
        System.out.println("Input phrase: ");
        Scanner strInput = new Scanner(System.in);
        String aPhrase = strInput.nextLine();

        if (aPhrase.equalsIgnoreCase("eureka")){
            System.out.println("They are the same");
        }else{
            System.out.println("They are not the same");
        }
    }
}

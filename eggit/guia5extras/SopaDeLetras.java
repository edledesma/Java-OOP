package eggit.guia5extras;

import java.util.Scanner;

public class SopaDeLetras {
    public static void main(String[] args) {
        Scanner vScanner = new Scanner(System.in);

        String[] vWords = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Input a new word " + (i + 1) + " (Between 3 & 5 characters in lenght): ");
            vWords[i] = vScanner.nextLine().toUpperCase();
            while (vWords[i].length() < 3 || vWords[i].length() > 5) {
                System.out.printf("The word must be between 3 & 5 characters. Input the word " + (i + 1) + " again: ");
                vWords[i] = vScanner.nextLine().toUpperCase();
            }
        }
        char[][] vWordsVector = new char[20][20];
        for (int i = 0; i < vWords.length; i++) {
            int vCurrentRow = (int) (Math.random() * 20);
            int vCurrentCol = (int) (Math.random() * (20 - vWords[i].length()));
            String vActualWord = vWords[i];
            for (int j = 0; j < vActualWord.length(); j++) {
                vWordsVector[vCurrentRow][vCurrentCol] = vActualWord.charAt(j);
                vCurrentCol++;
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < vWordsVector[i].length; j++) {
                if (vWordsVector[i][j] == 0) {
                    vWordsVector[i][j] = (char) (Math.random() * 10 + '0');
                }
            }
        }
        for (int i = 0; i < vWordsVector.length; i++) {
            for (int j = 0; j < vWordsVector[i].length; j++) {
                System.out.print(vWordsVector[i][j] + " ");
            }
            System.out.println();
        }
    }
}
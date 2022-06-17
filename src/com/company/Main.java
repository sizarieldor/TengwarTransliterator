package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //transliterate latin characters into characters for Tengwar in the Mode of Beleriand

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        //populate arrays with Latin chars
        char[] latinAlphabetLowercases = generateArrayLowercase();

        //map chars to tengwar keys
        Map<Character, String> transcriberMap = new LinkedHashMap<>();
        //this is not ideal, might read from a .csv later
        transcriberMap.put(latinAlphabetLowercases[0], "]G");
        transcriberMap.put(latinAlphabetLowercases[1], "w"); //b
        transcriberMap.put(latinAlphabetLowercases[2], "a"); //c
        transcriberMap.put(latinAlphabetLowercases[3], "2"); //d
        transcriberMap.put(latinAlphabetLowercases[4], "l");
        transcriberMap.put(latinAlphabetLowercases[5], "e");
        transcriberMap.put(latinAlphabetLowercases[6], "x");
        transcriberMap.put(latinAlphabetLowercases[7], "9");
        transcriberMap.put(latinAlphabetLowercases[8], "`B");
        transcriberMap.put(latinAlphabetLowercases[9], "s");
        transcriberMap.put(latinAlphabetLowercases[10], "z");
        transcriberMap.put(latinAlphabetLowercases[11], "j");
        transcriberMap.put(latinAlphabetLowercases[12], "y");
        transcriberMap.put(latinAlphabetLowercases[14], "6");
        transcriberMap.put(latinAlphabetLowercases[15], "h");
        transcriberMap.put(latinAlphabetLowercases[16], "q");
        transcriberMap.put(latinAlphabetLowercases[17], "z");
        transcriberMap.put(latinAlphabetLowercases[18], "7");
        transcriberMap.put(latinAlphabetLowercases[19], "8");
        transcriberMap.put(latinAlphabetLowercases[20], "1");
        transcriberMap.put(latinAlphabetLowercases[21], ".");
        transcriberMap.put(latinAlphabetLowercases[22], "r");
        transcriberMap.put(latinAlphabetLowercases[23], "n");
        transcriberMap.put(latinAlphabetLowercases[24], "z|");
        transcriberMap.put(latinAlphabetLowercases[25], "i");
        transcriberMap.put(latinAlphabetLowercases[26], "k");

        //do the magic

    }

    private static char[] generateArrayLowercase() {
        char[] latinAlphabetLowercases = new char[26];
        for (int i = 97; i < 123; i++) {
            latinAlphabetLowercases[i - 97] = (char) i;
        }
        return latinAlphabetLowercases;
    }


    private static String transliterateText() {
        String result = "";

        return result;
    }
}

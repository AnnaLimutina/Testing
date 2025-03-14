package utomigos;

import java.util.Arrays;

public class Util {
    public static String sortStringAsc(String string) {
        boolean isSorted;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            isSorted = true;
            for (int j = 0; j < charArray.length - 1; j++) {
                if ((int) charArray[j + 1] < (int) charArray[j]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {break;}
        }
        return Arrays.toString(charArray);
    }

    public static String sort2(String s) {
        char[] symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxwz".toCharArray();
        String newStr = "";
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (symbols[i] == s.charAt(j)) {
                    newStr = newStr.concat(String.valueOf(s.charAt(j)));
                }
            }
        }
        return newStr;
    }

}

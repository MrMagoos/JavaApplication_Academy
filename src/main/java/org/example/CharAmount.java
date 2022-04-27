package org.example;

import java.util.Locale;

public class CharAmount {
    public static void getCharacters(String str) {

        int characters = 256;
        int count[] = new int[characters];

        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;

        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println(str.charAt(i) + " = " + count[str.charAt(i)]);
        }
    }
}

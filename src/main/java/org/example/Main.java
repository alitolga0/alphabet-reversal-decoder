package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String message = "Povzhv hvmw z nvhhztv drgs xfiivmg hvhhrlm rm qhlm ulinzg erz gsrh vcznkov : {\"gbkv\":\"REGISTER\",\"mznv\":\"blfi mznv\",\"hfimznv\":\"blfi hfimznv\",\"vnzro\":\"blfi vnzro zwwivhh\",\"ivtrhgizgrlmKvb\":\"ccc\"}. Kvvk orhgvmrmt mvd nvhhztv uli gzhp xlmgvmg! Ylfi ivtrhgizgrlmKvb : 7058yw7347x9xz2u8x35uwvz08211z5w8yx285414676v80y4y9xxv6ywzz44454".toLowerCase();
        String[] words = message.split("\\W+");

        String result = "";
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Map<String, String> map = new HashMap();

        for (int i = 0; i < 26; i++) {
            map.put(array[i], array[array.length - 1 - i]);
        }

        for (int j = 0; j < words.length; j++) {
            char[] letters = words[j].toCharArray();
            for (int i = 0; i < letters.length; i++) {
                if (map.get(String.valueOf(letters[i])) == null) {
                    result += String.valueOf(letters[i]);
                } else {
                    result += map.get(String.valueOf(letters[i]));
                }

            }
            result += " ";
        }
        System.out.println(result);
    }
}
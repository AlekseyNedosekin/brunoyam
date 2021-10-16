package Les1;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Les2 {

    public static void  Les2_2() {
      int i = 5;
      short j = (short) (i+1);
      System.out.println(j);

      short j2 = (parceShort(i));
      System.out.println(j2);

      String s = "Long string";
        System.out.println(s.getBytes(StandardCharsets.UTF_8));
        System.out.println(s.getBytes());
        System.out.println(s.charAt(3)); //give it symbol
        System.out.println(s.toLowerCase(Locale.ROOT));//delete all Big symbol
        System.out.println(s.toUpperCase(Locale.ROOT));//all symbol do it BIG
        System.out.println(s.chars());
        char s1 = (char) (s.codePointAt(7));
        System.out.println(s1);
        char s2 = (char) s.codePointBefore(7);
        System.out.println(s2);
        System.out.println(s.concat(" ttt")); //concatenation
        //System.out.println(s.


       // System.out.println(s.);
    }

    private static short parceShort(int i) {
        short j = (short) (i+5);
        return j;
    }
}

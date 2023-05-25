package org.dv.scuderi;

import java.util.*;

/**
 * ProsaGPT
 */
public class D implements Scuderi {

    private final Scanner in = new Scanner(System.in);
    private final Set<Character> alphabetLetters = new HashSet<>();

    {
        for (char c = 'a'; c <= 'z'; ++c) {
            alphabetLetters.add(c);
        }
    }

    @Override
    public void solve() {
        int n = Integer.parseInt(in.nextLine());

        while (n-- > 0) {
            char[] phrase = in.nextLine().toCharArray();

            Set<Character> phraseLetters = new HashSet<>();
            for (char c : phrase) {
                phraseLetters.add(c);
            }

            if (phraseLetters.size() == alphabetLetters.size()) {
                System.out.println("muita informacao");
            } else if (phraseLetters.size() >= alphabetLetters.size() / 2) {
                System.out.println("media informacao");
            } else {
                System.out.println("pouca informacao");
            }
        }
    }

}

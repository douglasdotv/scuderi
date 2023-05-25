package org.dv.scuderi;

import java.util.*;

/**
 * Bob
 */
public class B implements Scuderi {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public void solve() {
        String s = sc.next();
        int n = s.length();

        int[] aWins = new int[n + 1];
        int[] bWins = new int[n + 1];
        int[] aScore = new int[n + 1];
        int[] bScore = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                for (int j = 1; j <= n; j++) {
                    aScore[j]++;
                    if (aScore[j] == j) {
                        aWins[j]++;
                        aScore[j] = 0;
                        bScore[j] = 0;
                    }
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    bScore[j]++;
                    if (bScore[j] == j) {
                        bWins[j]++;
                        aScore[j] = 0;
                        bScore[j] = 0;
                    }
                }
            }
        }

        List<Integer> results = new ArrayList<>();
        for (int k = 1; k <= n; k++) {
            if (aWins[k] > bWins[k]) {
                results.add(k);
            }
        }

        System.out.println(results.size());
        for (int result : results) {
            System.out.print(result + " ");
        }
    }

}
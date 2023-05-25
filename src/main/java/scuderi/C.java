package org.dv.scuderi;

import java.util.*;

/**
 * Fake news
 */
public class C implements Scuderi {

    private final Scanner in = new Scanner(System.in);
    private final int[][] ab = new int[1000][2];

    @Override
    public void solve() {
        int n = in.nextInt();
        int v = in.nextInt();
        for (int i = 0; i < n; i++) {
            ab[i][0] = in.nextInt();
            ab[i][1] = in.nextInt();
        }

        int totalViews = 0;
        int time = 0;

        while (totalViews < v) {
            for (int i = 0; i < n; i++) {
                if (time >= ab[i][0]) {
                    totalViews++;
                    ab[i][0] += ab[i][1];
                }
            }
            time++;
        }

        System.out.println(time - 1);
    }

}

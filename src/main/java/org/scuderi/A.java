package org.dv.scuderi;

import java.util.Scanner;

/**
 * Avião
 */
public class A implements Scuderi {

    private final Scanner in = new Scanner(System.in);
    private int h;
    private int k;
    private int v;
    private int s;
    private int dist;

    @Override
    public void solve() {
        readInput();

        while (h > 0) {
            v += s;

            v -= Math.max(1, v/10);

            if (v >= k) {
                h++;
            } else if (v > 0) {
                h--;
                if (h == 0) {
                    v = 0;
                }
            }

            if (v <= 0) {
                h = 0;
                if (v < 0) {
                    v = 0;
                }
            }

            dist += v;

            if (s > 0) {
                s--;
            }
        }

        System.out.println(dist);
    }

    private void readInput() {
        String[] input = in.nextLine().split("\\s+");
        h = Integer.parseInt(input[0]);
        k = Integer.parseInt(input[1]);
        v = Integer.parseInt(input[2]);
        s = Integer.parseInt(input[3]);
    }

}

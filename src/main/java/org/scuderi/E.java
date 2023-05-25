package org.dv.scuderi;

import java.util.Scanner;

/**
 * Eclipse
 */
public class E implements Scuderi {

    private final Scanner in = new Scanner(System.in);
    private int ds;
    private int ys;
    private int dm;
    private int ym;
    private int sunDiff;
    private int moonDiff;
    private int maxDiff;

    @Override
    public void solve() {
        readInput();
        calculateDiffs();
        int answer;

        if (maxDiff == sunDiff) {
            answer = moonDiff;
            while (answer < maxDiff) {
                answer += ym;
            }
        } else {
            answer = sunDiff;
            while (answer < maxDiff) {
                answer += ys;
            }
        }

        if (answer != maxDiff) {
            if (maxDiff == sunDiff) {
                maxDiff += ys;
                while (answer < maxDiff) {
                    answer += ym;
                }
            } else {
                maxDiff += ym;
                while (answer < maxDiff) {
                    answer += ys;
                }
            }
        }

        System.out.println(answer);
    }

    private void readInput() {
        ds = in.nextInt();
        ys = in.nextInt();
        in.nextLine();
        dm = in.nextInt();
        ym = in.nextInt();
    }

    private void calculateDiffs() {
        sunDiff = ys - ds;
        moonDiff = ym - dm;
        maxDiff = Math.max(sunDiff, moonDiff);
    }

}

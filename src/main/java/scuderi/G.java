package org.dv.scuderi;

import java.util.Scanner;

/**
 * Mágica
 */
public class G implements Scuderi {

    private final Scanner in = new Scanner(System.in);
    private int a;
    private int b;
    private int c;
    private int d;

    @Override
    public void solve() {
        readInput();

        for (int n = 0; n < 1_000_000_000; ++n) {
            if (n % a == 0 && n % b != 0 && c % n == 0 && d % n != 0) {
                System.out.println(n);
                return;
            }
        }

        System.out.println(-1);
    }

    private void readInput() {
        String[] numbers = in.nextLine().split("\\s+");
        a = Integer.parseInt(numbers[0]);
        b = Integer.parseInt(numbers[1]);
        c = Integer.parseInt(numbers[2]);
        d = Integer.parseInt(numbers[3]);
    }

}

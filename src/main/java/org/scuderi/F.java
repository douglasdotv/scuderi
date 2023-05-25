package org.dv.scuderi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Cabotagem
 */
public class F implements Scuderi {

    private final Scanner in = new Scanner(System.in);
    private int a;
    private int b;
    private int c;

    @Override
    public void solve() {
        int[] abc = readInputAndGetSortedTimes();
        if (abc[0] == abc[1] || abc[0] == abc[2] || abc[1] == abc[2] || abc[0] + abc[1] == abc[2]) {
            System.out.println('S');
        } else {
            System.out.println('N');
        }
    }

    private int[] readInputAndGetSortedTimes() {
        String[] input = in.nextLine().split("\\s+");
        int[] numbers = new int[3];
        numbers[0] = Integer.parseInt(input[0]);
        numbers[1] = Integer.parseInt(input[1]);
        numbers[2] = Integer.parseInt(input[2]);
        Arrays.sort(numbers);
        return numbers;
    }

}
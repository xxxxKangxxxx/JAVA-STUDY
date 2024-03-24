package java_study_Baekjoon;

import java.util.Scanner;

public class Prob_1297 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int D = scanner.nextInt();
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        double answer = Math.sqrt(1.0 * D * D / (H * H + W * W));
        System.out.println((int) Math.floor(answer * H) + " " + (int) Math.floor(answer * W));
    }
}

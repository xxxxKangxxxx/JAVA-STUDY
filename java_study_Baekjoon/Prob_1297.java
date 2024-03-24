package java_study_Baekjoon;

import java.util.Scanner;

public class Prob_1297 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int D = scanner.nextInt(); // 대각선의 길이 
        int H = scanner.nextInt(); // 높이 비율 
        int W = scanner.nextInt(); // 너비 비율 

        double answer = Math.sqrt(1.0 * D * D / (H * H + W * W)); // 피타고라스 공식 사용 
        System.out.println((int) Math.floor(answer * H) + " " + (int) Math.floor(answer * W)); // 높이의 비율과 너비의 비율을 구한 값과 곱하여 최종 높이와 너비를 구함 
    }
}

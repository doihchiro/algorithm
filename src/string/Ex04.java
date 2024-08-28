package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            String reverse = new StringBuilder(s).reverse().toString();
            answer.add(reverse);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex04 ex04 = new Ex04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String s : ex04.solution(n, str)) {
            System.out.println(s);
        }
    }
}

package string;

import java.util.Scanner;

public class Ex09 {

    public int solution(String str) {

        String answer = "";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) answer += c;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Ex09 ex09 = new Ex09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex09.solution(str));
    }
}

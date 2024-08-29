package string;

import java.util.Scanner;

public class Ex02 {

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex02 ex02 = new Ex02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex02.solution(str));
    }
}

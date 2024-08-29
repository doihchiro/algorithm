package string;

import java.util.Scanner;

public class Ex06 {

    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex06 ex06 = new Ex06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex06.solution(str));
    }
}

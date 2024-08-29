package string;

import java.util.Scanner;

public class Ex07 {

    public String solution(String str) {
        String answer = "YES";

        str = str.toUpperCase();
        int len = str.length();

        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-1-i)) answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex07 ex05 = new Ex07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex05.solution(str));
    }
}

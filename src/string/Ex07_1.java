package string;

import java.util.Scanner;

public class Ex07_1 {

    public String solution(String str) {
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Ex07_1 ex05 = new Ex07_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex05.solution(str));
    }
}

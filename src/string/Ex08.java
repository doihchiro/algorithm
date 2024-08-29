package string;

import java.util.Scanner;

public class Ex08 {

    public String solution(String str) {
        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Ex08 ex05 = new Ex08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ex05.solution(str));
    }
}

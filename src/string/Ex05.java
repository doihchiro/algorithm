package string;

import java.util.Scanner;

public class Ex05 {

    public String solution(String str) {
        String answer;

        int lt = 0, rt = str.length() - 1;
        char[] c = str.toCharArray();

        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            } else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);

        return answer;
    }

    public static void main(String[] args) {
        Ex05 ex05 = new Ex05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex05.solution(str));
    }
}

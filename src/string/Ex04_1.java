package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_1 {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = str[i];
            char[] c = s.toCharArray();
            int lt = 0; int rt = s.length() - 1;
            while (lt < rt) {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
            String reverse = String.valueOf(c);
            answer.add(reverse);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex04_1 ex04 = new Ex04_1();
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

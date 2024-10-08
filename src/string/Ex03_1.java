package string;

import java.util.Scanner;

public class Ex03_1 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Ex03_1 ex03_1 = new Ex03_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ex03_1.solution(str));
    }
}

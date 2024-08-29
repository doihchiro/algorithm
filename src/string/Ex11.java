package string;

import java.util.Scanner;

public class Ex11 {

    public String solution(String str) {
        String answer = "";
        str = str + " ";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                answer += str.charAt(i);
                if (count > 1) answer += String.valueOf(count);
                count = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex11.solution(str));
    }
}

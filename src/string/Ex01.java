package string;

import java.util.Scanner;

public class Ex01 {

    public int solution(String str, char c) {
        int count = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char x : str.toCharArray() ) {
            if (x == c) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Ex01 T = new Ex01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}

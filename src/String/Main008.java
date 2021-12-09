package String;

import java.util.Scanner;

class Main008 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) return "YES";
        return answer;
    }

    public static void main(String[] args) {
        Main008 T = new Main008();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}
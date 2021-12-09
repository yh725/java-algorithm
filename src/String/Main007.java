package String;

import java.util.Scanner;

class Main007 {
    public String solution(String str) {
        String answer = "YES";
        // 개인 풀이
        /*char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if(Character.toLowerCase(c[lt]) == Character.toLowerCase(c[rt])){
                lt++;
                rt--;
            }else{
                answer = "NO";
                break;
            }
        }*/
        // 문제 풀이 1
        /*int len = str.length();
        str = str.toLowerCase();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) answer = "NO";
        }*/
        // 문제 풀이 2
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main007 T = new Main007();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.print(T.solution(str));
    }
}
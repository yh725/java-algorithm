package String;

import java.util.Scanner;

class Main009 {
    public int solution(String str) {
        //int answer = 0;
        String answer = "";
        for (char x : str.toCharArray()) {
            /*if(x >= 48 && x < 57) {
                answer = answer * 10 + (x - 48);
            }*/
            if(Character.isDigit(x)) answer += String.valueOf(x);
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main009 T = new Main009();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}
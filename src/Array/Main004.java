package Array;

import java.util.Scanner;

class Main004 {
    // 개인 풀이
    /*public StringBuilder solution(int n) {
        StringBuilder answer = new StringBuilder();
        answer.append(1);
        int tmp = 1;
        int tmp2 = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                answer.append(" " + tmp);
                tmp2 = tmp + tmp2;
            } else {
                answer.append(" " + tmp2);
                tmp = tmp + tmp2;
            }
        }
        return answer;
    }*/

    // 문제 풀이
    /*public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }*/

    public void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Main004 T = new Main004();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        //System.out.println(T.solution(n));
        //for (int x : T.solution(n)) System.out.print(x + " ");
        T.solution(n);
    }
}
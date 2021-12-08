import java.util.Scanner;

class Main012 {
    public String solution(String s, int n) {
        String answer = "";

        // 개인 풀이
        /*s = s.replaceAll("#", "1").replaceAll("\\*", "0");
        for (int i = 1; i <= n; i++) {
            String tmp = s.substring((i - 1) * 7, i * 7);
            int tmpInt = Integer.parseInt(tmp, 2);
            answer += (char) tmpInt;
        }*/

        // 문제 풀이
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main012 T = new Main012();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.print(T.solution(str, n));
    }
}
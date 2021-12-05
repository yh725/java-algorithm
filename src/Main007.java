import java.util.Scanner;

class Main007 {
    public String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
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
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main007 T = new Main007();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.print(T.solution(str));
    }
}
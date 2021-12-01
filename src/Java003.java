import java.util.Scanner;

class Main003 {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        /*String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len > m){
                m = len;
                answer = x;
            }
        }*/
        while((pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
            if(str.length() > m) answer = str;
        }
        return answer;
    }

    public static void main(String[] args){
        Main003 T = new Main003();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
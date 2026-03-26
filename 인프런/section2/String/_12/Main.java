package section2.String._12;

import java.util.Scanner;

class Main {
    public String solution(int n, String str){
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<n; i++){
            String t = str.substring(i*7, (i+1)*7);
            t = t.replace('#', '1').replace('*', '0');
            int de = Integer.parseInt(t, 2);
            answer.append((char)de);
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}

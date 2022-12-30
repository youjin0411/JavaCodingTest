package DFS;
import java.util.*;
class DFS_bracket {
    static class P {
        int open, close;

        P(int open, int close) {
            this.open = open;
            this.close = close;
        }
    }
    public static void main(String[] args) {
        int answer = 0;
        int n = 2 ;

        Stack<P> stack = new Stack<>();
        stack.push(new P(0, 0));   //0개 괄호부터 시작

        while (!stack.isEmpty()) {
            P p = stack.pop();

            if (p.open > n) continue;
            if (p.open < p.close) continue;
            if (p.open + p.close == 2 * n) {
                answer++;
                continue;  //괄호 쌍의 갯수:2n
            }
            stack.push(new P(p.open + 1, p.close));  //열리는 괄호1개 넣고
            stack.push(new P(p.open, p.close + 1));  //닫히는 괄호1개 넣고
        }
        System.out.println(answer);
    }
}

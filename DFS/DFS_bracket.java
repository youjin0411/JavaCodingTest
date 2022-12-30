package DFS;
import java.util.*;
class DFS_bracket {
    //class P는 Stack에 P의 클래스
    static class P {
        int open, close;
        //P 생성자
        P(int open, int close) {
            this.open = open;
            this.close = close;
        }
    }
    public static void main(String[] args) {
        int answer = 0;
        int n = 2 ;

        //Stack 구조 => pop / push
        // P 클래스로 Stack 생성함
        Stack<P> stack = new Stack<>();
        stack.push(new P(0, 0));   //0개 괄호부터 시작

        while (!stack.isEmpty()) {
            P p = stack.pop(); //Stack구조의 stack에 담겨있는 값을 꺼내서 P클래스의 p에 넣어준다.

            //p.open은 왼쪽값, p.close는 오른쪽 값
            if (p.open > n) continue;
            if (p.open < p.close) continue;
            if (p.open + p.close == 2 * n) { //쌍이 맞는 값이 있는가 없는가, 즉 2의 배수면 answer을 증가해줌
                answer++;
                continue;  //괄호 쌍의 갯수:2n
            }
            //중요포인트 : p.open + 1 / p.close + 1로 pop해서 꺼내온 값에 +1을 해줘야 한다.
            stack.push(new P(p.open + 1, p.close));  //열리는 괄호1개 넣고
            stack.push(new P(p.open, p.close + 1));  //닫히는 괄호1개 넣고
        }
        System.out.println(answer);
    }
}

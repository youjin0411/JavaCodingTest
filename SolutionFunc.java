//위장 문제
import java.util.HashMap;
import java.util.*;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Arrays;

class SolutionFunc {
    public int solution(String[][] clothes) {
        // 1. 옷을 종류별로 구분하기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 입지 않는 경우를 추가하여 모든 조합 계산하기
        /*
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while(it.hasNext())
            answer *= it.next().intValue() + 1;
*/
        int answer = 1;
        for (Integer c : map.values()) {
            answer = answer * (c + 1); //사용하지 않는 경우 1추가해 경우의 수구함.
        }


        // 3. 아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;
    }


    //////////////////////////////////////////////////
// 삼각형 문제
    public int solution(int[][] triangle) {
        int answer = 0;
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    triangle[i][j] = triangle[i][j] + triangle[i - 1][j];

                } else if (i == j) {
                    triangle[i][j] = triangle[i][j] + triangle[i - 1][j - 1];
                } else {
                    int left = triangle[i][j] + triangle[i - 1][j - 1];
                    int right = triangle[i][j] + triangle[i - 1][j];
                    triangle[i][j] = Math.max(left, right);
                }
                answer = Math.max(answer, triangle[i][j]);
            }
        }
        return answer;
    }

///////////////////////////////////


    public class Test2 {
        //
//    public static void main(String[] args) {
//        int[][] arr = {{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}};
//        int ans = solution(arr);
//        System.out.println(ans) ;
//    }
        public int solution(int[][] triangle) {
            // 1. 기본값 초기화  //
            int[][] dp = new int[triangle.length][triangle.length];
            dp[0][0] = triangle[0][0];
            for (int i = 1; i < triangle.length; i++) {
                dp[i][0] = dp[i - 1][0] + triangle[i][0];
                dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];
            }

            // 2. 동적계획법 //
            for (int i = 2; i < triangle.length; i++)
                for (int j = 1; j < i; j++)
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];

            // 3. 최대값 반환 //
            int max = 0;
            for (int i = 0; i < dp.length; i++)
                max = Math.max(max, dp[dp.length - 1][i]);

            return max;
        }
    }
/////////////////////////////////////////////////
// 괄호 문제


    class Solution {
        class P {
            int open, close;

            P(int open, int close) {
                this.open = open;
                this.close = close;
            }
        }

        public int solution(int n) {
            int answer = 0;

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
            return answer;
        }
    }
}



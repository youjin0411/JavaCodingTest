import java.util.*;
class H_index {
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) System.out.print(citations[i] + " ");

        for (int i = 0; i < citations.length; i++) {
            //h를 길이 - i 한 이유는 h의 조건이 h편 이상 이면서 h번 이상 인용된 것이기 때문에
            //h를 논문의 수라고 생각을 했고
            int h = citations.length - i;

            //citations[i]는 인용된 횟수로, 인용된 횟수가 논문의 수보다 같거나 켜야 하는 조건으로 인해서 비교함
            if (citations[i] >= h) { //	  3 5 6  >=   3 2 1
                answer = h; //answer은 h편이됨
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
}

// import java.util.*;
// class Solution {
//     public int solution(int[] citations) {
//         //h번 이상 인용된 논문이 h편이상
//         int answer = 0;
//         int len = citations.length;
//         ArrayList<Integer> test = new ArrayList<Integer>(); //count 배열
//         // Arrays.sort(citations);
//         //각 인용된 횟수를 살리는 중첩 for문
//         for(int i = 0; i < len; i++){
//             int count = 0;
//             int cnt = 0;
//             int non = 0;
//             for(int j = 0; j < len; j++){
//                 if(citations[i] != 0 && citations[j] >= citations[i]) count++;
//             }
//             test.add(count); //count는 몇회이상 인용되었는가.
//             for(int c = 0; c < len; c++){
//                 if(test.get(i) <= citations[c]) cnt++;
//             }
//             //나머지 논문이 h번 이하로 인용되고,
//             if(cnt == test.get(i)) answer = cnt;
//         }
//         //인용된 횟수와 인용된 논문 편수의 값이 h하나로 일치해야 한다.
//         //즉, 2번 이상 인용된 횟수는 1이고, 2회 이상 인용한 편수의 값은 1이다.
//         System.out.println(test);
//         return answer;
//     }
// }
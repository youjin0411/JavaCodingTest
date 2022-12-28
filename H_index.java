import java.util.*;
class H_index {
    public static int solution(int[] citations) {
        //h번 이상 인용된 논문이 h편이상
        int answer = 0;
        int len = citations.length;
        ArrayList<Integer> test = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (citations[i] != 0 && citations[j] >= citations[i]) count++;
            }
            test.add(count);
        }
        for (int i = 0; i < test.size(); i++) {
            //get(i)는 ArrayList에서 i번째에 있는 값을 의미
            //h번 이상 인용 논문과 h편 이상이 같으면서 answer보다 test.get(i)가 클 때
            if (test.get(i) == citations[i] && test.get(i) > answer) {
                answer = test.get(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
}
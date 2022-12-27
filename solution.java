import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;
import java.util.Arrays;
class Solution {
    public  static int solution(int n, int[] lost, int[] reserver) {
        int answer = 0;
        int num = lost.length;
        //여분의 체육복 있는 학생수
        for(int i = 0; i < reserver.length; i++){
            //체육복 도난 학생 수
            for(int j = 0; j < lost.length; j++){
                //여분의 체육복이 있는 학생이 도난 당한 경우 도난당하지 않은 학생과 동일하게 생각
                if(reserver[i] == lost[j]){
                    num = num - 1;
                }
                if(reserver[i] == lost[j]-1 || reserver[i] == lost[j]+ 1){
                    //체육복을 빌린 경우 lost[j]를 -1로 변경해줌 즉 대여 한 것을 체크 해줌
                    lost[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        //전체 학생 수에서 도난 받은 학생 수를 뺌
        n -= num;
        //도난 받은 학생 수를 뺀 전체 학생 수에서 체육복을 빌린 학생의 수를 더함
        answer = n + answer;
        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        int lost[] = {2, 3};
        int reserver[] = {3, 4};
        System.out.println(solution(n, lost, reserver));
    }
}
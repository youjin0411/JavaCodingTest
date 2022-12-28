import java.util.*;
class KIndexNumber {
    public static int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            int[] arr1 = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr1);
            // 4. 자른 배열 출력
            answer[i] = arr1[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int array[] = {3, 55, 7, 2, 9, 3, 6};
        int [][] commands = {{2, 5, 3}, {4, 6, 2}, {1,2, 1} };
        int result[] = solution(array, commands);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}

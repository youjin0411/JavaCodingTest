package 배열;

public class array  {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int len = (num2-num1)+1;
        int[] answer = new int[len];
        int j = 0;
        for(int i = num1; i <= num2; i++){
            answer[j++]= numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        int len = (num2-num1)+1;
        int result[] = new int[len];
        result = solution(numbers, num1, num2);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }
}

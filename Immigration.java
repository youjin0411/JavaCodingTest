import java.util.Arrays;

class Immigration {
    public long solution(int n, int[] times) {
        long answer = 0;
        //오름차순 정렬 : 심사하는데 걸리는 시간이 짧은 심사관부터 더하기 위해서 정렬함
        Arrays.sort(times);
        long start = 0;
        //최악의 경우의 수
        long maxTime = (long) n * times[times.length - 1]; //가장 최악의 경우의(오래걸리는) 시간
        while (start <= maxTime) {
            //중간값 : 이분탐색해서 반으로 계속 나눔
            long mid = (start + maxTime) / 2;
            long sum = 0; // 총 심사한 인원
            for (int i = 0; i < times.length; i++) { //빨리 심사하는 심사관 순으로 심사처리하기 위해서 오름차순정렬함ㅁ
                sum += mid / times[i];
            }
            if (sum < n) { // 해야할 인원보다 심사처리 못함 -> 시간 더 필요
                start = mid + 1;
            } else { // 해야할 인원보다 심사처리 많이함 -> 시간을 줄여서 더 최고 경우의 시간을 만든다.
                maxTime = mid - 1;
                answer = mid;
            }
        }
        return answer;
    }
}

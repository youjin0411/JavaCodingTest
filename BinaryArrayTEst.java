import java.util.*;
public class BinaryArrayTEst {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 0, 1, 4};
        //binarySearch는 무조건 sort로 정렬을 한 후에 실행시켜야 한다.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int idx2 = Arrays.binarySearch(arr, 2);

        String person[] = {"유진", "미림", "학생", "아무개", "누구누구"};
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
    }
}

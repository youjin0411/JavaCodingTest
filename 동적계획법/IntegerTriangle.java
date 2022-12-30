package 동적계획법;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
class IntegerTriangle {
    public static int[][] solution(int[][] triangle) {
        int answer = 0;
        int arr[][] = Arrays.copyOf(triangle, triangle.length);
        for(int i = 1; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                if(j == 0){
                    arr[i][j] += arr[i-1][j];
                }else if(j == triangle[i].length - 1){
                    arr[i][j] += arr[i-1][j-1];
                }else{
                    if(arr[i-1][j-1] > arr[i-1][j]) arr[i][j] += arr[i-1][j-1];
                    else arr[i][j] += arr[i-1][j];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int triangle[][] = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int result[][] = solution(triangle);
        int max = 0;
        for(int i = 0; i < result[result.length-1].length; i++){
            if(result[result.length-1][i] > max) max = result[result.length-1][i];
        }
        System.out.println(max);
    }
}
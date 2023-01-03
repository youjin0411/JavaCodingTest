# JavaCodingTest
자바 코딩테스트😋

자바 함수
1. 복사 
- System.arraycopy(oldstr, 0, newstr, 0, oldstr.length);
2. 문자열 안에 값이 있는가 없는가 확인
- .containes("문자");
3. Arrays함수들(import java.util.*;)
- 값의 삭제, 크기 변경, 정렬 등의 불편함 해결을 위해 ArrayList변환
  - Arrays.asList(arr); //배열을 ArrayList로 변환
- 값을 문자열로 만들어 리턴하는 메서드
    - toString(arr);
- 오름차순 정렬
  - Arrays.sort(arr);
  - 출력 : Arrays.toString(arr)
- 내림차순 정렬
  - Collections.reverseOrder();
  - Arrays.sort(arr, Collections.reverseOrder())
  - 출력: Arrays.toString(arr)
- 배열 복사
  - Arrays.copyOf(arr, 5); //(배열, 새로운 크기)
  - 출력 : Arrays.toStrig();
4. IndexOf()
- String 객체에서 주어진 값과 일치하는 첫번째 인덱스 반환 없으면 -1리턴
5. 문자열 합치기
- String.join(",", arr); ("구분자", 배열(객체,리스트))
<hr/>

### 정렬
#### compareTo()
> 1) 문자열 비교
@override
public int compareTo(Sort.SortTotal s1){
	return (this.name.capareTo(s1.name));
}
> 2) 오름차순 숫자 정렬
public int compareTo(Sort.SortTotal n1){
	return (a+b).compareTo(a+b);
};
> 3) 내림차순 숫자 정렬
public int compareTo(String a, String b){
	return (b+a).compareTo(a+b);
}

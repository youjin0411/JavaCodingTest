package Sort;

public class SortTotal {
    private String name;
    private double id;
    public SortTotal(String n, int id){
        this.name = n;
        this.id = id;
    }
//    //문자열 비교할 때
//    @Override
//    public int compareTo(Sort.SortTotal s1){
//        return (this.name.compareTo(s1.name));
//    } //s1의 name이 크면 양수, 같으면 0, 작으면 음수를 리턴
//
//    //Student의 이름을 비교할 경우
//    public int compareTo(Object obj){
//        Sort.Student other = (Sort.Student) obj;
//        return (this.name.compareTo(other.name));
//    }// obj의 name이 크면 양수, 같으면 0, 작으면 음수를 리턴
//
//    //숫자 비교 - 오름차순
//    @Override
//    public int compareTo(Sort.SortTotal s1){
//        return (this.id - s1.id);
//    }
//
//    //숫자 비교 - 내림차순
//    @Override
//    public int compareTo(Sort.SortTotal m1){
//        return (s1.id - this.id);
//    }
//
//    public static void main(String[] args) {
//        Sort.SortTotal s = new Sort.SortTotal("김유진", 23);
//
//    }
}
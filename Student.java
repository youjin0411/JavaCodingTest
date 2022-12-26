import java.lang.reflect.Array;
import java.util.*;
public class Student implements Comparable{
    private String name;
    private double gpa;
    public Student(String n, double g){
        this.name = n;
        this.gpa = g;
    }
    public Student(String n){
        this.name = n;
    }
    public String getName(){return name;}
    public double getGpa() {return gpa;}

    //compareTo에서 지정하는 기준대로 정렬이 정해진다. 즉, gpa를 기준으로 오름차순 되는 것이고, gpa대신 name이면 name을 기준으로 오름차순됨
//    public int compareTo(Object obj){
//        Student other = (Student) obj;
//        if(gpa < other.gpa) return -1;
//        else if(gpa > other.gpa) return 1;
//        else return 0;
//    }

    //Student의 이름을 비교할 경우
    public int compareTo(Object obj){
        Student other = (Student) obj;
        return (this.name.compareTo(other.name));
    }// obj의 name이 크면 양수, 같으면 0, 작으면 음수를 리턴

    public static void main(String[] args) {
        Student s[] = new Student[3];
        s[0] = new Student("홍길동", 4.2);
        s[1] = new Student("이길동", 2.8);
        s[2] = new Student("김길동", 3.75);
        Arrays.sort(s);
        System.out.println("**GPA 오름차순 출력 **");
        for(Student stu: s){
            System.out.println("이름 = " + stu.getName()+" 평점 = " + stu.getGpa());
        }
    }
}

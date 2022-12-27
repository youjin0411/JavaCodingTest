import javax.swing.*;
import java.util.HashSet;
import java.util.Objects;

public class Member {
    private int memberId;
    private String memberName;

    //생성자 만들기
    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }
    public int getMemberId(){
        return memberId;
    }
    public void setMemberId(int memberId){
        this.memberId = memberId;
    }
    public String getMemberName(){
        return memberName;
    }
    public void setMemberName(String memberName){
        this.memberName = memberName;
    }

    //toString 오버라이딩
    @Override
    public String toString(){
        return memberName + " 회원님의 아이디는 "+ memberId +"입니다.";
    }

    //Member 클래스에 equals(), hashCode()를 overriding해야 한다.

    // equals 메서드는 주소값이 다른 객체는 서로 다른 객체로 판단한다.
    // 두 객체를 같도록 하려면 Member 클래스에 equals 메서드를 재정의 해야 한다.
    // equals를 사용하지 않으면 해당 객체가 자신과 같은 객체인지 값을 비교할 수 없기 때문에 null을 리턴하게 된다.
    @Override
    public boolean equals(Object o) {
        if (o instanceof Member){
            Member temp = (Member) o;
            return memberId == temp.memberId;
        }
        return false;
    }

    //equals를 재정의한 클래스에는 hashCode도 반드시 재정의한다.
    //hashcode()를 재정의 하지 않으면 같은 값 객체라도 해시값이 다를 수 있다. 따라서 HashTable에서 해당 객체가 저장된 버킷을 찾을 수 없다.
    @Override
    public int hashCode() {
        return ((Integer)memberId).hashCode();
    }

    //main
    public static void main(String[] args) {
        HashSet<String> m = new HashSet<String>();
        m.add(String.valueOf(new Member(1, "홍길동")));
        m.add(String.valueOf(new Member(2, "홍길동")));
        m.add(String.valueOf(new Member(3, "이길동")));
        m.add(String.valueOf(new Member(1, "홍길동")));

        System.out.println(m);
    }
}

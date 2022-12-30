package Hash_key_value;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {
    public int sno;
    public String name;

    public HashMapStudent(int sno, String name){
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof HashMapStudent){
            HashMapStudent temp = (HashMapStudent) o;
            return (sno == temp.sno ) && (name.equals(temp.name ));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return sno + name.hashCode();
    }

    @Override
    public String toString() {
        return this.sno + "." + this.name;
    }

    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<String, Integer>();
        //생성자로 만든 sno가 숫자형 타입이므로 타입을 맞춰주기 위해서 String.valueOf 사용함
        student.put(String.valueOf(new HashMapStudent(1, "홍길동")), 95);
        student.put(String.valueOf(new HashMapStudent(1, "홍길동")), 95);
        student.put(String.valueOf(new HashMapStudent(2, "김길동")), 95);

        System.out.println("총 Entry 수: " + student.size());
        System.out.println(student);
    }
}

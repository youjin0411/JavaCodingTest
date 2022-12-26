import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //HashMap 생성
        //Map 컬렉션은 키와 값으로 구성된 엔트리 객체를 저장한다.
        Map<String, Integer> people = new HashMap<String, Integer>();

        //Map people에 key로 String, Integet 타입을 각각 put으로 넣어줌
        //put은 주어진 키와 값을 추가, 저장이 되면 값을 리턴
        people.put("김길동", 85);
        people.put("홍길동", 95);
        people.put("최길동", 80);

        //Map의 값의 길이 즉, 총 3개를 넣었으므로 size는 3이다.
        System.out.println("총 Entity: " + people.size());

        //Map 형태의 인터페이스를 만드는데 사용(키와 값으로 구성되는 데이터)
        //키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴한다.
        //Set으로 앞에는 키, 뒤에는 값이 되는 집합이 나옴 -> 즉 집합 3개 생성 put 한 것들 , 키와 값이 분리가 됨
        Set<Map.Entry<String, Integer>> set = people.entrySet();
        //포인터와 같은 개념의  Iterator ??
        //데이터 하나하나를 꺼내 올 때 사용하는 Iterator
        //Iterator은 반복자
        Iterator<Map.Entry<String, Integer>> it = set.iterator();

        //만약 it에 데이터를 가지고 있다면
        while (it.hasNext()){
            Map.Entry<String, Integer> e = it.next();
            System.out.println("\t" + e.getKey() + " : " + e.getValue());
        }

        //value/key만 뽑아오기 위해서 Collection 변수에 넣는다.
        //Collection 클래스 내에서는 큰 값을 찾아주는 max 함수가 있으므로 활용하기 쉽게 Collection 사용함
        Collection values = people.values();
        Collection keys = people.keySet();

        //요 2줄은 없어도 된다. 확인용임
        it = values.iterator();
        Iterator<Map.Entry<String, Integer>> it2 = keys.iterator();

        System.out.println("최고점수 : " + Collections.max(values) + ", 이름 : " + Collections.max(keys));
    }
}

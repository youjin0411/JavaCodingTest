package Hash_key_value;

import java.util.*;
public class HashSetAddPerson{
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("추가할 회원의 이름은 : ");
            name.add(scan.nextLine());
        }
        System.out.println(name);
    }
}

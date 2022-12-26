public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArary = {"Java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArary, 0, newStrArray, 0 , oldStrArary.length);

//        for(int i = 0; i < newStrArray.length; i++){
//            System.out.print(newStrArray[i] + ", ");
//        }

        //foreach 문
          for (String i: newStrArray) {
              System.out.print(i + ", ");
          }
    }
}

package 람다식;

import javax.swing.Timer;

public class BeepSoundLambda {
    public static void main(String[] args) {
        //실제 타이머의 기능을 수행하는 클래스
        Timer t = new Timer(1000, event -> System.out.println("beep"));
        //Timer클래스가 수행되어야 할 내용을 작성하는 클래스
//        TimerTask mt = new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("beep");
//            }
//        };
//        t.schedule(mt, 0, 1000);

        //람다식
        t.start();
        for(int i = 0; i < 1000; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}

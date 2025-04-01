package lambda1;

public class Person {

    public void action1(Speakable speakable) {
        speakable.speak("안녕하세요");
    }

    public void action2(Workable workable) {
        workable.work("홍길동", "프로그래밍");
    }
}

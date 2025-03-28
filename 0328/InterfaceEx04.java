interface Vehicle {
    void run();
}

class Bus implements Vehicle {

    // annotation (써도 되고 안써도 되지만 확실하게 하고싶으면 쓰는게 좋음)
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void checkFare() {
        System.out.println("승차요금을 체크합니다.");
    }
}

public class InterfaceEx04 {
    public static void main(String[] args) {
        
        // 자동형변환
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFare();

        // 강제형변환
        Bus bus = (Bus)vehicle;
        bus.run();
        bus.checkFare();
    }
}

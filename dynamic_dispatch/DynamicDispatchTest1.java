package dynamic_dispatch;

// Dynamic Dispatch => динамическая диспетчеризация
public class DynamicDispatchTest1 {
    int x = 77;
    int y = 99;

    void  run(){
        System.out.println("RUN");
    }
}

class DynamicDispatchTest2 extends DynamicDispatchTest1 {
    int z =111;
    int t = 222;

    @Override
    void run() {
        System.out.println("DANCE");
    }
}

class DynamicDispatchTest3 {
    public static void main(String[] args) {
//        DynamicDispatchTest1 dynamicDispatchTest1Object = new DynamicDispatchTest1();
//        dynamicDispatchTest1Object.run();


        DynamicDispatchTest1 dynamicDispatchTest2Object = new DynamicDispatchTest2();
        dynamicDispatchTest2Object.run();
    }
}
package lesson1.c_1_1.c_1_1_1;

/**
 * Created by cch
 * 2018-05-04 14:47.
 */

public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}

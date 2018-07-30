package Lambda;

public class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println(" Hello world from thread ");
    }
}

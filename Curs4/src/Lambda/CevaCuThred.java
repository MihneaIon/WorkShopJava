package Lambda;

public class CevaCuThred {

    public void startThread()
    {
        Thread thred=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" Hello world from thread ");


            }
        });

        thred.start();
    }

    public void startThread2()
    {
        Thread thread=new Thread(new Worker());
        thread.start();
    }
}

package Lambda;

public class ThreadLambda {

    public void startThread()
    {
        Thread thread=new Thread(()-> System.out.println(" Salutttt din Thread"));
        thread.start();
    }
}

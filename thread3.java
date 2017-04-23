package thread3;
class UsingRunnable implements Runnable
{
    private int counter=0;
    public void run ()
    {
        counter++;
        System.out.println("Implementind runnable: counter = " +counter );
    }
}
class UsingThread extends Thread
{
    private int counter=0;
    public void run()
    {
        counter++;
        System.out.println("Implementind thread class: counter = " +counter );
    }
}
public class Thread3 {
    public static void main(String[] args) throws Exception
    {
        UsingRunnable run =new UsingRunnable();
        Thread t1 = new Thread(run);
        t1.start();
        Thread.sleep(1000);
        Thread t2= new Thread(run);
        t2.start();
        Thread.sleep(1000);
        Thread t3= new Thread(run);
        t3.start();
        Thread.sleep(1000);
        
        UsingThread th1= new UsingThread();
        th1.start();
        Thread.sleep(1000);
        UsingThread th2 =new UsingThread();
        th2.start();
        Thread.sleep(1000);
        UsingThread th3 =new UsingThread();
        th3.start();
        Thread.sleep(1000);
    }   
}

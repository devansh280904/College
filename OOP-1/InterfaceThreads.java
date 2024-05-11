class Hannibal implements Runnable{
    int ob=0;
    public synchronized void incrementObject(){
        ob++;
    }
    public void run(){
        for(int i =0;i<100;i++){
            incrementObject();
        }
    }
}
public class InterfaceThreads {
    public static void main(String[] args)throws InterruptedException {
        Hannibal hannibal = new Hannibal();
        Thread thread1=new Thread(hannibal);
        Thread thread2=new Thread(hannibal);
        thread1.start();
        thread2.start();
        thread1.join();
        thread1.join();
        System.out.println("Total count: "+hannibal.ob);
    }
}

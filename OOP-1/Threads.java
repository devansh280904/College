class Hannibal extends Thread{
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
public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Hannibal hannibal=new Hannibal();
        Hannibal hannibal2=new Hannibal();
        hannibal.start();
        hannibal2.start();
        hannibal.join();
        hannibal2.join();
        System.out.println("Total Count:"+(hannibal.ob+hannibal2.ob));
    }
    
}

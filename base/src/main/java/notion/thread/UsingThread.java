package notion.thread;
import java.util.Random;
// Classe d'utilisation des Thread, initiation à la programmation concurrentiel
// Observez l'execution de ce programme, et comprenez l'intérêt
public class UsingThread extends Thread{
    public void run(){
        Random rand = new Random();
        int ran = rand.nextInt(10,100);
        try{
            for (int i = 0;i<ran;i++){
                Thread.sleep(100);
                System.out.println("Réussite de la quête :"+ i + " ("+ran+")");
            }
        }
        catch(InterruptedException e){
            System.err.println("Echec de la quête");
        }
    }
    public static void main(String[] args){
        UsingThread task = new UsingThread();
        UsingThread task2 = new UsingThread();
        System.out.println("lancement thread 1");
        task.start();
        System.out.println("lancement thread 2");
        task2.start();
    }
}

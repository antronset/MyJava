package Shildt.Chapter17;

/**
 * Created by Антон on 12.04.2017.
 */
public class NewThread extends Thread {

    boolean suspendFlag;

    NewThread (String threadname, ThreadGroup tgOb){
        super (tgOb, threadname);
        System.out.println("Новый поток: " + this);
        suspendFlag = false;
        start(); // запустить поток исполнения
    }

    public void run (){
        try {
            for (int i=5; i>0; i--){
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Исключение в " + getName());
        }
        System.out.println(getName() + " завершается");
    }

    synchronized void mysuspend (){
        suspendFlag = true;
    }

    synchronized void myresume (){
        suspendFlag = false;
        notify();
    }
}

class ThreadGroupDemo{
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Группа А");
        ThreadGroup groupB = new ThreadGroup("Группа В");

        NewThread ob1 = new NewThread("Один", groupA);
        NewThread ob2 = new NewThread("Два", groupA);
        NewThread ob3 = new NewThread("Три", groupB);
        NewThread ob4 = new NewThread("Четыре", groupB);

        System.out.println("\nВывод из метода List(): ");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается группа А");
        Thread tga [] = new Thread[groupA.activeCount()]; //создаем массив потоков. В количестве, которое автоматич подсчитывается
        groupA.enumerate(tga); // получить потоки исполнения из группы

        for (int i=0; i<tga.length; i++){
            ((NewThread)tga[i]).mysuspend(); //приостановить каждый поток исполнения. Которые были ранее собраны. Из Группы А
        }

        try{ // замедление главного потока
            Thread.sleep(4000);
        } catch (InterruptedException e){
            System.out.println("Главный поток исполнения прерван");
        }

        System.out.println("Возобновление группы А");

        for (int i=0; i<tga.length; i++){
            ((NewThread)tga[i]).myresume(); // возобновить все потоки исполнения в группе
        }

        // ожидать завершения потоков исполнения главным потоком
        try{
            System.out.println("Ожидание завершения потоков исполнения");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e){
            System.out.println("Исключение в главном потоке исполнения");
        }
        System.out.println("Главный поток исполнения завершен");
    }
}

package ShagAcademy.MultiThreads;

import java.util.Random;

/**
 * Created by Антон on 20.06.2017.
 * Порядок:
 * 1 приказ методу старт создать 3 потока
 * 2 метод старт требует объекты раннабл и ссылается на метод ран
 * 3 метод ран для инициализации локальной памяти запрашивает объект threadLocal
 * 4 В данном объекте уже определен метод инциализирующий начальное значение
 * 5 Метод ран с помощью метода сет устанавливает новое значение и выводит на экран
 */


public class Main {
    private static int mNum = 12;
    private static ThreadLocal <Integer> threadLocal = new ThreadLocal<Integer>(){
        protected Integer initialValue(){
            return 5;
        }//использование локальной памяти потока. Для этого т ребуется инициализировать первоначальным значением,
        // что достигается переопределением метода initialValue()
    };

    public static void main(String[] args) {
        threadLocal.set(new Random().nextInt(100)); //установка значения для основного потока
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                threadLocal.set(new Random().nextInt(100));
                System.out.println("Thread " + Thread.currentThread().getName() + " value is " + threadLocal.get()
                + " mNum " + mNum); //имя вспомогательным потокам присваивается автоматически
            }
        };

        for (int i = 0; i < 3; i++){
            (new Thread(runner)).start(); //у потока есть конструктор который принмиает объект раннабл
        } //после активации старт, мы идем в метод ран и инициализируем каждый из трех вспомогательных потоков своим
        //значением
        System.out.println("Main thread value is " + threadLocal.get() + " mNum " + mNum);
    }

}



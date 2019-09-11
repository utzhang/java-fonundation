import javax.security.auth.callback.Callback;
import java.util.concurrent.FutureTask;

public class Page721ThirdThread implements Callback {
    public static void main(String[] args) {
        Page721ThirdThread rt = new Page721ThirdThread();

        //这个程序有问题的
        // FutureTask<Integer> task = new FutureTask<Integer>((Callback<Integer>)(rt)->{
        //     int i =0;
        //     for (; i < 100; i++) {
        //         System.out.println(Thread.currentThread().getName() + "的循环变量i的值：" + i);
        //     }
        //     return i;
        // });

        // for (int i = 0; i < 100; i++) {
        //     System.out.println(Thread.currentThread().getName() + " 的循环变量i的值：" + i);
        //     if (i == 20) {
        //         new Thread(task,"有返回值的线程").start();
        //     }
        // }
        //
        // try {
        //     System.out.println("子线程的返回值：" + task.get());
        // } catch (Exception ex) {
        //     ex.printStackTrace();
        // }
    }
}

package ExecutiveFramework;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ExceutorDemo {

    public static void main(String [] args){
        showExecutor();
        //showWithFuturesAndCallable();
    }

    /**
     *
     */
    public static void showExecutor(){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try{
            for(int i = 0; i < 10; i++)
                executor.submit(() -> {
                   System.out.println(Thread.currentThread().getName());
                });
        }finally{
            executor.shutdown(); //executors must be explicitly shutdown
        }
    }

    /**
     *
     */
    public static void showWithFuturesAndCallable(){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future future;

        Callable callTwitterApi = () -> {
                Thread.sleep(1000);
                return 5;
        };

        try{
            future = executor.submit(callTwitterApi);
            System.out.println("Perform more tasks while waiting for future ......");
            try {
                Integer result = (Integer) future.get();
                System.out.println("Result obtained from future after 3 seconds >>>> " + result);
            } catch (InterruptedException  | ExecutionException e) {
                e.printStackTrace();
            }
        }finally{
            executor.shutdown(); //executors must be explicitly shutdown
        }
    }
}


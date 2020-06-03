package com.cn.test.yjrc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.*;

@RestController
public class ThreadController {
     ExecutorService executor = new ThreadPoolExecutor(7,50,60,
            TimeUnit.SECONDS,new LinkedBlockingDeque<>(210), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
     @RequestMapping("/test1")
     public String test1() throws InterruptedException {

         TimeUnit.MILLISECONDS.sleep(80);
         return "success";
     }

    @RequestMapping("/test")
    public String test() throws ExecutionException, InterruptedException {

//        CompletableFuture
        Future<?> result1 = executor.submit(getIntegerCallable("1111"));
        Future<?> result2 = executor.submit(getIntegerCallable("222"));
        Future<?> result3 = executor.submit(getIntegerCallable("333"));
        Future<?> result4= executor.submit(getIntegerCallable("444"));
        Future<?> result5= executor.submit(getIntegerCallable("555"));
        Future<?> result6= executor.submit(getIntegerCallable("666"));
        Future<?> result7= executor.submit(getIntegerCallable("777"));
        long l = System.currentTimeMillis();
        result1.get();
        result2.get();
        result3.get();
        result4.get();
        result5.get();
        result6.get();
        result7.get();

        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
        return "success";
    }
    private Callable<String> getIntegerCallable(String msg) {
        return () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(msg+"*******"+Thread.currentThread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return msg;
        };
    }
}

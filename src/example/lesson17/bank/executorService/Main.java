package example.lesson17.bank.executorService;


import com.google.common.collect.ImmutableList;

import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public ExecutorService generateExecutor(int threads) {
        return Executors.newFixedThreadPool(threads);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Main main = new Main();
        final ExecutorService executorService = main.generateExecutor(10);

        ImmutableList<String> urlPaths = ImmutableList.of("path1", "path2", "path3", "path4");

        Queue<Future<String>> futures = new LinkedBlockingQueue<>();


        for (String urlPath : urlPaths) {
            final Future<String> future = executorService.submit(() -> makeRequest(urlPath));
            futures.add(future);
        }


        //logic

        //sdfsdfsfsf

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }


        executorService.shutdown();
    }

    private static String makeRequest(String urlPath) {
        System.out.println(urlPath);
        return urlPath.concat("-Response");
    }


}

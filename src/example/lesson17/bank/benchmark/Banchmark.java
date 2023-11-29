package example.lesson17.bank.benchmark;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Banchmark {
    public static int AMOUNT = 100000;
    private final CompletionService<Integer> completionService;
    private final Container container;

    private final Collection<Object> collection;


    public Banchmark(CompletionService<Integer> completionService, Container container, Collection<Object> collection) {
        this.completionService = completionService;
        this.container = container;
        this.collection = collection;
    }

    public void run() throws InterruptedException, ExecutionException {
        final long start = System.nanoTime();
        container.getObjectList().forEach(o -> completionService.submit(() -> generateTask(o)));
        for (int i = 0; i < container.getObjectList().size(); i++) {
            completionService.take().get();
        }
        final long finish = System.nanoTime();
        long result = finish - start;
        System.out.println("Time is " + result / 1000000 + " ms");
    }

    private Integer generateTask(Object o) {
        collection.add(o);
        return collection.size();
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < AMOUNT; i++) {
            list.add(new Object());
        }
        Container container = new Container(list);


        System.out.println("----------ConcurrentLinkedQueue----------");
        Banchmark banchmark1 =
                new Banchmark(new ExecutorCompletionService<>(executorService), container, new ConcurrentLinkedQueue<>());
        banchmark1.run();

        System.out.println("----------CopyOnWriteArrayList----------");
        Banchmark banchmark2 =
                new Banchmark(new ExecutorCompletionService<>(executorService), container, new CopyOnWriteArrayList<>());
        banchmark2.run();

        System.out.println("----------LinkedBlockingQueue----------");
        Banchmark banchmark =
                new Banchmark(new ExecutorCompletionService<>(executorService), container, new LinkedBlockingQueue<>());
        banchmark.run();

        executorService.shutdown();
    }
}

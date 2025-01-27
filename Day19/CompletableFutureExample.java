package Day19;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import static java.util.concurrent.CompletableFuture.supplyAsync;

public class CompletableFutureExample {
    static Scanner sc = new Scanner(System.in);

    public CompletableFutureExample() {
        try {
            CompletableFuture<String> data = supplyAsync(this::userData);
            CompletableFuture<String> order = supplyAsync(this::userOrders);
            CompletableFuture<String> res = data.thenCombine(order, (user, orders) -> user + "  ->  " + orders);
            res.thenAccept(result -> System.out.println("Combination of user data & orders: " + result));

            res.join();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized String userData() {
        System.out.println("Enter user name: ");
        String names = sc.nextLine();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Username fetched successfully!");
        return "User: " + names;
    }

    private synchronized String userOrders() {
        System.out.println("Enter user orders: ");
        String orders = sc.nextLine();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Orders fetched successfully!");
        return "Orders: " + orders;
    }

    public static void main(String[] args) {
        new CompletableFutureExample();
    }
}

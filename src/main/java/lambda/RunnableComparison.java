package lambda;

public class RunnableComparison {
    public static void main(String[] args) {
        runnableOldWay();
        runnableByLambda();
    }

    private static void runnableOldWay() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable old way");
            }
        };

        new Thread(runnable).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable old way 2");
            }
        }).start();
    }

    private static void runnableByLambda() {
        Runnable runnable = () -> {
            System.out.println("Runnable by lambda expr.");
        };

        Runnable runnable1 = () -> System.out.println("Runnable by lambda expr. 2");

        new Thread(runnable).start();
        new Thread(runnable1).start();
        new Thread(() -> System.out.println("Runnable by lambda expr. 3")).start();
    }
}

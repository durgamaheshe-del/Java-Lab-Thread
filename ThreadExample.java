class GoodMorningRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Hello");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class WelcomeRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class MainRunnable {
    public static void main(String[] args) {
        // Pass runnable instances to Thread constructors
        new Thread(new GoodMorningRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new WelcomeRunnable()).start();
    }
}

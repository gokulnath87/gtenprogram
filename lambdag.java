public class lambdag {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("thread name : gokul");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

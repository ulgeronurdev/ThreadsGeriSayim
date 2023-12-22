public class SureSayaciThreadOrnegi {
    public static void main(String[] args) {
        Runnable sure = () -> {
            for (int i = 60; i>=0; i--) {
                System.out.println("Kalan Süreniz : " + i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(sure);

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Süreniz sona erdi!");
    }
}
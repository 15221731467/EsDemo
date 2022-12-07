public class FTask implements Runnable{

    public String name;

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+i);
        }
    }
    public FTask(String name) {
        this.name = name;
    }
}

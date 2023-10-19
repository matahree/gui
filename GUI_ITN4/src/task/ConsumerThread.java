package task;

public class ConsumerThread extends Thread {

    private final Market market;

    public ConsumerThread(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        try {
            market.Consumer();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
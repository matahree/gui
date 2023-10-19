package task;

public class ProducerThread extends Thread {

    private final Market market;

    public ProducerThread(Market market) {
        this.market = market;
    }
    @Override
    public void run() {
        try {
            market.Producer();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
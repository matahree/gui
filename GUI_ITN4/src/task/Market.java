package task;

import java.util.LinkedList;

public class Market {
    LinkedList<String> list = new LinkedList<>();
    private static int capacity = 5;

    public void Producer() throws InterruptedException {
        String[] products = {"product 1","product 2","product 3","product 4","product 5"};
        int value = 0;
       

        while(true){
        	
            synchronized (this){
                while(list.size() == capacity)
                	wait();

                System.out.println("Produced: " + products[value]);
                list.add(products[value++]);
                notify();
                
                if(value >=5){
                	value =0;
                	}
                Thread.sleep(1000);
            }
            
        }
    }

    public void Consumer() throws InterruptedException {
        while(true){
            synchronized (this)
            {
                while(list.size() == 0)
                	wait();

                String product = list.removeFirst();

                System.out.println("Consumed: " + product);
                notify();

                Thread.sleep(1000);
            }
        }
    }
}

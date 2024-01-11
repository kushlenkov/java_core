package homeWorks.homeWorks4.advance;

public class Runner {
    public static void main(String[] args) {
        Watch watch1 = new Watch(false);
        Watch watch2 = new Watch(true);

        Worker worker1 = new Worker(watch1);
        Worker worker2 = new Worker(watch2);

        Store store1 = new Store(new Worker[]{worker1});
        Store store2 = new Store(new Worker[]{worker2});

        Brand brand = new Brand(new Store[]{store1, store2});

        for (Store brandStore : brand.getStores()) {
            for (Worker shopWorker : brandStore.getWorkers()) {
                try {
                    shopWorker.getWatch().doTick();
                } catch (WatchBrokenError e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

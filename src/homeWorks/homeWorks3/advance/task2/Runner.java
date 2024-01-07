package homeWorks.homeWorks3.advance.task2;

public class Runner {
    public static void main(String[] args) {
        Storage storage1 = new Storage(10);
        Worker artur = new Worker("Артур");
        Worker yuri = new Worker("Юрий");
        Worker leha = new Worker("Леха");
        artur.destroyProduct(storage1);
        yuri.destroyProduct(storage1);
        yuri.destroyProduct(storage1);
        leha.destroyProduct(storage1);



    }
}

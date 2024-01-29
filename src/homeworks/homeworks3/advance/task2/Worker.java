package homeworks.homeworks3.advance.task2;

public class Worker {

    private int brokenProductCount = 0;

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public Worker(int brokenProductCount) {
        this.brokenProductCount = brokenProductCount;
    }

    public int getBrokenProductCount() {
        return brokenProductCount;
    }

    public void setBrokenProductCount(int brokenProductCount) {
        this.brokenProductCount = brokenProductCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void destroyProduct(Storage storage) { ///Как почему Сторадже стораже ??????
        storage.delProduct();
        System.out.println(getName() + " берет из склада товар, и портит его");
        brokenProductCount++;
        System.out.println("Я " + getName() + ", испортил такое к-во товара: " +getBrokenProductCount());
        System.out.println("----------------------------");
    }

}

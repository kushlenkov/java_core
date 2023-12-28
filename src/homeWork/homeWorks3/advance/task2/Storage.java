package homeWork.homeWorks3.advance.task2;

public class Storage {
    private int productCount = 0;

    public Storage() {
    }

    public Storage(int productCount) {
        this.productCount = productCount;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public void delProduct() {
        System.out.println("На складе было бутылок водки " + getProductCount());
        this.productCount--;
        System.out.println("На складе осталось бутылок водки: " + getProductCount());
    }

}

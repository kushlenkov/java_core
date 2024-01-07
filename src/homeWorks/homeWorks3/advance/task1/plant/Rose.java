package homeWorks.homeWorks3.advance.task1.plant;

public class Rose extends Plant implements HasSmell, HasBloom {

    @Override
    public void hasSmell() {
        System.out.println("Роза пахнет");
    }

    @Override
    public void hasBloom() {
        System.out.println("Роза цветет");
    }
}

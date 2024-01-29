package homeworks.homeworks3.advance.task1.plant;

public class Fern extends Plant implements HasBloom {

    @Override
    public void hasBloom() {
        System.out.println("Папоротник цветет");
    }
}

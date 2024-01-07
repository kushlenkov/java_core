package homeWorks.homeWorks3.advance.task1.plant.tree;

import homeWorks.homeWorks3.advance.task1.plant.HasSmell;

public class Spruce extends Tree implements HasSmell {

    boolean haveBumps = true;

    @Override
    public void hasSmell() {
        System.out.println("Ель пахнет");
    }
}

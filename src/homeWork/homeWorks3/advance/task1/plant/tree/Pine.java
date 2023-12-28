package homeWork.homeWorks3.advance.task1.plant.tree;

import homeWork.homeWorks3.advance.task1.plant.HasSmell;

public class Pine extends Tree implements HasSmell {

    boolean haveBumps = true;

    @Override
    public void hasSmell() {
        System.out.println("Сосна пахнет");
    }
}

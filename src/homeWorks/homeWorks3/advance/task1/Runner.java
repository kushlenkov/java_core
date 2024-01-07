package homeWorks.homeWorks3.advance.task1;

import homeWorks.homeWorks3.advance.task1.plant.Fern;
import homeWorks.homeWorks3.advance.task1.plant.HasBloom;
import homeWorks.homeWorks3.advance.task1.plant.HasSmell;
import homeWorks.homeWorks3.advance.task1.plant.Rose;
import homeWorks.homeWorks3.advance.task1.plant.tree.Pine;
import homeWorks.homeWorks3.advance.task1.plant.tree.Spruce;

public class Runner {
    public static void main(String[] args) {

        Pine pine = new Pine();
        Spruce spruce = new Spruce();
        Fern fern = new Fern();
        Rose rose = new Rose();

        HasSmell[] hasSmells = {pine, spruce, rose};
        for (HasSmell smell : hasSmells) {
            smell.hasSmell();
        }

        HasBloom[] hasBlooms = {rose, fern};
        for (HasBloom bloom : hasBlooms) {
            bloom.hasBloom();
        }

    }
}

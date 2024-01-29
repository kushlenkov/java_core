package homeworks.homeworks3.advance.task1;

import homeworks.homeworks3.advance.task1.plant.Fern;
import homeworks.homeworks3.advance.task1.plant.HasBloom;
import homeworks.homeworks3.advance.task1.plant.HasSmell;
import homeworks.homeworks3.advance.task1.plant.Rose;
import homeworks.homeworks3.advance.task1.plant.tree.Pine;
import homeworks.homeworks3.advance.task1.plant.tree.Spruce;

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

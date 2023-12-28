package lecture.lesson7;

import java.util.Objects;

public class Fish extends Object implements Cloneable {
private String name;
private Integer age;
private Country country;

    //this - fish, o - fish2
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return Objects.equals(name, fish.name) && Objects.equals(age, fish.age);
    }

    @Override
    public int hashCode() {
        return name.length() + age;
    }

    public Fish(String name, Integer age, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                '}';
    }
}

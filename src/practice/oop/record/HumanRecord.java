package practice.oop.record;

public record HumanRecord(int birthYear,
                          String name,
                          String surName,
                          String lastName) {

    public HumanRecord {
        System.out.println("Hello from Record");
    }

    public void getInfo() {
        System.out.println(name + " " + lastName);
    }
}
